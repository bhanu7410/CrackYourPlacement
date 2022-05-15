class Node():
    def __init__(self, val = None):
        self.data = val
        self.next = None

def delete_node(node):
    prev = Node()
    if(node == None):
        return
    else:
        while(node.next != None):
            node.data = node.next.data
            prev = node
            node = node.next
        prev.next = None