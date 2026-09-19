public class Programa4 {
    
    int verificarSaldo(int saldo) {
        return saldo;
    }

    int retirarEfectivo(int saldo, int monto) {
        if (monto <= saldo) {
            saldo -= monto;
            return saldo;
        } else {
            System.out.println("Fondos insuficientes");
            return saldo;
        }
    }
}
