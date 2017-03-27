package ejecutaoperaciones;

/**
 *
 * @author Luis Garcia
 */
public class OperacionesBasicas {

    public int suma(int a, int b) {
        int resultadosuma = (a + b);
        return resultadosuma;
    }

    public int resta(int a, int b) {
        int resultadoresta = (a - b);
        return resultadoresta;
    }

    public int multiplicacion(int a, int b) {
        int resultadomultiplicacion = (a * b);
        return resultadomultiplicacion;
    }

    public double division(int a, int b) {
        double resultadodivision = (a / b);
        return resultadodivision;
    }
    public int random (int a, int b){
         int resultadorandom = (int) ((b-a) *Math.random() + a);
         return resultadorandom;
    }
}
