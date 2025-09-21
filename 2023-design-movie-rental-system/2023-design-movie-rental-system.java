class Pair {
    int shop;
    int movie;
    int price;

    public Pair(int shop, int movie, int price){
        this.shop = shop;
        this.movie = movie;
        this.price = price;
    }
}

class MovieRentingSystem {

    Map<Integer, TreeSet<Pair>> available; 
    TreeSet<Pair> rented;                  
    Map<String, Pair> pairMap;             

    public MovieRentingSystem(int n, int[][] entries) {

        available = new HashMap<>();
        rented = new TreeSet<>((a, b) -> {
            if (a.price != b.price) return a.price - b.price;
            if (a.shop != b.shop) return a.shop - b.shop;
            return a.movie - b.movie;
        });
        pairMap = new HashMap<>();

        for (int[] arr : entries) {
            Pair p = new Pair(arr[0], arr[1], arr[2]);
            pairMap.put(arr[0] + "#" + arr[1], p);
            available.putIfAbsent(arr[1], new TreeSet<>((a, b) -> {
                if (a.price != b.price) return a.price - b.price;
                if (a.shop != b.shop) return a.shop - b.shop;
                return a.movie - b.movie;
            }));
            available.get(arr[1]).add(p);
        }
    }
    
    public List<Integer> search(int movie) {
        List<Integer> ans = new ArrayList<>();
        if (!available.containsKey(movie)) return ans;

        int count = 0;
        for (Pair p : available.get(movie)) {
            ans.add(p.shop);
            if (++count == 5) break;
        }
        return ans;
    }

    public void rent(int shop, int movie) {
        String key = shop + "#" + movie;
        Pair p = pairMap.get(key);
        available.get(movie).remove(p);
        rented.add(p);
    }
    
    public void drop(int shop, int movie) {
        String key = shop + "#" + movie;
        Pair p = pairMap.get(key);
        rented.remove(p);
        available.get(movie).add(p);
    }
    
    public List<List<Integer>> report() {
        List<List<Integer>> ans = new ArrayList<>();
        int count = 0;
        for (Pair p : rented) {
            ans.add(Arrays.asList(p.shop, p.movie));
            if (++count == 5) break;
        }
        return ans;
    }
}
