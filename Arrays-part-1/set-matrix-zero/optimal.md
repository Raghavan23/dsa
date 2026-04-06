# 🧠 Set Matrix Zeroes — Optimal Solution (O(1) Space)

## 🎯 Goal

Modify the matrix in-place such that if any element is `0`, its entire row and column are set to `0`.

---

## 🚀 Key Idea

Instead of using extra arrays, we use the **first row and first column of the matrix as markers** to store which rows and columns need to be zeroed.

---

## ⚠️ Challenge

* `matrix[0][0]` belongs to both:

  * first row
  * first column
* So it cannot represent both states simultaneously

👉 To solve this, we use an extra variable:

* `col0` → tracks whether the **first column** should be zero

---

## 🧩 Approach

### 🔹 Step 1: Mark rows and columns

* Traverse the matrix
* If `matrix[i][j] == 0`:

  * Mark row → `matrix[i][0] = 0`
  * Mark column → `matrix[0][j] = 0`
* Separately track first column:

  * If `matrix[i][0] == 0` → set `col0 = 0`

---

### 🔹 Step 2: Update inner matrix

* Traverse from `(1,1)` to `(n-1, m-1)`
* If:

  * `matrix[i][0] == 0` **OR**
  * `matrix[0][j] == 0`
* Then set:

  * `matrix[i][j] = 0`

---

### 🔹 Step 3: Handle first row

* If `matrix[0][0] == 0`

  * Set entire first row to `0`

---

### 🔹 Step 4: Handle first column

* If `col0 == 0`

  * Set entire first column to `0`

---

## 🧠 Intuition

* First row → acts as marker for columns
* First column → acts as marker for rows
* `col0` → separately tracks column 0 to avoid conflict with `matrix[0][0]`

---

## ⏱️ Complexity

* **Time Complexity:** O(n × m)
* **Space Complexity:** O(1)

---

## ✅ Summary

* Reuse matrix for marking → saves space
* Handle first row & column carefully
* Use `col0` to avoid ambiguity

---

## 🔥 Key Takeaway

> “We trade extra space for clever reuse of the matrix itself.”
