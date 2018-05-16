import org.jcp.xml.dsig.internal.dom.Utils;

import java.io.InputStream;
import java.util.Scanner;

public class GameOperator {
    Scanner scanner = new Scanner(System.in);
    public void menu (){

        while (true) {
            printLogo();

            System.out.println("Welcome to GameCenter[PL] version 0.8!");
            System.out.println("Choose game");
            System.out.println("1-Gues Number[PL]");
            System.out.println("2-Hangman[PL]");
            System.out.println("3-Millionaire(ALPHA)[PL]");
            System.out.println("4-Exit");

            String input = scanner.nextLine();
            if (input.contains("1")) {
                GuesNumber guesNumber = new GuesNumber();
                guesNumber.start();

            }
            if (input.contains("2")) {
                Hangman hangman = new Hangman();
                hangman.start();
            }

            if (input.contains("3")) {

                Millionaire millionaire = new Millionaire();
                millionaire.start();
            }
            if (input.contains("4")) {
                System.out.println("Czy na pewno chcesz wyjść?");
                input = scanner.nextLine();
                if (input.contains("tak")) {
                    return;

                } else {
                    continue;
                }
            }
        }
    }

    public static void printLogo() {
        InputStream logStream = Utils.class.getResourceAsStream("/glogo.txt");
        if (logStream == null) {
            throw new IllegalStateException("Resource: logo.txt not found");
        } else {
            Scanner scanner = new Scanner(logStream);

            while(scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }

        }
    }
}
