# HackerRank Java Web Solutions

[Challenges](https://www.hackerrank.com/contests/bootcamp-java-web/challenges) of Backend with Java by WoMakersCode 🦋

### ✏️ Todolist

<details><summary><b>✔️ Java Stdin and Stdout I</b></summary>

<b>Task</b>

In this challenge, you must read <b>3</b> integers from stdin and then print them to stdout. Each integer must be printed on a new line.

Solution: [java-stdin-and-stdout-1](https://github.com/leticiacamposs2/hackerrank-java-web-challenges/blob/main/solutions/easy/java-stdin-and-stdout-1.java)

</details>

<details><summary><b>✔️ Java If-Else</b></summary>

<b>Task</b>

Given an integer, <b>n</b>, perform the following conditional actions:

- If <b>n</b> is odd, print <b>Weird</b>
- If <b>n</b> is even and in the inclusive range of <b>2</b> to <b>5</b>, print <b>Not Weird</b>
- If <b>n</b> is even and in the inclusive range of <b>6</b> to <b>20</b>, print <b>Weird</b>
- If <b>n</b> is even and greater than <b>20</b>, print <b>Not Weird</b>
Complete the stub code provided in your editor to print whether or not  is weird.

<b>Explanation</b>

Sample Case 0: <b>n = 3</b>
<b>n</b> is odd and odd numbers are weird, so we print `Weird`.

Sample Case 1: <b>n = 24</b>
<b>n > 20</b> and <b>n</b> is even, so it isn't weird. Thus, we print `Not Weird`.

Solution: [java-if-else](https://github.com/leticiacamposs2/hackerrank-java-web-challenges/blob/main/solutions/easy/java-if-else.java)

</details>

<details><summary><b>✔️ Java Date and Time</b></summary>

<b>Task</b>

You are given a date. You just need to write the method, <b>getDay</b>, which returns the day on that date. To simplify your task, we have provided a portion of the code in the editor.

<b>Example</b>
```
month = 8
day = 14
yaer = 2017
```

The method should return <b>MONDAY</b> as the day on that date.

![calendar](https://s3.amazonaws.com/hr-assets/0/1514458312-c097047ed4-calendar_class.png)

<b>Function Description</b>

Complete the findDay function in the editor below.

findDay has the following parameters:

- int: month
- int: day
- int: year

<b>Returns</b>

- string: the day of the week in capital letters

<b>Sample Input</b>

```
08 05 2015
```

<b>Sample Output</b>

```
WEDNESDAY
```

Solution: [java-date-and-time](https://github.com/leticiacamposs2/hackerrank-java-web-challenges/blob/main/solutions/easy/java-date-and-time.java)

</details>

<details><summary><b>✔️ Java Loops I</b></summary>

<b>Task</b>

Given an integer, <b>N</b>, print its first <b>10</b> multiples. Each multiple <b>N x i</b> (where <b>1 <= i <= 10</b>) should be printed on a new line in the form: <b>N x i = result</b>.

Solution: [java-loops-i](https://github.com/leticiacamposs2/hackerrank-java-web-challenges/blob/main/solutions/easy/java-loops-i.java)

</details>

<details><summary><b>✔️ Java Int to String</b></summary>

<b>Task</b>

If your code successfully converts <b>n</b> into a string <b>s</b> the code will print "Good job". Otherwise it will print "Wrong answer".

Solution: [java-int-to-string](https://github.com/leticiacamposs2/hackerrank-java-web-challenges/blob/main/solutions/easy/java-int-to-string.java)

</details>

<details><summary><b>✔️ Java String Reverse</b></summary>

<b>Task</b>

A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.

Given a string <b>A</b>, print `Yes` if it is a palindrome, print `No` otherwise.

Solution: [java-string-reverse](https://github.com/leticiacamposs2/hackerrank-java-web-challenges/blob/main/solutions/easy/java-string-reverse.java)

</details>

<details><summary><b>✔️ Java BigInteger</b></summary>

In this problem, you have to add and multiply huge numbers! These numbers are so big that you can't contain them in any ordinary data types like a long integer.

Use the power of Java's BigInteger class and solve this problem.

<b>Sample Input</b>

```
1234
20
```

<b>Sample Output</b>

```
1254
24680
```

<b>Explanation</b>

```
1234 + 20 = 1254
1234 * 20 = 24680
```

Solution: [java-biginteger](https://github.com/leticiacamposs2/hackerrank-java-web-challenges/blob/main/solutions/easy/java-biginteger.java)

</details>

<details><summary><b>✔️ Java 1D Array</b></summary>

<b>Task</b>

1. Reads an integer from stdin and saves it to a variable, <b>n</b>, denoting some number of integers.
2. Reads <b>n</b> integers corresponding to <b>a0, a1, ... an-1</b> from stdin and saves each integer  to a variable, <b>val</b>.
3. Attempts to print each element of an array of integers named <b>a</b>.

Solution: [java-1d-array-introduction](https://github.com/leticiacamposs2/hackerrank-java-web-challenges/blob/main/solutions/easy/java-1d-array-introduction.java)

</details>

<details><summary><b>✔️ Java Abstract Class</b></summary>

You have to create another class that extends the abstract class. Then you can create an instance of the new class.

Notice that setTitle method is abstract too and has no body. That means you must implement the body of that method in the child class.

<b>Sample Input</b>

```
A tale of two cities
```

<b>Sample Output</b>

```
The title is: A tale of two cities
```

Solution: [java-abstract-class](https://github.com/leticiacamposs2/hackerrank-java-web-challenges/blob/main/solutions/easy/java-abstract-class.java)

</details>

<details><summary><b>✔️ Java Datatypes</b></summary>

<b>Task</b>

Java has 8 primitive data types; char, boolean, byte, short, int, long, float, and double. For this exercise, we'll work with the primitives used to hold integer values (byte, short, int, and long):

- A byte is an 8-bit signed integer.
- A short is a 16-bit signed integer.
- An int is a 32-bit signed integer.
- A long is a 64-bit signed integer.

Given an input integer, you must determine which primitive data types are capable of properly storing that input.

<b>Reference:</b> https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html

Solution: [java-datatypes](https://github.com/leticiacamposs2/hackerrank-java-web-challenges/blob/main/solutions/easy/java-datatypes.java)

</details>

<details><summary><b>✔️ Java Arraylist</b></summary>

<b>Input Format</b>

The first line has an integer <b>n</b>. In each of the next <b>n</b> lines there will be an integer <b>d</b> denoting number of integers on that line and then there will be <b>d</b> space-separated integers. In the next line there will be an integer <b>q</b> denoting number of queries. Each query will consist of two integers <b>x</b> and <b>y</b>.

Each number will fit in signed integer.
Total number of integers in <b>n</b> lines will not cross <b>10 5</b>.

<b>Output Format</b>

In each line, output the number located in <b>Yth</b> position of <b>Xth</b> line. If there is no such position, just print "ERROR!"

<b>Sample Input</b>

```
5
5 41 77 74 22 44
1 12
4 37 34 36 52
0
3 20 22 33
5
1 3
3 4
3 1
4 3
5 5
```

<b>Sample Output</b>

```
74
52
37
ERROR!
ERROR!
```

<b>Explanation</b>

The diagram below explains the queries:

![java-arraylist](https://s3.amazonaws.com/hr-assets/0/1489168616-b25dd38013-arraylist.png)

<b>Reference:</b> https://docs.oracle.com/javase/7/docs/api/java/util/ArrayList.html

Solution: [java-arraylist](https://github.com/leticiacamposs2/hackerrank-java-web-challenges/blob/main/solutions/easy/java-arraylist.java)

</details>

<details><summary><b>✔️ Java Exception Handling (Try-catch)</b></summary>

Java has built-in mechanism to handle exceptions. Using the `try` statement we can test a block of code for errors. The `catch` block contains the code that says what to do if exception occurs.

This problem will test your knowledge on try-catch block.

You will be given two integers <b>x</b> and <b>y</b> as input, you have to compute <b>x/y</b>. If <b>x</b> and <b>y</b> are not <b>32</b> bit signed integers or if <b>y</b> is zero, exception will occur and you have to report it. Read sample Input/Output to know what to report in case of exceptions.

Solution: [java-exception-handling-try-catch](https://github.com/leticiacamposs2/hackerrank-java-web-challenges/blob/main/solutions/easy/java-exception-handling-try-catch.java)

</details>

<details><summary><b>✔️ Java Exception Handling</b></summary>

You are required to compute the power of a number by implementing a calculator. Create a class MyCalculator which consists of a single method long power(int, int). This method takes two integers, <b>n</b> and <b>p</b>, as parameters and finds <b>Np</b>. If either <b>n</b> or <b>p</b> is negative, then the method must throw an exception which says "n or p should not be negative". Also, if both <b>n</b> and <b>p</b> are zero, then the method must throw an exception which says "n and p should not be zero".

For example, -4 and -5 would result in java.lang.Exception: n or p should not be negative.

Solution: [java-exception-handling](https://github.com/leticiacamposs2/hackerrank-java-web-challenges/blob/main/solutions/easy/java-exception-handling.java)

</details>

<details><summary><b>✔️ Java String Tokens</b></summary>

Given a string, <b>s</b>, matching the regular expression `[A-Za-z !,?._'@]+`, split the string into tokens. We define a token to be one or more consecutive English alphabetic letters. Then, print the number of tokens, followed by each token on a new line.

<b>Output Format</b>

On the first line, print an integer, <b>n</b>, denoting the number of tokens in string <b>s</b> (they do not need to be unique). Next, print each of the  tokens on a new line in the same order as they appear in input string <b>s</b>.

Solution: [java-string-tokens](https://github.com/leticiacamposs2/hackerrank-java-web-challenges/blob/main/solutions/easy/java-string-tokens.java)

</details>

<details><summary><b>✔️ Java Dequeue</b></summary>

In computer science, a double-ended queue (dequeue, often abbreviated to deque, pronounced deck) is an abstract data type that generalizes a queue, for which elements can be added to or removed from either the front (head) or back (tail).

Deque interfaces can be implemented using various types of collections such as `LinkedList` or `ArrayDeque` classes. For example, deque can be declared as:
 
```
Deque deque = new LinkedList<>();
or
Deque deque = new ArrayDeque<>();
```

You can find more details about Deque here.

 In this problem, you are given <b>N</b> integers. You need to find the maximum number of unique integers among all the possible contiguous subarrays of size <b>M</b>.

Note: Time limit is <b>3</b> second for this problem.

Solution: [java-queue](https://github.com/leticiacamposs2/hackerrank-java-web-challenges/blob/main/solutions/medium/java--queue.java)

</details>

<details><summary><b>✔️ Java Priority Queue</b></summary>
 
In this problem we will test your knowledge on [Java Priority Queue](https://docs.oracle.com/javase/7/docs/api/java/util/PriorityQueue.html).

There are a number of students in a school who wait to be served. Two types of events, ENTER and SERVED, can take place which are described below.

- ENTER: A student with some priority enters the queue to be served.
- SERVED: The student with the highest priority is served (removed) from the queue.
A unique id is assigned to each student entering the queue. The queue serves the students based on the following criteria (priority criteria):

1. The student having the highest Cumulative Grade Point Average (CGPA) is served first.
2. Any students having the same CGPA will be served by name in ascending case-sensitive alphabetical order.
3. Any students having the same CGPA and name will be served in ascending order of the id. 

Create the following two classes:

- The Student class should implement:
 - The constructor `Student(int id, String name, double cgpa)`.
 - The method `int getID()` to return the id of the student.
 - The method `String getName()` to return the name of the student.
 - The method `double getCGPA()` to return the CGPA of the student.

 - The Priorities class should implement the method List< Student > getStudents(List< String > events) to process all the given events and return all the students yet to be served in the priority order.
 
Solution: [java-priority-queue](https://github.com/leticiacamposs2/hackerrank-java-web-challenges/blob/main/solutions/medium/java-priority-queue.java)

</details>

<details><summary><b>✔️ Can You Access?</b></summary>
 
You are given a class Solution and an inner class Inner.Private. The main method of class Solution takes an integer <b>num</b> as input. The powerof2 in class Inner.Private checks whether a number is a power of <b>2</b>. You have to call the method powerof2 of the class Inner.Private from the main method of the class Solution.
 
<b>Sample Input</b>

```
 8
```

<b>Sample Output</b>

```
8 is power of 2
An instance of class: Solution.Inner.Private has been created
```

Solution: [can-you-access](https://github.com/leticiacamposs2/hackerrank-java-web-challenges/blob/main/solutions/medium/can-you-access.java)

</details>

<details><summary><b>✔️ Java Comparator</b></summary>

We define the following terms:

- [Lexicographical Order](https://en.wikipedia.org/wiki/Lexicographical_order), also known as alphabetic or dictionary order, orders characters as follows:
 
  <b>A < B < ... < Y < Z < a < b < ... < y < z</b>
 
For example, `ball < cat, dog < dorm, Happy < happy, Zoo < ball`.

- A [substring](https://en.wikipedia.org/wiki/Substring) of a string is a contiguous block of characters in the string. For example, the substrings of abc are a, b, c, ab, bc, and abc.
Given a string, , and an integer, , complete the function so that it finds the lexicographically smallest and largest substrings of length .
  
Solution: [java-comparator](https://github.com/leticiacamposs2/hackerrank-java-web-challenges/blob/main/solutions/medium/java-comparator.java)

</details>

<details><summary><b>✔️ Java BitSet</b></summary>
 
Java's [BitSet](https://docs.oracle.com/javase/7/docs/api/java/util/BitSet.html) class implements a vector of bit values (i.e.:  <b>false(0)</b> or <b>true(1)</b>) that grows as needed, allowing us to easily manipulate bits while optimizing space (when compared to other collections). Any element having a bit value of <b>1</b> is called a set bit.

Given <b>2</b> BitSets, <b>B¹</b> and <b>B²</b>, of size <b>N</b> where all bits in both BitSets are initialized to <b>0</b>, perform a series of <b>M</b> operations. After each operation, print the number of set bits in the respective BitSets as two space-separated integers on a new line.

<b>Input Format</b>

The first line contains <b>2</b> space-separated integers, <b>N</b> (the length of both BitSets <b>B¹</b> and <b>B²</b>) and <b>M</b> (the number of operations to perform), respectively.
The <b>M</b> subsequent lines each contain an operation in one of the following forms: 
 
- [AND](https://en.wikipedia.org/wiki/Logical_conjunction)<b>< set > < set ></b> 
- [OR](https://en.wikipedia.org/wiki/Logical_disjunction)<b>< set > < set ></b> 
- [XOR](https://en.wikipedia.org/wiki/Logical_disjunction)<b>< set > < set ></b>
- [FLIP](https://en.wikipedia.org/wiki/Logical_disjunction)<b>< set > < index ></b>
- [SET](https://en.wikipedia.org/wiki/Logical_disjunction)<b>< set > < index ></b> 
 
In the list above, <b>< set > </b> is the integer <b>1</b> or <b>2</b>, where <b>1</b> denotes <b>B¹</b> and <b>2</b> denotes <b>B²</b>.
<b>< index ></b> is an integer denoting a bit's index in the BitSet corresponding to <b>< set ></b> .

For the binary operations <b>AND</b>, <b>OR</b>, and <b>XOR</b>, operands are read from left to right and the BitSet resulting from the operation replaces the contents of the first operand. For example:
 
```
AND 2 1
```

<b>B²</b> is the left operand, and <b>B¹</b> is the right operand. This operation should assign the result of <b>B² ^ B¹ to B²</b>.

Solution: [java-bitset](https://github.com/leticiacamposs2/hackerrank-java-web-challenges/blob/main/solutions/easy/java-bitset.java)

</details>

<br>

> [Challenges to solve](https://github.com/leticiacamposs2/hackerrank-java-web-challenges/tree/main/challenges-to-solve)
