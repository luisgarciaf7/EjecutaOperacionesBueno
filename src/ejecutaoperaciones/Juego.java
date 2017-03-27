package ejecutaoperaciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Luis Garcia
 */
public class Juego {

    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        OperacionesBasicas objeto = new OperacionesBasicas();
        int contador = 0;
        int contador2 = 0;
        String S = "S";
        String opcion = "opcion";
        String opcion2;
        do {
            int A = objeto.random(1, 10);
            int B = objeto.random(1, 10);

            System.out.println("Apuestas por A o por B?");
            opcion = (entrada.readLine());
            if (opcion.equals("b")) {
                if (A > B) {
                    System.out.println("Has perdido");
                    contador++;
                } else if (B > A) {
                    System.out.println("Has ganado ");
                    contador2++;
                }
            }
            if (opcion.equals("a")) {
                if (A > B) {
                    System.out.println("Has ganado");
                    contador2++;
                } else if (B > A) {
                    System.out.println("Has perdido");
                    contador++;
                }
            }
            System.out.println("A= " + A);
            System.out.println("B=" + B);
            System.out.println("Tienes  " + contador2 + "  ganadas y tienes  " + contador + " perdidas");

            System.out.println("Deseas volver a jugar");
            opcion2 = entrada.readLine();
        } while (opcion2.equals("s"));
    }
}
