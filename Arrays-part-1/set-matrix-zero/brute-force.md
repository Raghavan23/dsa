Brute force solution :-

We traverse the matrix and whenever we encounter a 0, we mark its row and column in separate arrays (row[] and col[]).

Then in a second pass, for each cell, if its row or column is marked, we set that cell to 0.


example :-

Input ~

1 1 1
1 0 1
1 1 1


We scan the matrix:

Iteration highlights:
At (1,1) → value is 0

So we mark:

row[1] = 1
col[1] = 1

Now:

row = [0, 1, 0]
col = [0, 1, 0]

👉 Meaning:

Row 1 must be zeroed
Column 1 must be zeroed

Now we update each cell:

Row 0:
(0,0): row[0]=0, col[0]=0 → keep → 1
(0,1): col[1]=1 → make 0
(0,2): keep → 1

Row becomes:

1 0 1
Row 1:
row[1]=1 → entire row becomes 0
0 0 0
Row 2:
(2,0): keep → 1
(2,1): col[1]=1 → make 0
(2,2): keep → 1

Row becomes:

1 0 1