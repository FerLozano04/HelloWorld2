import java.util.Scanner;
public class Main10 {
    public static void main(String[]arg){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el numero: ");
        int altura=teclado.nextInt();

        //triangulo
        for (int i=0;i<altura;i++){
            for (int j=0;j<altura-i-1;j++){
                System.out.print(" ");
            }
            for (int j=0; j<i+1;j++){
                System.out.print(" *");
            }
            System.out.println("");;
        }
        // triangulo invertido
        for (int i=1;i<altura;i++){  // comenzar en 1, para que la base invertida inicie en 4
            for (int j=0; j<i;j++){
                System.out.print(" ");
            }
            for (int j=0;j<altura-i;j++){
                System.out.print(" *");  // el espacio al iniciar el * para la forma correcta del rombo
            }
            System.out.println("");;
        }
    }
}
