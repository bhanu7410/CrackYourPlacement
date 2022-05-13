class Solution:
    def reverse(self, x) -> int:
        if x==0:
            return(x)
        t=False
        if x<0:
            t=True
            x*=-1
        s=str(x)
        s=s[::-1]
        x=int(s)
        if x>((2**31)-1) or x<-2**31 : return 0
        elif t: return(x*-1)
        else: return(x)