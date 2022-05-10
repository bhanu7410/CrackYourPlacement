class Solution:

    def findMinDiff(self, A,N,M):

        # code here
        A.sort()
        s=A[M-1]-A[0]
        i=0
        while M<=len(A):
            s=min(A[M-1]-A[i],s)
            M+=1
            i+=1
        return s



if __name__ == '__main__':

    t = int(input())

    for _ in range(t):
        N = int(input())
        A = [int(x) for x in input().split()]
        M = int(input())


        solObj = Solution()

        print(solObj.findMinDiff(A,N,M))