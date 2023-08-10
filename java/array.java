import java.util.*;
/* 
public class array{
    public static void main(String[] args){
        int arr[] = {-1,-2,-3,-4,-5,0,1,2,3,4,5,6,7,8,9};
        int len = arr.length-1;
        int high = len;
        int start = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number You want to find out = "+"");
        int value = sc.nextInt();
        int mid = start+(high-start)/2;
        if(arr[mid]== value){
            System.out.println(mid);
        }
        if(arr[mid]<value){
            for(int i = mid; i < len;i++){
                if(arr[i]==value){
                    System.out.print("Value found at index ="+" "+i+" ");
                }
            }
        }
        if(arr[mid]>value){
            for(int i = start; i < mid;i++){
                if(arr[i]==value){
                    System.out.println("Value found at index ="+" "+i+" ");
                }
            }
        }
        System.out.println("Mid of array is = "+" "+mid);
    }
}*/
/*public class array{
    static int findpeak(int arr[], int n){
        if(n==1)
        return 0;
        if(arr[0] > arr[1])
        return 0;
        if(arr[n - 1] >= arr[n-2])
        return n-1;

        for (int i = 1; i < n - 1; i++) {
            // Check if the neighbors are smaller
            if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1])
                return i;
        }
        return 0;
    }
    public static void main(String[] args) {
        int arr[] = {1,3,20,4,1,0};
        int n = arr.length;
        System.out.println("Index of peak point is "+ findpeak(arr,n));
    }
}
public class array{
    static int find(int arr[],int n){
        if(n==1)
        return 0;
        if(arr[0]>arr[1])
        return 0;
        if(arr[0]<arr[1])
        return 1;
        if(arr[n - 1]>=arr[n-2])
        return n-1;
        for(int i = 1; i < n-1;i++){
            if(arr[i] >= arr[n-1] && arr[i]>=arr[i+1])
            return arr[i];
        }
        return 0;
    }
    public static void main(String[] args) {
        int arr[] = {1,3};
        int n = arr.length;
        System.out.print("Peak number is ="+" "+find(arr,n));
    }
}*/
/*public class array{
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,900,8000,8};
        int n = arr.length;
        int value1 = 0;
        int value2 = 0;
        int max = arr[0];
        int max1 = max+1;
        int max2 = max1+1;
        for(int i = 0; i < n-1;i++){
            for(int j = max1; j < n-2;j++){
                for(int k = max2;k<n-3;k++){
                    if(arr[k]>value2){
                        value2 = arr[k];
                    }
                }
            
            if(arr[j]>value1){
                value1 = arr[j];
            }
        }
    if(arr[i]>max){
        max=arr[i];
    }    
    }
        if(max>value1 && max>value2){
            System.out.print("greatest 1 = "+max);
        }
        else if(value1>value2){
            System.out.println(value1);
        }
        else if(value1>max){
            System.out.println("largest 1 = "+value1);
        }
        else{
            System.out.print("largest1 = "+value2);
        }
    }
}*/
/*public class array {
    static void fun(int n){
        if(n==0||n<0){
        System.out.print(n+" ");
        return;
        }
        System.out.print(n+" ");
        fun(n-5);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        int n;
        fun(16);
        
    }
}*/


/*public class array{
    static int sum(int n){
        if(n==0)
        return 0;
        return n*sum(n-1);
    }
public static void main(String[] args) {
    int n;
    System.out.println(sum(5));
}
}*/
/*public class array{
    static boolean pallindrome(String str){
        int i = 0 , j= str.length()-1;
        while(i<j){
            if(str.charAt(i)!= str.charAt(j))
            return false;

            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "abba";
        str = str.toLowerCase();
        if(pallindrome(str))
        System.out.print("Yes");
        else
        System.out.print("No");
    }
}*/
/*public class array{
    static int getsum(int n){
        if(n==4)
        return n;
        else
        return 2*getsum(n+1);
    }
    public static void main(String[] args) {
        int n;
        System.out.println(getsum(2));
    }
}*/
/*public class array{
    static int fact(int n){
        if(n==1||n==0)
        return 1;
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        int n;
        System.out.println(fact(9));
    }
}*/

