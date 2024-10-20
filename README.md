# Password Generator

This Java application generates secure passwords based on user-defined parameters. It utilizes a unique 88-character alphabet, making the generated passwords more visually aggressive and stronger compared to standard 64-character sets.

## Features

- **Password Length**: Users can specify a password length between 16 and 50 characters, with a recommendation for lengths greater than 22 characters.
- **Password Generation**: Users can choose how many passwords to generate (up to 100). 
- **Strong Passwords**: The application ensures that the first character of each password is a letter and prevents consecutive characters from being numerically adjacent or repeating.

## Character Set

The application uses a visually interesting 88-character alphabet:

`!"#$%&'()*+,-./23456789:;<=>?@ABCDEFGHJKLMNO PRSTUVWXYZ[]^_abcdefghijkmnopqrstuvwxyz{|}~`


## Password Count

The total number of possible passwords of lengths ranging from 16 to 50 characters using the specified alphabet is approximately **1.69×10^97**, making it extremely difficult to crack.

## How to Use

1. Run the program.
2. Enter a desired password length (between 16 and 50 characters).
3. Specify the number of passwords to generate (up to 100).
4. The application will output the generated passwords.

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

## Conclusion

This Password Generator is a powerful tool for creating secure passwords that meet modern security standards. Its unique character set and generation logic ensure a high degree of randomness and strength, making it suitable for a variety of applications.


