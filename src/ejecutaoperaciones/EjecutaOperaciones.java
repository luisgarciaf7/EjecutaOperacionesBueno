package ejecutaoperaciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Luis Garcia
 */
public class EjecutaOperaciones {

    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        OperacionesBasicas objeto = new OperacionesBasicas();        
        System.out.println("Ingrese numero");
        int a = Integer.parseInt(entrada.readLine());
        System.out.println("Ingrese numero");
        int b = Integer.parseInt(entrada.readLine());
        int suma=objeto.suma(a, b);
        System.out.println("La suma es  " + suma);
        int resta=objeto.resta(a, b);
        System.out.println("La resta es  " + resta);
        int multiplicacion=objeto.multiplicacion(a, b);
        System.out.println("La multiplicacion es  " + multiplicacion);
        double division=objeto.division (a, b);
        System.out.println("La division es  "+ division );
        int resultadorandom=objeto.random(a, b);
        System.out.println("El numero aleatoria es  " + resultadorandom);
        
    }
}
