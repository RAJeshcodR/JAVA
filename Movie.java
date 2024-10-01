package pack1;
import java.util.Scanner;
public class Movie 
{
	static Scanner sc=new Scanner(System.in);
	static String movie;
	static String S; 
	static String D;
	int date;
	static String t; 
	static int tickets;
	static String blocks;static int Total;static String seats;
	int item;int product;
	static int qty,price;
	static String m1;static Long n1;
	void meth1()
	{   System.out.println("*******************************************************");System.out.println("*                                                     *");
		System.out.println("*    ==> SCREEN 1:              ==> SCREEN 2:         *");
		System.out.println("*       ◆ RRR                      ◆ Orange           *");
		System.out.println("*                                                     *");
		System.out.println("*    ==> SCREEN 3:              ==> SCREEN 4:         *");
		System.out.println("*       ◆ Dhruva                   ◆ Rangastalam      *");System.out.println("*                                                     *");
		System.out.println("*******************************************************");
		System.out.println("==> PLEASE ENTER YOUR MOVIE NAME");
		movie=sc.next();
		switch(movie)
		{
		case "RRR":
			System.out.println(" ===> ◆ SCREEN 1:");S="SCREEN 1";
			System.out.println("  ◑ ━━━━━━━━━━━━━━━━━ RRR ━━━━━━━━━━━━━━━━━ ◑\n");
			time();
			System.out.println("How Many Tickets you need to 'RRR' :");
			tickets=sc.nextInt();meth2();
		}
	}
	void time()
	{
		System.out.println(" ◆ Select your avaliable Date  :==================================================|");
		System.out.println("   --------------------------                                                     |");
		System.out.println(" 1)JAN '1' SUNDAY       2)JAN '2' MONDAY         3)JAN '3' TUESDAY                |");
		System.out.println("                                                                                  |");
		System.out.println(" 4)JAN '4' WEDNESDAY    5)JAN '5' THURSDAY       6)JAN '6' FRIDAY                 |");
		System.out.println("                                                                                  |");
		System.out.println(" 7)JAN '7' SATURDAY                                                               |");
		System.out.println("                                                                                  |");
		System.out.println("         ◆ Please enter the num :                                                 |");
		System.out.println("==================================================================================|");
		date=sc.nextInt();
		switch(date)
		{
		case 1:D="Sun, 1 Jan";break;case 2:D="Mon, 2 Jan";break;case 3:D="Tue, 3 Jan";break;case 4:D="Wed, 4 Jan";break;case 5:D="Thu, 5 Jan";break;case 6:D="Fri, 5 Jan";break; case 7:D="Sat, 7 Jan";break;
		}
		System.out.println(" ◆ Select your avaliable Date  :\n");
		System.out.println("     ****************       ****************       ****************");
		System.out.println("     |  1) 10:30AM  |       |  2) 01:35PM  |       |  3) 04:20PM  |");
		System.out.println("     ****************       ****************       ****************    \n");
		System.out.println("     ****************       ****************");
		System.out.println("     |  4) 07:30PM  |       |  5) 10:15PM  |");
		System.out.println("     ****************       ****************");
		System.out.println(" PLEASE ENTER THE NUMBER :");
		int time=sc.nextInt();
		if(time==1)
		{
			t="10:30 AM";
		}
		else if(time==2)
		{
			t="01:35 PM";
		}
		else if(time==3)
		{
			t="04:20 PM";
		}
		else if(time==4)
		{
			;t="07:30 PM";
		}
		else if(time==5)
		{
			t="07:30 PM";
		}
	}
	void meth2()
	{
		System.out.println();
		System.err.println("                     ◆◆◆◆◆◆ "+S+" ◆◆◆◆◆◆              ");
		System.out.println("◆ ▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬ ❴✪❵ ▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬ ◆");
		System.out.println();
		System.out.print("                              Gold(BLOCK) ");System.out.println("₹170.00");
		System.out.println("                            -----------------------                             ");
		System.out.println("     [A1] [A2] [A3] [A4] [A5]  [A6] [A7] [A8] [A9] [A10] [A11] [A12]       ");
		System.out.println("           [B1] [B2] [B3] [B4] [B5]     [B6] [B7] [B8] [B9] [B10]          ");
		System.out.println("                                                                           ");
		System.out.println("---------------------------------------------------------------------------");
		System.out.print("                            PRIME(BLOCK) ");System.out.println("₹135.00");
		System.out.println("                          --------------------                                ");
		System.out.println("     [A1] [A2] [A3] [A4] [A5]  [A6] [A7] [A8] [A9] [A10] [A11] [A12]       ");
		System.out.println("     [B1] [B2] [B3] [B4] [B5]  [B6] [B7] [B8] [B9] [B10] [B11] [B12]       ");
		System.out.println("         [C1] [C2] [C3] [C4] [C5]     [C6] [C7] [C8] [C9] [C10]            ");
		System.out.println("         [D1] [D2] [D3] [D4] [D5]     [D6] [D7] [D8] [D9] [D10]            ");
		System.out.println("         [E1] [E2] [E3] [E4] [E5]     [E6] [E7] [E8] [E9] [E10]            ");
		System.out.println("                                                                           ");
		System.out.println("---------------------------------------------------------------------------");
		System.out.print("                            CLASSIC(BLOCK) ");System.out.println("₹100.00");
		System.out.println("                          ----------------------                              ");
		System.out.println("     [A1] [A2] [A3] [A4] [A5]  [A6] [A7] [A8] [A9] [A10] [A11] [A12]       ");
		System.out.println("     [B1] [B2] [B3] [B4] [B5]  [B6] [B7] [B8] [B9] [B10] [B11] [B12]       ");
		System.out.println("     [C1] [C2] [C3] [C4] [C5]  [C6] [C7] [C8] [C9] [C10] [C11] [C12]       ");
		System.out.println("         [D1] [D2] [D3] [D4] [D5]     [D6] [D7] [D8] [D9] [D10]            ");
		System.out.println("                                                                           ");
		System.out.println("           ===================================================             ");
		System.err.println("          |                       SCREEN                      |            ");
		System.out.println("           ===================================================             ");
		System.out.println();
		System.out.println("◁━━━━━━━━━━━━━━━━━━━━ ◈Please Enter your BLOCK for "+tickets+" tickects(*small letters*)◈ ━━━━━━━━━━━━━━━━━━━▷");
		blocks=sc.next();
		switch(blocks)
		{
		case "gold":
			Total=tickets*170;
			System.out.print("Please Select Your "+tickets+"Seats :");System.out.println(" Use CAPITAL LETTERS ");
			seats=sc.next();
			meth5();
			mail();
			meth4();
			break; 
		case "prime":
			Total=tickets*135;
			System.out.println("Please Select Your "+tickets+"Seats :(NOTE :- Use Captal Letters )");
			seats=sc.next();
			meth5();
			mail();
			meth4();
			break;
		case "classic":
			Total=tickets*100;
			System.out.println("Please Select Your "+tickets+"Seats :(NOTE :- Use Captal Letters )");
			seats=sc.next();
	        meth5();
		    mail();
		    meth4();
			break;
		}	
	}
	void meth5()
	{
		System.out.println("|                    ❴✪❵  WELCOME TO FOOD WORLD  ❴✪❵                    |");System.out.println("======================================================================");
		System.out.println("        Please Choose Your Option :");System.out.println("        ------------------------------");
		System.out.println("        ==>  press '1'- Continue");
		System.out.println("        ==>  press '2'- Skip");
		int val=sc.nextInt();
		if(val<=1) 
		{System.out.println();
		System.out.println("-------** Have Some Snacks for INTERVAL Feel Free to Select **-------");
		System.out.println("*********************************************************************");
		System.out.println("*******************|        1)Popcorn        |***********************");
		System.out.println("*******************|        2)Snacks         |***********************");
		System.out.println("*******************|        3)Combo          |***********************");
		System.out.println("*******************|        4)Beverages      |***********************");
		System.out.println("*********************************************************************");System.out.println();
		}
		else
		{return;}
		System.out.println("     =====> Please Choose Your Item Code :");
		System.out.println("             ----------------------------");
		item=sc.nextInt();
		switch(item)
		{
		case 1:System.out.println();
		System.out.println("==============================================================");
		System.out.println("         CODES    |      ITEMS      |  PRICES                 ");
		System.out.println("==============================================================");
		System.out.println("--------  01)Tub Salted Popcorn '110gms' : ₹220   -----------");
		System.out.println("-------   02)Cheese Popcorn '110gms'     : ₹240   -----------");
		System.out.println("==============================================================");System.out.println();
		System.out.println("   ====> Please Choose Your ItemCode What You Want :");
		product=sc.nextInt();
		switch(product)
		{
		case 01:
			System.out.println(" How Many You Need : ");
			qty=sc.nextInt();
			price=qty*220;
			System.out.println(" Tub Salted Popcorn '110gms' :"+price);
			System.out.println();
			break;
		case 02:
			System.out.println(" How Many You Need : ");
			qty=sc.nextInt();
			price=qty*240;
			System.out.println(" Cheese Popcorn '110gms' :"+price);
			System.out.println();
			break;
		}
		break;
		case 2:
			System.out.println("=================================================================");
			System.out.println("        CODES    |         ITEMS         |   PRICES              ");
			System.out.println("=================================================================");
			System.out.println("-----*   001)PeriPeri French Fries '130gms' : ₹190    *----------");
			System.out.println("-----*   002)Chicken Pizza                  : ₹200    *----------");
			System.out.println("-----*   003)2 Pieces Aloo Samosa           : ₹100    *----------");
			System.out.println("=================================================================");
			System.out.println("  ==>Please Choose Your Item Code ");
			switch(sc.nextInt())
			{
			case 001:
				System.out.println(" How Many You Need : ");
				qty=sc.nextInt();
				price=qty*190;
				System.out.println("PeriPeri French Fries '130gms' :"+price);	
				System.out.println();
				break;
			case 002:
				System.out.println(" How Many You Need : ");
				qty=sc.nextInt();
				price=qty*200;
				System.out.println("Chicken Pizza :"+price);
				System.out.println();
				break;
			case 003:
				System.out.println(" How Many You Need : ");
				qty=sc.nextInt();
				price=qty*220;
				System.out.println("2 Pieces Aloo Samosa :"+price);
				System.out.println();
				break;
			}
			break;
		case 3:
			System.out.println("=================================================================");
			System.out.println("           CODES    |         ITEMS         |PRICES              ");
			System.out.println("=================================================================");
			System.out.println("---------   001)Nachos & Popcorn Combo       : ₹520    ----------");
			System.out.println("---------   002)Chicken Burger Meal Combo    : ₹350    ----------");
			System.out.println("---------   003)Chicken Burger & Fries Combo : ₹430    ----------");
			System.out.println("---------   004)Chicken Pizza Combo          : ₹370    ----------");
			System.out.println("---------   005)Veg Pizza Combo              : ₹360    ----------");
			System.out.println("=================================================================");System.out.println();
			System.out.println(" =====> Please Choose Your Item Code :");
			switch(sc.nextInt())
			{
			case 001:
				System.out.println(" How Many You Need : ");
				qty=sc.nextInt();
				price=qty*520;
				System.out.println("Nachos & Popcorn Combo :"+price);
				System.out.println();
				break;
			case 002:
				System.out.println(" How Many You Need : ");
				qty=sc.nextInt();
				price=qty*350;
				System.out.println("Chicken Burger Meal Combo :"+price);
				System.out.println();
				break;
			case 003:
				System.out.println(" How Many You Need : ");
				qty=sc.nextInt();
				price=qty*430;
				System.out.println("Chicken Burger & Fries Combo :"+price);
				System.out.println();
				break;
			case 004:
				System.out.println(" How Many You Need : ");
				qty=sc.nextInt();
				price=qty*370;
				System.out.println("Chicken Pizza Combo :"+price);
				System.out.println();
				break;
			case 005:
				System.out.println(" How Many You Need : ");
				qty=sc.nextInt();
				price=qty*360;
				System.out.println("Veg Pizza Combo :"+price);
				System.out.println();
				break;
			}
			break;
		case 4:
			System.out.println("=================================================================");
			System.out.println("           CODES    |         ITEMS         |PRICES              ");
			System.out.println("=================================================================");
			System.out.println("------------    001)Cappuccino '180ml'  : ₹120     --------------");
			System.out.println("------------    002)Espresso   '60ml'   : ₹100     --------------");
			System.out.println("------------    003)Americano  '180ml'  : ₹130     --------------");
			System.out.println("=================================================================");System.out.println();
			System.out.println(" =====> Please Choose Your Item Code :");
			switch(sc.nextInt())
			{
			case 001:
				System.out.println(" How Many You Need : ");
				qty=sc.nextInt();
				price=qty*120;
				System.out.println("Cappuccino '180ml'  :"+price);
				System.out.println();
				break;
			case 002:
				System.out.println(" How Many You Need : ");
				qty=sc.nextInt();
				price=qty*100;
				System.out.println("Espresso   '60ml'   :"+price);
				System.out.println();
				break;
			case 003:
				System.out.println(" How Many You Need :");
				qty=sc.nextInt();
				price=qty*130;
				System.out.println("Americano  '180ml'  :"+price);
				System.out.println();
				break;
			}
		}
	}
	void mail()
	{
		System.out.println("** Your E-MAIL & Phn.NUMBER will only be used for sending ticket(s) **");
		System.out.println("   ----------------------------------------------------------------");
		System.out.print(" Your email :");
		m1=sc.next();
		System.out.print(" Mobile Number :");System.out.print("");
		n1=sc.nextLong();
	}
	void meth4()
	{
		 System.out.println();
			System.out.println("******************************************************************");
			System.out.println("                           ALMOST THERE!                          ");System.out.println();
			System.out.println(" Movie Name :"+movie+"(U/A)           Tickets :"+tickets+"(S)");
			System.out.println("             Telugu,2D               "+blocks+" -"+seats);
			System.out.println(" Theater - INOX: GSM MALL ");
			System.out.println();	
			System.out.println("  Contact Details :");
			System.out.println("  ━━━━━━━━━━━━━━━━━━━━━━━");
			System.out.println(" "+m1);System.out.println(" "+n1);
			System.out.println();double gst=tickets*12.7;
			double TotalA=gst+Total+price;
			System.out.println("❖ Ticket price                    :Rs."+Total);
			System.out.println("❖ Snacks bill                     :Rs."+price);
			System.out.println("❖ Online Charges                  :Rs."+gst);System.out.println();
			System.out.println("                  ❖ Pay Rs."+TotalA);System.out.println();
			System.out.println(" Choose Payment Method :");
			System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
			System.out.println("             ◈ 1)GOOGLEPAY");System.out.println("             ◈ 2)PHONEPE");System.out.println("             ◈ 3)PAYTM");
			System.out.println();
			System.out.println("      ◆ Please Select Payment Option ◆");
			System.out.println("*******************************************************************");
			System.out.println();
			int p=sc.nextInt();
			if(3>=p) {
				System.out.println();
				System.out.println("❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖|");
				System.out.println("❖                               Your Ticket                                     ");
				System.out.println("❖    "+movie+"(U/A)                                                               ");
				System.out.println("❖    Telugu,2D                                                      |                                ");
				System.out.println("❖    "+D+ " | "+t+"                                                                                     ");
				System.out.println("❖    INOX: GSM MALL                                                 |                                ");
				System.out.println("❖                                                                                               ");
				System.out.println("❖                               ◤▖▖▬▖▖▬▬◥                         |                                 ");
				System.out.println("❖                               ▙▖▞▚▚▙▞▚▟                                                      ");
				System.out.println("❖                               ▙▖▞▚▚▙▞▚▟                         |                                 ");
				System.out.println("❖                               ▙▖▞▚▚▙▞▚▟                     ");
				System.out.println("❖                               ▛▚▙■▬▟▞▚▜                         |");
				System.out.println("❖                               ◣▚■▙▗▗▞▚◢             ");
				System.out.println("❖                                                                   |");
				System.out.println("❖                       BOOKING ID: GSM00097640PH    ");
				System.out.println("❖                            "+tickets+" Ticket(s)                         |");
				System.out.println("❖                                              ");
				System.out.println("❖                             INOX: GSM Mall                        |  ");
				System.out.println("❖                             "+blocks+"-"+seats+"      ");
				System.out.println("❖                                                                   |                                ");
				System.out.println("❖                                                                ");
				double gst1=tickets*12.7;
				double Total1A=gst1+Total;
				System.out.println("❖ Ticket price   :Rs."+Total+"                                           |");
				System.out.println("❖ Snacks bill    :Rs."+price);
				System.out.println("❖ Online Charges :Rs."+gst1+"                                           |");
				System.out.println("❖                                            --------");
				System.out.println("❖ Total Amount :                             Rs."+(Total1A+price)  );
				System.out.println("❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖❖|");}
	}
}
