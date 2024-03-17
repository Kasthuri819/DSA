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
    public ListNode addTwoNumbers(ListNode head1, ListNode head2) {

        ListNode temp1=head1;
		ListNode temp2=head2;
		ListNode dummyNode=new ListNode(-1);
		ListNode dummy=dummyNode;
		int carry=0;
		
		while(temp1!=null || temp2!=null)
		{
			int sum=0;
			
			if(temp1!=null)
			{
				sum+=temp1.val;
				temp1=temp1.next;
			}
				
			if(temp2!=null)
			{
				sum+=temp2.val;
				temp2=temp2.next;
			}
			
			sum+=carry;
			carry=sum/10;
			ListNode newNode=new ListNode(sum%10);
			dummy.next=newNode;
			dummy=newNode;				
		}
		
		if(carry>0)
		{
			ListNode newNode=new ListNode(carry);
			dummy.next=newNode;
			dummy=newNode;
		}
		return dummyNode.next;
        
    }
}