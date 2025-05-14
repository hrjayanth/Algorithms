# Dynamic Programming

**Dynamic programming (DP)** is a method used in computer science and mathematics to solve complex problems by breaking them down into simpler subproblems. It is especially useful for problems that have overlapping subproblems and optimal substructure.

## 🧠 Key Concepts

### 1. Overlapping Subproblems:

The problem can be broken into subproblems which are reused multiple times. For example, computing Fibonacci numbers:

fib(5) = fib(4) + fib(3)

fib(4) = fib(3) + fib(2)

Notice that fib(3) is repeated.

### 2. Optimal Substructure:

The optimal solution to the overall problem can be constructed from optimal solutions to its subproblems.
Example: Shortest path in a graph — the shortest path from A to C via B is the sum of the shortest paths A to B and B to C.

## 💡 Two Main Approaches

### 1. Top-Down (Memoization):

* Start solving the problem recursively.
* Store the results of subproblems in a table (usually a dictionary or array).
* Before solving a subproblem, check if it’s already solved.

### 2. Bottom-Up (Tabulation):

* Solve all smaller subproblems first and use their answers to build up the solution to the original problem.
* Often implemented using loops.

## 🧰 When to Use Dynamic Programming

1. The problem can be divided into overlapping subproblems.
2. You can define a recurrence relation.
3. Brute-force is too slow due to repeated work.

## 🧮 Common Examples

1. [Fibonacci sequence](Fibonacci.java)
2. Knapsack problem
3. Longest common subsequence (LCS)
4. Edit distance
5. [Coin change](CoinChange.java)
6. Matrix chain multiplication