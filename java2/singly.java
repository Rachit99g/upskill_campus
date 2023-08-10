public class singly{
    Node head;
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void addlast(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next!=null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    //Delete Last
    public void deleteLast(){
        if(head==null){
            System.out.println("BSDK KUCH ENTER KREGA TABHI TO KUCH DIKHEGA");
            return;
        }
        if(head.next==null){
            head = null;
            return;
        }
        Node secontdNode = head;
        Node last = head.next;
        while(last.next!=null){
            last = last.next;
            secontdNode = secontdNode.next;
        }
        secontdNode.next = null;

    }

    public void printl(){
        if(head==null){
            System.out.println("BSDK KUCH ENTER KREGA TABHI TO KUCH DIKHEGA");
            return;
        }
        Node currNode = head;
        while(currNode!=null){
            System.out.print(currNode.data+"->");
            currNode = currNode.next;
        }
        System.out.println();
        System.out.println("SORRY BHAI "+ ""+" TUMNE TO ENTER KRA HAI");
        System.out.println();
    }

    public static void main(String[] args) {
          singly list = new singly();
          list.deleteLast();
          list.printl();
    }
}
