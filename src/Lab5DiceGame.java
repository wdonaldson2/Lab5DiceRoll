//import javax.xml.bind.SchemaOutputResolver;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by williamdonaldson on 2/3/17.
 */
public class Lab5DiceGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Welcome to the Grand Circus Casino! ");

        System.out.println();

        System.out.print("How many sides should each die have? ");
        String numberOfSides = scan.next();
        System.out.println();

        System.out.println("Roll 1: ");


        System.out.println(eachRoll(2, 5) );
        System.out.println("Roll again? (Y/N): ...");
        scan.next();

    }

    public static int eachRoll(int number, int numSides) {

        int num = 0;
        int roll = 0;

        Random r = new Random();
        if (numSides >= 2) {

            for (int i = 1; i < number; i++) {
                roll = r.nextInt(numSides) + 1;
                System.out.println(roll);

            }
        }
        return number;
    }
    }

        //Math.random formula
        //String n = (Math.random() * 2 + 1));


