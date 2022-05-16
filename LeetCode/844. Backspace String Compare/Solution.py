class Solution:
    def backspaceCompare(self, S: str, T: str) -> bool:
        T=self.back(T)
        S=self.back(S)
        return S==T
    def back(self,x:str) -> str:
        sout=[]
        for s in x:
            if s != '#':
                sout.append(s)
            else:
                if len(sout) != 0:
                    sout.pop()
        return sout