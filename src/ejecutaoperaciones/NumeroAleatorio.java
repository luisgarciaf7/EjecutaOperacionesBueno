package ejecutaoperaciones;

/**
 *
 * @author Luis Garcia
 */
public class NumeroAleatorio {

    public int resultadorandom(int a, int b) {
        int resultadorandom = (int) ((b-a) *Math.random() + a);
        System.out.println(resultadorandom);
        return resultadorandom;
    }
}