/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.if1.pkg10119005.hayinananta;

import java.util.Scanner;

/**
 *
 * @author Hayin
 */
public class main {
    public static void main(String[] args) {
        // TODO code application logic here
        Customer customer = new Customer();
        Scanner scanner = new Scanner(System.in);
        System.out.println("===Program Kasir Rock n Roll Haircut===");
        System.out.print("Customer Name : ");
        customer.setName(scanner.next());
        System.out.print("Customer Email : ");
        customer.setEmail(scanner.next());
    }
    
}
