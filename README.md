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

<details><summary><b>❌ Java Date and Time</b></summary>

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

<details><summary><b>❌ Java Substring Comparisons</b></summary></details>
<details><summary><b>❌ Java Dequeue</b></summary></details>
<details><summary><b>❌ Java Priority Queue</b></summary></details>
<details><summary><b>❌ Can You Access?</b></summary></details>

<details><summary><b>✔️ Java Comparator</b>

Solution: [java-comparator](https://github.com/leticiacamposs2/hackerrank-java-web-challenges/blob/main/solutions/medium/java-comparator.java)

</summary>

<details><summary><b>✔️ Java BitSet</summary></details>

Solution: [java-bitset](https://github.com/leticiacamposs2/hackerrank-java-web-challenges/blob/main/solutions/easy/java-bitset.java)

</details>

<br>

> [Challenges to solve](https://github.com/leticiacamposs2/hackerrank-java-web-challenges/tree/main/challenges-to-solve)