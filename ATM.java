package AtmMachine;

import java.util.Scanner;

public class ATM {
 float balance;
 static String name;static Long num;
 static int one,Npin,Rpin,Ndeposit,checkbalance=1000,deposit,withdraw;
 static Scanner sc=new Scanner(System.in);
 public static void main(String[] args){
	System.out.println("**************************************");
	System.out.println("*   WELCOME TO BANKING APPLICATION   *");
	System.out.println("**************************************");
	System.out.println(" 1)Create Bank Account");
	System.out.println(" 2)Check Balance");
	System.out.println(" 3)Deposit");
	System.out.println(" 4)WithDraw");
	System.out.println(" 5)Go Back");
	one=sc.nextInt();
	if(one==1){
		ATM a=new ATM();
		a.creatac();
	}
	else if(one==2){
		ATM a=new ATM();
		a.checkbalance();
	}
	else if(one==3){
		ATM a=new ATM();
		a.deposit();
	}
	else if(one==4){
		ATM a=new ATM();
		a.withdraw();
	}
	else
	   System.out.println(" ** THANK YOU for visit our page **");
 }
 public void creatac(){
	 System.out.println("Creating ur bank account......");
	 System.out.println("------------------------");
	 System.out.print("Enter Your Name :");name=sc.next();
	 System.out.print("Enter Your PhnNO:");num=sc.nextLong();
	 System.out.print("Enter 4digits NEW-PIN :");Npin=sc.nextInt();
	 System.out.print("RE-ENTER PIN :");Rpin=sc.nextInt();
	 if(Npin==Rpin){
		 System.out.println("---> "+name+" your Account was Successfuly Created <---");System.out.println("");
		 mindeposit();
	 }
	 else{
		 System.err.println(" **❌ MISMATCH ❌**");System.out.println("");
		 System.out.println("-----> RE-TRY......");
	 retry();
	 }
 }
 public void checkbalance(){
	 System.out.println("Now Your Blance is :"+checkbalance);
	 deposit();
 }
 public void deposit(){
	 mindeposit();
	 checkbalance+=Ndeposit;
 }
 public void withdraw(){
	 System.out.println("Enter the withdrawal amount");
	 withdraw=sc.nextInt();
	 checkbalance-=withdraw;
	 if(withdraw<=checkbalance){
	 System.out.println("** Withdraw Successfuly :"+withdraw);
	 System.out.println(" Aval Balnace is :"+checkbalance);
	 }
	 else
		 System.out.println("you dont have sufficiant Amount");
 }
 public void retry(){
	 System.out.print("Enter 4digits NEW-PIN :");Npin=sc.nextInt();
	 System.out.print("RE-ENTER PIN :");Rpin=sc.nextInt();
	 if(Npin==Rpin) {
		 System.out.println("---> "+name+" your Account is Successfuly Created <---");System.out.println("");
		 mindeposit();
	 }
	 else{
		 System.err.println(" **❌ MISMATCH ❌**");System.out.println("");
		 System.out.println("-----> RE-TRY......");
	 retry();
	 }
 }
 public void mindeposit(){
	 System.out.println("----> 1)Deposit Amount [MIN:500]");
	 System.out.println("----> 2)Withdraw");
	 System.out.println("----> 2)EXIT");
	 one=sc.nextInt();
	 if(one==1){
		 System.out.println(" ENTER AMOUNT");
		 Ndeposit=sc.nextInt();
		 if(Ndeposit>=500){
		 System.out.println("** Deposit Successfuly **");
		 checkbalance+=Ndeposit;
		 System.out.println("Now Your Blance is :"+checkbalance);
		 }
		 else{
			 System.err.println("** PLEASE DEPOSIT ABOVE -->500 **");mindeposit();
		 }
	 }
	 else if(one==2){
		 withdraw();
	 }
	 else 
		 System.out.println(" ** THANK YOU for visit our page **");
 }
}







