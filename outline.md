# Robotics and Beyond Academy Java

## Monday: Review

### Instruction
First, have students set up a project in Eclipse and get comfortable with the
IDE's layout and some of the more useful shortcuts (Ctrl-Shift-O, Ctrl-Shift-F,
Ctrl-Space...). Then, spend a bit of time reviewing the very basics of Java to
make sure everyone is up to speed. Students will need to be proficient in the
following topics before going further:

- Input/output
- Data types
- Operators
- Conditionals
- Loops
- Arrays
- Methods (including the structure of the main method)

### Project
Have students create a calculator program that evaluates simple equations
consisting of two operands and an operator. The calculator should support decimal
arithmetic and handle the following operations:

- Addition
- Subtraction
- Multiplication
- Division
- Remainder (modulus)

#### Sample Output
```
42.5
/
2.5
42.5 / 2.5 = 17.0
```

#### Solution Code
[Calculator.java](solutions/monday/Calculator.java)


## Tuesday: Algorithms and Recursion

### Instruction
Start off by introducing the concept of an algorithm. Some (if not all)
students will already be familiar with the idea, but make sure everyone is on
the same page as to what exactly an algorithm is. Then, move on to talk about
recursion. Again, they may already be familiar with the concept.  Show some of
the practical applications of recursion in writing algorithms, such as an
algorithm for finding Fibonacci numbers. Lastly, make sure that students
understand the difference between an iterative algorithm (i.e. one that uses a
for loop) and a recursive algorithm.

