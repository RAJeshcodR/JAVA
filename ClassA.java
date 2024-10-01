package pack1;

import Supermarket.Shopping;

import java.util.Scanner;
public class ClassA 
{	static Scanner sc=new Scanner(System.in);
static int option;
public static void main(String[] args) 
{ meth3();}
  public static void meth3()
{
	System.out.println("********************************************************************");
	System.out.println("                       WELCOME TO MY-MART                           ");
	System.out.println("********************************************************************");
	System.out.println("              1)Grocery              2)Clothing & Accessories        ");
	System.out.println("              3)Appliances           4)Movies                       ");
	System.out.println("********************************************************************");
	System.out.println();
	System.out.println(" Please choose your option");
	option=sc.nextInt();
	switch(option)
	{
	case 1:
		System.out.println("   Thanks for Selecting Grocery Section");
		Shopping cobj=new Shopping();
		cobj.product();break;
	case 2:
		System.out.println("   Thanks for Selecting Clothing & Accessories Section");
		clothing aobj=new clothing();
		aobj.meth1();
		break;
	case 3:
		System.out.println("   Thanks for Selecting Appliances Section ");
	    Appliances aobj1=new Appliances();
	    aobj1.meth1();
	    break;
	case 4:System.out.println("   Thanks for Selecting movies ");
	    Movie aobj2=new Movie();
	    aobj2.meth1();
	    break;
	}

}
}
