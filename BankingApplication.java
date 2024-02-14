/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankingapplication;

/**
 *
 * @author deept
 */
import java.util.Scanner; 
class BankDetails{
    String acc_no;
    String name;
    long balance;
    Scanner sc=new Scanner(System.in);
public void createAccount(){
System.out.print("Enter The Account No:");
acc_no=sc.next();
System.out.print("Enter The Name:");
name=sc.next();
System.out.println("Enter The Balance Amount");
balance=sc.nextLong();
}
public void account(){
System.out.print("Enter The Account NO:\n");
acc_no=sc.next();
System.out.println("Name:\n"+name);
System.out.println("Balance Amount:"+balance);
}


public void deposit(){
    long amount;
   System.out.print("Enter the amount you want to deposit:");
    amount=sc.nextLong();
    balance=balance+amount;
}
public void withdrawal(){
    long amount;
    System.out.println("Enter the withdrawal amount");
    amount=sc.nextLong();
    if(balance>=amount){
       System.out.println("transaction completed");
balance=balance-amount;  
}
else{
    System.out.println("Transaction not possible!!!");
}}}
public class BankingApplication {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,i;
        Fd f=new Fd();
       
       System.out.print("Enter the number of users:");
         n=sc.nextInt();
         BankDetails det[]=new BankDetails[n];
         for(i=0;i<det.length;i++){
         det[i]=new BankDetails();
        
         }
         int ch;
         do{
             
        System.out.println("Banking Application");
        System.out.println("1.CREATE ACCOUNT\n2.FD\n3.DEPOSIT\n4.WITHDRAWAL\n5.DETAILS\n6.EXIT\n");
        System.out.println("Enter your choice:");
        ch=sc.nextInt();
        switch(ch){
            case 1:for(i=0;i<det.length;i++){
                det[i].createAccount();
                }
            
            break;
            case 2:f.invest();
            break;
            case 3: System.out.println("Enter the account no:");
                   String  acc_no=sc.next();
                for(i=0;i<det.length;i++){
                 det[i].deposit();
            }
                 break;
            case 4:System.out.print("Enter the account no:");
                    acc_no=sc.next();
                      for(i=0;i<det.length;i++){
                  det[i].withdrawal();
                 }
                 break;
            case 5:for(i=0;i<det.length;i++){
                det[i].account();
            }
                  break;
            case 6:System.out.print("Sorry we are not able to help you!!");
             break;
             
        }
         }
                
            
        while(ch!=5);
    }
}
