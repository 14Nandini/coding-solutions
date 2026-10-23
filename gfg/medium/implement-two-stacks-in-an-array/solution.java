class twoStacks {
    int arr[]=new int[100];
    int top1;
    int top2;
    twoStacks() {
        this.top1=-1;
        this.top2=100;
    }

    // Function to push an integer into the stack1.
    void push1(int x) {
        if(top1<top2-1){
           arr[++top1]=x; 
        }
    }

    // Function to push an integer into the stack2.
    void push2(int x) {
        if(top1<top2-1){
            arr[--top2]=x;
        }
    }

    // Function to remove an element from top of the stack1.

    int pop1() {
        if(top1==-1){
            return -1;
        }
        return arr[top1--];
    }        int pop2() {
        if(top2==100){
            return -1;
        }
        return arr[top2++];
    }
}