
package pruebagithub;

import java.util.Scanner;


public class PruebaGitHub {

    public static void main(String[] args) {
        int a;
        Scanner entrada = new Scanner (System.in);
        System.out.println("Hola mundo...");
        System.out.println("ingresar un numero del cual desees saber la tabla de multiplicar:");
        a = entrada.nextInt();
        int i = 0 ;
        for ( i = 1; i < 11; i++) {
            System.out.println(a + " * " + i + "= " + (a*i) );
        }
    }
    
}
