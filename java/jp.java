/*  Adding in begning//
public class jp{
    Node head;

    static class Node{

        Node prev;
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
            this.prev  = prev;
        }

    }

    public static jp insert_bg(jp list ,int data){

        Node New = new Node(data);
        if(list.head == null){
            list.head = New;
        }

        else{
            New.next = list.head;
            list.head.prev = New;
            list.head = New;
        }
        return list;
    }

    public static void printlist(jp list){
        Node curr = list.head;
        if(curr == null){
            System.out.println("Null");
        }
        else{
            while(curr != null){
                System.out.print(curr.data+"->");
                curr = curr.next;

            }
        }
    }

    public static void main(String[] args){
        jp list = new jp();

        list = insert_bg(list, 1);
        list = insert_bg(list, 2);
        printlist(list);

    }
}*/