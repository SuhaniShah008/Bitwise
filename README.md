# Bitwise

This Java program is an interactive console quiz that helps users practice **bitwise operations**.  
It randomly generates two numbers, chooses a bitwise operator, and hides one part of the expression — the user must correctly fill in the blank.

## Features
- Randomly generates two numbers between **0 and 10**
- Randomly selects one of the following bitwise operators:
  - `|` (OR)
  - `&` (AND)
  - `^` (XOR)
  - `<<` (Left Shift)
- Randomly hides:
  - The first number
  - The operator
  - The second number
  - Or the final answer
- Prompts the user to guess the missing value and checks if it’s correct

## Example Interaction
_ ^ 3 = 6
Enter what you put in the blank space: 5
The answer is right!
or
8 & 4 = _
Enter what you put in the blank space: 0
The answer is right!

## How to Run
1. Save the file as `Bitwise.java`
2. Open a terminal in the same directory and compile the program:
javac Bitwise.java
3. Run the program:
java Bitwise

## Concepts Demonstrated
- **Bitwise operations** (`|`, `&`, `^`, `<<`)
- **Random number generation**
- **Conditional statements** (`if`/`else`)
- **User input handling** using `Scanner`
- **Switch-case** logic for operator selection
