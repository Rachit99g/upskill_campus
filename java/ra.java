/*public class ra{
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null; 
        }
    }
    public static ra insert(ra list, int data){
        Node new_node = new Node(data);
        if(list.head==null){
            list.head = new_node;
        }
        else{
            Node temp = list.head;
            Node val = list.head;
            while(temp.next !=val){
                temp= temp.next;
            }
            temp.next = new_node;
        }
        return list;
    }
    public static void printlist(ra list){
        Node curr_node = list.head;
        if(curr_node==null){
            System.out.println("Empty list");
        }
        else{
            while(curr_node!=list.head){
                System.out.print(curr_node.data+"->");
                curr_node=curr_node.next;
            }
        }
    }
    public static void main(String[] args){
        ra list = new ra();
        list = insert(list,1);
        list = insert(list,2);
        list = insert(list,3);
        list = insert(list,4);
        list = insert(list,5);
        printlist(list);
    }
}*/
public class ra{
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static ra insert(ra list,int data){
        Node new_node = new Node(data);
        if(list.head==null){
            list.head = new_node;
        }
        else{
            Node temp = list.head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next = new_node;
        }
        return list;
    }
    public static void print(ra list){
        Node curr_node = list.head;
        if(curr_node==null){
            System.out.println("Empty list");
        }
        else{
            Node temp = list.head;
            while(temp.next!=null){
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
        }
    }
    public static void main(String[] args){
        ra list = new ra();
        list = insert(list,1);
        list = insert(list,2);
        list = insert(list,3);
        list = insert(list,4);
        list = insert(list,5);
        list = insert(list,6);
        print(list);
    }
}