public class WhileDoWhile {
    public static void main(String[] args) {

        int counter = 0;
        /*  Modul de constructie
            while(expresia-care trebuie sa fie adevarata){
                //bloc de cod = statement sau mai multe statement uri
            }
         */
        while (counter < 25){
            System.out.println("WHILE - Counterul are valoarea " + counter);// Loop infinit counterul trebuie incrementat sau
            //decrementat dupa caz
            counter++;//atentie la prefixare sau postfixare
            //and folosim structuri repetitive trebuie de la inceput cum oprim codul
        }

        System.out.println("-------------------------------------------");
        System.out.println(counter);
        counter = 0; // eintializare variabila cu "0"
        /*
        do() {
        blocul de cod
        } while (condita de oprire sau expresia advarata pt executia do while);
         */
        do {
            System.out.println("DOWHILE - Counterul are valoarea " + counter);
            counter = counter + 2;//mai ntai executa codul si dupa aceea evalueaza conditia WHILE
        }while(counter < 25);


    }
}
