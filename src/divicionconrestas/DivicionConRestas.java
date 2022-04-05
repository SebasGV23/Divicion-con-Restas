package divicionconrestas;
import java.util.Scanner;
public class DivicionConRestas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a, b, c, d; 
        a=b=c=d=0;
        
        System.out.println(" digite un número entero positivo para el dividiendo");
        a = sc.nextInt();
        System.out.println(" digite un número entero positivo para el divisor ");
        b = sc.nextInt();
        
        while (a >=b ) {
            a = a - b;
            c = c + 1;                 
        }
        if (a != 0) {
            System.out.println("Ingrese digitos para precicion decimal [1-6]");
            d = sc.nextInt();
             System.out.println(c+","+decimal(a, b, d));
        } else {
                    System.out.println(c);
                }    
        }
        static int decimal ( int a, int b, int d){
            int c = 0;
            if (d > 0 && d < 7){
                a*=(Math.pow(10,d));            
            }
            while (a>=b ) {
            a = a - b;
            c = c + 1;                 
        }  
        return c;
        }
    }