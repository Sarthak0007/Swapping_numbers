/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swapping_numbers;

import java.util.Scanner;


public class Swapping_numbers {

    
    public static void main(String[] args) {
        
        int a,b;
      Scanner scn =new Scanner(System.in); 
      
        System.out.println("Enter Value for A:");
        a =scn.nextInt();
        System.out.println("Enter Value for B:");
        b =scn.nextInt();
        
        System.out.println("Before Swapping:-a:"+a+"b:"+b);
        a =a+b;
        b =a-b;
        a =a-b;
        
        System.out.println("After Swapping :-a:"+a+"b:"+b);
    }
    
}
