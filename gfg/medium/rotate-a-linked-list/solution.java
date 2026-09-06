/*
class Node {
    int data;
    Node next;

    Node(int d){
        data=d;
        next=null;
   }
}
*/

class Solution {
    public Node rotate(Node head, int k) {
        // code here
        if(head == null || head.next == null || k == 0) return head;
        int len = 1;
        Node node = head;
        while(node.next != null){
            node = node.next;
            len++;
        }
        k = k % len;
        if(k == 0) return head;
        node.next = head;
        //int n = len - k;
        Node newTail = head;
        for(int i = 1; i < k; i++) newTail = newTail.next;
        Node newHead = newTail.next;
        newTail.next = null;
        return newHead;
    }
}