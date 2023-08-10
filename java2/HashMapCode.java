import java.util.*;

public class HashMapCode {
    static class HashMap<K,V>{
        private class Node{
            K key;
            V value;
            public Node(K key, V value){ // constructor of Node class for assigning value of key and value
                this.key = key;// this keyword is used to seprate the variables
                
                this.value = value;
            }
        } // here we complete the process of making the node of the linked list


        private int n; // n si the the number of thr nodes in the linked list
        private int N = 4; //n is the number of the bucket in the array
        private LinkedList<Node> buckets[]; // here we create a array of linkedlist


        @SuppressWarnings("unchecked") // for remove unwanted lines from the code during the compileation of thr code
        public HashMap(){ //here is the constructor of the class HashMap
            this.N = 4;
            this.buckets = new LinkedList[4];
            for(int i = 0; i < 4;i++){
                this.buckets[i] = new LinkedList<>();
            }
        }
        private int hashFunction(K key){
            int bi = key.hashCode();
            return Math.abs(bi)%N;
        }
        private int searhInLL(K key,int bi){
            LinkedList<Node>ll = buckets[bi];//is vale bucket index pr hmari linked list store hai jiska naam ll hai;
            int di = 0;
            for(int i = 0; i < ll.size();i++){
                if(ll.get(i).key==key){
                    return i;
                }
            }
            return -1;
        }
        @SuppressWarnings("unchecked")
        public void rehash(){
            //before rehashing we have to store the previous bucket data into somewhere
            LinkedList<Node>oldbuckets[] = buckets;
            buckets = new LinkedList[N*2];
            for(int i = 0; i < oldbuckets.length;i++){
                LinkedList<Node>ll = oldbuckets[i];//har bucket index pr ek linked list store hogi
                for(int j = 0; j < ll.size();j++){// linked list ka ek ek node nikalo or put function mei daldo
                    // put function new linked list mei data ko store kr dega//
                    Node node = ll.get(j);
                    put(node.key,node.value); //put hmesha nayi vali linkedlist mei hi store krta hai//
                }
            }
        }
       public void put(K key, V value){
           int bi /*Bucket index*/ =  hashFunction(key);
           int di /*Data index */ = searhInLL(key,bi);
           if(di == -1){
            //key does'nt exist
            buckets[bi].add(new Node(key, value));
            n++;
           }
           else{
            //key exist
            Node node = buckets[bi].get(di);
            node.value = value;
           }
           double lambda = (double) n/N;
           if(lambda>2.0){
            rehash();
           }
        }
        public boolean containskey(K key){
            int bi /*Bucket index*/ =  hashFunction(key);
           int di /*Data index */ = searhInLL(key,bi);
           if(di == -1){
            //key does'nt exist
            return false;
           }
           else{
            //key exist
            return true;
           }
        }

        public V remove(K key){
        int bi /*Bucket index*/ =  hashFunction(key);
           int di /*Data index */ = searhInLL(key,bi);
           if(di == -1){
            return null;
           }
           else{
            //key exist
            Node node = buckets[bi].remove(di);
            n--;
            return node.value;
           }
        }
        
        public V get(K key){
        int bi /*Bucket index*/ =  hashFunction(key);
        int di /*Data index */ = searhInLL(key,bi);
        if(di == -1){
            //key does'nt exist
            return null;
           }
           else{
            //key exist
            Node node = buckets[bi].get(di);
            return node.value;
           }
        }

        public ArrayList<K> keySet(){
            ArrayList<K>keys = new ArrayList<>();
            for(int i = 0; i < buckets.length;i++){
                LinkedList<Node>ll = buckets[i];
                for(int j = 0; j < ll.size();j++){
                    Node node = ll.get(j);
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public boolean isEmpty(){
            return n==0;
        }
    }
    public static void main(String[] args) {
        HashMap<String,Integer>map = new HashMap<>();
        map.put("India",190);
        map.put("China",200);
        map.put("pakistan",30);
        map.put("Russia",160);
        map.put("Russia",300);
        ArrayList<String>keys = map.keySet();
        for(int i = 0; i < keys.size();i++){
            System.out.println(keys.get(i)+" "+map.get(keys.get(i)));
        }
    }
}
