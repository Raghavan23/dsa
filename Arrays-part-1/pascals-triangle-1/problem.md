## 📌 Problem

Given an integer `numRows`, return the first `numRows` of Pascal's Triangle.

In Pascal's Triangle, each number is the sum of the two numbers directly above it.

---

### Example 1:

```
Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
```

### Example 2:

```
Input: numRows = 1
Output: [[1]]
```

---

## 🔹 Brute Force Approach

A brute force solution is to create a list of lists `result[][]` and iterate through each row from `i = 0` to `numRows - 1`.

* For each row `i`, create a new list (`row`) and iterate through each position `j` from `0` to `i`.
* If `j == 0` or `j == i`, add `1` (since edges are always 1).
* Otherwise, take the previous row and compute:

  ```
  result[i-1][j-1] + result[i-1][j]
  ```
* Finally, add the current row to the result.

**Time Complexity:** O(n²)
**Space Complexity:** O(n²)

---

## 🔹 Optimized Approach

The optimized solution involves **combinatorics**.

Pascal's Triangle represents the **combination formula (nCr)** used in mathematics.

Example:

```
Row 4 → 4C0 = 1, 4C1 = 4, 4C2 = 6, 4C3 = 4, 4C4 = 1
```

Instead of computing values using the previous row, we directly compute each element using the relation:

```
nCr = (nC(r-1) * (n - r + 1)) / r
```

The code computes the next combination using:

```
C(n, r+1) = C(n, r) × (n - r) / (r + 1)
```

Which translates to:

```
val = val * (n - r) / (r + 1)
```

**Time Complexity:** O(n²)
**Space Complexity:** O(n²)

---


