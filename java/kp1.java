/*public class kp1 {
    //insert-END//

    Node head;

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static kp1 insert_beg(kp1 list , int data){
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
    public static kp1 insert_end(kp1 list, int data){
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
        }
        return list;
    }

    public static kp1 del_beg(kp1 list){
        Node curr = list.head;

        if(list.head == null){
            System.out.println("Underflow");
        }
        else if(list.head.next == list.head){
            list.head = null;
        }

        else{
            while(curr.next != list.head){
                curr = curr.next;
            }
                curr.next = list.head.next;
                list.head = list.head.next;
        }
        return list;
    }

    public static kp1 del_end(kp1 list){
        Node prev = null;
        Node curr  = list.head;

        if(list.head == null){
            System.out.println("Underflow");
        }
        else if(list.head.next == list.head){
            list.head = null;
        }

        else{
            while(curr.next != list.head){
                prev = curr;
                curr = curr.next;
            }
            prev.next = list.head;
        }
        return list;
    }

    public static void printlist(kp1 list){
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
    kp1 list = new kp1();

    list = insert_end(list,1);
    list = insert_end(list,2);
    list = insert_end(list,3);
    list = insert_end(list,4);
    list = insert_end(list,5);
    list = del_beg(list);
    list = del_end(list);
    list = del_end(list);
    list = del_end(list);
    list = del_end(list);
    printlist(list);
}
}
*/