'''
Q: Implement Queue using Stacks
Link: https://leetcode.com/problems/implement-queue-using-stacks/

'''

class Queue(object):
    def __init__(self):
        """
        initialize your data structure here.
        """
        self.stackIn = []
        self.stackOut = []
        

    def push(self, x):
        """
        :type x: int
        :rtype: nothing
        """
        self.stackIn.append(x)
        

    def pop(self):
        """
        :rtype: nothing
        """
        self.peek()
        self.stackOut.pop()

    def peek(self):
        """
        :rtype: int
        """
        if not self.stackOut:
            while self.stackIn:
                self.stackOut.append(self.stackIn.pop())
        return self.stackOut[-1]

    def empty(self):
        """
        :rtype: bool
        """
        return not self.stackIn and not self.stackOut
        