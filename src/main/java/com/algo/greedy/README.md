# Greedy Algorithms

The **Greedy Algorithm** is a problem-solving technique that makes the locally optimal choice at each step, with the hope that these local choices lead to a globally optimal solution.

## ✅ Key Characteristics

Greedy Choice Property: A global optimum can be reached by choosing the best option at each step.

Optimal Substructure: A problem has an optimal solution that can be built from optimal solutions of its subproblems.

## 🧠 How It Works

At each decision point:

Pick the best available option without worrying about future consequences.

This decision is final (unlike dynamic programming or backtracking, which may revisit decisions).

## 📉 Advantages

Efficient: Often faster than other approaches (like dynamic programming).

Simple: Easy to implement and understand.

## ⚠️ Disadvantages
Not always optimal: Greedy doesn't explore all possible solutions.

Needs proof: You must prove that the greedy approach gives the optimal solution for the specific problem.

## 🧮 Examples

* [Coin Change (Canonical coins)](CoinChange.java)
* Fractional Knapsack
* Huffman Coding
* Activity Selection
