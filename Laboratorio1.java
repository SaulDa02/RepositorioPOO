
package practica.pkg1;

import java.util.Scanner;

public class Laboratorio1 {

    public static void main(String[] args) {
        Scanner scnNom = new Scanner(System.in);
        
        //Creacion de la primera cuenta arbitraria
        Cuenta cta1 = new Cuenta("Saul Davila Gonzalez", "20022111", 1.2, 1000);
                
        //Pedir datos al usuario
        System.out.println("Titular de la cuenta: ");
        String nom = scnNom.nextLine();
        System.out.println("Numero de cuenta: ");
        String numCuenta = scnNom.nextLine();
        System.out.println("Tipo de interes: ");
        double tipoint = scnNom.nextDouble();
        System.out.println("Saldo: ");
        double saldo = scnNom.nextDouble();
        System.out.println("Monto a trabajar: ");
        double cnt = scnNom.nextDouble();
        
        //Creacion de la segunda cuenta con los datos recien ingresados
        Cuenta cta2 = new Cuenta(nom, numCuenta, tipoint, saldo);
        
        //Creación de la tercera cuenta con base al objeto 2
        Cuenta cta3 = new Cuenta(cta2);
        
        System.out.println("\nAntes");
        //Cuentas recién creadas
        System.out.println("Cuenta 1.\nNombre: "+cta1.getNomCliente()+"\nCuenta: "+cta1.getNumCuenta());
        System.out.println("Tipo de interés: "+cta1.getTipointeres()+"\nSaldo: "+cta1.getSaldo()+"\n");
        
        System.out.println("Cuenta 2.\nNombre: "+cta2.getNomCliente()+"\nCuenta: "+cta2.getNumCuenta());
        System.out.println("Tipo de interés: "+cta2.getTipointeres()+"\nSaldo: "+cta2.getSaldo()+"\n");
        
        System.out.println("Cuenta 3.\nNombre: "+cta3.getNomCliente()+"\nCuenta: "+cta3.getNumCuenta());
        System.out.println("Tipo de interés: "+cta3.getTipointeres()+"\nSaldo: "+cta3.getSaldo()+"\n");
        
        //Uso del método deposito para añadir saldo a una cuenta
        cta1.deposito(cnt);
        
        //Uso del método retiro para quitar saldo de una cuenta
        cta2.retiro(cnt);
        
        //Uso del método transferencia para hacer una transacción
        cta2.transferencia(cta3, cnt);
        
        System.out.println("Deposito de monto a cuenta 1");
        System.out.println("Retiro de monto a cuenta 2");
        System.out.println("Transferencia de monto de cuenta 2 a cuenta 3");
        
        System.out.println("\nDespués");
        //Uso del método transferencia para pasar saldo de una cuenta a otra
        System.out.println("Cuenta 1.\nNombre: "+cta1.getNomCliente()+"\nCuenta: "+cta1.getNumCuenta());
        System.out.println("Tipo de interés: "+cta1.getTipointeres()+"\nSaldo: "+cta1.getSaldo()+"\n");
        
        System.out.println("Cuenta 2.\nNombre: "+cta2.getNomCliente()+"\nCuenta: "+cta2.getNumCuenta());
        System.out.println("Tipo de interés: "+cta2.getTipointeres()+"\nSaldo: "+cta2.getSaldo()+"\n");
        
        System.out.println("Cuenta 3.\nNombre: "+cta3.getNomCliente()+"\nCuenta: "+cta3.getNumCuenta());
        System.out.println("Tipo de interés: "+cta3.getTipointeres()+"\nSaldo: "+cta3.getSaldo()+"\n");
    }
    
}
