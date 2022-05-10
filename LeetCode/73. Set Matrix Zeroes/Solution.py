class Solution:
    def setZeroes(self, matrix) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        stk = []
        for i in range(len(matrix)):
            for j in range(len(matrix[i])):
                if matrix[i][j]==0:
                    stk.append([i,j])

        for w in stk:
            i=w[0]
            j=w[1]
            for l in range(len(matrix[i])):
                matrix[i][l]=0
            for l in range(len(matrix)):
                matrix[l][j]=0
        