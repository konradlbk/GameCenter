import java.util.Random;
import java.util.Scanner;

public class GuesNumber implements IPlayable {
    Random r = new Random();
    Scanner scanner = new Scanner(System.in);

    @Override
    public String toString() {
        return "GuesNumber{" +
                "r=" + r +
                ", scanner=" + scanner +
                '}';
    }

    @Override
    public void start() {
        System.out.println("Witaj w zgadywaczu!");
        System.out.println("Wybierz poziom trudności: ");
        System.out.println("1-Easy");
        System.out.println("2-Medium");
        System.out.println("3-Hard");
        System.out.println("Inne:  ");
        System.out.println("4-Wyjdź do Menu Głównego");
        String level = scanner.nextLine();
        if (level.contains("1")) {
            System.out.println("Masz 5 żyć. Najwyższa dostępna liczba to 30");
            int a = r.nextInt(30);
            // System.out.println(a);
            int input = 0;

            while (input != a) {
                for (int i = 4; i >= 0; i--) {
                    input = scanner.nextInt();
                    if (input < a) {

                        System.out.println("Za mała liczba! Pozostało prób: " + i);
                        if (i == 0) {
                            System.out.println("Przegrana");
                            return;
                        }
                    continue;
                    }

                    if (input > a) {

                        System.out.println("Podana liczba jest za duża! Pozostało prób: " + i);
                        if (i == 0) {
                            System.out.println("Przegrana");
                            return;
                        }
                        continue;
                    }
                    if (input == a) {
                        System.out.println("Gratulacje! Wygrałeś!");
                        System.out.println();
                        System.out.println();

                    }

                    return;
                }
            }


        }


        if (level.contains("2")) {
            System.out.println("Masz 10 prób. Najwyższa dostępna liczba to 100");
            int a = r.nextInt(100);
            // System.out.println(a);
            int input = 0;

            while (input != a) {
                for (int i = 14; i >= 0; i--) {
                    input = scanner.nextInt();
                    if (input < a) {

                        System.out.println("Za mała liczba! Pozostało prób: " + i);
                        if (i == 0) {
                            System.out.println("Przegrana");
                            return;
                        }
                        continue;
                    }

                    if (input > a) {

                        System.out.println("Podana liczba jest za duża! Pozostało prób: " + i);
                        if (i == 0) {
                            System.out.println("Przegrana");
                            return;
                        }
                        continue;
                    }
                    if (input == a) {
                        System.out.println("Gratulacje! Wygrałeś!");

                    }

                    return;
                }
            }


        }


        if (level.contains("3")) {
            System.out.println("Masz 7 prób. Najwyższa dostępna liczba to 120.");
            int a = r.nextInt(120);
            // System.out.println(a);
            int input = 0;

            while (input != a) {
                for (int i = 9; i >= 0; i--) {
                    input = scanner.nextInt();
                    if (input < a) {

                        System.out.println("Za mała liczba! Pozostało prób: " + i);
                        if (i == 0) {
                            System.out.println("Przegrana");
                            return;
                        }
                        continue;
                    }

                    if (input > a) {

                        System.out.println("Podana liczba jest za duża! Pozostało prób: " + i);
                        if (i == 0) {
                            System.out.println("Przegrana");
                            return;
                        }
                        continue;
                    }
                    if (input == a) {
                        System.out.println("Gratulacje! Wygrałeś!");

                    }

                    return;
                }
            }


        }
        if (level.contains("4")){
            return;
        }


    }
}
