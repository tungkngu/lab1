/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part3;

import java.util.Scanner;

public class Part3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] students = new String[10];
        for(int i = 0; i  < 10; i++){
            students[i] = input.nextLine();
            students[i].toUpperCase();
        }
        for(int i = 0; i  < 10; i++){
            System.out.println(students[i]);
        }
    }
    
}
