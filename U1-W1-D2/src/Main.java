import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //ESERCIZIO 1
        //1) STRINGA PARI

        String myName = "Alessandro";

        stringaPariDispari(myName);

        //2) ANNO BISESTILE

        int anno = 2024;

        annoBisestile(anno);

       //ESERCIZIO 2 (switch)

        int num = 6;

        switch (num){
            case 0 :
                System.out.println("zero");
                break;

            case 1 :
                System.out.println("uno");
                break;

            case 2 :
                System.out.println("due");
                break;
            case 3 :
                System.out.println("tre");
                break;

            default:
                System.out.println("ERRORE!?");
        }

        //ESERCIZIO 3 (while)

        //Scanner scanner = new Scanner(System.in);

        //String myString = scanner.nextLine();


        //ESERCIZIO 4 (for)

        Scanner scanner = new Scanner(System.in);

        int userNum  = scanner.nextInt();

        for (int i = userNum ; i >= 0 ; i--){

            System.out.println(i);
        }


    }
        public static boolean stringaPariDispari(String myName){
            if(myName.length() % 2 == 0){
                System.out.println("La lunghezza della stringa è pari");
                return true;
            } else {
                System.out.println("La lunghezza della stringa è dispari");
                return false;
            }
        }

        public static boolean annoBisestile(int anno){
        if (anno % 4 == 0){
            System.out.println("L'anno " + anno + " è bisestile");
            return true;
        } else if (anno % 100 == 0 && anno % 400 == 0) {
            System.out.println("L'anno " + anno + " è bisestile");
            return true;
        } else {
            System.out.println("L'anno " + anno + " non è bisestile");
            return false;
        }
        }


}