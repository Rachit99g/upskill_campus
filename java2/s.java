import java.util.*;
/*public class s{
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5};
        int arr2[]  = {6,7,8,9,1,2,3};
        int temp[] = new int[3];
        for(int i = 0;i < arr1.length;i++){
            for(int j = 0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    temp[i]=arr1[i];
                }
            }
        }
        for(int k = 0;k<temp.length;k++){
            System.out.print(temp[k]+" ");
        }
    }
}
*/
/*public class s{
    public static int minOperations(int N) {
        int[] dp = new int[N + 1];
        
        for (int i = 2; i <= N; i++) {
            dp[i] = 1 + dp[i - 1];
            
            if (i % 2 == 0)
                dp[i] = Math.min(dp[i], 1 + dp[i / 2]);
            
            if (i % 3 == 0)
                dp[i] = Math.min(dp[i], 1 + dp[i / 3]);
        }
        
        return dp[N];
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number = ");
        int N = sc.nextInt();
        int minOps = minOperations(N);
        System.out.println("Minimum operations to convert " + N + " to 1: " + minOps);
    }
}*/
// Java implementation of above approach


/*class s{
	
// Function that returns the minimum
// number of operations to be performed
// to reduce the number to 1
public static int count_minimum_operations(int n)
{
	
	// Base cases
	if (n == 2)
	{
		return 1;
	}
	else if (n == 1)
	{
		return 0;
	}
	if (n % 3 == 0)
	{
		return 1 + count_minimum_operations(n / 3);
	}
	else if (n % 3 == 1)
	{
		return 1 + count_minimum_operations(n - 1);
	}
	else
	{
		return 1 + count_minimum_operations(n + 1);
	}
}

// Driver code
public static void main(String []args)
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number = ");
    int n = sc.nextInt();
	int ans = count_minimum_operations(n);
	
	System.out.println(ans);
}
}

// This code is contributed by avanitrachhadiya2155

*/
/*public class s {
    public static void findNumbers(int[] arr) {
        int n = arr.length;
        
        // Mark visited elements
        boolean[] visited = new boolean[n + 1];
        
        int repeating = 0;
        int missing = 0;
        
        // Traverse the array
        for (int i = 0; i < n; i++) {
            if (visited[arr[i]]) {
                repeating = arr[i];
            } else {
                visited[arr[i]] = true;
            }
        }
        
        // Find the missing number
        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                missing = i;
                break;
            }
        }
        
        System.out.println("Repeating number: " + repeating);
        System.out.println("Missing number: " + missing);
    }
    
    public static void main(String[] args) {
        int[] arr = {2,2}; // Example array
        findNumbers(arr);
    }
}
*/

/*public class s{
    public static int findNearestPerfectSquare(int N) {
        int sqrt = (int) Math.sqrt(N); // Calculate the integer square root
        
        int floorSquare = sqrt * sqrt; // Square of the floor value
        int ceilSquare = (sqrt + 1) * (sqrt + 1); // Square of the ceiling value
        
        if (N - floorSquare <= ceilSquare - N) {
            return floorSquare; // Nearest perfect square is the floor square
        } else {
            return ceilSquare; // Nearest perfect square is the ceiling square
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number = ");
        int N = sc.nextInt(); // Example input
        int nearestSquare = findNearestPerfectSquare(N);
        System.out.println("Nearest perfect square to " + N + ": " + nearestSquare);
    }
}*/
/*public class s{
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<String,Integer>();
        hm.put("India", 1);
        hm.put("Russia", 2);
        hm.put("china", -1);
        hm.put("pakistan", 0);
        hm.put("In", 11);
        hm.put("Ru", 22);
        hm.put("chi", -12);
        hm.put("paki", 03);
        hm.put("Ind", 14);
        hm.put("Russ", 24);
        hm.put("chin", -12);
        hm.put("pakista", 05);
        for(Map.Entry<String,Integer> e: hm.entrySet()){
            System.out.println(e.getKey()+" "+ e.getValue());
        }
        System.out.println();
        System.out.println(hm.size());
    }
}*/
/*public class s{
    static int count(int arr[]){
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int x:arr){
            hm.put(x,hm.getOrDefault(x,0)+1);
        }
        for(Map.Entry<Integer,Integer>e: hm.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }
        return 0;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,2,1,3,5};
        System.out.println(count(arr));
    }
}*/
// without hashset
/*public class s{
    static void inter(int arr[], int arr1[]){
        for(int i = 0; i < arr.length;i++){
             boolean flag = false;
            for(int j = 0;j<arr1.length;j++){
                if(arr[i]==arr1[j]){
                    flag = true;
                    break;
                }
            }
            if(flag==true){
                System.out.print(arr[i]+" ");
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int arr2[] = {7,8,9,10,3,4};
        inter(arr, arr2);
    }
}*/
/*public class s{
    static void intersection(int arr[],int arr1[]){
        HashSet<Integer>hs = new HashSet<>();
        for(int i = 0;i<arr.length;i++){
            hs.add(arr[i]);
        }
        for(int i = 0;i< arr1.length;i++){
            if(hs.contains(arr1[i]))
            System.out.println(arr1[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int arr1[] = {6,4,5};
        intersection(arr, arr1);
    }
}*/
/*public class s{
    static void union(int arr[],int arr1[]){
        HashSet<Integer> h = new HashSet<>();
        for(int a:arr){
            h.add(a);
        }
        for(int a:arr1){
            h.add(a);
        }
        for(int b:h){
            System.out.print(b+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int arr1[] = {3,4,5,6};
        union(arr, arr1);
    }
}*/
/*public class s{
    static boolean tr(int arr[],int sum){
        int start = 0;
        int end = arr.length;
        while(start<end){
            if(start+end==sum){
                return true;
            }
            else if(start+end>sum){
                end--;
            }
            else{
                start++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {4 ,2 ,-3 ,1 ,6};
        int sum = 0;
        System.out.println(tr(arr, sum));
    }
}*/
// Java implementation of the Quadratic Probing

