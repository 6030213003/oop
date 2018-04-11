/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;

import java.util.Scanner;
public class bow {
 public void menu(){
    System.out.println("\t\t---Menu---");
    for (int i=1; i<=40; i++){ 
     System.out.print("-");}
     System.out.println();
     System.out.println("1.Cosmetics\n2.Skincare\n3.Perfume\n4.Dietary Supplements");
    
}
 
 public String name = "CEO";
 public String pass = "9999";
 public String name1 = "Cashcheer";
 public String pass1 = "6666";
 public String kpo = "Y";
 
 public void login(){
       
     String n;
     String p;
     String k;
     
     System.out.println("\t\tPlease Login");
    
    do{
     do{
        Scanner kb = new Scanner(System.in);
     System.out.print("Username : ");
     n = kb.nextLine();
     
        Scanner kb1 = new Scanner(System.in);
     System.out.print("Password : ");
     p = kb1.nextLine();
      if(!(n.equals(name)&& p.equals(pass))){
          System.out.println("--------------- Login failed---------------"); 
      }
      /*if (!n.equals(name1)||!p.equals(pass1)){
          System.out.println("--------------- Login failed---------------");
      }*/
      else if (!(n.equals(name1)&& p.equals(pass1))){
          System.out.println("--------------- Login failed---------------");
      }
     }
     while(!(n.equals(name)&&p.equals(pass)) && !(n.equals(name1)&&p.equals(pass1)));
     
     
     Scanner kb2 = new Scanner(System.in);
     System.out.print("What do you end program? Y/N : ");
     k = kb2.nextLine();
 }
    while(!(k.equals(kpo)));
     
 }
 
 public void login1(){}
}
