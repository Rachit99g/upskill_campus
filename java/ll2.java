public class ll2{
    Node head;
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
// delete first
    public void del_f(){
        if(head == null){
            System.out.println("The list is empty");
            return;
        }
        else{
            head = head.next;
        }
    }

    // delete last
    public void del_l(){
        if(head == null){
            System.out.println("The list is empty");
        }

        if(head.next == null){
            head = null;
            return;
        }

        Node second_last = head;
        Node last = head.next;
        while(last.next != null){
            last = last.next;
            second_last = second_last.next;
        }
        second_last.next = null;
    }

    public static ll2 insert_end(ll2 list, int data){
        Node newNode = new Node(data);
        if(list.head == null){
            list.head = newNode;
        }
        else{
            Node temp = list.head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
        return list;
    }

    public static void printList(ll2 list){
        Node trav = list.head;
        if(trav == null){
            System.out.println("Null list");
        }
        else{
            while(trav != null){
                System.out.print(trav.data + "->");
                trav = trav.next;
            }
        }
    }

    public static void main(String[] args){
        ll2 list1 = new ll2();

        list1 = insert_end(list1,1);
        list1 = insert_end(list1,2);
        list1 = insert_end(list1,3);
        list1 = insert_end(list1,4);
        list1.del_l();
        list1.del_f();

        printList(list1);
    }
}