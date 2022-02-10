public class OperatorulTernar {
    public static void main(String[] args) {

        //operatorul ternar este un if then else prescurtat
        //" ? :

        int a = 25;
        int b = 35;
        System.out.println((a == 25) || (b == 8) ? true : false);
        System.out.println((b == 34) ? "b este 35" : "b nu este 35 ");
        System.out.println((a == 25) && (b == 35 ) ? 1 : 2);
    }
}
