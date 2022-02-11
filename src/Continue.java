public class Continue {
    public static void main(String[] args) {

        for(int counter = 0; counter < 42; counter++){
            if (counter % 2 == 0){
                continue; // FOLOSIM CONTINUE CAND VREM SA SARIM PESTE VALORI
            }
            System.out.println("Are valoare " + counter);
        }
        System.out.println("-------------------------------");
        int counter = 0;

        while (counter < 42){
            if (counter % 2 == 1){ //atentie trebuie sa i spunem lui if ce trebuie sa faca daca gasest conditia inainte de continue
                counter++;
                continue;
            }
            System.out.println("WHILE Are valoarea para " + counter);
            counter++;
        }
        counter = 0;

        System.out.println("-------------------------------");
        do {
            if ((counter - 1) % 2 == 0){
                counter++;
                continue;
            }
            System.out.println("Counter DOWHILE are valoarea " + counter);
            counter++;
        }while (counter < 42);

    }
}
