/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorarmi;

/**
 *
 * @author Eduardo M
 */
import java.rmi.Naming;

public class CalculatorServer {

    public CalculatorServer() {
        try { //Fazer o registo para o porto desejado
            java.rmi.registry.LocateRegistry.createRegistry(1099);
            System.out.println("RMI registry ready.");
        } catch (Exception e) {
            System.out.println("Exception starting RMI registry:");
            e.printStackTrace();
        }
        try {
            Calculator c = new CalculatorImpl();
            Naming.rebind("CalculatorService", c);
        } catch (Exception e) {
            System.out.println("Trouble:" + e);
        }
    }

    public static void main(String args[]) {
        new CalculatorServer();
    }
}
