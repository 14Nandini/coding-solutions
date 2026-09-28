/* Structure of linked list Node
class Node{
    int data;
    Node next;

    Node(int a){
        data = a;
        next = null;
    }
}
*/
class Solution {
    public int getCount(Node head) {
        // code here
        Node node = head;
        int len = 0;
        while(node != null){
            len++;
            node = node.next;
        }
        return len;
    }
}