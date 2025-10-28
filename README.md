VennSet

This Java program demonstrates how to use sets to perform basic operations similar to a Venn diagram — finding intersections (common elements) and unique elements between two sets.

Features

Creates two sets of strings (setA and setB)

Finds:

Intersection (common elements)

Elements unique to setA

Elements unique to setB

Prints all results to the console

Example Output
Set A: [banana, cherry, apple]
Set B: [banana, cherry, date, fig]
Duplicates (Intersection): [banana, cherry]
Only in A: [apple]
Only in B: [date, fig]

How to Run

Save the file as VennSet.java.

Open a terminal in the same directory and compile the program:

javac VennSet.java


Run the compiled class:

java VennSet

Concepts Demonstrated

Set operations in Java

Intersection using retainAll()

Difference using removeAll()

HashSet implementation for unique elements
