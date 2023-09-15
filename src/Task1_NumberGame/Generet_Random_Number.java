package Task1_NumberGame;

import java.util.concurrent.ThreadLocalRandom;

public class Generet_Random_Number {
    public static void main(String[] args) {
        int min=1;
        int max=100;
        int randomNumber = ThreadLocalRandom.current().nextInt(min, max + 1);

        System.out.println("Random Number: " + randomNumber);
    }
}
