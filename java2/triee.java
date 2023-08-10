/*public class triee {
    static class Node{
        Node[] children;
        boolean endofword;

        public Node(){
            children = new Node[26];
            for(int i = 0; i < 26;i++){
                children[i] = null;
            }
            endofword = false;
        }
    }
    static Node root = new Node();
    public static void insert(String word){
        Node curr = root;
        for(int i  = 0; i < word.length();i++){
            int idx = word.charAt(i) - 'a';
            if(curr.children[idx]==null){
                curr.children[idx] = new Node();
            }
            if(i == word.length()-1){
                curr.children[idx].endofword = true; 
            }
            curr = curr.children[idx];
        }
    }
    public static boolean search(String key){
        Node curr = root;
        for(int i = 0; i < key.length();i++){
            int idx = key.charAt(i) - 'a';
            Node node = curr.children[idx];
            if(curr.children[idx]==null){
                return false;
            }
            if(i == key.length()-1 && node.endofword == false ){
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }
    public static boolean wordbreak(String keyy){
        if(keyy.length()==0){
            return true;
        }

        for(int i = 1; i <= keyy.length();i++){
            String firstpart = keyy.substring(0, i );
            String secpart = keyy.substring(i);
            if(search(firstpart) && wordbreak(secpart)){
                return true;

            }
        }
        return false;
    }
    public static int unique_substring(){
        
    }

    public static boolean startwith(String prob){
        Node curr = root;
        for(int i = 0; i < prob.length();i++ ){
            int idx = prob.charAt(i)-'a';
            if(curr.children[idx]==null){
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }
    public static void main(String[] args) {
        String words[] = {"sll","sike","sam","samsung","sobile","sachit"};
        String key = "s";
        String problem = "hit";
        for(int i = 0; i < words.length;i++){
            insert(words[i]);
        }
        System.out.println(startwith(key));

    }
}
*/