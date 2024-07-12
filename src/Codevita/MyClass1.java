package Codevita;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyClass1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Movie movie[] = new Movie[4];
        for (int i = 0; i < 4; i++) {
            int movieId = Integer.parseInt(sc.nextLine());
            String movieName = sc.nextLine();
            String companyName = sc.nextLine();
            String genre = sc.nextLine();
            int budget = Integer.parseInt(sc.nextLine());
            movie[i] = new Movie(movieId, movieName, companyName, genre, budget);
        }
        String par1 = sc.nextLine();

        double avg = findAvgBudgetForGenre(movie, par1);
        if (Double.compare(0.0, avg) == 0) {
            System.out.println("No movie available");
        } else
            System.out.println(avg);

        Movie mov = findMovieNameWithThirdHighestBudget(movie);
        if (mov == null) {
            System.out.println("No Movie available");
        } else
            System.out.println(mov.getMovieName());

    }

    private static double findAvgBudgetForGenre(Movie[] movie, String par1) {
        Stream<Movie> st = Arrays.stream(movie);
        long ct = st.filter(x -> x.getGenre().equalsIgnoreCase(par1)).count();
        if (ct == 0)
            return 0.0;
        st = Arrays.stream(movie);
        double ans = st.filter(x -> x.getGenre().equalsIgnoreCase(par1)).map(x -> x.getBudget())
                        .mapToDouble(x -> x).average().getAsDouble();
        return ans;
    }

    private static Movie findMovieNameWithThirdHighestBudget(Movie[] movie) {
        Stream<Movie> st = Arrays.stream(movie);
        List<Movie> list = st.sorted(Comparator.comparing(Movie::getBudget)).collect(Collectors.toList());
        for (int i = 0; i < 3; i++) {
            if (list.get(i).getBudget() == list.get(i + 1).getBudget()) {
                return null;
            }
        }
        return list.get(1);
    }

}

class Movie {
    private int movieId;
    private String movieName;
    private String companyName;
    private String genre;
    private int budget;

    public Movie(int movieId, String movieName, String companyName, String genre, int budget) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.companyName = companyName;
        this.genre = genre;
        this.budget = budget;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }
}