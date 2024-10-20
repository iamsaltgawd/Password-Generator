# Password Generator

Using parameters that the user specifies, this Java application creates secure passwords. Because it uses an alphabet with 88 characters instead of 64, the generated passwords are more visually striking and robust.

## Features

   - **Password Length**: Users can enter a password that is between 16 and 50 characters long, while longer passwords over 22 characters are advised.
   - **Password Generation**: Users are able to select up to 100 passwords to be generated.
   - **Strong Passwords**: The program makes sure that every password begins with a letter and doesn't allow characters to repeat or be numerically near to one another.

## Character Set

The 88-character alphabet used in the program is visually appealing:

`!"#$%&'()*+,-./23456789:;<=>?@ABCDEFGHJKLMNO PRSTUVWXYZ[]^_abcdefghijkmnopqrstuvwxyz{|}~`


## Password Count

With the given alphabet, there are roughly 1.69×10^97 possible password lengths between 16 and 50 characters, making it very challenging to crack.

## How to Use

1. Run the program.
2. Choose the length of your password (between 16 and 50 characters).
3. Specify the number of passwords to generate (up to 100).
4. The created passwords will be printed in the terminal.

## Example
```
Enter password length (ideally > 22): 24
How many passwords: 5
Generating 5 passwords:
1: K5$K!>3p@N?F|dT7$Aw
2: H9)v?U6&+zM&3J[b|yK3
3: O@|2+>7!M4^c1Z@k7s
4: T4t$a5J1<G2D?9C|Y
5: S6$P*3Q>^A9-h4N!D@1
```
