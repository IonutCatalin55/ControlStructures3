public class ForEach {
    public static void main(String[] args) {

        int[] vectorsOfInts = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Lungimea vectorului este " + vectorsOfInts.length);

        for (int i = 0;i < vectorsOfInts.length; i++){
            System.out.println("FOR1 Elementul de la pozitia " + i + " este " + vectorsOfInts[i]);
        }
        System.out.println("--------------------------");
        // for - enhanced loop apox ca for each
       /* for(int element : vectorsOfInts){ //o varaianta de for each
            System.out.println("FOR2 elementul de la pozitia " + element + " are val: " +vectorsOfInts[element]);
        } */


        for (int element : vectorsOfInts) { //SE ACCESEAZA FIECARE ELEMENT DIN VECTOR UNU CATE UNU FARA A MAI AVEA NEVOIE DE POZITIE
            System.out.println("FOR22 are valoarea " + element);
        }
        System.out.println("--------------------------");
        //DACA TREBUIE SA ITERAM PE SARITE FOR EACH DE MAI SUS NU NE MAI ESTE DE AJUTOR

        for (int i = 0; i < vectorsOfInts.length; i = i + 2 ){
            System.out.println("FOR3 -> elem de pe pozitia " + i + " este " + vectorsOfInts[i]);
        }
        System.out.println("--------------------------");

        for (int i = 1; i < vectorsOfInts.length; i = i + 2 ){
            System.out.println("FOR4 -> elem de pe pozitia " + i + " este " + vectorsOfInts[i]);
        }

    }
}
