package pack1;
import java.util.Scanner;
public class clothing 
{
	Scanner sc=new Scanner(System.in);
	int menswear;
	int tshirtunits,tshirtunits1,tshirtunits2,tshirtunits3,tshirtunits4;
	int shirtunits1,shirtunits2,shirtunits3,shirtunits4;
	int panta,pantb,pantc,pantd,pante;
	int formals1,formals2,formals3,formals4;                                           
	static int tshirts,tshirt1,tshirt2,tshirt3,tshirt4;     
	static int shirt1,shirt2,shirt3,shirt4;
	static int pants1,pants2,pants3,pants4,pants5;
	static int formal1,formal2,formal3,formal4;

	int womenswear;
	int kurtha1,kurtha2,kurtha3,kurtha4,kurtha5;
	int tops1,tops2,tops3,tops4,tops5;
	int sets1,sets2,sets3;
	int pantA,pantB,pantC,pantD,pantE,pantF;
	int tsA,tsB,tsC,tsD;
	static int kurta1,kurta2,kurta3,kurta4,kurta5;
	static int top1,top2,top3,top4,top5;
	static int set1,set2,set3;
	static int pant1,pant2,pant3,pant4,pant5,pant6;
	static int ts1,ts2,ts3,ts4;

	int kidswear;
	int girl1,girl2,girl3,girl4;
	int boy1,boy2,boy3,boy4;
	static int girls1,girls2,girls3,girls4;
	static int boys1,boys2,boys3,boys4;

	int footwears;
	int cshoes1;int sshoes1;int fshoes1;int sneakers1;int boots1;
	int sandals1,sandals2,sandals3,sandals4;
	static int cshoes;static int sshoes;static int fshoes;static int sneakers;static int boots;static int z;
	static int sandal1,sandal2,sandal3,sandal4;

