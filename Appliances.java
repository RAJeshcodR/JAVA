package pack1;
import java.util.Scanner;
public class Appliances 
{
	Scanner sc=new Scanner(System.in);
	int home;static int n,n1,n2,n3,n4,n5,n6,n7,n8,n9,na,nb,nc,t;
	static int iron,fan,light,michine,ac;

	int kitchen;
	static int kettle,grinder,induction,stove,fridge;

	int personal;
	static int hd,bt,hs;static int a=1;int x;
	void meth1()
	{
		System.out.println("********************************************"); 
		System.out.println("               APPLIANCES");
		System.out.println("********************************************");
		System.out.println("  1)HOME APPLIANCES      2)KITCHEN APPLIANCES");
		System.out.println("  3)PERSONAL CARE APPLIANCES   4)EXIT\n");
		System.out.println(" ==> PLEASE CHOOSE YOUR OPTION");
		int code=sc.nextInt();
		switch(code)
		{
		default :new ClassA();ClassA.meth3();break;
		case 1:
			System.out.println("----> HOME APPLIANCES :\n ");
			System.out.println("  1)Bajaj Dry Iron-Dx4   : 1000 W --------699.Rs");
			System.out.println("  2)Celling fan 1200 mm  : Brown  --------1299.Rs");
			System.out.println("  3)Syska LED Tube Light : 20 W ---- 1U----80.Rs");
			System.out.println("  4)Washing michine 7kgs TL --------------- Rs.15,790/-");
			System.out.println("  5)1.5 Ton 3 Star Inverter Split AC ------ Rs.31099/-\n");
			System.out.println("==> PLEASE CHOOSE YOUR OPTION");
			home=sc.nextInt();
			if(home==1)
			{
				System.out.println("  Bajaj Dry Iron-Dx4   : 1000 W -------699.Rs\n");
				System.out.println("  How many you want");
     			n=sc.nextInt();
				iron=n*699;
				System.out.println(" PRESS '1' TO CONTINUE");
				System.out.println(" PRESS '0' TO GET BILL");
				meth2();
			}
			else if(home==2) 
			{
				System.out.println("  Celling fan 1200 mm  : Brown  ------1299.Rs\n");				
				System.out.println("  How many you want");
				n1=sc.nextInt();
				fan=n1*1299;
				System.out.println(" PRESS '1' TO CONTINUE");
				System.out.println(" PRESS '0' TO GET BILL");
				meth2();
			}
			else if(home==3)
			{
				System.out.println("  Syska LED Tube Light : 20 W   ---- 1unit-----80.Rs\n");
				System.out.println("  How many Tube lights you want");
				n2=sc.nextInt();
				t=n2*80;
				System.out.println(" PRESS '1' TO CONTINUE");
				System.out.println(" PRESS '0' TO GET BILL");
				meth2();
			}
			else if(home==4)
			{
				System.out.println("  Washing michine 7kgs TL ---------------15,790.Rs");System.out.println("  How many you want");
				n3=sc.nextInt();
				michine=n3*15790;
				System.out.println(" PRESS '1' TO CONTINUE");
				System.out.println(" PRESS '0' TO GET BILL");
				meth2();
			}
			else if(home==5)
			{
				System.out.println("  1.5 Ton 3 Star Inverter Split AC ------ Rs.31099/-");System.out.println("  How many you want");
				n4=sc.nextInt();
				ac=n4*31099;
				System.out.println(" PRESS '1' TO CONTINUE");
				System.out.println(" PRESS '0' TO GET BILL");
				meth2();
			}
			break;
		case 2:
			System.out.println("----> KITCHEN APPLIANCES :\n");
			System.out.println(" 1)Electric Kettle-1.5 Liters  ---------549.Rs");
			System.out.println(" 2)Mixer Grinder-500 W : 3 Jars --------1399.Rs");
			System.out.println(" 3)Induction Cooktop PIC : 1900 W ------1699.Rs");
			System.out.println(" 4)Stainless Steel Gas Stove : 2 Burners --- 2099.Rs");
			System.out.println(" 5)236 L 5star Double Door Refrigerator ---- Rs.22,800/-\n");
			System.out.println(" ==> PLEASE CHOOSE YOUR OPTION");
			kitchen=sc.nextInt();
			if(kitchen==1)
			{
				System.out.println(" Electric Kettle-1.5 Liters   ---------549.Rs");System.out.println("  How many you want");
				n5=sc.nextInt();
				kettle=n5*549;
				System.out.println(" PRESS '1' TO CONTINUE");
				System.out.println(" PRESS '0' TO GET BILL");
				meth2();
			}
			else if(kitchen==2)
			{
				System.out.println(" Mixer Grinder-500 W : 3 Jars --------1399.Rs");System.out.println("  How many you want");
				n6=sc.nextInt();
				grinder=n6*1399;
				System.out.println(" PRESS '1' TO CONTINUE");
				System.out.println(" PRESS '0' TO GET BILL");
				meth2();
			}
			else if(kitchen==3)
			{			
				System.out.println(" Induction Cooktop PIC : 1900 W ------1699.Rs");System.out.println("  How many you want");
				n7=sc.nextInt();
				induction=n7*1699;
				System.out.println(" PRESS '1' TO CONTINUE");
				System.out.println(" PRESS '0' TO GET BILL");
				meth2();
			}
			else if(kitchen==4)
			{
				System.out.println(" Stainless Steel Gas Stove : 2 Burners --- 2099.Rs\n");System.out.println("  How many you want");
				n8=sc.nextInt();
				stove=n8*2099;
				System.out.println(" PRESS '1' TO CONTINUE");
				System.out.println(" PRESS '0' TO GET BILL");
				meth2();
			}
			else if(kitchen==5)
			{
				System.out.println(" 236 L 5star Double Door Refrigerator ---- Rs.22,800/-\n");System.out.println("  How many you want");
				n9=sc.nextInt();
				fridge=n9*22800;
				System.out.println(" PRESS '1' TO CONTINUE");
				System.out.println(" PRESS '0' TO GET BILL");
				meth2();
			}
			break;
		case 3:
			System.out.println("----> PERSONAL CARE APPLIANCES :");
			System.out.println("  1)Hair Dryer HP8142 : 1000  W -------- Rs.840/-");
			System.out.println("  2)Beard Trimmer : 1 Unit ------------ Rs.899/-");
			System.out.println("  3)Hair Styler-VHSCC01 : 1U----------- Rs.1299/-");
			System.out.println(" ==> PLEASE CHOOSE YOUR OPTION");
			personal=sc.nextInt();
			if(personal==1)
			{
				System.out.println("  Hair Dryer HP8142 : 1000 W -------- Rs.840/-");System.out.println("  How many you want");
				na=sc.nextInt();
				hd=na*840;
				System.out.println(" PRESS '1' TO CONTINUE");
				System.out.println(" PRESS '0' TO GET BILL");
				meth2();
			}
			else if(personal==2)
			{
				System.out.println(" Beard Trimmer : 1 Unit ------------ Rs.899/-");System.out.println("  How many you want");
				nb=sc.nextInt();
				bt=nb*899;
				System.out.println(" PRESS '1' TO CONTINUE");
				System.out.println(" PRESS '0' TO GET BILL");
				meth2();
			}
			else if(personal==3)
			{
				System.out.println(" Hair Styler-VHSCC01 : 1U----------- Rs.1299/-");System.out.println("  How many you want");
				nc=sc.nextInt();
				hs=nc*1299;
				System.out.println(" PRESS '1' TO CONTINUE");
				System.out.println(" PRESS '0' TO GET BILL");
				meth2();
			}
			break;
		}
	}
	void meth2()
	{
		int i=sc.nextInt();
		if(i==1)
		{
			meth1();
		}
		else
		{
			bill();
		}
	}
	void bill()
	{
		int homebill=iron+fan+light+michine+ac;
		int kitchenbill=kettle+grinder+induction+stove+fridge;
		int personalbill=hd+bt+hs;
		int Totalbill=homebill+kitchenbill+personalbill;
		int Discount=(Totalbill/100)*10;
		System.out.println("**************************************************************");
		System.out.println(" s/n   item                             units        price    ");
		System.out.println("**************************************************************");
		if(homebill>0)
		{
			if(iron>0)
			{
				System.out.println("  "+a+"    Bajaj Dry Iron-Dx4   : 1000 W      "+n+"           "+iron+".rs");a++;
			}
			if(fan>0)
			{
				System.out.println("  "+a+"    Celling fan 1200 mm  : Brown       "+n1+"           "+fan+".rs");a++;
			}

			if(t>0)
			{
				System.out.println("  "+a+"    Syska LED Tube Light : 20 W        "+n2+"           "+t+".rs");a++;
			}

			if(michine>0)
			{
				System.out.println("  "+a+"    Washing michine 7kgs TL            "+n3+"           "+michine+".rs");a++;
			}

			if(ac>0)
			{
				System.out.println("  "+a+"    1.5 Ton 3 Star Inverter Split AC   "+n4+"           "+ac+".rs");a++;
			}
		}
		if(kitchenbill>0)
		{
			if(kettle>0)
			{
				System.out.println("  "+a+"    Electric Kettle-1.5 Liters         "+n5+"           "+kettle+".rs");a++;
			}
			if(grinder>0)
			{
				System.out.println("  "+a+"    Mixer Grinder-500 W : 3 Jars       "+n6+"           "+grinder+".rs");a++;
			} 
			if(induction>0)
			{
				System.out.println("  "+a+"    Induction Cooktop PIC : 1900 W     "+n7+"           "+induction+".rs");a++;
			}
			if(stove>0)
			{
				System.out.println("  "+a+"    Stainless Gas Stove : 2 Burners    "+n8+"           "+stove+".rs");a++;
			}
			if(fridge>0)
			{
				System.out.println("  "+a+"    236L 5star Double Door Refgrtor    "+n9+"           "+fridge+".rs");a++;
			}
		}
		if(personalbill>0)
		{
			if(hd>0)
			{
				System.out.println("  "+a+"    Hair Dryer HP8142 : 1000  W        "+na+"           "+hd+".rs");a++;
			}
			if(bt>0)
			{
				System.out.println("  "+a+"    Beard Trimmer : 1 Unit             "+nb+"           "+bt+".rs");a++;
			}
			if(hs>0)
			{
				System.out.println("  "+a+"    Hair Styler-VHSCC01 : 1U           "+nc+"           "+hs+".rs");a++;
			}
		}
		System.out.println("***************************************************************");
		System.out.println();
		System.out.println("   TOTAL BILL       : "+Totalbill+".rs");
		System.out.println("   DISCOUNT BILL    : "+(Totalbill-Discount+".Rs"));
		System.out.println("                                 ----------------------");
		System.out.println("                                 | PAY  : "+(Totalbill-Discount+".Rs     |"));
		System.out.println("                                 ----------------------");
		if(Totalbill>=1000)
		{	
			System.out.println("YOU RECEIVED DISCOUNT OF 10% : "+Discount+".Rs");
			System.out.println("TOTAL BILL OF PURCHASED ITEMS: "+(Totalbill-Discount+".Rs"));
		}

		else if(Totalbill<1199)
		{
			System.out.println("   ***   SHOP MORE "+(1199-Totalbill)+" TO GET 10% OF DISCOUNT   *");
			System.out.println("    *      YOUR TOTAL BILL "+(Totalbill)+" RUPEES ONLY    *** \n");}
		System.out.println("  =========> PRESS '1' TO EXIT <===========");
	    x=sc.nextInt();
			new ClassA();
			ClassA.meth3();
	}
}
