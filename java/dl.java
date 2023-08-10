
/*public class dl {
    Node head;
    static class Node{
        int data;
        Node prev;
        Node next;

        Node(int data){
            this.data = data;
            this.prev = prev;
            this.next = null;
        }
    }
    public static dl insert_end(dl list,int data){
        Node new_node = new Node(data);
        if(list.head==null){
            list.head = new_node;
        }
        else{
            list.head.next = new_node;
            new_node.prev = list.head;
        }
        return list;
        
    }

    public static void printlist(dl list){
        Node curr_node  = list.head;
        if(curr_node == null){
            System.out.println("Null");
        }
        else{
            while (curr_node != null) {
                
                System.out.print(curr_node.data + "->");
        
                curr_node = curr_node.next;
            }
        }
    }

    public static void main(String[] args)
	{
		
		dl list = new dl();

        list = insert_end(list,4);
        list = insert_end(list,5);
        list = insert_end(list,6);
		
		printlist(list);
}
}
*/