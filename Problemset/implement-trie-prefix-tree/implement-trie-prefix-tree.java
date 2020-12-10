
// @Title: 实现 Trie (前缀树) (Implement Trie (Prefix Tree))
// @Author: 15218859676
// @Date: 2020-12-07 20:59:19
// @Runtime: 56 ms
// @Memory: 50.3 MB

class Trie {
    private class Node{
        boolean isWorld;
        HashMap<Character,Node> next;
        public Node(boolean isWorld){
            next = new HashMap<>();
            this.isWorld = isWorld;
        }
        public Node(){
            this(false);
        }
    }
    private Node root;
   
    
    /** Initialize your data structure here. */
    public Trie() {
        root = new Node();
       
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        Node curNode = root;
        Character c ;
        for(int i = 0 ; i < word.length() ; i++){
            c = word.charAt(i);
            if (curNode.next.get(c) == null){
                curNode.next.put(c,new Node());
            }
            curNode = curNode.next.get(c);
        }
        if(!curNode.isWorld){
            curNode.isWorld = true;
          
        }

    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        Node cur = root;
        Character c ;
        for(int i = 0 ; i < word.length() ; i++){
            c = word.charAt(i);
            if (cur.next.get(c) == null){
                return false;
            }
            cur = cur.next.get(c);
        }
        return cur.isWorld;
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        Node curNode = root;
        Character c ;
        for(int i = 0 ; i < prefix.length(); i++){
            c = prefix.charAt(i);
            if (curNode.next.get(c) == null){
                return false;
            }
            curNode = curNode.next.get(c);
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
