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

public class CalculatorClient {

    public static void main(String[] args) {
        try {
            Calculator c
                    = (Calculator) Naming.lookup("//192.168.100.71/CalculatorService");
            System.out.println(c.sub(4, 3));
            System.out.println(c.add(4, 5));
            System.out.println(c.mul(3, 6));
            System.out.println(c.div(9, 3));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
