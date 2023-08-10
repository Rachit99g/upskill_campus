import java.util.*;

/*public class hm {
    static void freq(int arr[]){
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = arr.length;
        for(int i:arr){
            if(map.containsKey(i)){
                map.put(i, map.get(i)+1);
            }
            else{
                map.put(i, 1);
            }
        }
        for(int key : map.keySet()){
            if(map.get(key) > n/3){
                System.out.println(key);
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,3};
        freq(arr);
    }
}*/
/*public class hm{
    static void union(int arr[],int arr1[]){
    HashSet<Integer>  Hs = new HashSet<>();
    for(int i:arr){
        Hs.add(i);
    }
    for(int i:arr1){
        Hs.add(i);
    }

        System.out.println(Hs);
    
}
    public static void main(String[] args) {
        int arr[] = {7,3,9};
        int arr1[] = {6,3,92,9,4};
        union(arr, arr1);
    }
}*/
/*public class hm{
    static void intersection(int arr[],int arr1[]){
    HashSet<Integer> hs = new HashSet<>();
    for(int i:arr){
        hs.add(i);
    }
    int count = 0;
    for(int j:arr1){
        if(hs.contains(j)){
            System.out.print(j+" ");
            count++;  //Intersection of two arrays
        }
        else{
            hs.add(j);
        }
    }
    System.out.println();
    System.out.println("total = "+count);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,8};
        int arr1[] = {1,2,3,4,5,6,8};
        intersection(arr, arr1);
    }
}*/
/*public class hm{
    static String distance(HashMap<String,String>tickets){
        HashMap<String,String> reverseMap = new HashMap<>();

        for(String key:tickets.keySet()){
            reverseMap.put(tickets.get(key),key);
        }

        for(String key: tickets.keySet()){
            if(!reverseMap.containsKey(key)){
                return key;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        int arr[] = {};// itinerary
        HashMap<String,String> tickets = new HashMap<>();
        tickets.put("Chennai", "Bengluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");
        String start = distance(tickets);
        while(tickets.containsKey(start)){
            System.out.print(start+" -> ");
            start = tickets.get(start);
        }
        System.out.println(start);
    }
}*/

///////////////////////////////////////////// SUBARRAY SUM EQUAL TO K////////////////////////////////////////////////
public class hm{
    static int subsumeqtok(int arr[],int k){
        int sum = 0;
        for(int i = 0; i < arr.length;i++){
            for(int j = 0; j < arr.length;j++){
                sum +=arr[j];
                if(sum==k){
                    return j;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {10,2,-2,-20,10};
        int k = -10;
        System.out.println(subsumeqtok(arr, k));
    }
}
/*public class hm{
    public static void main(String[] args) {
        int arr[] = {};
        int k  = -10;
    }
}*/