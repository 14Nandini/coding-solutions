class myStack {
    Node top;
    int count;

    public myStack() {
        top = null;
        count = 0;
    }

    public boolean isEmpty() {
        if(top == null){
            return true;
        }
        return false;
    }

    public void push(int x) {
        Node newNode = new Node(x);
        newNode.next = top;
        top = newNode;
        count++;
    }

    public void pop() {
        if(isEmpty()){
            return;
        }
        top = top.next;
        count--;
    }

    public int peek() {
        if(isEmpty()){
            return - 1;
        }
        return top.data;
    }

    public int size() {
       return count;
    }
}