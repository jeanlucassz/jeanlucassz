/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package JeanJAVA;

import java.util.Scanner;


public class Jean {

    public static void main(String[] args) {
       
       double n1, n2, n3;
       Scanner Jean = new Scanner(System.in);
       
       
       System.out.println("Digite a primeira nota: ");
       n1 = Jean.nextDouble();
       n1 = n1*2;
       
       System.out.println("Digite a segunda nota: ");
       n2 = Jean.nextDouble();
       n2 = n2*3;
       
       n3 = (n1+n2)/5;
        
       System.out.println("A media ponderada é: " +n3);
       
       
    }
}

   