/*class s {

	// Function to print an array
	static void printArray(int arr[])
	{

		// Iterating and printing the array
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	// Function to implement the
	// quadratic probing
	static void hashing(int table[], int tsize, int arr[],
						int N)
	{

		// Iterating through the array
		for (int i = 0; i < N; i++) {

			// Computing the hash value
			int hv = arr[i] % tsize;

			// Insert in the table if there
			// is no collision
			if (table[hv] == -1)
				table[hv] = arr[i];
			else {

				// If there is a collision
				// iterating through all
				// possible quadratic values
				for (int j = 0; j < tsize; j++) {

					// Computing the new hash value
					int t = (hv + j * j) % tsize;
					if (table[t] == -1) {

						// Break the loop after
						// inserting the value
						// in the table
						table[t] = arr[i];
						break;
					}
				}
			}
		}

		printArray(table);
	}

	// Driver code
	public static void main(String args[])
	{
		int arr[] = { 21,10,32,43};
		int N = 4;

		// Size of the hash table
		int L =11;
		int hash_table[] = new int[L];

		// Initializing the hash table
		for (int i = 0; i < L; i++) {
			hash_table[i] = -1;
		}

		// Function call
		hashing(hash_table, L, arr, N);
	}
}
*/
/*public class s{
    static void printArray(int arr[]){
        for(int i = 0; i < arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void hashing(int arr[],int hash_table[],int n,int l){
        for(int i = 0; i < n;i++){
            int hv = arr[i]%l;
            if(hash_table[hv]==-1){
            hash_table[hv] = arr[i];
            }

            else{
                for(int j = 0; j < l;j++){
                    int t = (hv + j*j);
                    if(hash_table[t] == -1){
                        hash_table[t] = arr[i];
                        break;
                    }
                }
            }
        }
        printArray(hash_table);
    }
    public static void main(String[] args) {
        int arr[] = { 50, 700, 76, 85, 92, 73, 101};
        int n = 7;
        int l = 7;
        int hash_table[] = new int[l];

        for(int i = 0; i < l;i++){
            hash_table[i] = -1;
        }
 
        // Function call
        hashing(arr, hash_table, n, l);
    }
}*/
/*public class s{
    static int maxlen(int arr[],int sum){
        HashMap<Integer,Integer>hmm = new HashMap<>();
        int pre_sum=0;
        int res = 0;
        for(int i = 0; i < arr.length;i++){
            pre_sum+=arr[i];
            if(pre_sum==sum){
                res = i+1;
            }
            if(hmm.containsKey(pre_sum)){
                hmm.put(pre_sum,i);
            }

            if(hmm.containsKey(pre_sum-sum)){
                res = Math.max(res,i);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {3,1,0,1,8,2,3,6};
        int sum = 5;
        System.out.println(maxlen(arr, sum));
    }
}*/
/*public class s{
    static int cout(int arr[]){
        int  res = 0,t;
        for(int i = 0; i < arr.length;i++){
            int cout0 = 0 , cout1 = 0;
            for(int j = i;j<arr.length;j++){
                if(arr[j]==1)
                    cout1++;
                    else
                    cout0++;
                    if(cout0==cout1)
                    res = Math.max(res,cout0+cout1);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {1,0,1,1,1,0,0};
        System.out.println(cout(arr));
    }
}*/
/*public class s{
    static int longestsub(int arr[],int sum){
        int res = 0;
        for(int i = 0; i < arr.length;i++){
            int curr_sum = 0;
            for(int j = i; j < arr.length;j++){
                curr_sum+=arr[j];
                if(curr_sum== sum){
                    res = Math.max(res,j-i+1);
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {5, 8, -4, -4, 9, -2, 2};
        int sum = 0;
        System.out.println(longestsub(arr, sum));
    }
}*/
/*public class s{
    static int ci(int arr[],int sum){
        HashMap<Integer,Integer> hm = new HashMap<>();
        int currsum = 0;
        int res = 0;
        for(int i = 0; i < arr.length;i++){
            currsum+=arr[i];
            if(currsum==sum)
                res = i+1;
            
            if(hm.containsKey(currsum)==false)
                hm.put(currsum,i);
            
            if(hm.containsKey(currsum-sum)){
                res = Math.max(res,i-hm.get(currsum-sum));
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {8,3,1,5,-6,6,2,2};
        int sum = 4;
        System.out.println(ci(arr, sum));
    }
}*/
/*public class s{
    static int ss(int ar[]){
        for(int i = 0; i < ar.length;i++){
            if(ar[i]==0){
                ar[i] = -1;
            }
        }
        HashMap<Integer,Integer> hm = new HashMap<>();
        int res = 0;
        int currsum = 0;
        for(int i = 0; i < ar.length;i++){
            currsum+=ar[i];
            if(currsum==0)
            res = i+1;
            if(hm.containsKey(currsum)==false)
                hm.put(currsum,i);
            
            if(hm.containsKey(currsum-0)){
                res = Math.max(res,i-hm.get(currsum-0));
            }
        }
        return res;
    }
    public static void main(String[]arr){
    int ar[] = {1,0,0,1,0,1,1};
        System.out.println(ss(ar));
    }
}*/
/*public class s{
    static int cmt(int arr[], int n){
        Arrays.sort(arr);
        int count = 1;
        int res= 0;
        for(int i = 1; i < n;i++){
            if(arr[i]==arr[i-1]+1){
                count++;
            }
            else if(arr[i]!=arr[i-1]){
                res = Math.max(res, count);
                count = 1;
            }
        }
        return Math.max(res,count);
    }
    public static void main(String[] args) {
        int arr[] = {2,9,4,3,10};
        int n = arr.length;
        System.out.println(cmt(arr,n));
    }
}*/
/*public class s{
    static int hash(int arr[],int n){
        HashSet<Integer> ss = new HashSet<>();
        int res = 0;
        for(int i = 0; i < n;i++)
            ss.add(arr[i]);
        
            for(int i = 0; i < n;i++){
                if(!ss.contains(arr[i]-1)){
                    int curr = 1;
                    while(ss.contains(curr+arr[i]))
                    curr++;

                    res = Math.max(res, curr);
                }
            }
            return res;
    }
    public static void main(String[] args) {
        int arr[] = {1,9,3,4,2,10,13};
        int n = arr.length;
        System.out.println(hash(arr, n));
    }
}*/
/* 

public class s {
    public static List<Integer> findMissingNumbers(int[] array) {
        List<Integer> missingNumbers = new ArrayList<>();
        Set<Integer> numberSet = new HashSet<>();

        // Step 1: Add all elements of the array to the HashSet
        for (int num : array) {
            numberSet.add(num);
        }

        // Step 2: Find missing numbers
        int min = Arrays.stream(array).min().orElse(0);
        int max = Arrays.stream(array).max().orElse(0);

        for (int i = min; i <= max; i++) {
            if (!numberSet.contains(i)) {
                missingNumbers.add(i);
            }
        }

        return missingNumbers;
    }

    public static void main(String[] args) {
        int[] array = {3,0,1};
        List<Integer> missingNumbers = findMissingNumbers(array);

        if (!missingNumbers.isEmpty()) {
            System.out.println("Missing numbers in the array:");
            for (int num : missingNumbers) {
                System.out.print(num + " ");

            }
        } else {
            System.out.println("No missing numbers found in the array.");
        }
    }
}
*/
/*public class s{
    public static void main(String[] args) {
        int arr[]  = {1,2,6};
        int min = Arrays.stream(arr).min().orElse(0);
        int max = Arrays.stream(arr).max().orElse(0);
        System.out.println(min);
        System.out.println(max);
    }
}*/
/*public class s{
    static boolean find(String s1, String s2,int m){
        s1.toLowerCase();
        for(int i = 0; i < s1.length();i++)
        for(int j = 0;j<m;j++){
            if(s1.charAt(i)==s2.charAt(j)){
                return true;
            }
        }
        
        return false;
    }
    public static void main(String[] args) {
        String s1 = "ABCDEF";
        String s2 = "abcd";
        s2 = s2.toUpperCase();
        int m = s2.length();
        System.out.println(find(s1, s2, m));

    }
}*/
/*public class s {
    static boolean func(String s1, String s2, int n, int m){
        if(m==0)
            return true;
        if(n==0)
        return false;

        if(s1.charAt(n-1)==s2.charAt(m-1)){
        return func(s1, s2, n-1, m-1);
        }

        return func(s1, s2, n-1, m);

    }
    public static void main(String[] args) {
        String s1 = "ABCDEFG";
        String s2 = "ACEF";
        int n = s1.length();
        int m = s2.length();
        System.out.println(func(s1, s2, n, m));
    }
}*/
/*public class s {
    public static int strstr(String s, String x) {
        int sLen = s.length();
        int xLen = x.length();

        for (int i = 0; i <= sLen - xLen; i++) {
            int j;
            for (j = 0; j < xLen; j++) {
                if (s.charAt(i + j) != x.charAt(j)) {
                    break;
                }
            }
            if (j == xLen) {
                return i; // Return the starting index of the first occurrence of x in s
            }
        }

        return -1; // x not found in s
    }

    public static void main(String[] args) {
        String s = "GeeksForGeeks";
        String x = "For";
        int index = strstr(s, x);
        System.out.println(index);
    }
}
*/
/*public class s {


    static int countSubstrings(String b) {
        int count = 0;
        for(int i = 0; i < b.length();i++){
            if(b.charAt(i)=='1'){
                count++;
            }
        }
        return count*(count-1)/2;//4*(4-1)/2 = 4*3/2 = 12/2 = 6
    }

    public static void main(String[] args) {
        String b = "1111";
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        System.out.println(countSubstrings(b));
    }
}
*/
/*public class s {

    public static int strstr(String s, String x) {
        int sLength = s.length();
        int xLength = x.length();

        // Edge cases: if the search string is empty or longer than the source string
        if (xLength == 0) {
            return 0; // Empty string found at the beginning
        }

        if (xLength > sLength) {
            return -1; // Search string is longer than the source string, not found
        }

        for (int i = 0; i <= sLength - xLength; i++) {
            int j;
            for (j = 0; j < xLength; j++) {
                if (s.charAt(i + j) != x.charAt(j)) {
                    break;
                }
            }
            if (j == xLength) {
                return i; // Match found, return the starting index of the match
            }
        }

        return -1; // No match found
    }

    public static void main(String[] args) {
        String sourceString = "hello, world";
        String searchString = "world";

        int result = strstr(sourceString, searchString);
        System.out.println("Search result: " + result);
    }
}
*/
/*public class s{
    static boolean reply(String ss, String gg){
        HashSet<String> hs = new HashSet<>();
         ss.toCharArray();
        for(int i = 0; i < ss.length()-gg.length();i++){
            String make = ss.substring(i, i+gg.length());
            hs.add(make);
        }
        for(int i = 0; i < ss.length()-gg.length();i++){
            String make1 = ss.substring(i,i+gg.length());
            if(hs.contains(gg)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String ss = "GeeksForGeeks";
        String gg = "For";
        System.out.println(reply(ss, gg));
    }
}*/
/*public class s{
    static boolean  ret(String a, String b){
        if(a.length()!=b.length()){
            return false;
        }

        int count[] = new int[256];
        for(int i = 0; i < a.length();i++){
            count[a.charAt(i)]++;
            count[b.charAt(i)]--;
        }
        for(int i = 0; i < count.length;i++){
            if(count[i]!=0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String a = "Rachit";
        String b  = "tachiR";
        System.out.println(ret(a, b));
    }
}*/

