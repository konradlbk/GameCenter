import org.jcp.xml.dsig.internal.dom.Utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Millionaire implements IPlayable{
    public static final String SEPARATOR = ";";
    public String FILEPATH = "src/questions.txt";

    Scanner scanner = new Scanner(System.in);

    @Override
    public void start() {

        printLogo();
        boolean prawidlowa = false;
        String name = "";
        //List<MillionaireQuestions> ostateczne = new ArrayList<>();
        //ostateczne=getQuestions();
        System.out.println("Witaj w Milionerach!");
        System.out.println("1-Aby zacząć grę");
        System.out.println("2-Wyjdź do Menu Głównego");
       String input = scanner.nextLine();



       if (input.contains("1")){
           System.out.println("Jak masz na imię?");
           name=scanner.nextLine();
           System.out.println("A więc zacznijmy grę, " + name + "! \n");
           System.out.println("Pytanie za 500zł");
           System.out.println(getQuestions().get(0));

           input = scanner.nextLine();
           if (input.contains("B")){
               System.out.println("Definitywnie?");
               input=scanner.nextLine();
               if (input.contains("tak")){
                   System.out.println("Gratulacje, Twoja wygrana to 500zł!");
                   prawidlowa=true;
               } else {
                   System.out.println("Podaj definitywną odpowiedź");
                   input=scanner.nextLine();
                   if (input.contains("B")){
                       System.out.println("Gratulację, jest to prawidłowa odpowiedź!");
                       prawidlowa=true;
                   }else {
                       System.out.println("Niestety odpowiedź jest nieprawidłowa");
                       prawidlowa=false;
                   }
               }
           } else if (!input.contains("B")){
               System.out.println("Definitywnie?");
               input=scanner.nextLine();
               if (input.contains("tak")){
                   System.out.println("Niestety nie jest to prawidlowa odpowiedź. Musimy się pożegnać.");
                   prawidlowa=false;
               } else if (input.contains("nie")){
                   System.out.println("Proszę wybrać definitywną odpowiedź");
                   input=scanner.nextLine();
                   if (input.contains("B")){
                       System.out.println("Gratluacje! Jest to prawidlowa odpowiedź. Twoja wygrana wynosi 500zł");
                       prawidlowa=true;
                   } else {
                       System.out.println("Niestety nie jest to prawidlowa odpowiedź. Dziękuję za udział w grze.");
                       prawidlowa=false;
                   }
               }
           }

           if (prawidlowa==true) {
               System.out.println("Pytanie za 1000zł");
               System.out.println(getQuestions().get(1));
               input=scanner.nextLine();
               if (input.contains("B")){
                   System.out.println("Definitywnie?");
                   input=scanner.nextLine();
                   if (input.contains("tak")){
                       System.out.println("Gratulacje, Twoja obecna wygrana to 1000zł!");
                       prawidlowa=true;
                   } else {
                       System.out.println("Podaj definitywną odpowiedź");
                       input=scanner.nextLine();
                       if (input.contains("B")){
                           System.out.println("Gratulację, jest to prawidłowa odpowiedź! Twoja wygrana obecnie wynosi 1000zł");
                           prawidlowa=true;
                       }else {
                           System.out.println("Niestety odpowiedź jest nieprawidłowa");
                           prawidlowa=false;
                       }
                   }
               } else if (!input.contains("B")){
                   System.out.println("Definitywnie?");
                   input=scanner.nextLine();
                   if (input.contains("tak")){
                       System.out.println("Niestety nie jest to prawidlowa odpowiedź. Musimy się pożegnać.");
                       prawidlowa=false;
                   } else if (input.contains("nie")){
                       System.out.println("Proszę wybrać definitywną odpowiedź");
                       input=scanner.nextLine();
                       if (input.contains("B")){
                           System.out.println("Gratluacje! Jest to prawidlowa odpowiedź. Twoja wygrana wynosi obecnie 1000zł");
                           prawidlowa=true;
                       } else {
                           System.out.println("Niestety nie jest to prawidlowa odpowiedź. Dziękuję za udział w grze.");
                           prawidlowa=false;
                       }
                   }
               }

           }




           if (prawidlowa==true) {
               System.out.println("Pytanie za 2000zł");
               System.out.println(getQuestions().get(2));
               input=scanner.nextLine();
               if (input.contains("C")){
                   System.out.println("Definitywnie?");
                   input=scanner.nextLine();
                   if (input.contains("tak")){
                       System.out.println("Gratulacje, Twoja obecna wygrana to 2000zł!");
                       prawidlowa=true;
                   } else {
                       System.out.println("Podaj definitywną odpowiedź");
                       input=scanner.nextLine();
                       if (input.contains("C")){
                           System.out.println("Gratulację, jest to prawidłowa odpowiedź! Twoja wygrana obecnie wynosi 2000zł");
                           prawidlowa=true;
                       }else {
                           System.out.println("Niestety odpowiedź jest nieprawidłowa");
                           prawidlowa=false;
                       }
                   }
               } else if (!input.contains("C")){
                   System.out.println("Definitywnie?");
                   input=scanner.nextLine();
                   if (input.contains("tak")){
                       System.out.println("Niestety nie jest to prawidlowa odpowiedź. Musimy się pożegnać.");
                       prawidlowa=false;
                   } else if (input.contains("nie")){
                       System.out.println("Proszę wybrać definitywną odpowiedź");
                       input=scanner.nextLine();
                       if (input.contains("C")){
                           System.out.println("Gratluacje! Jest to prawidlowa odpowiedź. Twoja wygrana wynosi obecnie 2000zł");
                           prawidlowa=true;
                       } else {
                           System.out.println("Niestety nie jest to prawidlowa odpowiedź. Dziękuję za udział w grze.");
                           prawidlowa=false;
                       }
                   }
               }

           }



           if (prawidlowa==true) {
               System.out.println("Pytanie za 5000zł");
               System.out.println(getQuestions().get(3));
               input=scanner.nextLine();
               if (input.contains("B")){
                   System.out.println("Definitywnie?");
                   input=scanner.nextLine();
                   if (input.contains("tak")){
                       System.out.println("Gratulacje, Twoja obecna wygrana to 5000zł! Jest to również próg gwarantowany.");
                       prawidlowa=true;
                   } else {
                       System.out.println("Podaj definitywną odpowiedź");
                       input=scanner.nextLine();
                       if (input.contains("B")){
                           System.out.println("Gratulację, jest to prawidłowa odpowiedź! Twoja wygrana obecnie wynosi 5000zł!");
                           prawidlowa=true;
                       }else {
                           System.out.println("Niestety odpowiedź jest nieprawidłowa");
                           prawidlowa=false;
                       }
                   }
               } else if (!input.contains("B")){
                   System.out.println("Definitywnie?");
                   input=scanner.nextLine();
                   if (input.contains("tak")){
                       System.out.println("Niestety nie jest to prawidlowa odpowiedź. Musimy się pożegnać.");
                       prawidlowa=false;
                   } else if (input.contains("nie")){
                       System.out.println("Proszę wybrać definitywną odpowiedź");
                       input=scanner.nextLine();
                       if (input.contains("B")){
                           System.out.println("Gratluacje! Jest to prawidlowa odpowiedź. Twoja wygrana wynosi obecnie 5000zł");
                           prawidlowa=true;
                       } else {
                           System.out.println("Niestety nie jest to prawidlowa odpowiedź. Dziękuję za udział w grze.");
                           prawidlowa=false;
                       }
                   }
               }

           }


           if (prawidlowa==true) {
               System.out.println("Pytanie za 10000zł");
               System.out.println(getQuestions().get(4));
               input=scanner.nextLine();
               if (input.contains("B")){
                   System.out.println("Definitywnie?");
                   input=scanner.nextLine();
                   if (input.contains("tak")){
                       System.out.println("Gratulacje, Twoja obecna wygrana to 10000zł!");
                       prawidlowa=true;
                   } else {
                       System.out.println("Podaj definitywną odpowiedź");
                       input=scanner.nextLine();
                       if (input.contains("B")){
                           System.out.println("Gratulację, jest to prawidłowa odpowiedź! Twoja wygrana obecnie wynosi 10000zł");
                           prawidlowa=true;
                       }else {
                           System.out.println("Niestety odpowiedź jest nieprawidłowa");
                           prawidlowa=false;
                       }
                   }
               } else if (!input.contains("B")){
                   System.out.println("Definitywnie?");
                   input=scanner.nextLine();
                   if (input.contains("tak")){
                       System.out.println("Niestety nie jest to prawidlowa odpowiedź. Musimy się pożegnać.");
                       prawidlowa=false;
                   } else if (input.contains("nie")){
                       System.out.println("Proszę wybrać definitywną odpowiedź");
                       input=scanner.nextLine();
                       if (input.contains("B")){
                           System.out.println("Gratluacje! Jest to prawidlowa odpowiedź. Twoja wygrana wynosi obecnie 10000zł");
                           prawidlowa=true;
                       } else {
                           System.out.println("Niestety nie jest to prawidlowa odpowiedź. Dziękuję za udział w grze.");
                           prawidlowa=false;
                       }
                   }
               }

           }


           if (prawidlowa==true) {
               System.out.println("Pytanie za 20000zł");
               System.out.println(getQuestions().get(5));
               input=scanner.nextLine();
               if (input.contains("A")){
                   System.out.println("Definitywnie?");
                   input=scanner.nextLine();
                   if (input.contains("tak")){
                       System.out.println("Gratulacje, Twoja obecna wygrana to 20000zł!");
                       prawidlowa=true;
                   } else {
                       System.out.println("Podaj definitywną odpowiedź");
                       input=scanner.nextLine();
                       if (input.contains("A")){
                           System.out.println("Gratulację, jest to prawidłowa odpowiedź! Twoja wygrana obecnie wynosi 20000zł");
                           prawidlowa=true;
                       }else {
                           System.out.println("Niestety odpowiedź jest nieprawidłowa");
                           prawidlowa=false;
                       }
                   }
               } else if (!input.contains("A")){
                   System.out.println("Definitywnie?");
                   input=scanner.nextLine();
                   if (input.contains("tak")){
                       System.out.println("Niestety nie jest to prawidlowa odpowiedź. Musimy się pożegnać.");
                       prawidlowa=false;
                   } else if (input.contains("nie")){
                       System.out.println("Proszę wybrać definitywną odpowiedź");
                       input=scanner.nextLine();
                       if (input.contains("A")){
                           System.out.println("Gratluacje! Jest to prawidlowa odpowiedź. Twoja wygrana wynosi obecnie 20000zł");
                           prawidlowa=true;
                       } else {
                           System.out.println("Niestety nie jest to prawidlowa odpowiedź. Dziękuję za udział w grze.");
                           prawidlowa=false;
                       }
                   }
               }

           }


           if (prawidlowa==true) {
               System.out.println("Pytanie za 40000zł");
               System.out.println(getQuestions().get(6));
               input=scanner.nextLine();
               if (input.contains("D")){
                   System.out.println("Definitywnie?");
                   input=scanner.nextLine();
                   if (input.contains("tak")){
                       System.out.println("Gratulacje, Twoja obecna wygrana to 40000zł!");
                       prawidlowa=true;
                   } else {
                       System.out.println("Podaj definitywną odpowiedź");
                       input=scanner.nextLine();
                       if (input.contains("D")){
                           System.out.println("Gratulację, jest to prawidłowa odpowiedź! Twoja wygrana obecnie wynosi 40000zł");
                           prawidlowa=true;
                       }else {
                           System.out.println("Niestety odpowiedź jest nieprawidłowa");
                           prawidlowa=false;
                       }
                   }
               } else if (!input.contains("D")){
                   System.out.println("Definitywnie?");
                   input=scanner.nextLine();
                   if (input.contains("tak")){
                       System.out.println("Niestety nie jest to prawidlowa odpowiedź. Musimy się pożegnać.");
                       prawidlowa=false;
                   } else if (input.contains("nie")){
                       System.out.println("Proszę wybrać definitywną odpowiedź");
                       input=scanner.nextLine();
                       if (input.contains("D")){
                           System.out.println("Gratluacje! Jest to prawidlowa odpowiedź. Twoja wygrana wynosi obecnie 40000zł");
                           prawidlowa=true;
                       } else {
                           System.out.println("Niestety nie jest to prawidlowa odpowiedź. Dziękuję za udział w grze.");
                           prawidlowa=false;
                       }
                   }
               }

           }

           if (prawidlowa==true) {
               System.out.println("Pytanie za 75000zł");
               System.out.println(getQuestions().get(7));
               input=scanner.nextLine();
               if (input.contains("D")){
                   System.out.println("Definitywnie?");
                   input=scanner.nextLine();
                   if (input.contains("tak")){
                       System.out.println("Gratulacje, Twoja obecna wygrana to 75000zł!");
                       prawidlowa=true;
                   } else {
                       System.out.println("Podaj definitywną odpowiedź");
                       input=scanner.nextLine();
                       if (input.contains("D")){
                           System.out.println("Gratulację, jest to prawidłowa odpowiedź! Twoja wygrana obecnie wynosi 75000zł");
                           prawidlowa=true;
                       }else {
                           System.out.println("Niestety odpowiedź jest nieprawidłowa");
                           prawidlowa=false;
                       }
                   }
               } else if (!input.contains("D")){
                   System.out.println("Definitywnie?");
                   input=scanner.nextLine();
                   if (input.contains("tak")){
                       System.out.println("Niestety nie jest to prawidlowa odpowiedź. Musimy się pożegnać.");
                       prawidlowa=false;
                   } else if (input.contains("nie")){
                       System.out.println("Proszę wybrać definitywną odpowiedź");
                       input=scanner.nextLine();
                       if (input.contains("D")){
                           System.out.println("Gratluacje! Jest to prawidlowa odpowiedź. Twoja wygrana wynosi obecnie 75000zł");
                           prawidlowa=true;
                       } else {
                           System.out.println("Niestety nie jest to prawidlowa odpowiedź. Dziękuję za udział w grze.");
                           prawidlowa=false;
                       }
                   }
               }

           }


           if (prawidlowa==true) {
               System.out.println("Pytanie za 125000zł");
               System.out.println(getQuestions().get(8));
               input=scanner.nextLine();
               if (input.contains("A")){
                   System.out.println("Definitywnie?");
                   input=scanner.nextLine();
                   if (input.contains("tak")){
                       System.out.println("Gratulacje, Twoja obecna wygrana to 125000zł!");
                       prawidlowa=true;
                   } else {
                       System.out.println("Podaj definitywną odpowiedź");
                       input=scanner.nextLine();
                       if (input.contains("A")){
                           System.out.println("Gratulację, jest to prawidłowa odpowiedź! Twoja wygrana obecnie wynosi 125000zł");
                           prawidlowa=true;
                       }else {
                           System.out.println("Niestety odpowiedź jest nieprawidłowa");
                           prawidlowa=false;
                       }
                   }
               } else if (!input.contains("A")){
                   System.out.println("Definitywnie?");
                   input=scanner.nextLine();
                   if (input.contains("tak")){
                       System.out.println("Niestety nie jest to prawidlowa odpowiedź. Musimy się pożegnać.");
                       prawidlowa=false;
                   } else if (input.contains("nie")){
                       System.out.println("Proszę wybrać definitywną odpowiedź");
                       input=scanner.nextLine();
                       if (input.contains("D")){
                           System.out.println("Gratluacje! Jest to prawidlowa odpowiedź. Twoja wygrana wynosi obecnie 125000zł");
                           prawidlowa=true;
                       } else {
                           System.out.println("Niestety nie jest to prawidlowa odpowiedź. Dziękuję za udział w grze.");
                           prawidlowa=false;
                       }
                   }
               }

           }


           if (prawidlowa==true) {
               System.out.println("Pytanie za 250000zł");
               System.out.println(getQuestions().get(9));
               input=scanner.nextLine();
               if (input.contains("A")){
                   System.out.println("Definitywnie?");
                   input=scanner.nextLine();
                   if (input.contains("tak")){
                       System.out.println("Gratulacje, Twoja obecna wygrana to 250000zł!");
                       prawidlowa=true;
                   } else {
                       System.out.println("Podaj definitywną odpowiedź");
                       input=scanner.nextLine();
                       if (input.contains("A")){
                           System.out.println("Gratulację, jest to prawidłowa odpowiedź! Twoja wygrana obecnie wynosi 250000zł");
                           prawidlowa=true;
                       }else {
                           System.out.println("Niestety odpowiedź jest nieprawidłowa");
                           prawidlowa=false;
                       }
                   }
               } else if (!input.contains("A")){
                   System.out.println("Definitywnie?");
                   input=scanner.nextLine();
                   if (input.contains("tak")){
                       System.out.println("Niestety nie jest to prawidlowa odpowiedź. Musimy się pożegnać.");
                       prawidlowa=false;
                   } else if (input.contains("nie")){
                       System.out.println("Proszę wybrać definitywną odpowiedź");
                       input=scanner.nextLine();
                       if (input.contains("A")){
                           System.out.println("Gratluacje! Jest to prawidlowa odpowiedź. Twoja wygrana wynosi obecnie 250000zł");
                           prawidlowa=true;
                       } else {
                           System.out.println("Niestety nie jest to prawidlowa odpowiedź. Dziękuję za udział w grze.");
                           prawidlowa=false;
                       }
                   }
               }

           }


           if (prawidlowa==true) {
               System.out.println("Pytanie za 500000zł");
               System.out.println(getQuestions().get(10));
               input=scanner.nextLine();
               if (input.contains("C")){
                   System.out.println("Definitywnie?");
                   input=scanner.nextLine();
                   if (input.contains("tak")){
                       System.out.println("Gratulacje, Twoja obecna wygrana to 500000zł!");
                       prawidlowa=true;
                   } else {
                       System.out.println("Podaj definitywną odpowiedź");
                       input=scanner.nextLine();
                       if (input.contains("C")){
                           System.out.println("Gratulację, jest to prawidłowa odpowiedź! Twoja wygrana obecnie wynosi 500000zł");
                           prawidlowa=true;
                       }else {
                           System.out.println("Niestety odpowiedź jest nieprawidłowa");
                           prawidlowa=false;
                       }
                   }
               } else if (!input.contains("C")){
                   System.out.println("Definitywnie?");
                   input=scanner.nextLine();
                   if (input.contains("tak")){
                       System.out.println("Niestety nie jest to prawidlowa odpowiedź. Musimy się pożegnać.");
                       prawidlowa=false;
                   } else if (input.contains("nie")){
                       System.out.println("Proszę wybrać definitywną odpowiedź");
                       input=scanner.nextLine();
                       if (input.contains("C")){
                           System.out.println("Gratluacje! Jest to prawidlowa odpowiedź. Twoja wygrana wynosi obecnie 500000zł");
                           prawidlowa=true;
                       } else {
                           System.out.println("Niestety nie jest to prawidlowa odpowiedź. Dziękuję za udział w grze.");
                           prawidlowa=false;
                       }
                   }
               }

           }


           if (prawidlowa==true) {
               System.out.println("Ostatnie pytanie za 1000000zł");
               System.out.println(getQuestions().get(10));
               input=scanner.nextLine();
               if (input.contains("C")){
                   System.out.println("Definitywnie?");
                   input=scanner.nextLine();
                   if (input.contains("tak")){
                       System.out.println("Gratulacje, wygrałeś(aś) MILION ZLOTYCH!");
                       prawidlowa=true;
                   } else {
                       System.out.println("Podaj definitywną odpowiedź");
                       input=scanner.nextLine();
                       if (input.contains("C")){
                           System.out.println("Gratulację, jest to prawidłowa odpowiedź! Wlasnie wygrales(as) MILION ZLOTYCH!");
                           prawidlowa=true;
                       }else {
                           System.out.println("Niestety odpowiedź jest nieprawidłowa");
                           prawidlowa=false;
                       }
                   }
               } else if (!input.contains("C")){
                   System.out.println("Definitywnie?");
                   input=scanner.nextLine();
                   if (input.contains("tak")){
                       System.out.println("Niestety nie jest to prawidlowa odpowiedź. Musimy się pożegnać.");
                       prawidlowa=false;
                   } else if (input.contains("nie")){
                       System.out.println("Proszę wybrać definitywną odpowiedź");
                       input=scanner.nextLine();
                       if (input.contains("C")){
                           System.out.println("Gratluacje! Jest to prawidlowa odpowiedź. Wlasnie wygrales(as) milion zlotych!");
                           prawidlowa=true;
                       } else {
                           System.out.println("Niestety nie jest to prawidlowa odpowiedź. Dziękuję za udział w grze.");
                           prawidlowa=false;
                       }
                   }
               }

           }

    }


    }






    public static List<MillionaireQuestions> getQuestions () {
        List<MillionaireQuestions> pytania = new ArrayList<>();
           try {
                InputStream is = Millionaire.class.getResourceAsStream("questions.txt");
                Reader in = new InputStreamReader(is, "utf-8");
                Scanner scanner1 = new Scanner(in);
               while (scanner1.hasNextLine()) {
                   String line = scanner1.nextLine();
                   MillionaireQuestions questions = getQuestionsFromLine(line);
                   pytania.add(questions);
              }

           } catch (UnsupportedEncodingException e){
               e.printStackTrace();
           }
                return pytania;
        }

        public static MillionaireQuestions getQuestionsFromLine (String line){

        String [] splits = line.split(SEPARATOR);
        String question = splits[0];
        String ans1 = splits[1];
        String ans2 = splits[2];
        String ans3 = splits[3];
        String ans4 = splits[4];

        return new MillionaireQuestions(question, ans1, ans2, ans3, ans4);

    }

    public static void printLogo() {
        InputStream logStream = Utils.class.getResourceAsStream("/mlogo.txt");
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
