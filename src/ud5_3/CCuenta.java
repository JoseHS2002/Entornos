package ud5_3;

public class CCuenta {
    public static void main(String[] args) {
        // Depuracion. Se detiene siempre
        CCuenta miCuenta = new CCuenta();
        System.out.println("Saldo Inicial: "+miCuenta.dSaldo+" euros");
        // Depuracion. Provoca parada por ingreso con cantidad menor de 0
        miCuenta.ingresar(-100);
        System.out.println("Saldo Inicial: "+miCuenta.dSaldo+" euros");
        miCuenta.ingresar(100);
        System.out.println("Saldo Inicial: "+miCuenta.dSaldo+" euros");
        miCuenta.ingresar(200);
        System.out.println("Saldo Inicial: "+miCuenta.dSaldo+" euros");
        // Depuracion. Provoca parada con condicion de tercer ingreso
        miCuenta.ingresar(300);
        System.out.println("Saldo Inicial: "+miCuenta.dSaldo+" euros");

    }
}
