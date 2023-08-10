import java.util.*;
/*public class Sorting{
    static void rot(int arr[],int n){
        int temp = arr[0];
        for(int i = 1; i < n;i++ ){
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
    }
    
    static void lf(int arr[],int d,int n){
        for(int i = 0; i <d;i++){
            rot(arr,n);
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int n = arr.length;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of D = " );
        int d = sc.nextInt();
        System.out.println("Before Rotation ");
        for(int i = 0; i < n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        lf(arr, d, n);

        System.out.println("After Rotation");
        for(int i = 0; i < n;i++){
            System.out.print(arr[i]+" ");
        }

    }
}/* 
public class Sorting{ // TIME COMPLEXITY = O(N)
                     //SPACE COMPLEXITY = O(N)
    static void reva(int arr[],int d,int n){
        int temp [] = new int[d];
        for(int i = 0; i < d;i++){
            temp[i] = arr[i];
        }
        for(int i = d; i < n;i++){
            arr[i-d] = arr[i];
        }
        for(int i = 0; i <d;i++){
            arr[n-d+i] = temp[i];
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int n = arr.length;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of elements to be rotated = ");
        int d = sc.nextInt();
        System.out.println("Before Rotation");

        for(int i = 0; i < n;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();
        reva(arr, d, n);

        System.out.println("After Rotation");
        for(int i = 0; i < n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
*/

/*public class Sorting{
    static int find(int arr[],int n){
        int maxidx = 0;
        int maxvalue = Integer.MIN_VALUE;

        for(int i = 0; i < n;i++){
            if(arr[i]>maxvalue){
                maxvalue = arr[i];
                maxidx = i;
            }
        }
        return maxidx;
    }
    public static void main(String[] args) {
        int arr[] = {10,5,8,12,7};
        int n = arr.length;
        System.out.println(find(arr, n));
    }
}*/
/* 
public class Sorting{
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int n = arr.length;
        for(int i = 0; i < n-1;i++){
            arr[i] = arr[i+1];
            System.out.print(arr[i]+" ");
        }
    }
}*/

//Lomuto-Partition
/*public class BinaryArraySorter {
    public static void sortBinaryArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            while (arr[left] == 0 && left < right) {
                left++;
            }

            while (arr[right] == 1 && left < right) {
                right--;
            }

            if (left < right) {
                arr[left] = 0;
                arr[right] = 1;
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int[] binaryArray = {1, 0, 1, 0, 0, 1, 1, 0};
        sortBinaryArray(binaryArray);

        // Print sorted binary array
        for (int num : binaryArray) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}*/
/*public class Sorting{

    static int partition(int[] arr, int low, int high){
        int pivot = arr[low];
        int i = low-1 , j = high+1;

        while(true){
            do{
                i++;
            }

            while(arr[i] < pivot);

            do{
                j--;
            }
            while(arr[j]>pivot);

            if(i>=j)
            return j;

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

    }

        static void quicksort(int arr[],int low, int high){
            if(low < high){
                int pi = partition(arr, low, high);

                quicksort(arr,low,pi);
                quicksort(arr,pi+1,high);
            }
        
    }
    public static void main(String[] args) {
        int arr[] = {12,12,12,12 };
        int n = arr.length;
        quicksort(arr,0,n-1);
        System.out.print("[");
        for(int i = 0; i < n;i++){
            
            System.out.print(arr[i]+" ");
            
        }
        System.out.print("]");
    }
}*/
/*public class ThreeWayPartitioning {
    public static void threeWayPartition(int[] arr, int lowVal, int highVal) {
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;
        
        while (mid <= high) {
            if (arr[mid] < lowVal) {
                swap(arr, low, mid);
                low++;
                mid++;
            } else if (arr[mid] > highVal) {
                swap(arr, mid, high);
                high--;
            } else {
                mid++;
            }
        }
    }
    
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public static void main(String[] args) {
        int[] arr = {2, 0, 1, 2, 0, 1, 0};
        int lowVal = 1;
        int highVal = 2;
        
        System.out.println("Before partitioning: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        
        threeWayPartition(arr, lowVal, highVal);
        
        System.out.println("\nAfter partitioning: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}*/
