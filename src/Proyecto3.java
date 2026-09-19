public class Proyecto3 {
    void edades(int edad) {
        if(edad > 0) {
            if (edad < 18 && edad > 0) {
                System.out.println("Menor de Edad");
            } else if (edad >= 18 && edad < 50) {
            System.out.print("Adulto");
            } else {
                System.out.println("Adulto mayor");
            }
        } else {
            System.out.println("Edad no válida");
        }
    }
}
