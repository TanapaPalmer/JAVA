import java.util.ArrayList;
import java.util.Random;

public class TestPuzzling {

    public static void main(String[] args) {
        Puzzling generator = new Puzzling();


        ArrayList<Integer> randomRolls = generator.getTenRolls();
        System.out.println(randomRolls);


        String randomChar = generator.getRandomLetter();
        System.out.println(randomChar);


        String getPass = generator.generatePassword();
        System.out.println(getPass);


        System.out.println(generator.getNewPasswordSet(5));


        ArrayList<Integer> pseudoRand = generator.pseudoRandom(10);
        System.out.println(pseudoRand);

    }
}