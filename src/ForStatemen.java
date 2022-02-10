public class ForStatemen {
    public static void main(String[] args) {

        /*
        for(statement de initializare; conditia de oprire; statement care se intampla la fiecare iteratie ) {
        BLOCUL DE COD;
        }
         */

        for (int counter = 0; counter < 25; counter++){ //variabila counter este definita in interiorul lui for si nu poate fi folosita
            System.out.println("FOR1 -> Counter-ul are valoarea " + counter); // in afara lui
        }
        System.out.println("-----------------------------------");
        //putem defini variabila in afara for-ului
        int iteratot;
        for (iteratot = 98; iteratot < 100; iteratot++){
            System.out.println("FOR2 -> Iteratorul are valoarea " + iteratot);
        }
        //Variabila iterator fiind definita in afara for ului  va putea fi apelata in afara lui
        System.out.println(" Dupa FOR2 Iterator are valoarea " + iteratot);

       /* for (;;){ // Varianta posibila de for -> loop infinit
            System.out.println("FOR3 -> iteratorul are valoarea " + iteratot);
        }*/
        iteratot = 5;    //alta forma de for cu statement de incrementare in blocul de cod
        for (;iteratot <25;){
            System.out.println("FOR3 -> iterator are valoarea " +iteratot);
            iteratot++;
        }
        System.out.println("Dupa FOR3 -> iterator are valoarea " + iteratot);

    }
}
