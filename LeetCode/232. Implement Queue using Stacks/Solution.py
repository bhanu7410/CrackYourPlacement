class MyQueue:

    def __init__(self):
        self.s1 = []
        self.s2 = []

    def push(self, x: int) -> None:
        
        # move everything from s1 to s2
        while (len(self.s1) > 0):
            self.s2.append(self.s1.pop())
        
        # add element to s1
        self.s1.append(x)
        
        # move everything back to s1
        while (len(self.s2) > 0):
            self.s1.append(self.s2.pop())
        

    def pop(self) -> int:
        return self.s1.pop()

    def peek(self) -> int:
        return self.s1[-1]

    def empty(self) -> bool:
        return len(self.s1) == 0