/*public class s{
    static int cnt(String str){
        int count[] = new int[256];//EXTRA SPACE
        for(int i = 0; i < str.length();i++){
            count[str.charAt(i)]++;
        }
        for(int i = 0; i < str.length();i++){ //time complexity O(n);
            if(count[str.charAt(i)]>1){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String str = "aabcdefg";
        System.out.println(cnt(str));
        }
    }*/

    /*public class s{
        static int repo(String ss){
            int res = -1;
            boolean []c = new boolean[256];
            for(int i = ss.length()-1; i>=0;i--){
                if(c[ss.charAt(i)]){
                    res = i;
                }
                else{
                    c[ss.charAt(i)]=true;
                }
            }
            return res;
        }
        public static void main(String[] args) {
            String ss = "geeksforgeeks";
            System.out.println(repo(ss));
        }
    }*/
    /*public class s{
        static void ret(String text, String pattern){
            int n = text.length();
            int m = pattern.length();
            for(int i = 0; i <= (n-m);i++){
                int j;
                for(j = 0; j < m;j++)
                if(pattern.charAt(j)!=text.charAt(i+j))
                break;

                if(j==m)
                System.out.println(i+" ");
            }
            }
        public static void main(String[] args) {
            String text = "geeks";
            String pattern = "eks";
            ret(text, pattern);
        }
    }*/
    /*public class s{
        static int return_count(String str){
            int res = Integer.MAX_VALUE;
            int cntt[] = new int[256];
            Arrays.fill(cntt,-1);
            for(int i = 0; i < str.length();i++){
               int fi =  cntt[str.charAt(i)];
               if(fi==-1){
                cntt[str.charAt(i)] = i;
               }
               else{
                res = Math.min(res,fi);
               }
            }
            return (res==Integer.MAX_VALUE)?-1:res;
        }
        public static void main(String[] args) {
            String str = "geeksforgeeks";
            System.out.println(return_count(str));
        }
    }*/
    /*public class s{
        static int resp(String letters){
            int res = -1;
            boolean Chhar[] = new boolean[256];
            for(int i = letters.length()-1;i>=0;i--){
                if(Chhar[letters.charAt(i)]){
                    res = i;
                }
                else{
                    Chhar[letters.charAt(i)]=true;
                }
            }
            return res;
        }
        public static void main(String[] args) {
            String letters = "respe";
            System.out.println(resp(letters));
        }
    }*/
    /*public class s{
        static void search(String str, String pat){
            int n=  str.length();
            int m = pat.length();
            for(int i = 0; i <=(n-m);){
                int j;
                for(j = 0; j < m;j++)
                    if(pat.charAt(j)!=str.charAt(i+j))
                        break;
                        if(j==m){
                        System.out.print(i+" ");
                        }

                        if(j==0){
                        i++;
                        }

                        else{
                            i=(i+j);
                        }
            }
        }
        public static void main(String[] args) {
            String str = "abcdefgjefgh";
            String pat = "efgh";
            search(str, pat);
        }
    }*/  
/*class s { 
    static final int d=256;
    static final int q=101;   
    static void RBSearch(String pat,String txt,int M, int N){
    
    //Compute (d^(M-1))%q
    int h=1;
    for(int i=1;i<=M-1;i++)
        h=(h*d)%q;
    
    //Compute p and to
    int p=0,t=0;
    for(int i=0;i<M;i++){
        p=(p*d+pat.charAt(i))%q;
        t=(t*d+txt.charAt(i))%q;
    }
    
    for(int i=0;i<=(N-M);i++){
       //Check for hit
       if(p==t){
           boolean flag=true;
           for(int j=0;j<M;j++)
                if(txt.charAt(i+j)!=pat.charAt(j)){flag=false;break;}
            if(flag==true)System.out.print(i+" ");
       }
       //Compute ti+1 using ti
       if(i<N-M){
           t=((d*(t-txt.charAt(i)*h))+txt.charAt(i+M))%q;
        if(t==0)t=t+q;
       }
    }
    return;
}
  
    public static void main(String args[]) 
    {   
        String txt = "GEEKS FOR GEEKS";
        String pat="FOR";
        System.out.print("All index numbers where pattern found: ");
        RBSearch(pat,txt,4,15);  
    } 
} */
