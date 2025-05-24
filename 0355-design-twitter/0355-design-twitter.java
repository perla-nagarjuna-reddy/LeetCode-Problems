class Twitter {
    static int timestamp = 0;

    class Tweet {
        int userId;
        int tweetId;
        int time;

        Tweet(int userId, int tweetId, int time) {
            this.userId = userId;
            this.tweetId = tweetId;
            this.time = time;
        }
    }
    HashMap<Integer,Deque<Integer>> map;
    HashMap<Integer,Set<Integer>> followMap;
    List<Tweet> allTweets;
    public Twitter() {
        map = new HashMap<>();
        followMap = new HashMap<>();
        allTweets = new ArrayList<>();
    }
    
    public void postTweet(int userId, int tweetId) {

        if(map.containsKey(userId)){
            Deque<Integer> dq = map.get(userId);

            dq.addFirst(tweetId);

            map.put(userId,dq);
        }
        else{
            Deque<Integer> dq = new ArrayDeque();
            dq.add(tweetId);
            map.put(userId,dq);
        }
        allTweets.add(new Tweet(userId, tweetId, timestamp++));
    }
    
    public List<Integer> getNewsFeed(int userId) {
        List<Integer> ans = new ArrayList<>();
        Set<Integer> followees = followMap.getOrDefault(userId, new HashSet<>());
        followees.add(userId); 
        for (int i = allTweets.size() - 1; i >= 0 && ans.size() < 10; i--) {
            Tweet t = allTweets.get(i);
            if (followees.contains(t.userId)) {
                ans.add(t.tweetId);
            }
        }
        return ans;
    }
    
    public void follow(int followerId, int followeeId) {

        if(followerId == followeeId) return;
        
        if(followMap.containsKey(followerId)){
            Set<Integer> ls = followMap.get(followerId);

            ls.add(followeeId);

            followMap.put(followerId,ls);
        }
        else{
            Set<Integer> ls = new HashSet<>();
            ls.add(followeeId);
            if(!map.containsKey(followeeId)){

            }
            followMap.put(followerId,ls);
        }
    }
    
    public void unfollow(int followerId, int followeeId) {
        if(followMap.containsKey(followerId)){
            followMap.get(followerId).remove(followeeId);
        }
    }
}

/**
 * Your Twitter object will be instantiated and called as such:
 * Twitter obj = new Twitter();
 * obj.postTweet(userId,tweetId);
 * List<Integer> param_2 = obj.getNewsFeed(userId);
 * obj.follow(followerId,followeeId);
 * obj.unfollow(followerId,followeeId);
 */