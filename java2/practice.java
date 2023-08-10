import java.util.*;
/*public class practice {
    static int Maxi(int arr[],int n){
        int min = Integer.MIN_VALUE;
        int max = 0;
        for(int i = 0; i<n;i++){
            if(arr[i]>min){
                min = arr[i];
                max = Math.max(max,min);
            }
        }
        return max;
    }
    static int Mini(int arr[],int n){
        int max = Integer.MAX_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<n;i++){
            if(arr[i]<max){
                max = arr[i];
                min = Math.min(max,min);
            }
        }
        return min;
    }
    public static void main(String[] args) {
        // Maximum and minimum of an array 
        int arr[] = {3, -555, 4, -1, -9};
        int n = arr.length;
        System.out.println("Maximum in array is = "+ Maxi(arr, n));
        System.out.println("Minimum in array is = "+ Mini(arr, n));
    }
}
*/
/*public class practice{
    static void rever(int arr[],int n){
        if(n==1){
            return ;
        }
        int start = 0;
        int end = n-1;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        for(int i = 0; i < n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int n = arr.length;
        rever(arr, n);
    }
}*/
////KADENE'S ALGORITHUM
/*public class practice{
    static int maxsum(int arr[],int n){
        int sum = 0;
        int maxi = Integer.MIN_VALUE;
        for(int i = 0; i < n;i++){ //Kadaen's algorithum
            sum += arr[i];
            maxi = Math.max(maxi,sum);
            if(sum<0){
                sum = 0;
            }
        }
        return maxi;
    }
    public static void main(String[] args) {
        int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        int n = arr.length;
        System.out.println(maxsum(arr, n));
    }
}*/
/*public class practice{
    static boolean dupl(int arr[],int n){
        for(int i = 0; i < n;i++){
            for(int j = i+1; j < n;j++){
                if(arr[j]==arr[i]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {-2, -3, 4, 1, 2, -1, 5, 3};
        int n = arr.length;
        System.out.println(dupl(arr, n));
    }
}*/
/*public class practice{

    public static int findMinDifference(int[] packets, int numChildren) {
        int n = packets.length;

        // If there are fewer chocolates than the number of children, return -1 (not possible).
        if (n < numChildren) {
            return -1;
        }

        // Sort the packets in ascending order.
        Arrays.sort(packets);

        // Initialize the minimum difference to a large value.
        int minDifference = Integer.MAX_VALUE;

        // Find the minimum difference by comparing the (i + numChildren - 1)th element with the ith element.
        for (int i = 0; i + numChildren - 1 < n; i++) {
            int difference = packets[i + numChildren - 1] - packets[i];
            minDifference = Math.min(minDifference, difference);
        }

        return minDifference;
    }

    public static void main(String[] args) {
        int[] packets = {12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50};
        int numChildren = 7;

        int minDifference = findMinDifference(packets, numChildren);
        System.out.println("Minimum difference between maximum and minimum chocolates: " + minDifference);
    }
}*/
public class practice{
    static int search(int arr[],int n){
        LinkedList<Integer> LL = new LinkedList<>();
        for(int i = 0; i < arr.length;i++){
            LL.add(i,arr[i]);
        }
        boolean flag = true;
        if(LL.contains(n)==flag){
            int c = LL.indexOf(n);
            return c;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {3, 5, 1, 2};
        int n = 2;
        System.out.println(search(arr,n));
    }
}