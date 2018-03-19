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

public class Zad33a {
    
    public static int potega(int x, int n){
        if (n==0)
            return 1;
        if (n%2>0)
            return x*potega(x, n-1);
        else{
            int a = potega(x, n/2);
            return a*a;
        }
    }
    
    public static void main(String[] args) {
        int x,n;
        Scanner in = new Scanner (System.in);
        System.out.println("Podaj liczbe ");
        x = in.nextInt();
        System.out.println("Podaj wykladnik ");
        n = in.nextInt();
        
        System.out.println("Potega tych liczb to "+potega(x, n));
    }
}

