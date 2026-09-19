public class Proyecto1 {

    double suma(double a, double b) {
        return a + b;
    }

    double resta(double a, double b) {
        return a - b;
    }

    double multiplicacion(double a, double b) {
        return a * b;
    }

    double division(double a, double b) {
        if (b == 0) {
            System.out.println("No se puede dividir por cero");
            return 0;
        }
        return a / b;
    }

}
