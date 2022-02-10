public class IfThenElse {
    public static void main(String[] args) {
        int a =51;

        // 1* If- then - se lucreaza cu acolade dupa coditie
        if( a == 50) { //Daca nu se pun acolade in "if" se executa doar prima metod, adoua va fi in afara "if"-ului
            System.out.println("a chiar este 50! -> statement executat in if");
            System.out.println("Exprsia este adevarata -> statement executat in if");
        }

        if(a != 50) {
            System.out.println("a este diferit de 50 1");
        }else {
            System.out.println("a este 50! -> ramura else");
        }

        if(a == 50) {
            System.out.println("a este diferit de 50");
        }else if(a < 25) {
            System.out.println("a este mai mic decat 25");
        }else if(a > 100) {
            System.out.println("a este mai mare decat 100");
        }else {
            System.out.println("Inputul este diferit si neacoperit de blocul if then else !");
        }
    }

}
