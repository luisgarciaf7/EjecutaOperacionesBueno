package ejecutaoperaciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Luis Garcia
 */
public class Canciones {

    public static String cancion;

    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        OperacionesBasicas objeto = new OperacionesBasicas();

        System.out.println("1. Pasito perrón");
        System.out.println("2. All Or Nothing ");
        System.out.println("3. Alone");
        System.out.println("4. Alguien robo");
        System.out.println("5. Animals");
        System.out.println("6. Aprender a Quererte");
        System.out.println("7. Call Me A Spaceman");
        System.out.println("8. Caminar de tu mano");
        System.out.println("9. Casi Humanos");
        System.out.println("10. Closer");
        System.out.println("11. Como te atrevez");
        System.out.println("12. Como te atrevez");
        System.out.println("13. Deja que te bese");
        System.out.println("14. Despacito");
        System.out.println("15. Disparo al corazón");
        System.out.println("16. Doble vida");
        System.out.println("17. Duele el amor");
        System.out.println("18. Ecos de Amor");
        System.out.println("19. Espacio sideral");
        System.out.println("20. Get Down");

        System.out.println("¿Quieres reproducir en orden aleatorio S/N");
        cancion = entrada.readLine();
        if (cancion.equals("s")) {
            int limite = objeto.random(1, 20);
            System.out.println(limite);
            switch (limite) {
                case 1:
                    System.out.println(" Pasito perron");
                    break;
                case 2:
                    System.out.println("All Or Nothing");
                    break;
                case 3:
                    System.out.println(" Alone ");
                    break;
                case 4:
                    System.out.println("Alguien robo");
                    break;
                case 5:
                    System.out.println("Animals");
                    break;
                case 6:
                    System.out.println("Aprender a Quererte");
                    break;
                case 7:
                    System.out.println("Call Me A Spaceman");
                    break;
                case 8:
                    System.out.println(" Caminar de tu mano");
                    break;
                case 9:
                    System.out.println("Casi Humanos");
                    break;
                case 10:
                    System.out.println("Closer");
                    break;
                case 11:
                    System.out.println("Como te atrevez");
                    break;
                case 12:
                    System.out.println("Como tu no hay 2");
                    break;
                case 13:
                    System.out.println("Deja que te bese");
                    break;
                case 14:
                    System.out.println("Despacito");
                    break;
                case 15:
                    System.out.println("Disparo al corazón");
                    break;
                case 16:
                    System.out.println("Doble vida");
                    break;
                case 17:
                    System.out.println("Duele el amor");
                    break;
                case 18:
                    System.out.println("Ecos de Amor");
                    break;
                case 19:
                    System.out.println("Espacio sideral");
                    break;
                case 20:
                    System.out.println("Get Down");
                    break;
            }
        } else {
            System.out.println(" Pasito perrón");
        }
    }
}
