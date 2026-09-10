/* Structure of Linked List Node
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    public int getKthFromLast(Node head, int k) {
        // code here
        Node temp = head;
        int n = 1, m = 0;
        while(temp.next != null){
            temp = temp.next;
            n++;
        }
        if(k > n) return -1;
        Node res = head;
        while(m < n - k){
            res = res.next;
            m++;
        }
        return res.data;
    }
}