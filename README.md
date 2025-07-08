# Algorithm Techniques

## 1. Brute Force

Try all possibilities.

Simple but inefficient for large inputs.

📌 Example: Check all substrings to find the longest palindrome.

Refer here for more details: [Brute Force](src/main/java/com/algo/bruteForce/README.md)

## 2. Greedy Algorithms

Make the best choice at each step, hoping it leads to the best overall solution.

Works only when local optimal = global optimal.

📌 Example: Coin Change (if denominations are standard like {1, 5, 10, 25}), Activity Selection, Huffman Coding.

Refer here for more details: [Greedy Algorithms](src/main/java/com/algo/greedy/README.md)

## 3. Divide and Conquer

Break the problem into smaller subproblems, solve them independently, and combine the results.

📌 Example: Merge Sort, Quick Sort, Binary Search, Closest Pair of Points.

Refer here for more details: [Divide and Conquer](src/main/java/com/algo/divideNConquer/README.md)

## 4. Dynamic Programming (DP)

Like divide and conquer, but with overlapping subproblems.

Store results of subproblems to avoid recalculating.

📌 Example: Fibonacci, Knapsack, Longest Common Subsequence.

Refer here for more details: [Dynamic Programming](src/main/java/com/algo/dynamicProgramming/README.md)

## 5. Backtracking

Try all possibilities like brute force, but prune bad choices early.

Used in combinatorial problems.

📌 Example: Sudoku Solver, N-Queens, Subset Sum, Word Search.

Refer here for more details: [Backtracking](src/main/java/com/algo/backtracking/README.md)

## 6. Recursion

A problem-solving method where the function calls itself.

Often used with DP, backtracking, and divide & conquer.

⚠️ Needs a base case to stop.

## 7. Memoization

A top-down version of dynamic programming.

Cache results of recursive calls to avoid repeating work.

📌 Example: Recursive Fibonacci with caching.

## 8. Bit Manipulation

Use binary operations to solve problems efficiently.

📌 Example: Subset generation, power of two, XOR-based problems.

## 9. Sliding Window
Efficiently process contiguous subarrays using a window that slides across the input.

📌 Example: Max sum subarray of size k, Longest substring without repeating characters.

## 10. Two Pointers
Use two pointers to scan from both ends or within the array.

📌 Example: Sorted array pair sum, Merge two sorted arrays, Dutch national flag problem.

## 11. Graph Algorithms
Use for problems involving relationships and paths.

DFS / BFS – traversal

Dijkstra’s / Bellman-Ford – shortest path

Prim’s / Kruskal’s – minimum spanning tree

Topological Sort – scheduling tasks

## 12. Union Find / Disjoint Set Union (DSU)
Used to efficiently track connected components.

📌 Example: Cycle detection in graph, Kruskal’s algorithm.

## 13. Trie (Prefix Tree)
Special tree for storing strings, useful in autocomplete, word games.

📌 Example: Word Dictionary, Prefix Search.

## 14. Segment Trees / Fenwick Trees
Advanced data structures to do range queries and updates efficiently.

📌 Example: Range sum, range min/max in an array.