/*public class array{
    static void mul(int n,int i){
        if(i>10)
        return;
        System.out.println(n+"*"+i+" = "+n*i);

        mul(n,i+1);
    }
    public static void main(String[] args) {
        int n = 5;
        mul(n,1);
        
    }
}*/
/*public class array{
    static int jos(int n,int k){
        if(n==1)
        return 0;

        return (jos(n-1,k)+k)%n;
    }
    public static void main(String[] args) {
        int n;
        int k;
        System.out.println(jos(3,2)
        );

public class array{
    static int count(int n){
        int res = 0;
        while(n>0){
            n= n /10;
            res++;
        }
        return res;
    }
    public static void main(String[] args) {
        int n;
        System.out.println(count(555));
    }
}*/
/*public class array{
    static int fact(int n){
        if(n==1||n==0)
        return 1;
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        int n;
        System.out.println(fact(5));
    }
}*/
/*class array
{
    public double jjk(int C)
    {
        //Your code here
        if(C==0)
        return 0;
        return (9/5)*(C+32);
    }
    public static void main(String[] args){
        int C;
        System.out.println(jjk(32));
    }
}*/
/*public class array{
    static int count(int n){
        int res=0;
        for(int i = 5; i <=n;i=i*5)
        res = res+n/i;
        return res;
    }

    public static void main(String[] args) {
        int n;
        System.out.println(count(251));
    }
}*/
/*public class array{
    static boolean palin(int n){
        int rev = 0;
        int temp = n;
        while(temp!=0){
            int var = temp%10;
            rev = rev*10+var;
            temp = temp/10;
        }
        return (rev==n);
    }
    public static void main(String[] args) {
        int n;
        System.out.println(palin(111));
    }
}
public class array{
    static boolean func(int n){
        if(n==1)
        return true;
        if(n==2||n==3)
        return true;
        if(n%2==0||n%3==0)
        return false;
        for(int i = 5; i*i<=n;i=i+6)
        if(n%i==0||n%(i+2)==0)
        return false;
        return true;
    }
    public static void main(String[] args) {
        int n;
        System.out.println(func(121));
    }
}*/
/*public class array{
    static void prime(int n){
        if(n<1)
        return;

        for(int i = 2; i * i<=n;i++){
            while(n%i==0){
                System.out.println(i);
                n=n/i;
            }
        }
        if(n>1){
            System.out.println(n);
        }
    }
    public static void main(String[] args) {
        int n;
        System.out.println(prime(450));
    }
}*/
/* 
import java.util.*;
import java.util.Arrays;
public class array{
    public static void main(String[] args) {
        int count = 0;
        String str = "Kallukiaayegibaratrangilihogiraat";
        String str1 = str.toLowerCase();
        char arr[] = str1.toCharArray();
        int i = 0;
        char temp;
        while(i<arr.length){
            int j = i+1;
            while(j<arr.length){
                if(arr[j]<arr[i]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j+=1;
            }
            i+=1;
            count++;
        }
        System.out.println(arr);
        System.out.println("Total char are = "+count);
    }
}*/
/*import java.util.*;*/
/*public class array{

    public static void main(String[] args) {
        String str = "helloworldimfrompelak";
        for(int i = 0; i <str.length();i++){
            if(i%2!=0){
                System.out.println("Char at "+i+"index is "+str.charAt(i));
            }
        }
    }
}*/
/*public class array{
    public static void main(String[] args) {
        int count = 0;
        String str = "Rachi";
        for(int i = 0; i < str.length();i++){
            if(str.charAt(i)=='t'){
                count++;
            }
        }
        System.out.println("number of times t occur = "+count);
    }
}*/
/* 
class array {
    // A utility function that returns maximum of two integers
    static int max(int a, int b) { return (a > b) ? a : b; }

    // Returns the maximum value that can be put in a
    // knapsack of capacity W
    static int knapSack(int W, int wt[], int val[], int n)
    {
        int i, w;
        int K[][] = new int[n + 1][W + 1];

        // Build table K[][] in bottom up manner
        for (i = 0; i <= n; i++) {
            for (w = 0; w <= W; w++) {
                if (i == 0 || w == 0)
                    K[i][w] = 0;
                else if (wt[i - 1] <= w)
                    K[i][w] = max(val[i - 1] + K[i - 1][w - wt[i - 1]], K[i - 1][w]);
                else
                    K[i][w] = K[i - 1][w];
            }
        }

        return K[n][W];
    }

    // Driver Code
    public static void main(String args[])
    {
        int val[] = new int[] {4,5,3,7};
        int wt[] = new int[] {2,3,1,4};
        int W = 5;
        int n = val.length;

        System.out.println(knapSack(W, wt, val, n));
    }
}*/
// rotation of array//
/*public class array{
    public static void main(String[] args) {
        String str = "Rachit";
        String s1;
        String s2;
        s1 = str.substring(2)+str.substring(0,2);
        System.out.println("Left Rotate in String"+s1);
        s2 = str.substring(4,6)+str.substring(0, 4);
        System.out.println("Right-Rotate in String"+s2);

    }
}
//Sorting a String//
public class array{
    public static void main(String[] args) {
        String str = "Rachit tu to kamal hai bhai";
        char arr[] = str.toCharArray();
        int n = arr.length;
        for(int i = 0; i < n;i++){
            for(int j = i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
            }
            }
        }
        System.out.println(arr);
    }
}
*/
/*public class array{
    public static void main(String[] args) {
        int arr[] = {5,10,20,6,3,8};
        int n = arr.length;
        int res = 1;
        for(int i = 0; i < n;i++){
            int curr = 1;
            for(int j = i+1; j < n;j++){
                if(arr[j]%2==0 && arr[j-1]%2!=0 || arr[j]%2!=0 && arr[j-1]%2==0){
                    curr++;
                }
                else{
                    break;
                }
            }
            res = Math.max(res,curr);
        }
        System.out.print(res);
    }
}*/
// maximum sum of subarray of an array//
/*public class array{
    static int func(int arr[]){
        int n = arr.length;
        int res = arr[0];
        for(int i = 0; i < n;i++){
            int sum = 0;
            for(int j = i; j < n;j++){
                sum = sum+arr[j];
                res = Math.max(res,sum);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {1,-2,3,-1,2};
        System.out.println(func(arr));
    }
}*/
// Maximum multiplication of subarray of an array//
/*public class array{
    static int func1(int arr[]){
        int n = arr.length;
        int max_mul = arr[0];
        for(int i = 0; i < n;i++){
            int mul = 1;
            for(int j = i;j< n;j++){
                mul = mul*arr[j];
                max_mul = Math.max(mul,max_mul);
            }
        }
        return max_mul;
    }
    public static void main(String[] args) {
        int arr[] = {1,-2,3,-1,2};
        System.out.println(func1(arr));
    }
}*/
//maximum subtraction of subarray of array//
/*public class array{
    static int mum(int arr[]){
        int n = arr.length;
        int max_sub = arr[0];
        for(int i = 0; i < n;i++){
            int sub = 0;
            for(int j = i; j < n;j++){
                sub = arr[j]-sub;
                max_sub = Math.max(sub,max_sub);
            }
        }
        return max_sub;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        System.out.println(mum(arr));
    }
}*/
//Window sliding technique k is given to find sum of sub array//
/*public class array {
    static boolean func(int arr[],int n){
        for(int i = 0; i < n;i++){
            int ls = 0;
            int rs = 0;
            for(int j = 0;j<i;j++)
            ls = ls+arr[j];
            for(int k = i+1;k<n;k++)
            rs = rs+arr[k];

            if(ls==rs)
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {3,4,8,-9,9,7};
        int n = arr.length;
        System.out.println(func(arr,n));
    }
}*/
/*public class array{
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int n = arr.length;
        int arr2[] = new int[n+1];
        int index = 2;
        int value = 85;
        for(int i = 0; i < n+1;i++){
            if(i<index){
                arr2[i] = arr[i];
            }
            else if(i==index){
                arr2[i] = value;
            }
            else{
                arr2[i] = arr[i-1];
            }
        }
        for(int i = 0; i <arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }
        System.out.print(" " +"Time complexity is O(n)");
    }
}*/
/*public class array
{ 
    static void lRotateOne(int arr[], int n)
    {
    	int temp = arr[0];

    	for(int i = 1; i < n; i++)
    	{
    		arr[i - 1] = arr[i];
    	}

    	arr[n - 1] = temp;
    }

    static void leftRotate(int arr[], int d, int n)
    {
    	for(int i = 0; i < d; i++)
    	{
    		lRotateOne(arr, n);
    	}
    }

    public static void main(String args[]) 
    { 
       int arr[] = {1, 2, 3, 4, 5}, n = 5, d = 2;

       System.out.println("Before Rotation");

       for(int i = 0; i < n; i++)
       {
       		System.out.print(arr[i]+" ");
       }

       System.out.println();

       leftRotate(arr, d, n);

       System.out.println("After Rotation");

       for(int i = 0; i < n; i++)
       {
       		System.out.print(arr[i]+" ");
       }

    } 

}*/
/*public class array{
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int n = arr.length;
        int temp = arr[3];
        for(int i = 0;i<n;i++){
            if(i==3){
                for(int j = 4;j<n;j++){
                    arr[j-1] = arr[j];
                }
                arr[n-1] = temp;
            }
            System.out.print(arr[i]+" ");
        }
    }
}*/