//Lomuto partition Quick Sort (UNSTABLE ALGORITHUM)//
/*public class Sorting{
    static int lom(int arr[], int low,int high){
        int pivot = arr[0];
        int k = 5;
        int i = low-1;
        int temp = 0;
        for(int j = low; j < high;j++){
            if(arr[j]<pivot){
            i++;
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            }

        }
        temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return (i+1);
    }
    static void Qc(int arr[],int low, int high){
        int k = 5;
        if(low < high){
            int perfect = lom(arr, low, high);
            Qc(arr, low,perfect-1);
            Qc(arr,perfect+1,high);
            if(perfect==k-1)
            return arr[perfect];

            else if()
            
        }
        }
    public static void main(String[] args) {
        int arr[] = {10,80,30,90,40,50,70};
        int n = arr.length-1;
        int low = 0;
        int high = n;
        Qc(arr, low, high);
        for(int k = 0; k < n+1;k++){
            System.out.print(arr[k]+" ");
        }
    }
}
*/
//choclate distribution
/*public class Sorting{
    static int choc(int arr[],int stud,int n){
        if(stud==0 || n==0)
        return 0;
        Arrays.sort(arr);
        if(stud>n)
        return -1;
        
        int res = Integer.MAX_VALUE;
        for(int i = 0;i+stud-1<n;i++){
            int diff = arr[i+stud-1]-arr[i];
            res = Math.min(diff,res);
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {12, 4,  7,  9,  2,  23, 25, 41, 30,
            40, 28, 42, 30, 44, 48, 43, 50};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of students = ");
        int stud = sc.nextInt();
        int n = arr.length;
        System.out.println(choc(arr, stud,n));
    }
}*/
/*public class Sorting{
    static int ch(int arr[],int m , int all){
        if(all==0|| m==0)
        return -1;

        if(all>m)
        return -1;

        Arrays.sort(arr);

        int minn = Integer.MAX_VALUE;
        for(int i = 0;i+all-1<m;i++){
            int diff = arr[i+all-1]-arr[i];
            minn = Math.min(diff,minn);
        }
        return minn;
    }
    public static void main(String[] args) {
        int arr[] = {12, 4,  7,  9,  2,  23, 25, 41, 30,
            40, 28, 42, 30, 44, 48, 43, 50};
            int m = arr.length;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the no of students = ");
            int all = sc.nextInt();
            System.out.print(ch(arr, m, all));
    }
}*/
//two way sorting
/*public class Sorting{
    static void rep(int arr[],int n){
        int []temp = new int[n];
        int i = 0;
        for(int j = 0; j < n;j++){
            if(arr[j]<0){
                temp[i] = arr[j];
                i++;
            }
        }
        for(int j = 0;j < n;j++){
            if(arr[j]>0){
                temp[i] = arr[j];
                i++;
            }
        }
        for(int k = 0; k <n;k++){
            arr[k]=temp[k];
        }
        for(int f= 0;f<temp.length;f++){
            System.out.print(arr[f]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {13,-12,18,-10};
        int n = arr.length;
        rep(arr, n);
    }
}*/
/*public class Sorting{
    public void ls(int arr[],int n){
        int low = 0;
        int hi = n-1;
        int mid = 0;
        int temp;
        while(mid<=hi){
            if(arr[mid]==0){
                temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                temp = arr[mid];
                arr[mid] = arr[hi];
                arr[hi] = temp;
                hi--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,1,2,0,2,1,0,2};
        int n = arr.length;
        Sorting sr = new Sorting();
        sr.ls(arr, n);
        for(int i = 0; i <n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
*/
public class Sorting{
    static void merg(int arr1[],int arr2[],int n,int m){
        for(int i = n;i< m;i++)
        for(int j = 0;j < n;j++){
            arr1[n+j] = arr2[j];
        }
    }
    public static void main(String[] args) {
        int arr1[] = {1,2,3,0,0,0};
        int arr2[] = {2,5,6};
        int m = arr1.length;
        int n = arr2.length;
        merg(arr1, arr2, n, m);
        Arrays.sort(arr1);
        for(int k = 0; k < arr1.length;k++ ){
            System.out.print(arr1[k]+" ");
        }
    }
}