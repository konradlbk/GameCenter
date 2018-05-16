import org.jcp.xml.dsig.internal.dom.Utils;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Hangman implements IPlayable {
    @Override
    public void start() {
        printLogo();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Witaj w grze wisielec!");
        System.out.println("Wybierz poziom trudności");
        System.out.println("1-Easy");
        System.out.println("2-Medium");
        System.out.println("3-Hard");
        System.out.println("Inne:  ");
        System.out.println("4-Wyjdź do Menu Głównego");

        String level = scanner.nextLine();

        if (level.contains("1")) {

            Random r = new Random();
            int inputWord = r.nextInt(20);
            List<String> words = new ArrayList<>();
            InputStream load = Hangman.class.getResourceAsStream("words.txt");
            Scanner scanner2 = new Scanner(load);
            while (scanner2.hasNextLine()){
                String line = scanner2.nextLine();
                words.add(line);
            }


            String hiddenWord = words.get(inputWord);
           // System.out.println(hiddenWord);
            String wisielec = "HANGMAN";
                char[] userWord = new char[hiddenWord.length()];
                for (int i=0; i<userWord.length; i++){

                    userWord[i]='_';
                }

                int lifes=7;
            while (true) {

                boolean containsSign=false;

               // System.out.println(userWord);


                        System.out.println("Podaj znak");
                        char symbol = scanner.next().charAt(0);

                        for (int j = 0; j < hiddenWord.length(); j++) {
                            if (symbol==hiddenWord.charAt(j)) {
                                userWord[j] = symbol;
                                containsSign = true;


                            }


                        }

                        if (containsSign==false){

                            lifes--;

                          System.out.println("POZOSTALO " + lifes + " SZANS");
                        }

                        System.out.println();
                System.out.println(userWord);

                        if (lifes == 0) {
                            System.out.println("HANGMAN");
                            System.out.println("Koniec żyć. Przegrana");
                            System.out.println();
                            return;
                        }

                        String sth = new String(userWord);
                        if (hiddenWord.equals(sth)){
                            System.out.println("Wygrana!");
                            System.out.println();
                            return;
                        }



            }
        }


        if (level.contains("2")) {

            Random r = new Random();
            int inputWord = r.nextInt(20);
            List<String> words = new ArrayList<>();
            InputStream load = Hangman.class.getResourceAsStream("wordsMedium.txt");
            Scanner scanner2 = new Scanner(load);
            while (scanner2.hasNextLine()){
                String line = scanner2.nextLine();
                words.add(line);
            }


            String hiddenWord = words.get(inputWord);
            // System.out.println(hiddenWord);
            String wisielec = "HANGMAN";
            char[] userWord = new char[hiddenWord.length()];
            for (int i=0; i<userWord.length; i++){

                userWord[i]='_';
            }

            int lifes=7;
            while (true) {

                boolean containsSign=false;

                // System.out.println(userWord);


                System.out.println("Podaj znak");
                char symbol = scanner.next().charAt(0);

                for (int j = 0; j < hiddenWord.length(); j++) {
                    if (symbol==hiddenWord.charAt(j)) {
                        userWord[j] = symbol;
                        containsSign = true;


                    }


                }

                if (containsSign==false){

                    lifes--;

                    System.out.println("POZOSTALO " + lifes + " SZANS");
                }

                System.out.println();
                System.out.println(userWord);

                if (lifes == 0) {
                    System.out.println("HANGMAN");
                    System.out.println("Koniec żyć. Przegrana");
                    System.out.println();
                    return;
                }

                String sth = new String(userWord);
                if (hiddenWord.equals(sth)){
                    System.out.println("Wygrana!");
                    System.out.println();
                    return;
                }



            }
        }


        if (level.contains("3")) {

            Random r = new Random();
            int inputWord = r.nextInt(9);
            List<String> words = new ArrayList<>();
            InputStream load = Hangman.class.getResourceAsStream("wordsHard.txt");
            Scanner scanner2 = new Scanner(load);
            while (scanner2.hasNextLine()){
                String line = scanner2.nextLine();
                words.add(line);
            }


            String hiddenWord = words.get(inputWord);
            // System.out.println(hiddenWord);
            String wisielec = "HANGMAN";
            char[] userWord = new char[hiddenWord.length()];
            for (int i=0; i<userWord.length; i++){

                userWord[i]='_';
            }

            int lifes=7;
            while (true) {

                boolean containsSign=false;

                // System.out.println(userWord);


                System.out.println("Podaj znak");
                char symbol = scanner.next().charAt(0);

                for (int j = 0; j < hiddenWord.length(); j++) {
                    if (symbol==hiddenWord.charAt(j)) {
                        userWord[j] = symbol;
                        containsSign = true;


                    }


                }

                if (containsSign==false){

                    lifes--;

                    System.out.println("POZOSTALO " + lifes + " SZANS");
                }

                System.out.println();
                System.out.println(userWord);

                if (lifes == 0) {
                    System.out.println("HANGMAN");
                    System.out.println("Koniec żyć. Przegrana");
                    System.out.println();
                    return;
                }

                String sth = new String(userWord);
                if (hiddenWord.equals(sth)){
                    System.out.println("Wygrana!");
                    System.out.println();
                    return;
                }



            }
        }
        if (level.contains("4")){
            return;
        }
    }

    public static void printLogo() {
        InputStream logStream = Utils.class.getResourceAsStream("/hlogo.txt");
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

