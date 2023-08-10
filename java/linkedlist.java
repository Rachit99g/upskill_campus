/* 
// Java program to implement
// a Singly Linked List
public class linkedlist {

	Node head;// head of list

	// Linked list Node.
	// This inner class is made static
	// so that main() can access it
	static class Node {

		Node prev;
		int data;
		Node next;
		

		// Constructor
		Node(int data)
		{
			this.data = data;
			this.next = null;
		}
	}

	// Method to insert a new node
	public static linkedlist insert_end( linkedlist list,int data)
	{
		// Create a new node with given data
		Node new_node = new Node(data);
		

		// If the Linked List is empty,
		// then make the new node as head
		if (list.head == null) {
			list.head = new_node;
		}
		else {
			// Else traverse till the last node
			// and insert the new_node there
			Node temp = list.head;
			while (temp.next != null) {
				temp = temp.next;
			}

			// Insert the new_node at last node
			temp.next = new_node;
		}

		// Return the list by head
		return list;
	}

	public static linkedlist insert_beg(linkedlist list,int data){
        Node newNode = new Node(data);
        newNode.next=list.head;
        list.head=newNode;
        return list;

    }

	// Method to print the LinkedList.
	public static void printList(linkedlist list)
	{
		Node currNode = list.head;
	
		System.out.print("LinkedList: ");

		if(currNode.next==null){
			System.out.println("Null");
		}

		else{
		// Traverse through the LinkedList
		while (currNode != null) {
			// Print the data at current node
			System.out.print(currNode.data + "->");
	
			// Go to next node
			currNode = currNode.next;
		}
	}
	}
	
	public static void main(String[] args)
	{
		/* Start with the empty list. */
		/*linkedlist list = new linkedlist();

		//
		// ******INSERTION******
		//

		// Insert the values
		list = insert_end(list,2);
		list = insert_end(list,3);
		list = insert_end(list,4);
		list = insert_end(list,5);
		
		list = insert_end(list,1);
		list = insert_beg(list,99);
		// Print the LinkedList
		printList(list);
}
}
*/
