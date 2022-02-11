public class Return {
    public static void main(String[] args) {

        int sum  = 0, a = 6, b = 18;
        sum = a +b;
        System.out.println("Suma este " + sum);
        doPrint(sum);

        int c = 17, d = 30;
        sum = c + d;
        System.out.println("Suma este " + sum);
        doPrint(sum);
        System.out.println("suma cu ajutorul metodei main este " + sum(a ,b));

    }
    //cream o metoda noua in afara metodei main care sa calculeze direct suma

    public static int sum(int operandOne, int operandTwo){
        System.out.println("Calculez suma: " + operandOne + " + " +operandTwo);
        return operandOne + operandTwo; //return trebuie sa fie ultimul statement,orice cod pus dupa este eroare de compilare
    }

    //folosirea "return dar fara sa returneze ceva "
    public static void doPrint(int sum){
        if(sum < 30){
            return;
        }
        System.out.println("This sum is awesom!");
    }
}
