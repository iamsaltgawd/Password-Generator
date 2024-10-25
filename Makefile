SRC_DIR := src
OUT_DIR := out

SRCS := $(wildcard $(SRC_DIR)/*.java)
CLS := $(SRCS:$(SRC_DIR)/%.java=$(OUT_DIR)/%.class)

JC := javac
JCFLAGS := -d $(OUT_DIR) -cp $(SRC_DIR)

.SUFFIXES: .java

.PHONY: all clean run

all: $(CLS)

$(OUT_DIR)/%.class: $(SRC_DIR)/%.java | $(OUT_DIR)
	$(JC) $(JCFLAGS) $<

$(OUT_DIR):
	mkdir -p $(OUT_DIR)

run: $(CLS)
	java -cp $(OUT_DIR) Main

clean:
	rm -f $(OUT_DIR)/*.class
