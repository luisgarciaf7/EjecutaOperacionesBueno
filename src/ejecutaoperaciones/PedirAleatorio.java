package ejecutaoperaciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Luis Garcia
 */
public class PedirAleatorio {

    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        OperacionesBasicas objeto = new OperacionesBasicas();
        System.out.println("Ingrese limite superior");
        int a = Integer.parseInt(entrada.readLine());
        System.out.println("Ingrese limite inferior");
        int b = Integer.parseInt(entrada.readLine());
        int resultadorandom=objeto.random(a, b);
        System.out.println("El numero aleatoria es  " + resultadorandom);

    }
}
