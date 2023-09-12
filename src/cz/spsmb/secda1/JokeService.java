package cz.spsmb.secda1;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class JokeService {

    private static List<Joke> jokes = new LinkedList<>();

    public Joke getRandomJoke() {
        Random random = new Random();
        int index = random.nextInt(jokes.size());
        return jokes.get(index);
    }

    public void loadJokesFromCSVFile() {
        Scanner sc = new Scanner(this.getClass().getResourceAsStream("/resources/shortjokes.csv"));
        sc.useDelimiter("\n");
        while (sc.hasNext()) {
            String line = sc.next();
            int delimiter = line.indexOf(',');
            Long id = Long.parseLong(line.substring(0, delimiter));
            String text = line.substring(delimiter+2, line.length()-2);
            jokes.add(new Joke(id, text));
        }
        sc.close();
    }
}
