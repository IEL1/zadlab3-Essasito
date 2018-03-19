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

public class Zad17a {
    public static void main(String[] args) {
        
        int x,y;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbe całkowitą ");
        x = scanner.nextInt();
        if (x%2>0){
            System.out.println("Podana liczba jest nieparzysta");
        }
        else{
            System.out.println("Podana liczba jest parzysta");
        }
    }
}
