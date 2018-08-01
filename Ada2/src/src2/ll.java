package src2;


import java.util.*;
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
		
public class ll
{
  //  Node head;  
	
	/* Function to print linked list */
    void printList(Node head)
    {
        Node temp = head;
        while (temp != null)
        {
           System.out.print(temp.data+" ");
           temp = temp.next;
        }  
        System.out.println();
    }
	
     /* Drier program to test above functions */
    public static void main(String args[])
    {
         Scanner sc = new Scanner(System.in);
		 int t=sc.nextInt();
		 
		 while(t-->0)
         {
			int n = sc.nextInt();
			ll llist=new ll();
            GFG obj = new GFG();
            Node head=null;
            for(int i=0;i<n;i++)
            {
                int a1=sc.nextInt();
                int a2=sc.nextInt();
                if(a2==0)
                    head=obj.insertAtBeginning(head,a1);
                else
                    head=obj.insertAtEnd(head,a1);
            }
			llist.printList(head);
		}
	}
}


/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/*class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }*/
class GFG
{
// function inserts the data in front of the list and returns the head of LL.
	Node insertAtBeginning(Node head1,int a1)
	
	{ 
		System.out.println(head1.data);
		Node head=new Node(head1.data);
	head.next=head1.next;
	   Node a= new Node(a1);
	  a.next=head;
	  head1=a;
	  return head1;
	   
	}
// function appends the data at the end of the list and returns the head of LL.
	Node insertAtEnd(Node head1,int a1)
	{
	    Node a=new Node(a1);
	    while(head1!=null){
	        head1=head1.next;
	       
	    }
	    if(head1==null){
	             head1.next=a;
	        }
	    //Add your code here.
	    return head1;
	}
}