package aula12;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ex03 {
    private static final String FILE_PATH = "movies.txt";
    public static void main(String[] args) {
        List<Movie> movies = readMoviesFromFile();
        Collections.sort(movies);

        System.out.println("Lista de filmes ordenados pelo nome:");
        printMovies(movies);

        System.out.println("\nLista de filmes ordenados pelo score (decrescente):");
        movies.sort((m1, m2) -> Double.compare(m2.getScore(), m1.getScore()));
        printMovies(movies);

        System.out.println("\nLista de filmes ordenados pelo running time (crescente):");
        movies.sort((m1, m2) -> Integer.compare(m1.getRunningTime(), m2.getRunningTime()));
        printMovies(movies);

        System.out.println("\nGéneros distintos e respetivo número de filmes:");
        printDistinctGenres(movies);

        double scoreThreshold = 60.0;
        String selectedGenre = "comedy"; // Exemplo: género indicado pelo utilizador
        List<Movie> selectedMovies = filterMoviesByScoreAndGenre(movies, scoreThreshold, selectedGenre);

        if (writeMoviesToFile(selectedMovies, OUTPUT_FILE_PATH)) {
            System.out.println("\nFilmes com score superior a " + scoreThreshold + " e género " + selectedGenre +
                    " foram escritos em " + OUTPUT_FILE_PATH);
        } else {
            System.out.println("\nErro ao escrever os filmes selecionados no ficheiro.");
        }
    }

    private static List<Movie> readMoviesFromFile() {
        List<Movie> movies = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
            String line = br.readLine(); // Ignorar a primeira linha (cabeçalho)

            while ((line = br.readLine()) != null) {
                String[] parts = line.split("\t");
                String name = parts[0];
                double score = Double.parseDouble(parts[1]);
                String rating = parts[2];
                String genre = parts[3];
                int runningTime = Integer.parseInt(parts[4]);

                Movie movie = new Movie(name, score, rating, genre, runningTime);
                movies.add(movie);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return movies;
    }

    private static void printMovies(List<Movie> movies) {
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }

    private static void printDistinctGenres(List<Movie> movies) {
        List<String> genres = new ArrayList<>();

        for (Movie movie : movies) {
            String genre = movie.getGenre();
            if (!genres.contains(genre)) {
                genres.add(genre);
            }
        }

        Collections.sort(genres);

        for (String genre : genres) {
            int count = 0;
            for (Movie movie : movies) {
                if (movie.getGenre().equals(genre)) {
                    count++;
                }
            }
            System.out.println(genre + ": " + count);
        }
    }

    private static List<Movie> filterMoviesByScoreAndGenre(List<Movie> movies, double scoreThreshold, String genre) {
        List<Movie> selectedMovies = new ArrayList<>();

        for (Movie movie : movies) {
            if (movie.getScore() > scoreThreshold && movie.getGenre().equals(genre)) {
                selectedMovies.add(movie);
            }
        }

        return selectedMovies;
    }

    private static final String OUTPUT_FILE_PATH = "selected_movies.txt";

    private static boolean writeMoviesToFile(List<Movie> movies, String filePath) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            bw.write("name\tscore\trating\tgenre\trunning_time\n");

            for (Movie movie : movies) {
                bw.write(movie.getName() + "\t" + movie.getScore() + "\t" + movie.getRating() + "\t" +
                        movie.getGenre() + "\t" + movie.getRunningTime() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }

}
