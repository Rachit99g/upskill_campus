//import java.util.*;
//public class al {
    /*static void swap(ArrayList<Integer> list,int idx1,int idx2){
        int temp = list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);
    }*/
    //static int storewater(ArrayList<Integer>height){
        //int max_water = 0;
        //Brute-force approach
       /* for(int i = 0; i < height.size();i++){
            for(int j = i+1; j < height.size();j++){
                int ht = Math.min(height.get(i),height.get(j));
                int w = j-i;
                int curr_water = (ht * w);
                max_water = Math.max(max_water,curr_water);
            }
        }
        return max_water;
    }*/
    /*int lp = 0; // TIME COMPLEXITY = O(N)
    int rp = height.size()-1;
    while(lp<rp){
        // calculate area
        int ht = Math.min(height.get(lp),height.get(rp));
        int width = rp-lp;
        int curr_water = ht * width;
        max_water = Math.max(max_water,curr_water);
    
    //
    if(height.get(lp)< height.get(rp)){
        lp++;
    }
    else{
        rp--;
    }

    
    }
    return max_water;
}*/
//static boolean sum(ArrayList<Integer>height){
   /*int target = 10;
    for(int i = 0; i < height.size();i++){
        for(int j = i+1; j < height.size();j++){
            if(height.get(i) + height.get(j)==target){
                return true;
            }
        }
    }
    return false;*/
    /*int idx1 = 0;
    int idx2 = height.size()-1;
    int target = 5;
    while(idx1 != idx2){
        if(height.get(idx1)+height.get(idx2)==target){
            idx1++;
            idx2--;
            return true;
        }

        if(height.get(idx1)+height.get(idx2) < target){
            idx1++;
        }
        else{
            idx2--;
        }
    }
    return false;

}

    public static void main(String[] args) {
       

       /////////////////////  2D ArrayList///////////////////////////////

      // ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
      /*  ArrayList<Integer> type = new ArrayList<>();
       type.add(1);
       type.add(2);
       type.add(3);
       ArrayList<Integer> type1 = new ArrayList<>();
       type1.add(4);
       type1.add(5);
       type1.add(6);
       mainlist.add(type);
       mainlist.add(type1);
       System.out.print(mainlist+" ");
       System.out.println();
       // Now printing all arraylist alag alag//

       for(int i = 0; i <  mainlist.size();i++){
        ArrayList<Integer> currList = mainlist.get(i);
        for(int j = 0; j < currList.size();j++){
            System.out.print(currList.get(j)+" ");
        }
        System.out.println();
       }
       */
       /*ArrayList<Integer> type1 = new ArrayList<>();
       ArrayList<Integer> type2 = new ArrayList<>();
       ArrayList<Integer> type3 = new ArrayList<>();
       type1.add(1);
       type1.add(2);
       type1.add(3);
       type1.add(4);
       type2.add(5);
       type2.add(6);
       type2.add(7);
       type2.add(8);
       type3.add(9);
       type3.add(10);
       type3.add(11);
       type3.add(12);
       mainlist.add(type1);
       mainlist.add(type2);
       mainlist.add(type3);
       System.out.print(mainlist+" ");
       System.out.println();
       t ype1.remove(1);
       t 
       ype3.remove(0);
       type3.remove(2);
       for(int i = 0; i < mainlist.size();i++){
        ArrayList<Integer> suit = mainlist.get(i);
        for(int j = 0; j < suit.size();j++){
            System.out.print(suit.get(j)+" ");
        }
        System.out.println();
       }*/

      /* ArrayList<Integer> height = new ArrayList<>();
       height.add(1);
       height.add(2);
       height.add(3);
       height.add(4);
       height.add(5);
       height.add(6);

       System.out.println(sum(height));
    }   
}*/


