# Backtracking

**Backtracking** is a general-purpose algorithmic technique for solving problems incrementally, by trying all possibilities and removing those that fail to satisfy the problem’s constraints.

## 🧠 Core Concept

Build a solution step by step, and backtrack (go back) as soon as you realize the current path won't lead to a valid or optimal solution.

## 🪜 Backtracking Algorithm Structure

* Choose: Pick an option.
* Explore: Recurse with that option added to the solution.
* Unchoose (Backtrack): Remove the last choice and try another.

## 🔁 General Pseudocode

```
text
Copy
Edit
backtrack(solution):
    if solution is complete:
        output or save solution
        return
    for each possible choice:
        if choice is valid:
            make choice
            backtrack(solution with choice)
            undo choice (backtrack)
```

## ✅ Examples

* [Permutations](Permutations.java) 
* Combinations
* Constraint satisfaction problems (e.g. Sudoku, N-Queens)
* Path-finding (e.g. maze solving)