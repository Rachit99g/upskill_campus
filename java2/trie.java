public class trie {
    static class Node{
        Node[] children;
        boolean eow;

        public Node(){
            children  = new Node[26];
            for(int i = 0; i < children.length;i++){
                children[i] = null;
            }
            eow = false;
        }
    }
    static Node root = new Node();
        public static void insert(String meaning){
            Node curr = root;
            for(int i = 0; i < meaning.length();i++){
                int idx = meaning.charAt(i) - 'a';
                if(curr.children[idx]==null){
                    curr.children[idx] = new Node();
                }
                if(i==meaning.length()-1){
                    curr.children[idx].eow = true;
                }
                
                curr= curr.children[idx];
            }
        }
        public static boolean search(String keys){
            Node curr = root;
            for(int i = 0; i< keys.length();i++){
                int idx = keys.charAt(i) - 'a';
                if(curr.children[idx]==null){
                    return false;
                }
                if(i == keys.length()-1 &&curr.children[idx].eow==false){
                    return false;
                }
                curr = curr.children[idx];
            }
            return true;
        }
    
    public static void main(String[] args) {
        String meanings[] = {"to","the","principal","vps","public","school"};
        for(int i = 0; i < meanings.length;i++){
            insert(meanings[i]);
        }
        System.out.println(search("public"));
        System.out.println(search("vps"));
    }
}
