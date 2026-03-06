package prueba;

import prueba.Cuenta;

public class Main {
    public static void main (String[] args){
        Cuenta cuenta1 = new Cuenta(2000000);
        cuenta1.obtenerSaldo();
        cuenta1.depositar(60000);
        cuenta1.retirar(6700);
        cuenta1.obtenerSaldo();
    }

    }
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.

