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

public class Zad34 {

     public static int Fibonacci(int n){
        if ((n==1)||(n==2))
            return 1;
        else
            return Fibonacci(n-1)+Fibonacci(n-2);
    }
     
    public static void main(String[] args) {
        int n;
        System.out.println("Podaj wyraz ciagu ");        
        Scanner in = new Scanner (System.in);
        n = in.nextInt();
        System.out.println(n+" -ty wyraz ciagu Fibonacciego: "+Fibonacci(n));
    }
}
