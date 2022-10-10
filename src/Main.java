import java.util.Scanner;  //import de la clase Scanner

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);  //Se crea un objeto Scanner
        Double n;
        System.out.print("Introduzca la nota del examen:  ");
        n = sc.nextDouble(); //leer un dato

        if (n< 3) {
            System.out.println("Muy deficiente");
        } else if (n>=3 && n< 5) {
            System.out.println("Insuficiente");
        }else if (n>= 5 && n<6) {
            System.out.println("Suficiente");
        }else if (n>= 6 && n<7) {
            System.out.println("Bien");
        }else if (n>= 7 && n<9) {
            System.out.println("Notable");
        }else if (n>= 9 && n<10) {
            System.out.println("Sobresaliente");
        } else {
            System.out.println("Matrícula de honor");

        }
    }
}