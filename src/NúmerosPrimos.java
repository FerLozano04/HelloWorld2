import java.util.Scanner;

public class NúmerosPrimos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c,i,n;

        System.out.print("Ingresa un numero: ");
        n = sc.nextInt();

        c = 0;

        for(i = 1; i <= n; i++)
        {
            if((n % i) == 0)
            {
                c++;
            }
        }

        if(c <= 2)
        {
            System.out.println("El numero es primo");
        }else{
            System.out.println("El numero no es primo");
        }
    }
}