/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part2;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class Part2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {




        Scanner input = new Scanner(System.in);
        int num1, num2;
        String op;
        System.out.print("Input the number 1: ");
        num1 = input.nextInt();
        System.out.print("Input the number 2: ");
        num2 = input.nextInt();
        System.out.print("Input the operator: ");
        op = input.nextLine();
        System.out.println("The result of " + num1+ "+" + num2 + " = " +(num1+num2));

    }
    
}