### Project
Show students the [Tower of Hanoi](https://en.wikipedia.org/wiki/Tower_of_Hanoi)
game. It will be helpful to draw diagrams. Students will then write a simple
recursive algorithm to solve the puzzle. It may be necessary to provide some
starter code from the solution (i.e. the method signature for the solve function)
to set students in the right direction.

#### Sample Output
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

#### Solution Code
[Hanoi.java](solutions/tuesday/Hanoi.java)


## Wednesday: Algorithms pt. 2

### Instruction
This lesson will focus on some important algorithms that students should be
familiar with for AP Computer Science A and college-level courses: sorting
algorithms. Diagrams will be helpful in explaining how each algorithm works.
Be sure to cover the following algorithms in instruction:

- Insertion sort
- Bubble sort
- Quick sort

For more advanced students, show them the more complex algorithms like merge
sort. It may be helpful to give students a brief introduction to
[order notation](https://en.wikipedia.org/wiki/Big_O_notation) to show which
algorithms are most efficient in different cases.

### Project
Have students implement the sorting algorithms that were learned during
instruction (by default: insertion sort, bubble sort, and quick sort). If time
allows, help students implement more complex sorting algorithms in a similar
fashion. You may choose to provide the main method from the solution so that
students have a "driver" function to test their algorithms on as they progress. Or,
you could just instruct students to create appropriate test cases before starting
on the sorting algorithms.

#### Sample Output
```
small_array:
35 4 14 19 42 6 11 25 
Running insertionSort on small_array:
4 6 11 14 19 25 35 42 

medium_array:
22 16 7 13 55 24 65 91 10 44 26 33 70 16 
Running bubbleSort on medium_array:
7 10 13 16 16 22 24 26 33 44 55 65 70 91 

large_array:
10 27 6 81 60 44 2 9 50 54 12 17 20 92 66 5 14 74 13 77 34 19 15 38 
Running quickSort on large_array:
2 5 6 9 10 12 13 14 15 17 19 20 27 34 38 44 50 54 60 66 74 77 81 92 
```

#### Solution Code
[Sorting.java](solutions/wednesday/Sorting.java)


## Thursday: Data Structures

### Instruction
Introduce the concept of a data structure, relating it to the data types
students are already familiar with. Summarize the following data structures
and explain how they are similar or different from other data structures:

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
a hash table instead of a map). Also, show students an appropriate way to
iterate through a map, as it will be necessary for the project.

### Project
Students will create a phone book program using a map to store pairs of names
and phone numbers. The phone book must support the following operations:
- `add` - Will prompt the user to enter a name and phone number to be added
  to the phone book
- `remove` - Will prompt the user to enter a name to attempt to remove from the
  phone book
- `search` - Will prompt the user to enter a name to search for in the phone
  book
- `print` - Prints each entry of the phone book
- `stop` - Stops the program

#### Sample Output
```
add
Enter a name:
John Smith
Enter a number:
123456789
John Smith has been added to the phone book.
add
Enter a name:
Jane Doe
Enter a number:
555444333
Jane Doe has been added to the phone book.
print
John Smith: 123456789
Jane Doe: 555444333
search
Enter a name to search for:
John Smith
John Smith's number is 123456789.
stop
```

#### Solution Code
[PhoneBook.java](solutions/thursday/Phonebook.java)


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
covered throughout the week. Students will build a Matrix class that stores
a matrix as a 2D array. The class should demonstrate the four principles of
object orientation learned during instruction. For example, the variables for
the rows, columns, and the 2D array itself should be private, and there should
be getter methods for retrieving this data. Again, it will be helpful to
provide students with the main method from the solution or at least guide them
in the right direction as far as creating test cases.

- `public Matrix(int rows, int cols)` - Constructor; creates a new Matrix of size
  *rows* x *cols* filled with 0's
- `public Matrix(int[][] data)` - Constructor; creates a new Matrix represented by the
  2D array *data*
- `public Matrix multiply(Matrix m)` - Performs
  [matrix multiplication](https://en.wikipedia.org/wiki/Matrix_multiplication) between
  this Matrix and the Matrix parameter *m* and returns the result
- `public void print()` - Prints the matrix
- `public int getRows()` - Returns *rows*
- `public int getData()` - Returns *cols*
- `public int[][] getData()` Returns a copy of *data*. Students should construct a new
  2D array filled with the values from *data* rather than returning *data*
  directly.

If time allows, have students create more functions for matrix operations such
as `add`, `subtract`, `submatrix`, `rref`, etc.

#### Sample Output
```
MATRIX 1:
0 0 3 7 
3 6 3 3 
1 9 2 6 

MATRIX 2:
8 7 2 
3 1 2 
5 8 4 
8 5 5 

RESULT MATRIX:
71 59 47 
81 66 45 
93 62 58 
```

#### Solution Code
[Main.java](solutions/friday/Main.java),
[Matrix.java](solutions/friday/Matrix.java)


## Alternative Projects
This outline makes some assumptions about what students already know and do not
already know. You may need to adapt this outline as you go, and use your
judgement to decide which projects are too complex or not complex enough for
your students. Here are some alternative projects that you could use:

### Monday
- Guessing game program: Chooses a random number from a certain range (use
a Random object) and let the user guess a number until the correct number is
guessed. After each guess, tell the user whether they guessed higher, lower
than the correct number.

### Tuesday
- Factorial calculator: For an easier introduction to recursion, have students
  create a program that calculates the factorial of a number recursively.
- Fibonacci calculator: This is also a good introduction to recursion, and
  probably a bit more difficult than the factorial calculator.

### Wednesday
- More sorting algorithms: Have students look at a list of popular sorting algorithms
  and choose one (or some) that they would like to implement.

### Thursday
- Searching algorithms: If students are already proficient with using maps
  (or finish the project early) and have a decent grasp of trees, students
  can attempt to write a
  [breadth-first](https://en.wikipedia.org/wiki/Breadth-first_search) or
  [depth-first](https://en.wikipedia.org/wiki/Depth-first_search) algorithm.
  This will be quite a challenge, so this is only recommended for very advanced
  students!

### Friday
- Banking program: For a project that is more strictly OOP (and demonstrates
  more of the four OOP principles learned on Friday), have students create a
  "banking program" consisting of an abstract BankAccount class and child classes
  CheckingAccount and SavingsAccount.


