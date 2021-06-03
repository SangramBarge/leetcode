/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode node = head;
        
        int node_length =0;
        while(node !=null){
            node_length+=1;
            node =node.next;
        }
        node_length = node_length/2+1;
        node = head;
        for(int i=1;i<node_length;i++){
          
                node = node.next;
            
        }
        
        return node;
    }
}
