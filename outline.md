# Robotics and Beyond Academy Java

## Monday: Review

### Instruction
First, have students set up a project in Eclipse and get comfortable with the
IDE's layout and some of the more useful shortcuts (Ctrl-Shift-O, Ctrl-Shift-F,
Ctrl-Space...). Then, spend a bit of time reviewing the very basics of Java
to make sure everyone is up to speed. Students will need to be proficient in the
following topics before going further:

- Input/output
- Data types
- Operators
- Conditionals
- Loops
- Arrays
- Methods (including the structure of the main method)

### Project
Have students create a calculator program that evaluates simple equations. The
calculator must support decimal operations and handle the following operations:

- Addition
- Subtraction
- Multiplication
- Division
- Remainder (modulus)

#### Sample Output
```
35.2
+
7.9
=
43.1
```
```
42.5
/
2.5
=
17
```


## Tuesday: Algorithms and Recursion

### Instruction
Start off by introducing the concept of an
[algorithm](https://en.wikipedia.org/wiki/Algorithm). Some (if not all)
students will already be familiar with the idea, but make sure everyone is on
the same page as to what exactly an algorithm is. Then, move on to talk about
recursion. Again, they may already be familiar with the concept.  Then, move on
to show some of the practical applications of recursion in writing algorithms,
such as an algorithm for finding Fibonacci numbers. Lastly, make sure that
students understand the difference between an iterative algorithm (i.e. one that
uses a for loop) and a recursive algorithm.

### Project
Show students the [Tower of Hanoi](https://en.wikipedia.org/wiki/Tower_of_Hanoi)
game. It will be helpful to draw diagrams. Students will then write a simple
recursive algorithm to solve the puzzle. It will probably be necessary to
provide some starter code from the solution (i.e. the method signature for the
solve function) to set students in the right direction.
```
How many disks?
3
Moving disk 1 from SOURCE rod to TARGET rod
Moving disk 2 from SOURCE rod to SPARE rod
Moving disk 1 from TARGET rod to SPARE rod
Moving disk 3 from SOURCE rod to TARGET rod
Moving disk 1 from SPARE rod to SOURCE rod
Moving disk 2 from SPARE rod to TARGET rod
Moving disk 1 from SOURCE rod to TARGET rod
```
```
How many disks?
4
Moving disk 1 from SOURCE rod to SPARE rod
Moving disk 2 from SOURCE rod to TARGET rod
Moving disk 1 from SPARE rod to TARGET rod
Moving disk 3 from SOURCE rod to SPARE rod
Moving disk 1 from TARGET rod to SOURCE rod
Moving disk 2 from TARGET rod to SPARE rod
Moving disk 1 from SOURCE rod to SPARE rod
Moving disk 4 from SOURCE rod to TARGET rod
Moving disk 1 from SPARE rod to TARGET rod
Moving disk 2 from SPARE rod to SOURCE rod
Moving disk 1 from TARGET rod to SOURCE rod
Moving disk 3 from SPARE rod to TARGET rod
Moving disk 1 from SOURCE rod to SPARE rod
Moving disk 2 from SOURCE rod to TARGET rod
Moving disk 1 from SPARE rod to TARGET rod
```


## Wednesday: Algorithms pt. 2

### Instruction
This lesson will focus on some important algorithms that students should be
familiar with for AP Computer Science A and college-level courses: sorting
algorithms (insertion sort, bubble sort, quicksort...). Diagrams will be
helpful in explaining how each algorithm works. It may be helpful to give
students a very brief introduction to
[order notation](https://en.wikipedia.org/wiki/Big_O_notation) to show which
algorithms are most efficient in different cases.

### Project
Have students implement insertion sort, bubble sort, and quicksort. If time
allows, students can implement more sorting algorithms in a similar fashion.
You may choose to provide the main method from the solution so that students
have a "driver" function to test their algorithms on as they progress. Or, you
could just instruct students to create appropriate test cases before starting
on the sorting algorithms themselves.


## Thursday: Data Structures

### Instruction
Introduce the concept of a data structure, relating it to the data types
students are already familiar with. Summarize the following data structures and
explain how they are similar or different from other data structures:

- Array
- Vectors
- Lists
- Sets
- Maps
- Trees
- Queues
- Stacks
- Hash Tables

Be sure to provide examples of what situations are appropriate for using each
data structure, and why using one may be preferable to another (i.e. using
a hash table instead of a map).

### Project
Students will create a phone book program using a map to store pairs of names
and phone numbers. The phone book must support the following operations:
- `add` - Will prompt the user to enter a name and phone number to be added
  to the phone book
- `remove` - Will prompt the user to enter a name to attempt to remove from the
  phone book
- `search` - Will prompt the user to enter a name to search for in the phone
  book
- `stop` - Stops the program


## Friday: Object Orientation

### Instruction
Again, depending on the students' background, they may already be familiar with
object orientation. Spend some time first exlaining the concept itself
(diagrams!) before showing the syntax. You should explain:

- Inheritance
- Encapsulation
- Abstraction
- Polymorphism

### Project
This project will attempt to tie together most of the topics that have been
covered throughout the week. Students will build a
[Matrix](https://en.wikipedia.org/wiki/Matrix_(mathematics)) class that stores
a matrix as a 2D array. The class should demonstrate the four principles of
object orientation learned during instruction. For example, the variables for
the rows, columns, and the 2D array itself should be private, and there should
be getter methods for retrieving this data. Again, it will be helpful to
provide students with the main method from the solution or at least guide them
in the right direction as far as creating test cases.

- `Matrix(int rows, int cols)` - Constructor; creates a new Matrix of size
  *rows* x *cols* filled with 0's
- `Matrix(int[][] data)` - Constructor; creates a new Matrix represented by the
  2D array *data*
- `Matrix multiply(Matrix m)` - Performs matrix multiplication between this
  Matrix and the Matrix parameter *m* and returns the result
- `void print()` - Prints the matrix
- `int getRows()` - Returns *rows*
- `int getData()` - Returns *cols*
- `int[][] getData()` Returns a copy of *data*. Students should construct a new
  2D array filled with the values from *data* rather than returning *data*
  directly.

