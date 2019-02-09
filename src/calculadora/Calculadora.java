package calculadora;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Calculadora {

    public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException {
       
        int operacion; 
        int a;
        int b;
        int resultadosuma;
        int resultadoresta;
        int resultadomult;
        int resultadodiv;
        
        System.out.println("Eliga el número 1 si desea hacer una suma.");
        System.out.println("Eliga el número 2 si desea hacer una resta.");
        System.out.println("Eliga el número 3 si desea hacer una multiplicación.");
        System.out.println("Eliga el número 4 si desea hacer una división.");
        
        System.out.println("Indique la operacion que va a realizar: ");
        operacion = Integer.parseInt(entrada.readLine());
        
        if(operacion==1){
            System.out.println("Indique el primer valor: ");
            a = Integer.parseInt(entrada.readLine());
            System.out.println("Indique el segundo valor: ");
            b = Integer.parseInt(entrada.readLine());
            int suma= a+b;
            System.out.println("El resultado de tu suma es: " + suma);              
        } 
        else if (operacion == 2) 
         {
            System.out.println("Indique el primer valor: ");
            a = Integer.parseInt(entrada.readLine());
            System.out.println("Indique el segundo valor: ");
            b = Integer.parseInt(entrada.readLine());
            int resta= a-b;
            System.out.println("El resultado de tu resta es: " + resta); 
          }
            
        
    }
    
}
