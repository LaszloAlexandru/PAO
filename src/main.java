import java.util.Scanner;

public class main {
    public static void main(String[] args) {
//        System.out.println("ASTA E UN PROGRAM ORDINAR");
//        int a = 5, b = 10;
//        int sum = a + b;
//        Integer abc = new Integer(10);
        //System.out.println(abc);
        Scanner scanner = new Scanner(System.in);
        int comanda;
        do{
            comanda = scanner.nextInt();
            if(comanda == 1){
                int a,b;
                a = scanner.nextInt();
                b = scanner.nextInt();
                System.out.println(a+b);
            }
            if(comanda == 2){
                int a,b;
                a = scanner.nextInt();
                b = scanner.nextInt();
                System.out.println(a-b);
            }
        }while(comanda != 0);
    }
}
