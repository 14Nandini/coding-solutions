/* Structure of Linked List Node
class Node
{
    int data;
    Node next;

    Node(int d)
    {
        this.data = d;
        this.next = null;
    }
}
*/
class Solution {
    Node deleteNode(Node head, int x) {
        // code here
        int len = 0;
        Node temp = head;
        while(temp != null){
            len++;
            temp = temp.next;
        }
        if(x > len) return head;
        if( x == 1) return head.next;
        Node res = head;
        int c = 1;
        while(res != null && c < x - 1){
            res = res.next;
            c++;
        }
        if(res != null && res.next != null) res.next = res.next.next;
        return head;
    }
}