	int stationaries;
	int books1,books2,books3;
	int paints1,paints2,paints3,paints4;
	int schools1,schools2,schools3,schools4;
	static int book1,book2,book3;
	static int paint1,paint2,paint3,paint4;
	static int school1,school2,school3,school4;static int n=1;int x;
	void meth1()
	{
		System.out.println("*********************************************");
		System.out.println("*           CLOTHING & ACCESSORIES          *");
		System.out.println("*********************************************");
		System.out.println("       1)Men's Wear        2)Women's Wear");
		System.out.println("       3)Kids Wear         4)footwear");
		System.out.println("       5)stationary        6)Exit");
		System.out.println("*********************************************");

		System.out.println(" PLEASE CHOOSE YOUR OPTION");
		int cloths= sc.nextInt();
		switch(cloths)
		{
		default :System.err.println(" ⚠️ INVALID OPTION ⚠️");meth1();
		case 1:mens();
		break;
		case 2:womens();
		break;
		case 3:kids();
		break;
		case 4:footwear();
		break;
		case 5:stationary();
		break;
		case 6:new ClassA();ClassA.meth3();break;
		}
	}
	void meth2()
	{
		int i=sc.nextInt();
		if(i==1)
		{
			mens();
		}
		else if(i==2)
		{
			womens();
		}
		else if(i==3)
		{
			kids();
		}
		else if(i==4)
		{
			footwear();
		}
		else if(i==5)
		{
			stationary();
		}
		else
		{
			bill();
		}
	}
	void mens()
	{
		System.out.println(" *** MENS SECTION ***");
		System.out.println(" 1)T-shirts");
		System.out.println(" 2)Shirts");
		System.out.println(" 3)jeans & Cargos");
		System.out.println(" 4)Formals");
		System.out.println(" 5)Exit");
		System.out.println(" PLEASE CHOOSE YOUR OPTION");
		int cloths=sc.nextInt();
		switch(cloths)
		{
		case 1:
			System.out.println("**************************************************\n");
			System.out.println("*    1)V-Neck (half sleeves)---1-----Rs.149/-    *");
			System.out.println("*    2)V-Neck (full sleeves)---1-----Rs.199/-    *");
			System.out.println("*    3)Round-Neck          ----1-----Rs.149/-    *");
			System.out.println("*    4)Sweatshirts         ----1-----Rs.249/-    *");
			System.out.println("*    5)Polo T-shirt        ----1-----Rs.299/-    *");
			System.out.println("**************************************************\n");
			System.out.println(" PLEASE CHOOSE YOUR OPTION");
			menswear=sc.nextInt();
			if(menswear==1)
			{ 
				System.out.println(" V-Neck (half sleeves)---1-----Rs.149/-");
				System.out.println(" HOW MANY T-SHIRTS YOU WANT");
				tshirtunits=sc.nextInt();tshirts=tshirtunits*149;
				System.out.println(" PRESS '1' TO CONTINUE SHOPPING ");
				System.out.println(" PRESS '0' TO GET BILL");
				meth2();
			}
			else if(menswear==2)
			{
				System.out.println(" V-Neck (full sleeves)---1-----Rs.199/-");
				System.out.println(" HOW MANY T-SHIRTS YOU WANT");
				tshirtunits1=sc.nextInt();tshirt1=tshirtunits1*199;
				System.out.println(" PRESS '1' TO CONTINUE SHOPPING)");
				System.out.println(" PRESS '0' TO GET BILL");;meth2();
			}
			else if(menswear==3)
			{
				System.out.println(" Round-Neck          ----1-----Rs.149/-");
				System.out.println(" HOW MANY T-SHIRTS YOU WANT");
				tshirtunits2=sc.nextInt();tshirt2=tshirtunits2*149;
				System.out.println(" PRESS '1' TO CONTINUE SHOPPING)");
				System.out.println(" PRESS '0' TO GET BILL");meth2();
			}
			else if(menswear==4)
			{
				System.out.println(" Sweatshirts         ----1-----Rs.249/-");
				System.out.println(" HOW MANY T-SHIRTS YOU WANT");
				tshirtunits3=sc.nextInt();tshirt3=tshirtunits3*249;
				System.out.println(" PRESS '1' TO CONTINUE SHOPPING)");
				System.out.println(" PRESS '0' TO GET BILL");meth2();
			}
			else if(menswear==5)
			{
				System.out.println(" Polo T-shirt        ----1-----Rs.299/-");
				System.out.println(" HOW MANY T-SHIRTS YOU WANT");
				tshirtunits4=sc.nextInt();tshirt4=tshirtunits4*299;
				System.out.println(" PRESS '1' TO CONTINUE SHOPPING)");
				System.out.println(" PRESS '0' TO GET BILL");meth2();
			}
			break;
		case 2:
			System.out.println("**************************************************\n");
			System.out.println("*    1)SHIRTS (half sleeves)---1-----Rs.249/-    *");
			System.out.println("*    2)SHIRTS (full sleeves)---1-----Rs.299/-    *");
			System.out.println("*    3)Denim Shirts        ----1-----Rs.449/-    *");
			System.out.println("*    4)Double pocket-shirt ----1-----Rs.349/-    *");
			System.out.println("**************************************************\n");
			System.out.println(" PLEASE CHOOSE YOUR OPTION");
			menswear=sc.nextInt();
			if(menswear==1)
			{
				System.out.println(" SHIRTS (half sleeves)---1-----Rs.249/- ");
				System.out.println("HOW MANY SHIRTS YOU WANT");
				shirtunits1=sc.nextInt();shirt1=shirtunits1*249;
				System.out.println(" PRESS '1' TO CONTINUE SHOPPING)");
				System.out.println(" PRESS '0' TO GET BILL");meth2();

			}
			else if(menswear==2)
			{
				System.out.println(" SHIRTS (full sleeves)---1-----Rs.299/-");
				System.out.println(" HOW MANY SHIRTS YOU WANT");
				shirtunits2=sc.nextInt();shirt2=shirtunits2*299;
				System.out.println(" PRESS '1' TO CONTINUE SHOPPING)");
				System.out.println(" PRESS '0' TO GET BILL");meth2();
			}
			else if(menswear==3)
			{
				System.out.println(" Denim Shirts        ----1-----Rs.449/-");
				System.out.println(" HOW MANY SHIRTS YOU WANT");
				shirtunits3=sc.nextInt();shirt3=shirtunits3*449;
				System.out.println(" PRESS '1' TO CONTINUE SHOPPING)");
				System.out.println(" PRESS '0' TO GET BILL");meth2();
			}
			else if(menswear==4)
			{
				System.out.println(" Double pocket-shirt ----1-----Rs.349/-");
				System.out.println(" HOW MANY SHIRTS YOU WANT");
				shirtunits4=sc.nextInt();shirt4=shirtunits4*449;
				System.out.println(" PRESS '1' TO CONTINUE SHOPPING)");
				System.out.println(" PRESS '0' TO GET BILL");meth2();
			}break;
		case 3:
			System.out.println("**************************************************\n");
			System.out.println("*    1)Jeans pants          ---1-----Rs.649/-    *");
			System.out.println("*    2)Cotton jeans         ---1-----Rs.549/-    *");
			System.out.println("*    3)Cargos              ----1-----Rs.749/-    *");
			System.out.println("*    4)Chinos              ----1-----Rs.549/-    *");
			System.out.println("*    5)Trousers            ----1-----Rs.499/-    *\n");
			System.out.println("**************************************************");
			System.out.println(" PLEASE CHOOSE YOUR OPTION");
			menswear=sc.nextInt();
			if(menswear==1)
			{ 
				System.out.println(" Jeans pants          ---1-----Rs.649/-");
				System.out.println(" HOW MANY JEANS YOU WANT");
				panta=sc.nextInt();pants1=panta*649;
				System.out.println(" PRESS '1' TO CONTINUE SHOPPING)");
				System.out.println(" PRESS '0' TO GET BILL");meth2();
			}
			else if(menswear==2)
			{
				System.out.println(" Cotton jeans         ---1-----Rs.549/-");
				System.out.println(" HOW MANY PANTS YOU WANT");
				pantb=sc.nextInt();pants2=pantb*549;
				System.out.println(" PRESS '1' TO CONTINUE SHOPPING)");
				System.out.println(" PRESS '0' TO GET BILL");meth2();
			}
			else if(menswear==3)
			{
				System.out.println(" Cargos              ----1-----Rs.749/-");
				System.out.println(" HOW MANY PANTS YOU WANT");
				pantc=sc.nextInt();pants3=pantc*749;
				System.out.println(" PRESS '1' TO CONTINUE SHOPPING)");
				System.out.println(" PRESS '0' TO GET BILL");meth2();
			}
			else if(menswear==4)
			{
				System.out.println(" Chinos              ----1-----Rs.549/-");
				System.out.println(" HOW MANY PANTS YOU WANT");
				pantd=sc.nextInt();pants4=pantd*549;
				System.out.println(" PRESS '1' TO CONTINUE SHOPPING)");
				System.out.println(" PRESS '0' TO GET BILL");meth2();
			}
			else if(menswear==5)
			{
				System.out.println(" Trousers            ----1-----Rs.499/-");
				System.out.println(" HOW MANY PANTS YOU WANT");
				pante=sc.nextInt();pants5=pante*499;
				System.out.println(" PRESS '1' TO CONTINUE SHOPPING)");
				System.out.println(" PRESS '0' TO GET BILL");meth2();
			}
			break;
		case 4:
			System.out.println("**************************************************\n");
			System.out.println("*    1)Formal shirts        ---1-----Rs.249/-    *");
			System.out.println("*    2)Sharvanis            ---1-----Rs.749/-    *");
			System.out.println("*    3)Kurta pyjama        ----1-----Rs.799/-    *");
			System.out.println("*    4)Formal Pants        ----1-----Rs.499/-    \n*");
			System.out.println("**************************************************");
			System.out.println(" PLEASE CHOOSE YOUR OPTION");
			menswear=sc.nextInt();
			if(menswear==1)
			{ 
				System.out.println(" Formal shirts        ---1-----Rs.249/-");
				System.out.println(" HOW MANY SHIRTS YOU WANT");
				formals1=sc.nextInt();formal1=formals1*249;
				System.out.println(" PRESS '1' TO CONTINUE SHOPPING)");
				System.out.println(" PRESS '0' TO GET BILL");meth2();
			}
			else if(menswear==2)
			{
				System.out.println(" Sharvanis            ---1-----Rs.749/-");
				System.out.println(" HOW MANY YOU WANT");
				formals2=sc.nextInt();formal2=formals2*749;
				System.out.println(" PRESS '1' TO CONTINUE SHOPPING)");
				System.out.println(" PRESS '0' TO GET BILL");meth2();
			}
			else if(menswear==3)
			{
				System.out.println(" Kurta pyjama        ----1-----Rs.799/-");
				System.out.println(" HOW MANY PYJAMAS YOU WANT");
				formals3=sc.nextInt();formal3=formals3*799;
				System.out.println(" PRESS '1' TO CONTINUE SHOPPING)");
				System.out.println(" PRESS '0' TO GET BILL");meth2();
			}
			else if(menswear==4)
			{
				System.out.println(" Formal Pants        ----1-----Rs.499/-");
				System.out.println(" HOW MANY FORMAL PANTS YOU WANT");
				formals4=sc.nextInt();formal4=formals4*499;
				System.out.println(" PRESS '1' TO CONTINUE SHOPPING)");
				System.out.println(" PRESS '0' TO GET BILL");meth2();
			}
			break;
		case 5:
			meth1();break;
		}
	}
	void womens()
	{
		System.out.println(" *** WOMENS SECTION ***");
		System.out.println(" 1)Kurta");
		System.out.println(" 2)Western Tops");
		System.out.println(" 3)Kurta Suit sets");
		System.out.println(" 4)Jeans & Leggings");
		System.out.println(" 5)T-shirts");
		System.out.println(" 6)Exit");
		System.out.println(" PLEASE CHOOSE YOUR OPTION");
		int  cloths=sc.nextInt();
		switch(cloths)
		{
		case 1:
			System.out.println("*******************************************************\n");
			System.out.println("*    1)V-Neck (half sleeves Kurta) ---1-----Rs.349/-  *");
			System.out.println("*    2)V-Neck (full sleeves Kurta) ---1-----Rs.349/-  *");
			System.out.println("*    3)Round-Neck          -----------1-----Rs.249/-  *");
			System.out.println("*    4)Laced Kurta         -----------1-----Rs.599/-  *");
			System.out.println("*    5)Embroidery Kurta    -----------1-----Rs.799/-  *");
			System.out.println("*******************************************************\n");
			System.out.println(" PLEASE CHOOSE YOUR OPTION");
			womenswear=sc.nextInt();
			if(womenswear==1)
			{ 
				System.out.println(" V-Neck (half sleeves Kurta) ---1-----Rs.349/-");
				System.out.println(" HOW MANY T-SHIRTS YOU WANT");
				kurtha1=sc.nextInt();kurta1=kurtha1*349;
				System.out.println(" PRESS '2' TO CONTINUE SHOPPING ");
				System.out.println(" PRESS '0' TO GET BILL");
				meth2();
			}
			else if(womenswear==2)
			{
				System.out.println(" V-Neck (full sleeves Kurtha)---1-----Rs.349/-");
				System.out.println(" HOW MANY T-SHIRTS YOU WANT");
				kurtha2=sc.nextInt();kurta2=kurtha2*349;
				System.out.println(" PRESS '2' TO CONTINUE SHOPPING ");
				System.out.println(" PRESS '0' TO GET BILL");meth2();
			}
			else if(womenswear==3)
			{
				System.out.println(" Round-Neck          -----------1-----Rs.249/-");
				System.out.println(" HOW MANY T-SHIRTS YOU WANT");
				kurtha3=sc.nextInt();kurta3=kurtha3*249;
				System.out.println(" PRESS '2' TO CONTINUE SHOPPING ");
				System.out.println(" PRESS '0' TO GET BILL");meth2();
			}
			else if(womenswear==4)
			{
				System.out.println(" Laced Kurta         -----------1-----Rs.599/-");
				System.out.println(" HOW MANY T-SHIRTS YOU WANT");
				kurtha4=sc.nextInt();kurta4=kurtha4*599;
				System.out.println(" PRESS '2' TO CONTINUE SHOPPING ");
				System.out.println(" PRESS '0' TO GET BILL");meth2();
			}
			else if(womenswear==5)
			{
				System.out.println(" Embroidery Kurta    -----------1-----Rs.799/-");
				System.out.println(" HOW MANY T-SHIRTS YOU WANT");
				kurtha5=sc.nextInt();kurta5=kurtha5*799;
				System.out.println(" PRESS '2' TO CONTINUE SHOPPING ");
				System.out.println(" PRESS '0' TO GET BILL");meth2( );
			}
			break;
		case 2:
			System.out.println("*************************************************\n");
			System.out.println("*    1)SHIRT-TYPES       ----1-----Rs.299/-    *");
			System.out.println("*    2)Coat-Types        ----1-----Rs.499/-    *");
			System.out.println("*    3)Net-Types         ----1-----Rs.449/-    *");
			System.out.println("*    4)Thread Works      ----1-----Rs.349/-    *");
			System.out.println("*    5)Jean-type         ----1-----Rs.399/-    *");
			System.out.println("************************************************\n");
			System.out.println(" PLEASE CHOOSE YOUR OPTION");
			womenswear=sc.nextInt();
			if(womenswear==1)
			{
				System.out.println(" SHIRT-TYPES       ----1-----Rs.299/- ");
				System.out.println("HOW MANY SHIRTS YOU WANT");
				tops1=sc.nextInt();top1=tops1*299;
				System.out.println(" PRESS '2' TO CONTINUE SHOPPING ");
				System.out.println(" PRESS '0' TO GET BILL");meth2( );
			}
			else if(womenswear==2)
			{
				System.out.println(" Coat-Types        ----1-----Rs.499/-");
				System.out.println(" HOW MANY SHIRTS YOU WANT");
				tops2=sc.nextInt();top2=tops2*499;
				System.out.println(" PRESS '2' TO CONTINUE SHOPPING ");
				System.out.println(" PRESS '0' TO GET BILL");meth2();
			}
			else if(womenswear==3)
			{
				System.out.println(" Net-Types         ----1-----Rs.449/-");
				System.out.println(" HOW MANY SHIRTS YOU WANT");
				tops3=sc.nextInt();top3=tops3*449;
				System.out.println(" PRESS '2' TO CONTINUE SHOPPING ");
				System.out.println(" PRESS '0' TO GET BILL");meth2();
			}
			else if(womenswear==4)
			{
				System.out.println(" Thread Works      ----1-----Rs.349/-");
				System.out.println(" HOW MANY SHIRTS YOU WANT");
				tops4=sc.nextInt();top4=tops4*349;
				System.out.println(" PRESS '2' TO CONTINUE SHOPPING ");
				System.out.println(" PRESS '0' TO GET BILL");meth2();
			}
			else if(womenswear==5)
			{
				System.out.println(" Jean-type         ----1-----Rs.399/-");
				System.out.println(" HOW MANY SHIRTS YOU WANT");
				tops5=sc.nextInt();top5=tops5*399;
				System.out.println(" PRESS '2' TO CONTINUE SHOPPING ");
				System.out.println(" PRESS '0' TO GET BILL");meth2();
			}break;
		case 3:
			System.out.println("**************************************************\n");
			System.out.println("*    1)Trial cut Kurti      ---1-----Rs.649/-    *");
			System.out.println("*    2)Flared Kurti         ---1-----Rs.549/-    *");
			System.out.println("*    3)Angrakha Kurti      ----1-----Rs.749/-    *");
			System.out.println("**************************************************\n");
			System.out.println(" PLEASE CHOOSE YOUR OPTION ");
			womenswear=sc.nextInt();
			if(womenswear==1)
			{ 
				System.out.println(" Trial cut Kurti      ---1-----Rs.649/-");
				System.out.println(" HOW MANY JEANS YOU WANT");
				sets1=sc.nextInt();set1=sets1*649;
				System.out.println(" PRESS '2' TO CONTINUE SHOPPING ");
				System.out.println(" PRESS '0' TO GET BILL");meth2();
			}
			else if(womenswear==2)
			{
				System.out.println(" Flared Kurti         ---1-----Rs.549/-");
				System.out.println(" HOW MANY PANTS YOU WANT");
				sets2=sc.nextInt();set2=sets2*549;
				System.out.println(" PRESS '2' TO CONTINUE SHOPPING ");
				System.out.println(" PRESS '0' TO GET BILL");meth2();
			}
			else if(womenswear==3)
			{
				System.out.println(" Angrakha Kurti      ----1-----Rs.749/-");
				System.out.println(" HOW MANY PANTS YOU WANT");
				sets3=sc.nextInt();set3=sets3*749;
				System.out.println(" PRESS '2' TO CONTINUE SHOPPING ");
				System.out.println(" PRESS '0' TO GET BILL");meth2();
			}
			break;
		case 4:
			System.out.println("**************************************************\n");
			System.out.println("*    1)Bootcut-Jeans        ---1-----Rs.449/-    *");
			System.out.println("*    2)Skinny-Jeans         ---1-----Rs.549/-    *");
			System.out.println("*    3)Mom-Jeans            ---1-----Rs.499/-    *");
			System.out.println("*    4)Ankel Length-leggings---1-----Rs.349/-    *");
			System.out.println("*    5)Disco leggings      ----1-----Rs.399/-    *");
			System.out.println("*    6)jeggings            ----1-----Rs.499/-    \n*");
			System.out.println("**************************************************");
			System.out.println(" PLEASE CHOOSE YOUR OPTION ");
			womenswear=sc.nextInt();
			if(womenswear==1)
			{ 
				System.out.println(" Bootcut-Jeans        ---1-----Rs.449/-");
				System.out.println(" HOW MANY SHIRTS YOU WANT");
				pantA=sc.nextInt();pant1=pantA*449;
				System.out.println(" PRESS '2' TO CONTINUE SHOPPING ");
				System.out.println(" PRESS '0' TO GET BILL");meth2( );
			}
			else if(womenswear==2)
			{
				System.out.println(" Skinny-Jeans         ---1-----Rs.549/-");
				System.out.println(" HOW MANY YOU WANT");
				pantB=sc.nextInt();pant2=pantB*549;
				System.out.println(" PRESS '2' TO CONTINUE SHOPPING ");
				System.out.println(" PRESS '0' TO GET BILL");meth2( );
			}
			else if(womenswear==3)
			{
				System.out.println(" Mom-Jeans            ---1-----Rs.499/-");
				System.out.println(" HOW MANY PYJAMAS YOU WANT");
				pantC=sc.nextInt();pant3=pantC*499;
				System.out.println(" PRESS '2' TO CONTINUE SHOPPING ");
				System.out.println(" PRESS '0' TO GET BILL");meth2( );
			}
			else if(womenswear==4)
			{
				System.out.println(" Ankel Length-leggings---1-----Rs.349/-");
				System.out.println(" HOW MANY FORMAL PANTS YOU WANT");
				pantD=sc.nextInt();pant4=pantD*349;
				System.out.println(" PRESS '2' TO CONTINUE SHOPPING ");
				System.out.println(" PRESS '0' TO GET BILL");meth2( );
			}
			else if(womenswear==5)
			{
				System.out.println(" Disco leggings      ----1-----Rs.399/-");
				System.out.println(" HOW MANY PYJAMAS YOU WANT");
				pantE=sc.nextInt();pant5=pantE*399;
				System.out.println(" PRESS '2' TO CONTINUE SHOPPING ");
				System.out.println(" PRESS '0' TO GET BILL");meth2( );
			}
			else if(womenswear==6)
			{
				System.out.println(" jeggings            ----1-----Rs.499/-");
				System.out.println(" HOW MANY FORMAL PANTS YOU WANT");
				pantF=sc.nextInt();pant6=pantF*449;
				System.out.println(" PRESS '2' TO CONTINUE SHOPPING ");
				System.out.println(" PRESS '0' TO GET BILL");meth2( );
			}
			break;
		case 5:
			System.out.println("**************************************************\n");
			System.out.println("*    1)V-Neck (half sleeves)---1-----Rs.149/-    *");
			System.out.println("*    2)V-Neck (full sleeves)---1-----Rs.199/-    *");
			System.out.println("*    3)Round-Neck          ----1-----Rs.149/-    *");
			System.out.println("*    4)Hoodies             ----1-----Rs.549/-    *");
			System.out.println("**************************************************\n");
			System.out.println(" PLEASE CHOOSE YOUR OPTION");
			womenswear=sc.nextInt();
			if(womenswear==1)
			{ 
				System.out.println(" V-Neck (half sleeves)---1-----Rs.149/-");
				System.out.println(" HOW MANY T-SHIRTS YOU WANT");
				tsA=sc.nextInt();ts1=tsA*149;
				System.out.println(" PRESS '2' TO CONTINUE SHOPPING ");
				System.out.println(" PRESS '0' TO GET BILL");meth2();
			}
			else if(womenswear==2)
			{
				System.out.println(" V-Neck (full sleeves)---1-----Rs.199/-");
				System.out.println(" HOW MANY T-SHIRTS YOU WANT");
				tsB=sc.nextInt();ts2=tsB*199;
				System.out.println(" PRESS '2' TO CONTINUE SHOPPING ");
				System.out.println(" PRESS '0' TO GET BILL");meth2();
			}
			else if(womenswear==3)
			{
				System.out.println(" Round-Neck          ----1-----Rs.149/-");
				System.out.println(" HOW MANY T-SHIRTS YOU WANT");
				tsC=sc.nextInt();ts3=tsC*149;
				System.out.println(" PRESS '2' TO CONTINUE SHOPPING ");
				System.out.println(" PRESS '0' TO GET BILL");meth2();
			}
			else if(womenswear==4)
			{
				System.out.println(" Hoodies         ----1-----Rs.549/-");
				System.out.println(" HOW MANY T-SHIRTS YOU WANT");
				tsD=sc.nextInt();ts4=tsD*549;
				System.out.println(" PRESS '2' TO CONTINUE SHOPPING ");
				System.out.println(" PRESS '0' TO GET BILL");meth2();
			}
			break;
		case 6:
			meth1();break;
		}
	}
	void kids()
	{
		System.out.println(" *** KIDS SECTION ***************************** \n");
		System.out.println(" *  1)Girls Colthing    2)Boy Clothing        *\n");
		System.out.println(" *            3)Exit                          *\n");
		System.out.println(" **********************************************");
		System.out.println(" PLEASE CHOOSE THE OPTION");
		int cloths=sc.nextInt();
		switch(cloths)
		{
		case 1:
			System.out.println("*******************************************\n*");
			System.out.println("*       1)Dresses  ------1---Rs.349/-     *");
			System.out.println("*       2)Frocks   ------1---Rs.299/-     *");
			System.out.println("*       3)Jumpsuits------1---RS.349/-     *");
			System.out.println("*       4)Night-wear-----1---Rs.299/-     *");
			System.out.println("*******************************************\n");
			System.out.println(" PLEASE CHOOSE YOUR OPTION ");
			kidswear=sc.nextInt();
			if(kidswear==1)
			{
				System.out.println("   Dresses  ------1---Rs.349/-");
				System.out.println("  HOW MANY YOU WANT");
				girl1=sc.nextInt();girls1=girl1*349;
				System.out.println(" PRESS '3' TO CONTINUE SHOPPING ");
				System.out.println(" PRESS '0' TO GET BILL");meth2();
			}
			else if(kidswear==2)
			{
				System.out.println("   Frocks   ------1---Rs.299/-");
				System.out.println("  HOW MANY YOU WANT");
				girl2=sc.nextInt();girls2=girl2*299;
				System.out.println(" PRESS '3' TO CONTINUE SHOPPING ");
				System.out.println(" PRESS '0' TO GET BILL");meth2();
			}
			else if(kidswear==3)
			{
				System.out.println("   Jumpsuits  -----1---Rs.349/-");
				System.out.println("  HOW MANY YOU WANT");
				girl3=sc.nextInt();girls3=girl3*349;
				System.out.println(" PRESS '3' TO CONTINUE SHOPPING ");
				System.out.println(" PRESS '0' TO GET BILL");meth2();
			}
			else if (kidswear==4)
			{
				System.out.println("   Tshits-pants COMBO----Rs.299/-");
				System.out.println("  HOW MANY YOU WANT");
				girl4=sc.nextInt();girls4=girl4*299;
				System.out.println(" PRESS '3' TO CONTINUE SHOPPING ");
				System.out.println(" PRESS '0' TO GET BILL");meth2();
			}
			break;
		case 2:
			System.out.println("****************************************\n");
			System.out.println("*      1)T-shirts  ------1---Rs.149/-  *");
			System.out.println("*      2)Shirts    ------1---Rs.249/-  *");
			System.out.println("*      3)jeans     ------1---Rs.449/-  *");
			System.out.println("*      4)Night-wear------1---Rs.299/-  *");
			System.out.println("****************************************\n");
			System.out.println(" PLEASE CHOOSE YOUR OPTION");
			kidswear=sc.nextInt();
			if(kidswear==1)
			{
				System.out.println("   T-shirts  ------1---Rs.149/-");
				System.out.println("  HOW MANY YOU WANT");
				boy1=sc.nextInt();boys1=boy1*149;
				System.out.println(" PRESS '3' TO CONTINUE SHOPPING ");
				System.out.println(" PRESS '0' TO GET BILL");meth2();
			}
			else if(kidswear==2)
			{
				System.out.println("   Shirts    ------1---Rs.249/-");
				System.out.println("  HOW MANY YOU WANT");
				boy2=sc.nextInt();boys2=boy2*249;
				System.out.println(" PRESS '3' TO CONTINUE SHOPPING ");
				System.out.println(" PRESS '0' TO GET BILL");meth2();
			}
			else if(kidswear==3)
			{
				System.out.println("   jeans     ------1---Rs.449/-");
				System.out.println("  HOW MANY YOU WANT");
				boy3=sc.nextInt();boys3=boy3*449;
				System.out.println(" PRESS '3' TO CONTINUE SHOPPING ");
				System.out.println(" PRESS '0' TO GET BILL");meth2();
			}
			else if (kidswear==4)
			{
				System.out.println("   Tshits-pants COMBO----Rs.299/-");
				System.out.println("  HOW MANY YOU WANT");
				boy4=sc.nextInt();boys4=boy4*299;
				System.out.println(" PRESS '3' TO CONTINUE SHOPPING ");
				System.out.println(" PRESS '0' TO GET BILL");meth2();
			}
			break;
		case 3:
			new clothing();
			meth1();break;
		}
	}
	void footwear()
	{
		System.out.println(" *** FOOTWEAR SECTION **************************\n");
		System.out.println("   1)Casual Shoes   ------1----Rs.299/-        *");
		System.out.println("   2)Sports Shoes   ------1----Rs.349/-        *");
		System.out.println("   3)Formal Shoes   ------1----Rs.299/-        *");
		System.out.println("   4)Sneakers       ------1----Rs.349/-        *");
		System.out.println("   5)Boots          ------1----Rs.499/-        *");
		System.out.println("   6)Sandals     7)Exit                              *");
		System.out.println("************************************************\n");
		System.out.println("  PLEASE CHOOSE YOUR OPTION");
		footwears=sc.nextInt();
		switch(footwears)
		{
		case 1:
			System.out.println(" Casual Shoes   ------1----Rs.299/-");
			System.out.println(" HOW MANY SHOES YOU WANT");
			cshoes1=sc.nextInt();cshoes=cshoes1*299;
			System.out.println(" Please Enter Your Shoe Size");
			z=sc.nextInt();
			System.out.println(" PRESS '4' TO CONTINUE SHOPPING ");
			System.out.println(" PRESS '0' TO GET BILL");meth2();
			break;
		case 2:
			System.out.println(" Sports Shoes   ------1----Rs.349/-");
			System.out.println(" HOW MANY SHOES YOU WANT");
			sshoes1=sc.nextInt();sshoes=sshoes1*349;
			System.out.println(" Please Enter Your Shoe Size");
			z=sc.nextInt();
			System.out.println(" PRESS '4' TO CONTINUE SHOPPING ");
			System.out.println(" PRESS '0' TO GET BILL");meth2();
			break;
		case 3:
			System.out.println(" Formal Shoes   ------1----Rs.299/-");
			System.out.println(" HOW MANY SHOES YOU WANT");
			fshoes1=sc.nextInt();fshoes=fshoes1*299;
			System.out.println(" Please Enter Your Shoe Size");
			z=sc.nextInt();
			System.out.println(" PRESS '4' TO CONTINUE SHOPPING ");
			System.out.println(" PRESS '0' TO GET BILL");meth2();
			break;
		case 4:
			System.out.println(" Sneakers    ------1----Rs.349/-");
			System.out.println(" HOW MANY SNEAKERS YOU WANT");
			sneakers1=sc.nextInt();sneakers=sneakers1*349;
			System.out.println(" Please Enter Your Shoe Size");
			z=sc.nextInt();
			System.out.println(" PRESS '4' TO CONTINUE SHOPPING ");
			System.out.println(" PRESS '0' TO GET BILL");meth2();
			break;
		case 5:
			System.out.println(" Boots   ------1----Rs.499/-");
			System.out.println(" HOW MANY BOOTS YOU WANT");
			boots1=sc.nextInt();boots=boots1*499;
			System.out.println(" Please Enter Your Shoe Size");
			z=sc.nextInt();
			System.out.println(" PRESS '4' TO CONTINUE SHOPPING ");
			System.out.println(" PRESS '0' TO GET BILL");meth2();
			break;
		case 6:
			System.out.println("  ** Sandals ** \n");
			System.out.println("   1)Crocs    -----1---Rs.849/-");
			System.out.println("   2)Flip Flops ---1---Rs.799/-");
			System.out.println("   3)Sliders  -----1---Rs.399/-");
			System.out.println("   4)Belt Slippers-1---Rs.549/-\n ");
			System.out.println(" PLEASE CHOOSE THE OPTION");
			footwears=sc.nextInt();
			if(footwears==1)
			{
				System.out.println(" Crocs    -----1---Rs.849/-");
				System.out.println(" HOW MANY CROCS YOU WANT");
				sandals1=sc.nextInt();sandal1=sandals1*849;
				System.out.println(" Please Enter Your FOOT Size");
				z=sc.nextInt();
				System.out.println(" PRESS '4' TO CONTINUE SHOPPING ");
				System.out.println(" PRESS '0' TO GET BILL");meth2();
			}
			else if(footwears==2)
			{
				System.out.println(" Flip Flops ---1---Rs.799/-");
				System.out.println(" HOW MANY YOU WANT");
				sandals2=sc.nextInt();sandal2=sandals2*799;
				System.out.println(" Please Enter Your FOOT Size");
				z=sc.nextInt();
				System.out.println(" PRESS '4' TO CONTINUE SHOPPING ");
				System.out.println(" PRESS '0' TO GET BILL");meth2();
			}
			else if(footwears==3)
			{
				System.out.println(" Sliders  -----1---Rs.399/-");
				System.out.println(" HOW MANY SLIDERS YOU WANT");
				sandals3=sc.nextInt();sandal3=sandals3*399;
				System.out.println(" Please Enter Your FOOT Size");
				z=sc.nextInt();
				System.out.println(" PRESS '4' TO CONTINUE SHOPPING ");
				System.out.println(" PRESS '0' TO GET BILL");meth2();
			}
			else if(footwears==4)
			{
				System.out.println(" Belt Slippers-1---Rs.549/-");
				System.out.println(" HOW MANY SLIPPERS YOU WANT");
				sandals4=sc.nextInt();sandal4=sandals4*549;
				System.out.println(" Please Enter Your FOOT Size");
				z=sc.nextInt();
				System.out.println(" PRESS '4' TO CONTINUE SHOPPING ");
				System.out.println(" PRESS '0' TO GET BILL");meth2();
			}
			else
			{
				System.err.println(" ⚠️ INVALID OPTION ⚠️");
				footwear();
			}
			break;
		case 7:
			new clothing();
			meth1();break;
		}
	}
	void stationary()
	{
		System.out.println(" *** STATIONARY SECTION **********************\n");
		System.out.println(" | 1)Notebooks       2)Drawing Accessories   |");
		System.out.println(" | 3)School Needs    4)exit        |\n");
		System.out.println(" *********************************************");
		System.out.println("  ===> PLEASE CHOOSE THE OPTION");
		int cloths=sc.nextInt();
		switch(cloths)
		{
		case 1:
			System.out.println(" *** NOTEBOOKS ***\n");
			System.out.println("  1)White 240Pages longbook -----1---Rs.60/-");
			System.out.println("  2)white 140Pages Longbook -----1---Rs.40/-");
			System.out.println("  3)Single Line Longbook    -----1---Rs.41/-\n");
			System.out.println(" ==> PLEASE CHOOSE YOUR OPTION  ");
			stationaries=sc.nextInt();
			if(stationaries==1)
			{
				System.out.println(" White 240Pages longbook -----1---Rs.60/-");
				System.out.println(" HOW MANY BOOks YOU WANT");
				books1=sc.nextInt();book1=books1*60;
				System.out.println(" PRESS '5' TO CONTINUE SHOPPING ");
				System.out.println(" PRESS '0' TO GET BILL");meth2();
			}
			else if(stationaries==2)
			{
				System.out.println(" white 140Pages Longbook -----1---Rs.40/-");
				System.out.println(" HOW MANY BOOks YOU WANT");
				books2=sc.nextInt();book2=books2*40;
				System.out.println(" PRESS '5' TO CONTINUE SHOPPING ");
				System.out.println(" PRESS '0' TO GET BILL");meth2();
			}
			else if(stationaries==3)
			{
				System.out.println(" Single Line Longbook    -----1---Rs.41/-");
				System.out.println(" HOW MANY BOOks YOU WANT");
				books3=sc.nextInt();book3=books3*41;
				System.out.println(" PRESS '5' TO CONTINUE SHOPPING ");
				System.out.println(" PRESS '0' TO GET BILL");meth2();
			}
			break;
		case 2:
			System.out.println("  *** DRAWING ACCESSORIES ***\n");
			System.out.println("  1)Drawing Book : 36 Pages  ------1----Rs.40/-");
			System.out.println("  2)Crayons      : 12 Pieces ------1----Rs.35/-");
			System.out.println("  3)Painting Kit        -----------1----Rs.70/-");
			System.out.println("  4)Colour Paints 10ml :12 shades--1----Rs.135/-\n");
			System.out.println("  ==> PLEASE CHOOSE YOUR OPTION ");
			stationaries=sc.nextInt();
			if(stationaries==1)
			{
				System.out.println(" Drawing Book : 36 Pages  ------1----Rs.40/-");
				System.out.println(" HOW MANY BOOks YOU WANT");
				paints1=sc.nextInt();paint1=paints1*40;
				System.out.println(" PRESS '5' TO CONTINUE SHOPPING ");
				System.out.println(" PRESS '0' TO GET BILL");meth2();
			}
			else if(stationaries==2)
			{
				System.out.println(" Crayons      : 12 Pieces ------1----Rs.35/-");
				System.out.println(" HOW MANY BOOks YOU WANT");
				paints2=sc.nextInt();paint2=paints2*35;
				System.out.println(" PRESS '5' TO CONTINUE SHOPPING ");
				System.out.println(" PRESS '0' TO GET BILL");meth2();
			}
			else if(stationaries==3)
			{
				System.out.println(" Painting Kit        -----------1----Rs.70/-");
				System.out.println(" HOW MANY Painting Kits YOU WANT");
				paints3=sc.nextInt();paint3=paints3*70;
				System.out.println(" PRESS '5' TO CONTINUE SHOPPING ");
				System.out.println(" PRESS '0' TO GET BILL");meth2();
			}
			else if(stationaries==4)
			{
				System.out.println(" Colour Paints 10ml :12 shades--1----Rs.135/-");
				System.out.println(" HOW MANY BOOks YOU WANT");
				paints4=sc.nextInt();paint4=paints4*135;
				System.out.println(" PRESS '5' TO CONTINUE SHOPPING ");
				System.out.println(" PRESS '0' TO GET BILL");meth2();
			}
			break;
		case 3:
			System.out.println(" *** SCHOOL NEEDS ***\n");
			System.out.println(" 1)School Bag    --------1----Rs.499/-");
			System.out.println(" 2)pencil box    --------1----Rs.50/-");
			System.out.println(" 3)Ballpen Box   --------1----Rs.70/-");
			System.out.println(" 4)Gel pens 12pens-------1----Rs.90/-\n");
			System.out.println(" ==> PLEASE CHOOSE YOUR OPTION ");
			stationaries=sc.nextInt();
			if(stationaries==1)
			{
				System.out.println(" School Bag    --------1----Rs.499/-");
				System.out.println(" HOW MANY YOU WANT");
				int needs=sc.nextInt();school1=needs*499;
				System.out.println(" PRESS '5' TO CONTINUE SHOPPING ");
				System.out.println(" PRESS '0' TO GET BILL");meth2();
			}
			else if(stationaries==2)
			{
				System.out.println(" pencil box    --------1----Rs.50/-");
				System.out.println(" HOW MANY PENCIL BOXES YOU WANT");
				int needs=sc.nextInt();school2=needs*50;
				System.out.println(" PRESS '5' TO CONTINUE SHOPPING ");
				System.out.println(" PRESS '0' TO GET BILL");meth2();
			}
			else if(stationaries==3)
			{
				System.out.println(" Ballpen Box   --------1----Rs.70/-");
				System.out.println(" HOW MANY PENS YOU WANT");
				int needs=sc.nextInt();school3=needs*70;
				System.out.println(" PRESS '5' TO CONTINUE SHOPPING ");
				System.out.println(" PRESS '0' TO GET BILL");meth2();
			}
			else if (stationaries==4)
			{
				System.out.println(" Gel pens 12pens-------1----Rs.90/-");
				System.out.println(" HOW MANY YOU WANT");
				int needs=sc.nextInt();school4=needs*90;
				System.out.println(" PRESS '5' TO CONTINUE SHOPPING ");
				System.out.println(" PRESS '0' TO GET BILL");meth2();
			}
			break;
		case 4:
			meth1();break;
		}
	}
	void bill()
	{
		int mensbill=(tshirts+tshirt1+tshirt2+tshirt3+tshirt4)+(shirt1+shirt2+shirt3+shirt4)+(pants1+pants2+pants3+pants4+pants5)+(formal1+formal2+formal3+formal4);
		int womensbill=(kurta1+kurta2+kurta3+kurta4+kurta5)+(top1+top2+top3+top4+top5)+(set1+set2+set3)+(pant1+pant2+pant3+pant4+pant5+pant6)+(ts1+ts2+ts3+ts4);
		int kidsbill=(girls1+girls2+girls3+girls4)+(boys1+boys2+boys3+boys4);
		int footbill=cshoes+sshoes+fshoes+sneakers+boots+(sandal1+sandal2+sandal3+sandal4);
		int stationary=(book1+book2+book3)+(paint1+paint2+paint3+paint4)+(school1+school2+school3+school4);
		int Totalbill=mensbill+womensbill+kidsbill+footbill+stationary;
		int Discount=(Totalbill/100)*50;
		System.out.println("*******************************************************");
		System.out.println(" s/n    item                     units        price    ");
		System.out.println("*******************************************************");
		if(mensbill>0) 
		{
			if(tshirts>0)
			{
				System.out.println("  "+n+".    V-NECK (half sleeves)      "+tshirtunits+"           "+tshirts);n++;
			}
			if(tshirt1>0)
			{
				System.out.println("  "+n+".    V-NECK (full sleeves)      "+tshirtunits1+"           "+tshirt1);n++;
			}
			if(tshirt2>0)
			{
				System.out.println("  "+n+".    ROUND NECK                 "+tshirtunits2+"           "+tshirt2);n++;
			}
			if(tshirt3>0)
			{
				System.out.println("  "+n+".    SWEET-SHIRTS               "+tshirtunits3+"           "+tshirt3);n++;
			}
			if(tshirt4>0)
			{
				System.out.println("  "+n+".   POLO T-SHIRTS               "+tshirtunits4+"           "+tshirt4);n++;
			}
			if(shirt1>0)
			{
				System.out.println("  "+n+".    SHIRTS (full sleeves)      "+shirtunits1+"           "+shirt1);n++;
			}
			if(shirt2>0)
			{
				System.out.println("  "+n+".    SHIRTS (half sleeves)      "+shirtunits2+"           "+shirt2);n++;
			}
			if(shirt3>0)
			{
				System.out.println("  "+n+".    DENIM SHIRTS               "+shirtunits3+"           "+shirt3);n++;
			}
			if(shirt4>0)
			{
				System.out.println("  "+n+".    DOUBLE POCKETS-SHIRTS      "+shirtunits4+"           "+shirt4);n++;
			}
			if(pants1>0)
			{
				System.out.println("  "+n+".    JEANS PANTS                "+panta+"           "+pants1);n++;
			}
			if(pants2>0)
			{
				System.out.println("  "+n+".    COTTON JEANS               "+pantb+"           "+pants2);n++;
			}
			if(pants3>0)
			{
				System.out.println("  "+n+".    CARGOS                     "+pantc+"           "+pants3);n++;
			}
			if(pants4>0)
			{
				System.out.println("  "+n+".    CHINOS                     "+pantd+"           "+pants4);n++;
			}
			if(pants5>0)
			{
				System.out.println("  "+n+".    TROUSERS                   "+pante+"           "+pants5);n++;
			}
			if(formal1>0)
			{
				System.out.println("  "+n+".    FORMAL-SHIRTS              "+formals1+"           "+formal1);n++;
     		}
			if(formal2>0)
			{
				System.out.println("  "+n+".    SHARVANIS                  "+formals2+"           "+formal2);n++;
			}
			if(formal3>0)
			{
				System.out.println("  "+n+".    KURTA PAIJAMA              "+formals3+"           "+formal3);n++;
			}
			if(formal4>0)
			{
				System.out.println("  "+n+".    FORMAL-PANTS               "+formals4+"           "+formal4);n++;
			}
		}
		if(womensbill>0)
		{
			if(kurta1>0)
			{
				System.out.println("  "+n+".    V-NECK (half sleeves Kurta)"+kurtha1+"           "+kurta1);n++;
			}
			if(kurta2>0)
			{
				System.out.println("  "+n+".    V-NECK (full sleeves Kurta)"+kurtha2+"           "+kurta2);n++;
			}
			if(kurta3>0)
			{
				System.out.println("  "+n+".    ROUND NECK(Kurta)          "+kurtha3+"           "+kurta3);n++;
			}
			if(kurta4>0)
			{
				System.out.println("  "+n+".    LACED KURTA                "+kurtha4+"           "+kurta4);n++;
			}
			if(kurta5>0)
			{
				System.out.println("  "+n+".    EMBROIDERY KURTA           "+kurtha5+"           "+kurta5);n++;
			}
			if(top1>0)
			{
				System.out.println("  "+n+".    SHIRT-TYPED                "+tops1+"           "+top1);n++;
			}
			if(top2>0)
			{
				System.out.println("  "+n+".    COAT-TYPED                 "+tops2+"           "+top2);n++;
			}
			if(top3>0)
			{
				System.out.println("  "+n+".    NET-TYPED                  "+tops3+"           "+top3);n++;
			}
			if(top4>0)
			{
				System.out.println("  "+n+".    THREAD-TYPED               "+tops4+"           "+top4);n++;
			}
			if(top5>0)
			{
				System.out.println("  "+n+".    JEANS-TYPED                "+tops5+"           "+top5);n++;
			}
			if(set1>0)
			{
				System.out.println("  "+n+".    TRAIL CUT KURTI            "+sets1+"           "+set1);n++;
			}
			if(set2>0)
			{
				System.out.println("  "+n+".    FLARED KURTI               "+sets2+"           "+set2);n++;
			}
			if(set3>0)
			{
				System.out.println("  "+n+".    ANGRAKHA KURTI             "+sets3+"           "+set3);n++;
			}
			if(pant1>0)
			{
				System.out.println("  "+n+".    BOOTCUT JEANS              "+pantA+"           "+pant1);n++;
			}
			if(pant2>0)
			{
				System.out.println("  "+n+".    SKINNY JEANS               "+pantB+"           "+pant2);n++;
			}
			if(pant3>0)
			{
				System.out.println("  "+n+".    MOM-JEANS                  "+pantC+"           "+pant3);n++;
			}
			if(pant4>0)
			{
				System.out.println("  "+n+".    ANKEL LENGTH-LEGGINGS      "+pantD+"           "+pant4);n++;
			}
			if(pant5>0)
			{
				System.out.println("  "+n+".    DISCO LEGGINGS             "+pantE+"           "+pant5);n++;
			}
			if(pant6>0)
			{
				System.out.println("  "+n+".    JEGGINGS                   "+pantF+"           "+pant6);n++;
			}
			if(ts1>0)
			{
				System.out.println("  "+n+".    V-NECK (half sleeves)      "+tsA+"           "+ts1);n++;
			}
			if(ts2>0)
			{
				System.out.println("  "+n+".    V-NECK (full sleeves)      "+tsB+"           "+ts2);n++;
			}
			if(ts3>0)
			{
				System.out.println("  "+n+".    ROUND NECK                 "+tsC+"           "+ts3);n++;
			}
			if(ts4 >0)
			{
				System.out.println("  "+n+".    HODDIES                    "+tsD+"           "+ts4);n++;
			}
		}
		if(kidsbill>0)
		{
			if(girls1>0)
			{
				System.out.println("  "+n+".    DRESSES                    "+girl1+"           "+girls1);n++;
			}
			if(girls2>0)
			{
				System.out.println("  "+n+".    FROCKS                     "+girl2+"           "+girls2);n++;
			}
			if(girls3>0)
			{
				System.out.println("  "+n+".    JUMSUITS                   "+girl3+"           "+girls3);n++;
			}
			if(girls4>0)
			{
				System.out.println("  "+n+".    NIGHT-WEAR                 "+girl4+"           "+girls4);n++;
			}
			if(boys1>0)
			{
				System.out.println("  "+n+".    T-SHIRTS                   "+boy1+"           "+boys1);n++;
			}
			if(boys2>0)
			{
				System.out.println("  "+n+".    SHIRTS                     "+boy2+"           "+boys2);n++;
			}
			if(boys3>0)
			{
				System.out.println("  "+n+".    JEANS                      "+boy3+"           "+boys3);n++;
			}
			if(boys4>0)
			{
				System.out.println("  "+n+".    NIGHTWEAR                  "+boy4+"           "+boys4);n++;
			}
		}
		if(footbill>0)
		{
			if(cshoes>0)
			{
				System.out.println("  "+n+".    CASUAL-SHOES               "+cshoes1+"           "+cshoes);n++;
			}
			if(sshoes>0)
			{
				System.out.println("  "+n+".    SPORTS-SHOES               "+sshoes1+"           "+sshoes);n++;
			}
			if(fshoes>0)
			{
				System.out.println("  "+n+".    FORMAL-SHOES               "+fshoes1+"           "+fshoes);n++;
			}
			if(sneakers>0)
			{
				System.out.println("  "+n+".    SNEAKERS                   "+sneakers1+"           "+sneakers);n++;
			}
			if(boots>0)
			{
				System.out.println("  "+n+".    BOOTS                      "+boots1+"           "+boots);n++;
			}
			if(sandal1>0)
			{
				System.out.println("  "+n+".    CROCKS                     "+sandals1+"           "+sandal1);n++;
			}
			if(sandal2>0)
			{
				System.out.println("  "+n+".    FLIP-FLOPS                 "+sandals2+"           "+sandal2);n++;
			}
			if(sandal3>0)
			{
				System.out.println("  "+n+".    SLIDERS                    "+sandals3+"           "+sandal3);n++;
			}
			if(sandal4>0)
			{
				System.out.println("  "+n+".    BELT-SLIPPERS              "+sandals4+"           "+sandal4);n++;
			}
		}
		if(stationary>0)
		{
			if(book1>0)
			{
				System.out.println("  "+n+".    White 240Pages longbook    "+books1+"           "+book1);n++;
			}
			if(book2>0)
			{
				System.out.println("  "+n+".    White 140Pages Longbook    "+books2+"           "+book2);n++;
			}
			if(book3>0)
			{
				System.out.println("  "+n+".    Single Line Longbook       "+books3+"           "+book3);n++;
			}
			if(paint1>0)
			{
				System.out.println("  "+n+".    Drawing Book : 36 Pages    "+paints1+"           "+paint1);n++;
			}
			if(paint2>0)
			{
				System.out.println("  "+n+".    Crayons    : 12 Pie        "+paints2+"           "+paint2);n++;
			}
			if(paint3>0)
			{
				System.out.println("  "+n+".    Painting Kit               "+paints3+"           "+paint3);n++;
			}
			if(paint4>0)
			{
				System.out.println("  "+n+".    ColourPaints 10ml:12shades "+paints4+"           "+paint4);n++;
			}
			if(school1>0)
			{
				System.out.println("  "+n+".    School Bag                 "+schools1+"           "+school1);n++;
			}
			if(school2>0)
			{
				System.out.println("  "+n+".    pencil box                 "+schools2+"           "+school2);n++;
			}
			if(school3>0)
			{
				System.out.println("  "+n+".    Ballpen Box                "+schools3+"           "+school3);n++;
			}
			if(school4>0)
			{
				System.out.println("  "+n+".    Gel pens 12pens            "+schools4+"           "+school4);n++;
			}
		}System.out.println();
		System.out.println("   TOTAL BILL       : "+Totalbill+".rs");
		System.out.println("   DISCOUNT BILL    : "+(Totalbill-Discount+".Rs"));
		System.out.println("                                 ----------------------");
		System.out.println("                                 | PAY  : "+(Totalbill-Discount+".Rs     |"));
		System.out.println("                                 ----------------------");
		if(Totalbill>=1000)
		{	
			System.out.print("YOU RECEIVED DISCOUNT OF 10% "+Discount+".Rs");
			System.out.println("TOTAL BILL OF PURCHASED ITEMS: "+(Totalbill-Discount+".Rs"));
		}
		else if(Totalbill<1199)
		{
			System.out.print("   ***   SHOP MORE "+(1199-Totalbill)+" TO GET "+"10%"+" OF DISCOUNT   *");
			System.out.print("    *      YOUR TOTAL BILL "+Totalbill+" RUPEES ONLY    *** \n");}
		System.out.println("  =========> PRESS '1' TO EXIT <===========");
	    x=sc.nextInt();
			new ClassA();
			ClassA.meth3();
	}
}
