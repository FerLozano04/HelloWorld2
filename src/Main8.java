import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduce un numero");
        int altura= sc.nextInt();

        for(int i=0;i<altura;i++) {
            for(int j=0;j<i+1;j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
