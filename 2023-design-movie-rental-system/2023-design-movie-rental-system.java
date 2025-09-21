class MovieRentingSystem {
    class MovieCopy {
        int shop, movie, price;
        MovieCopy(int shop, int movie, int price) {
            this.shop = shop;
            this.movie = movie;
            this.price = price;
        }
    }
    private Map<Integer, TreeSet<MovieCopy>> movieToCopies;  // unrented movies
    private Map<String, MovieCopy> shopMovieMap;
    private TreeSet<MovieCopy> rented;   

    public MovieRentingSystem(int n, int[][] entries) {
        movieToCopies = new HashMap<>();
        shopMovieMap = new HashMap<>();
        // Onlogn
        rented = new TreeSet<>((a, b) -> {
            if (a.price != b.price) return a.price - b.price;
            if (a.shop != b.shop) return a.shop - b.shop;
            return a.movie - b.movie;
        });

        for (int[] e : entries) {
            int shop = e[0], movie = e[1], price = e[2];
            MovieCopy copy = new MovieCopy(shop, movie, price);

            shopMovieMap.put(shop + ":" + movie, copy);
            movieToCopies.putIfAbsent(movie, new TreeSet<>(
                (a, b) -> (a.price != b.price) ? a.price - b.price : a.shop - b.shop
            ));
            movieToCopies.get(movie).add(copy);
        }
    }
    public List<Integer> search(int movie) {
        // O(1)
        List<Integer> result = new ArrayList<>();
        if (!movieToCopies.containsKey(movie)) return result;

        Iterator<MovieCopy> it = movieToCopies.get(movie).iterator();
        for (int count = 0; it.hasNext() && count < 5; count++) {
            result.add(it.next().shop); // [1,0,2]
        }
        return result;
    }
    public void rent(int shop, int movie) { // O(logn)
        MovieCopy copy = shopMovieMap.get(shop + ":" + movie);
        movieToCopies.get(movie).remove(copy); // unrented
        rented.add(copy); // add
    }
    public void drop(int shop, int movie) {
        MovieCopy copy = shopMovieMap.get(shop + ":" + movie);
        rented.remove(copy);
        movieToCopies.get(movie).add(copy);
    }
    public List<List<Integer>> report() {
        List<List<Integer>> result = new ArrayList<>();
        Iterator<MovieCopy> it = rented.iterator();
        for (int count = 0; it.hasNext() && count < 5; count++) {
            MovieCopy c = it.next();
            result.add(Arrays.asList(c.shop, c.movie));
        }
        return result;
    }
}