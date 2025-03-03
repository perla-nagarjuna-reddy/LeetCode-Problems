class Pair{
    
    String word;
    
    int seq;
    
    public Pair(String word,int seq){
        this.word = word;
        this.seq = seq;
    }
}
class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> set = new HashSet<>();
        
        for(String word :  wordList){
            set.add(word);
        }
        
        Queue<Pair> q = new LinkedList<>();
        
        q.add(new Pair(beginWord,1));
        
        while(!q.isEmpty()){
            
            Pair wordPair = q.poll();
            
            String word = wordPair.word;
            
            int seq = wordPair.seq;
            
            if(word.equals(endWord)){
                return seq;
            }
            
            for(int i = 0 ; i < word.length(); i++){
                
                for(char ch = 'a'; ch <= 'z' ; ch++){
                    
                    char[] replaceWord = word.toCharArray();
                    
                    replaceWord[i] = ch;
                    
                    String newWord = new String(replaceWord);
                    
                    if(set.contains(newWord)){
                        set.remove(newWord);
                        
                        q.add(new Pair(newWord,seq+1));
                    }
                }
            }
            
        }
        return 0;
    }
}