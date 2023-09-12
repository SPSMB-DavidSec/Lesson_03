package cz.spsmb.secda1;

import java.io.FileNotFoundException;
import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        float total = 0.2f;

        for (int i = 0; i < 100; i++) {

            total += 0.2;

        }
        System.out.println("total = " + total);

	float a = 10000000; //2.15
                        //1.11
    float b = 0.532f;
        System.out.println(a);
        System.out.println(+b);
        System.out.println(NumberFormat.getInstance().format(a+b));


        JokeService jokeService = new JokeService();
        jokeService.loadJokesFromCSVFile();

    }
}
