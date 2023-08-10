import java.util.LinkedList;

public class hashmap{
    static class hashmapcode<K,V>{//generics
        private class Node{
            K key;
            V value;
            public Node(K key,V value){
                this.key = key;
                this.value = value;
            }
        }

        private int n;// number of nodes of linked list in array at every bucket
        private int N;// numbers of bucket in array
        private LinkedList<Node> buckets[];// the semelarity between the in private int arr[] and the given below is that
        // private show the access modifier and the int show the type of the arr
        //just like private LinkedList<Node> buckets[] private show the access modifier and type of buckets array is linked list

        @SuppressWarnings("unchecked")

        public hashmapcode(){
            this.N = 4;
            this.buckets = new LinkedList[4];//here we initialise the array
            for(int i = 0; i < 4;i++){
                this.buckets[i] = new LinkedList<>();
            }
        }
        
        private int hashFunction(K key){
            int bi = key.hashCode();
            return Math.abs(bi)%N;
        }
    }
    public static void main(String[] args) {
        
    }
}