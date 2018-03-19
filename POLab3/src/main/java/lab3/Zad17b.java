/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author Sebcio
 */
import java.util.Scanner;

public class Zad17b {
    public static void main(String[] args) {
        
        int x,y,z;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj pierwszą liczbę całkowitą ");
        x = scanner.nextInt();
        System.out.print("Podaj drugą liczbę całkowitą ");
        y = scanner.nextInt();
        z = x ^ y;
            System.out.println("Wynik operacji xor " +z+ "");
    }
}
