import java.util.Scanner;


public class SwitchStatement {
    public static void main(String[] args) {

Scanner scanner = new Scanner(System.in); //cu scanare de la tastatura
        System.out.println("Introdu o litera de la a ... la g");
String zilele = scanner.nextLine();// nextInt pentru un nr intreg,nextChar etc

        /*
        daca nu incheiem case-ul cu brake, Switch va evalua toate cazurile
         */
        switch (zilele){
            case "a":
                System.out.println("luni");
                break;
            case "b":
                System.out.println("marti");
                break;
            case "c":
                System.out.println("miercuri");
                break;
            case "d":
                System.out.println("joi");
                break;
            case "e":
                System.out.println("vineri");
                break;
            case "f":
                System.out.println("sambata");
                break;
            case "g":
                System.out.println("duminica");
                break;
            default:
                System.out.println("nu este o zi a saptamani");
                break; // pt ca default e ultima ramura in switch default nu mai este necesar


    }
    }
}
