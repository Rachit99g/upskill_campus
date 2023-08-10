public class ll{
    Node head;
    static class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;

        }
    }
    public static ll insert(ll list, String data){
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
    public static void printList(ll list){
        Node currNode = list.head;
        System.out.println("Linked-List :");
        if(currNode == null){
            System.out.println("Null list");
        }
        else{
            while(currNode != null){
                System.out.print(currNode.data +"->");

                currNode = currNode.next;
            }
        }
    }

    public static void main(String[] args){
        ll list = new ll();
    list = insert(list,"Yes");
    list = insert(list,"I");
    list = insert(list,"Created");
    list = insert(list,"a");
    list = insert(list,"Linked-List");
    list = insert(list,"hello");

    printList(list);
    }
}
