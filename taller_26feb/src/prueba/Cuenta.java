package prueba;

public class Cuenta {
    private double saldo;

    public Cuenta(){
        this.saldo=0;
    }
    public Cuenta(double cantidad){
        if (cantidad >=0){
            this.saldo = cantidad;
            System.out.println("Cuenta creada con saldo: " + saldo);
        } else {
            System.out.println("Saldo inicial invalido. La cuenta se creo con $0");
        }
        
    }
    
    public void depositar(double cantidad){
        if (cantidad > 0){
            saldo = saldo + cantidad;
            System.out.println("El deposito se realizo con exito. ");
        }else {
            System.out.println("Error: el monto debe ser mayor a 0");
        }
    }

    public void retirar(double cantidad){
        if (cantidad <= 0 ){
            System.out.println("Error: el monto a retirar debe ser mayor a 0");
        } else if(cantidad > saldo){
            System.out.println("Error hay saldo insuficiente");
        } else{
            saldo -= cantidad;
            System.out.println("Retiro realizado con exito. Su nuevo saldo es $" + saldo);
        }
    }

    public void obtenerSaldo(){
        System.out.println("El saldo de su cuenta es: $" + saldo);
    }
}
