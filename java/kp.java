/*public class kp{
    Node head;
//reverse of linked list//
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static kp insert_beg(kp list , int data){
        Node new_node = new Node(data);
        Node temp = list.head;
	
		if (list.head == null) {
			new_node.next = new_node;
           list.head = new_node;
		}

        else{
            while(temp.next != list.head){
                temp = temp.next;
            }
            temp.next = new_node;
            new_node.next = list.head;
            list.head = new_node;
        }
        return list;
    }
    
    public static void printlist(kp list){
        Node currNode = list.head;
	
		System.out.print("LinkedList: ");

		if(currNode==null){
			System.out.println("Null");
		}

		else{
		while (currNode.next!= list.head) {
			// Print the data at current node
			System.out.print(currNode.data + "->");
	
			currNode = currNode.next;
		}
        System.out.print(currNode.data);
	}
    }

public static void main(String[] args)
{
    kp list = new kp();

    list = insert_beg(list,1);
    list = insert_beg(list,2);
    list = insert_beg(list,3);
    list = insert_beg(list,4);
    printlist(list);
}
}*/