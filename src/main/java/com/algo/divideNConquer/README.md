# Divide and Conquer

**Divide and Conquer** is a fundamental algorithm design paradigm. It works by breaking a problem into smaller sub-problems, solving each sub-problem recursively, and then combining their solutions to solve the original problem.

## 🧠 Key Concepts
1. **Divide:** Break the problem into smaller sub-problems.
2. **Conquer:** Solve each sub-problem recursively. If sub-problem is small enough, solve it directly.
3. **Combine:** Merge the solutions of sub-problems into the final solution.

## 🧰 When to Use Dynamic Programming

1. Problem Can Be Divided into Independent Sub-Problems
    * If a problem can be split into smaller self-contained units that don’t depend on each other, it's a good candidate.
2. Sub-Problems Are of the Same Type
    * The smaller problems should be of the same nature as the original.
    * This allows the use of recursion to apply the same logic repeatedly.
3. Combining the Results Is Efficient
    * The final step (combine) should not outweigh the gains from dividing and conquering.
    * Example: Merging sorted arrays in Merge Sort is linear time (O(n)).
4. You Want Better Time Complexity
    * Often improves brute force O(n²) to O(n log n) or even O(log n).
    * Example: Merge Sort vs Bubble Sort.
5. Parallelization is Needed
    * Sub-problems can often be solved in parallel (especially in multi-threaded or distributed systems).
    * Example: Matrix multiplication, large-scale data processing

## 🧮 Common Examples

1. Merge Sort
2. [Quick Sort](./QuickSortAlgorithm.java)
3. Binary Search
4. Matrix Multiplication (Strassen’s algorithm)
5. Closest Pair of Points
6. [Square Root](./SquareRoot.java)
