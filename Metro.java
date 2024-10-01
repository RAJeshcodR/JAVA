package pack2;
import java.util.Scanner;
public class Metro
{
static Scanner sc=new Scanner(System.in);
void meth7()
{
System.out.println("▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄");
System.out.println("                                                                            ╔═══❖•ೋ° °ೋ•❖═══╗ ");
System.out.println(" ");
System.out.println("                                                                    WELCOME TO HYDERABAD METRO STATION " );
System.out.println(" ");
System.out.println("                                                                            ╚═══❖•ೋ° °ೋ•❖═══╝ ");
System.out.println("▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄");
System.out.println(" ");
System.out.println("                  Metro Station ");
System.out.println("**********************************************************");
System.out.println("*        1)AboutUs                    2)ContactUs        *");
System.out.println("*       ------------                 ------------        *");
System.out.println("*        3)MetroMap                   4)ToRegister       *");
System.out.println("*       ------------                 ------------        *");
System.out.println("**********************************************************");
int e=sc.nextInt();
new Metro().meth4(e);
}
void meth1()
{
System.out.println("⎝⎝ㅹ⎝⎝ㅹ⎝⎝ㅹ⎝⎝ㅹ⎝⎝ㅹ⎝⎝ 𝙃𝙮𝙙𝙚𝙧𝙖𝙗𝙖𝙙 ⎝⎝ㅹ⎝⎝ㅹ⎝⎝ 𝙈𝙀𝙏𝙍𝙊 ⎝⎝ㅹ⎝⎝ㅹ⎝⎝ 𝙎𝙏𝘼𝙏𝙄𝙊𝙉 ⎝⎝ㅹ⎝⎝ㅹ⎝⎝ㅹ⎠⎠             ");
System.out.println(" ");
System.out.println("          ╭━ ♥━ ♥━ ♥━ ♥━ ♥━ ♥━ ♥━\r\n"
+ "          ╰╮┏━┳┳┳┓ ┏┳┳┳┳┳┓ ┏┳┳┳┳┳┓\r\n"
+ "          ┏┻╋━╋┻┻┫ ┣┻┻┻┻┻┫ ┣┻┻┻┻┻┫\r\n"
+ "          ┗ⓞ━━━ⓞ┻━┻ⓞ━━ⓞ┻━┻ⓞ━━ⓞ╯ ");
System.out.println(" --------------------------------------------------------------");
System.out.println("|**************         1) To Travel            ***************|");
System.out.println("|            ***********2) To Exit  **************             |");
System.out.println(" --------------------------------------------------------------");
System.out.println("Please Choose Your Option");
int a=sc.nextInt();
if(a<=1)
{
new Metro().meth3();
System.out.println("**************************************************************");
System.out.println("|      Please enter in small letter and withoutspace         |");
System.out.println("**************************************************************");
System.out.println(" FROM STATION");
String Pick=sc.next();
System.out.println("TO STATION");
String Desti=sc.next();
sc.nextLine();
switch (Pick)
{
case "nagole":
new Metro().meth(Pick, Desti);
break;
case "uppal":
new Metro().meth(Pick, Desti);
break;
case "stadium":
new Metro().meth(Pick, Desti);
break;
case "ngri":
new Metro().meth(Pick, Desti);
break;
case "habsiguda":
new Metro().meth(Pick, Desti);
break;
case "secunderabadeast":
new Metro().meth(Pick, Desti);
break;
case "paradeground":
new Metro().meth(Pick, Desti);
break;
case "paradise":
new Metro().meth(Pick, Desti);
break;
case "rassopura":
new Metro().meth(Pick, Desti);
break;
case "prakashnagar":
new Metro().meth(Pick, Desti);
break;
case "begumpet":
new Metro().meth(Pick, Desti);
break;
case "ameerpet":
new Metro().meth(Pick, Desti);
break;
case "madhuranagar":
new Metro().meth(Pick, Desti);
break;
case "yusufguda":
new Metro().meth(Pick, Desti);
break;
case "jubileehillsroadno5":
new Metro().meth(Pick, Desti);
break;
case "jubillecheckpost":
new Metro().meth(Pick, Desti);
break;
case "pedammatemple":
new Metro().meth(Pick, Desti);
break;
case "madhapur":
new Metro().meth(Pick, Desti);
break;
case "durgamacheruvu":
new Metro().meth(Pick, Desti);
break;
case "hitechcity":
new Metro().meth(Pick, Desti);
break;
case "raidurg":
new Metro().meth(Pick, Desti);
break;
case "miyapur":
new Metro().meth(Pick, Desti);
break;
case "jntucollege":
new Metro().meth(Pick, Desti);
break;
case "kphbcolony":
new Metro().meth(Pick, Desti);
break;
case "kukatpally":
new Metro().meth(Pick, Desti);
break;
case "balanagar":
new Metro().meth(Pick, Desti);
break;
case "moosapat":
new Metro().meth(Pick, Desti);
break;
case "bharatnagar":
new Metro().meth(Pick, Desti);
break;
case "erragdda":
new Metro().meth(Pick, Desti);
break;
case "esihospital":
new Metro().meth(Pick, Desti);
break;
case "srnagar":
new Metro().meth(Pick, Desti);
break;
case "punjagutta":
new Metro().meth(Pick, Desti);
break;
case "irrummanzil":
new Metro().meth(Pick, Desti);
break;
case "khairatabad":
new Metro().meth(Pick, Desti);
break;
case "lakdikapul":
new Metro().meth(Pick, Desti);
break;
case "assembly":
new Metro().meth(Pick, Desti);
break;
case "nampally":
new Metro().meth(Pick, Desti);
break;
case "gandhihospital":
new Metro().meth(Pick, Desti);
break;
case "omc":
new Metro().meth(Pick, Desti);
break;
case "mgbusstand":
new Metro().meth(Pick, Desti);
break;
case "malakpet":
new Metro().meth(Pick, Desti);
break;
case "newmarket":
new Metro().meth(Pick, Desti);
break;
case "musarambagh":
new Metro().meth(Pick, Desti);
break;
case "dilsukhnagar":
new Metro().meth(Pick, Desti);
break;
case "chaitanyapuri":
new Metro().meth(Pick, Desti);
break;
case "victoriamemorial":
new Metro().meth(Pick, Desti);
break;
case "lbnagar":
new Metro().meth(Pick, Desti);
break;
case "secunderabadwest":
new Metro().meth(Pick, Desti);
break;
case "musheerabad":
new Metro().meth(Pick, Desti);
break;
case "rtccrossroads":
new Metro().meth(Pick, Desti);
break;
case "chikkadpally":
new Metro().meth(Pick, Desti);
break;
case "sultanbazar":
new Metro().meth(Pick, Desti);
break;
}
}
else
{
System.out.println(" ------------------------------------------------------------");
System.out.println("| 1) thankyou for visiting....... |");
System.out.println(" ------------------------------------------------------------");
System.out.println("");
}
}
void meth(String Pick,String Desti)
{
switch (Desti)
{
case "uppal":
System.out.println("How many Tickets do you need");
int ticket=sc.nextInt();
System.out.println("-------------------------------------------------------------------");
System.out.println("You have booked "+ticket +" Tickets");
System.out.println("--------------------------------------------------------------------------");
int Amount =ticket*10;
new Metro().meth2(Pick,Desti,ticket,Amount);
break;
case "stadium":
System.out.println("How many Tickets do you need");
int ticket1=sc.nextInt();
System.out.println("----------------------------------------------------------------------------");
System.out.println("You have booked "+ticket1 +" Tickets |");
System.out.println("----------------------------------------------------------------------------");
int Amount1 =ticket1*15;
new Metro().meth2(Pick,Desti,ticket1,Amount1);
break;
case "ngri":
System.out.println("How many Tickets do you need");
int ticket2=sc.nextInt();
System.out.println("----------------------------------------------------------------------------");
System.out.println("You have booked "+ticket2 +" Tickets |");
System.out.println("----------------------------------------------------------------------------");
int Amount2 =ticket2*15;
new Metro().meth2(Pick,Desti,ticket2,Amount2);
break;
case "habsiguda":
System.out.println("How many Tickets do you need");
int ticket3=sc.nextInt();
System.out.println("----------------------------------------------------------------------------");
System.out.println("You have booked "+ticket3 +" Tickets |");
System.out.println("----------------------------------------------------------------------------");
int Amount3 =ticket3*25;
new Metro().meth2(Pick,Desti,ticket3,Amount3);
break;
case "tarnaka":
System.out.println("How many Tickets do you need");
int ticket4=sc.nextInt();
System.out.println("----------------------------------------------------------------------------");
System.out.println("You have booked "+ticket4 +" Tickets |");
System.out.println("----------------------------------------------------------------------------");
int Amount4 =ticket4*25;
new Metro().meth2(Pick,Desti,ticket4,Amount4);
break;
case "mettuguda":
System.out.println("How many Tickets do you need");
int ticket5=sc.nextInt();
System.out.println("----------------------------------------------------------------------");
System.out.println("You have booked "+ticket5 +" Tickets |");
System.out.println("----------------------------------------------------------------------------");
int Amount5 =ticket5*30;
new Metro().meth2(Pick,Desti,ticket5,Amount5);
break;
case "secunderabadeast":
System.out.println("How many Tickets do you need");
int ticket6=sc.nextInt();
System.out.println("----------------------------------------------------------------------------");
System.out.println("You have booked "+ticket6 +" Tickets |");
System.out.println("----------------------------------------------------------------------------");
int Amount6 =ticket6*35;
new Metro().meth2(Pick,Desti,ticket6,Amount6);
break;
case "paradeground":
System.out.println("How many Tickets do you need");
int ticket7=sc.nextInt();
System.out.println("----------------------------------------------------------------------------");
System.out.println("You have booked "+ticket7 +" Tickets |");
System.out.println("----------------------------------------------------------------------------");
int Amount7 =ticket7*40;
new Metro().meth2(Pick,Desti,ticket7,Amount7);
break;
case "paradise":
System.out.println("How many Tickets do you need");
int ticket8=sc.nextInt();
System.out.println("----------------------------------------------------------------------------");
System.out.println("You have booked "+ticket8 +" Tickets |");
System.out.println("----------------------------------------------------------------------------");
int Amount8 =ticket8*40;
new Metro().meth2(Pick,Desti,ticket8,Amount8);
break;
case "rasoolpura":
System.out.println("How many Tickets do you need");
int ticket9=sc.nextInt();
System.out.println("----------------------------------------------------------------------------");
System.out.println("You have booked "+ticket9 +" Tickets |");
System.out.println("----------------------------------------------------------------------------");
int Amount9 =ticket9*40;
new Metro().meth2(Pick,Desti,ticket9,Amount9);
break;
case "prakashnagar":
System.out.println("How many Tickets do you need");
int ticket10=sc.nextInt();
System.out.println("----------------------------------------------------------------------");
System.out.println("You have booked "+ticket10 +" Tickets |");
System.out.println("----------------------------------------------------------------------------");
int Amount10 =ticket10*40;
new Metro().meth2(Pick,Desti,ticket10,Amount10);
break;
case "begumpet":
System.out.println("How many Tickets do you need");
int ticket11=sc.nextInt();
System.out.println("----------------------------------------------------------------------------");
System.out.println("You have booked "+ticket11 +" Tickets |");
System.out.println("----------------------------------------------------------------------------");
int Amount11 =ticket11*45;
new Metro().meth2(Pick,Desti,ticket11,Amount11);
break;
case "ameerpet":
System.out.println("How many Tickets do you need");
int ticket12=sc.nextInt();
System.out.println("----------------------------------------------------------------------------");
System.out.println("You have booked "+ticket12 +" Tickets |");
System.out.println("----------------------------------------------------------------------------");
int Amount12 =ticket12*45;
new Metro().meth2(Pick,Desti,ticket12,Amount12);
break;
case "madhuranagar":
System.out.println("How many Tickets do you need");
int ticket13=sc.nextInt();
System.out.println("----------------------------------------------------------------------------");
System.out.println("You have booked "+ticket13 +" Tickets |");
System.out.println("----------------------------------------------------------------------------");
int Amount13 =ticket13*45;
new Metro().meth2(Pick,Desti,ticket13,Amount13);
break;
case "yusufguda":
System.out.println("How many Tickets do you need");
int ticket14=sc.nextInt();
System.out.println("----------------------------------------------------------------------------");
System.out.println("You have booked "+ticket14 +" Tickets |");
System.out.println("----------------------------------------------------------------------------");
int Amount14=ticket14*50;
new Metro().meth2(Pick,Desti,ticket14,Amount14);
break;
case "jubileehillsroadno5":
System.out.println("How many Tickets do you need");
int ticket15=sc.nextInt();
System.out.println("---------------------------------------------------------------------------");
System.out.println("You have booked "+ticket15 +" Tickets |");
System.out.println("---------------------------------------------------------------------------");
int Amount15 =ticket15*50;
new Metro().meth2(Pick,Desti,ticket15,Amount15);
break;
case "jubileehillscheckpost":
System.out.println("How many Tickets do you need");
int ticket16=sc.nextInt();
System.out.println("----------------------------------------------------------------------------");
System.out.println("You have booked "+ticket16 +" Tickets |");
System.out.println("----------------------------------------------------------------------------");
int Amount16 =ticket16*50;
new Metro().meth2(Pick,Desti,ticket16,Amount16);
break;
case "peddammatemple":
System.out.println("How many Tickets do you need");
int ticket17=sc.nextInt();
System.out.println("----------------------------------------------------------------------------");
System.out.println("You have booked "+ticket17 +" Tickets |");
System.out.println("----------------------------------------------------------------------------");
int Amount17 =ticket17*50;
new Metro().meth2(Pick,Desti,ticket17,Amount17);
break;
case "madhapur":
System.out.println("How many Tickets do you need");
int ticket18=sc.nextInt();
System.out.println("----------------------------------------------------------------------------");
System.out.println("You have booked "+ticket18+" Tickets |");
System.out.println("----------------------------------------------------------------------------");
int Amount18 =ticket18*55;
new Metro().meth2(Pick,Desti,ticket18,Amount18);
break;
case "durgamcheruvu":
System.out.println("How many Tickets do you need");
int ticket19=sc.nextInt();
System.out.println("----------------------------------------------------------------------------");
System.out.println("You have booked "+ticket19 +" Tickets |");
System.out.println("----------------------------------------------------------------------------");
int Amount19 =ticket19*55;
new Metro().meth2(Pick,Desti,ticket19,Amount19);
break;
case "hiteccity":
System.out.println("How many Tickets do you need");
int ticket20=sc.nextInt();
System.out.println("----------------------------------------------------------------------------");
System.out.println("You have booked "+ticket20 +" Tickets |");
System.out.println("----------------------------------------------------------------------------");
int Amount20 =ticket20*60;
new Metro().meth2(Pick,Desti,ticket20,Amount20);
break;
case "raidurg":
System.out.println("How many Tickets do you need");
int ticket21=sc.nextInt();
System.out.println("-----------------------------------------------------------------------------");
System.out.println("You have booked "+ticket21 +" Tickets |");
System.out.println("-----------------------------------------------------------------------------");
int Amount21 =ticket21*60;
new Metro().meth2(Pick,Desti,ticket21,Amount21);
break;
case "miyapur":
System.out.println("How many Tickets do you need");
int ticket22=sc.nextInt();
System.out.println("----------------------------------------------------------------------------");
System.out.println("You have booked "+ticket22 +" Tickets |");
System.out.println("----------------------------------------------------------------------------");
int Amount22 =ticket22*60;
new Metro().meth2(Pick,Desti,ticket22,Amount22);
break;
case "jntucollege":
System.out.println("How many Tickets do you need");
int ticket23=sc.nextInt();
System.out.println("----------------------------------------------------------------------------");
System.out.println("You have booked "+ticket23 +" Tickets |");
System.out.println("----------------------------------------------------------------------------");
int Amount23 =ticket23*60;
new Metro().meth2(Pick,Desti,ticket23,Amount23);
break;
case "kphbcolony":
System.out.println("How many Tickets do you need");
int ticket24=sc.nextInt();
System.out.println("----------------------------------------------------------------------------");
System.out.println("You have booked "+ticket24 +" Tickets |");
System.out.println("----------------------------------------------------------------------------");
int Amount24 =ticket24*55;
new Metro().meth2(Pick,Desti,ticket24,Amount24);
break;
case "kukatpally":
System.out.println("How many Tickets do you need");
int ticket25=sc.nextInt();
System.out.println("----------------------------------------------------------------------------");
System.out.println("You have booked "+ticket25 +" Tickets |");
System.out.println("----------------------------------------------------------------------------");
int Amount25 =ticket25*55;
new Metro().meth2(Pick,Desti,ticket25,Amount25);
break;
case "balanagar":
System.out.println("How many Tickets do you need");
int ticket26=sc.nextInt();
System.out.println("----------------------------------------------------------------------------");
System.out.println("You have booked "+ticket26 +" Tickets |");
System.out.println("----------------------------------------------------------------------------");
int Amount26=ticket26*50;
new Metro().meth2(Pick,Desti,ticket26,Amount26);
break;
case "moosapet":
System.out.println("How many Tickets do you need");
int ticket27=sc.nextInt();
System.out.println("----------------------------------------------------------------------------");
System.out.println("You have booked "+ticket27 +" Tickets |");
System.out.println("----------------------------------------------------------------------------");
int Amount27 =ticket27*50;
new Metro().meth2(Pick,Desti,ticket27,Amount27);
break;
case "bharatnagar":
System.out.println("How many Tickets do you need");
int ticket28=sc.nextInt();
System.out.println("-----------------------------------------------------------------------------");
System.out.println("You have booked "+ticket28 +" Tickets |");
System.out.println("-----------------------------------------------------------------------------");
int Amount28 =ticket28*50;new Metro().meth2(Pick,Desti,ticket28,Amount28);
break;
case "erragadda":
System.out.println("How many Tickets do you need");
int ticket29=sc.nextInt();
System.out.println("-----------------------------------------------------------------------------");
System.out.println("You have booked "+ticket29 +" Tickets |");
System.out.println("-----------------------------------------------------------------------------");
int Amount29 =ticket29*50;
new Metro().meth2(Pick,Desti,ticket29,Amount29);
break;
case "esihospital":
System.out.println("How many Tickets do you need");
int ticket30=sc.nextInt();
System.out.println("-----------------------------------------------------------------------------");
System.out.println("You have booked "+ticket30 +" Tickets |");
System.out.println("-----------------------------------------------------------------------------");
int Amount30 =ticket30*50;
new Metro().meth2(Pick,Desti,ticket30,Amount30);
break;
case "srnagar":
System.out.println("How many Tickets do you need");
int ticket31=sc.nextInt();
System.out.println("-----------------------------------------------------------------------------");
System.out.println("You have booked "+ticket31 +" Tickets |");
System.out.println("-----------------------------------------------------------------------------");
int Amount31 =ticket31*45;
new Metro().meth2(Pick,Desti,ticket31,Amount31);
break;
case "punjagutta":
System.out.println("How many Tickets do you need");
int ticket32=sc.nextInt();
System.out.println("----------------------------------------------------------------------------");
System.out.println("You have booked "+ticket32 +" Tickets |");
System.out.println("----------------------------------------------------------------------------");
int Amount32 =ticket32*45;
new Metro().meth2(Pick,Desti,ticket32,Amount32);
case "irrummanzil":
System.out.println("How many Tickets do you need");
int ticket33=sc.nextInt();
System.out.println("---------------------------------------------------------------------------");
System.out.println("You have booked "+ticket33 +" Tickets |");
System.out.println("---------------------------------------------------------------------------");
int Amount33 =ticket33*50;
new Metro().meth2(Pick,Desti,ticket33,Amount33);
break;
case "kairatabad":
System.out.println("How many Tickets do you need");
int ticket34=sc.nextInt();
System.out.println("----------------------------------------------------------------------------");
System.out.println("You have booked "+ticket34 +" Tickets |");
System.out.println("----------------------------------------------------------------------------");
int Amount34 =ticket34*50;
new Metro().meth2(Pick,Desti,ticket34,Amount34);
break;
case "ladkikapul":
System.out.println("How many Tickets do you need");
int ticket35=sc.nextInt();
System.out.println("-----------------------------------------------------------------------------");
System.out.println("You have booked "+ticket35 +" Tickets |");
System.out.println("-----------------------------------------------------------------------------");
int Amount35 =ticket35*50;
new Metro().meth2(Pick,Desti,ticket35,Amount35);
break;
case "assembly":
System.out.println("How many Tickets do you need");
int ticket36=sc.nextInt();
System.out.println("------------------------------------------------------------------------------");
System.out.println("You have booked "+ticket36 +" Tickets |");
System.out.println("------------------------------------------------------------------------------");
int Amount36 =ticket36*50;
new Metro().meth2(Pick,Desti,ticket36,Amount36);
break;
case "nampally":
System.out.println("How many Tickets do you need");
int ticket37=sc.nextInt();
System.out.println("------------------------------------------------------------------------------");
System.out.println("You have booked "+ticket37 +" Tickets |");
System.out.println("------------------------------------------------------------------------------");
int Amount37 =ticket37*50;
new Metro().meth2(Pick,Desti,ticket37,Amount37);
break;
case "gandhibhavan":
System.out.println("How many Tickets do you need");
int ticket38=sc.nextInt();
System.out.println("------------------------------------------------------------------------------");
System.out.println("You have booked "+ticket38 +" Tickets |");
System.out.println("------------------------------------------------------------------------------");
int Amount38=ticket38*50;
new Metro().meth2(Pick,Desti,ticket38,Amount38);
break;
case "omc":
System.out.println("How many Tickets do you need");
int ticket39=sc.nextInt();
System.out.println("-----------------------------------------------------------------------------");
System.out.println("You have booked "+ticket39 +" Tickets |");
System.out.println("-----------------------------------------------------------------------------");
int Amount39 =ticket39*50;
new Metro().meth2(Pick,Desti,ticket39,Amount39);
break;
case "mgbusstation":
System.out.println("How many Tickets do you need");
int ticket40=sc.nextInt();
System.out.println("-----------------------------------------------------------------------------");
System.out.println("You have booked "+ticket40 +" Tickets |");
System.out.println("-----------------------------------------------------------------------------");
int Amount40 =ticket40*50;
new Metro().meth2(Pick,Desti,ticket40,Amount40);
break;
case "malakpet":
System.out.println("How many Tickets do you need");
int ticket41=sc.nextInt();
System.out.println("-----------------------------------------------------------------------------");
System.out.println("You have booked "+ticket41 +" Tickets |");
System.out.println("-----------------------------------------------------------------------------");
int Amount41 =ticket41*50;
new Metro().meth2(Pick,Desti,ticket41,Amount41);
break;
case "newmarket":
System.out.println("How many Tickets do you need");
int ticket42=sc.nextInt();
System.out.println("-----------------------------------------------------------------------------");
System.out.println("You have booked "+ticket42 +" Tickets |");
System.out.println("-----------------------------------------------------------------------------");
int Amount42 =ticket42*50;
new Metro().meth2(Pick,Desti,ticket42,Amount42);
break;
case "musarambagh":
System.out.println("How many Tickets do you need");
int ticket43=sc.nextInt();
System.out.println("-----------------------------------------------------------------------------");
System.out.println("You have booked "+ticket43 +" Tickets |");
System.out.println("-----------------------------------------------------------------------------");
int Amount43 =ticket43*50;
new Metro().meth2(Pick,Desti,ticket43,Amount43);
break;
case "dilsuknagar":
System.out.println("How many Tickets do you need");
int ticket44=sc.nextInt();
System.out.println("------------------------------------------------------------------------------");
System.out.println("You have booked "+ticket44 +" Tickets |");
System.out.println("------------------------------------------------------------------------------");
int Amount44 =ticket44*55;
new Metro().meth2(Pick,Desti,ticket44,Amount44);
break;
case "chaitanyapuri":
System.out.println("How many Tickets do you need");
int ticket45=sc.nextInt();
System.out.println("------------------------------------------------------------------------------");
System.out.println("You have booked "+ticket45 +" Tickets |");
System.out.println("------------------------------------------------------------------------------");
int Amount45 =ticket45*55;
new Metro().meth2(Pick,Desti,ticket45,Amount45);
break;
case "victoriamemorial":
System.out.println("How many Tickets do you need");
int ticket46=sc.nextInt();
System.out.println("------------------------------------------------------------------------------");
System.out.println("You have booked "+ticket46+" Tickets |");
System.out.println("------------------------------------------------------------------------------");
int Amount46 =ticket46*55;
new Metro().meth2(Pick,Desti,ticket46,Amount46);
break;
case "lbnagar":
System.out.println("How many Tickets do you need");
int ticket47=sc.nextInt();
System.out.println("-------------------------------------------------------------------------------");
System.out.println("You have booked "+ticket47 +" Tickets |");
System.out.println("-------------------------------------------------------------------------------");
int Amount47 =ticket47*60;
new Metro().meth2(Pick,Desti,ticket47,Amount47);
break;
case "secunderabadwest":
System.out.println("How many Tickets do you need");
int ticket48=sc.nextInt();
System.out.println("---------------------------------------------------------------------------------");
System.out.println("You have booked "+ticket48 +" Tickets |");
System.out.println("---------------------------------------------------------------------------------");
int Amount48 =ticket48*40;
new Metro().meth2(Pick,Desti,ticket48,Amount48);
break;
case "gandhihospital":
System.out.println("How many Tickets do you need");
int ticket49=sc.nextInt();
System.out.println("----------------------------------------------------------------------------------");
System.out.println("You have booked "+ticket49 +" Tickets |");
System.out.println("----------------------------------------------------------------------------------");
int Amount49 =ticket49*40;
new Metro().meth2(Pick,Desti,ticket49,Amount49);
break;
case "museerabad":
System.out.println("How many Tickets do you need");
int ticket50=sc.nextInt();
System.out.println("----------------------------------------------------------------------------------");
System.out.println("You have booked "+ticket50 +" Tickets |");
System.out.println("----------------------------------------------------------------------------------");
int Amount50 =ticket50*40;
new Metro().meth2(Pick,Desti,ticket50,Amount50);
break;
case "rtccroosroads":
System.out.println("How many Tickets do you need");
int ticket51=sc.nextInt();
System.out.println("-----------------------------------------------------------------------------------");
System.out.println("You have booked "+ticket51 +" Tickets |");
System.out.println("-----------------------------------------------------------------------------------");
int Amount51 =ticket51*45;
new Metro().meth2(Pick,Desti,ticket51,Amount51);
break;
case "chikkadpally":
System.out.println("How many Tickets do you need");
int ticket52=sc.nextInt();
System.out.println("-----------------------------------------------------------------------------------");
System.out.println("You have booked "+ticket52 +" Tickets |");
System.out.println("-----------------------------------------------------------------------------------");
int Amount52 =ticket52*45;
new Metro().meth2(Pick,Desti,ticket52,Amount52);
break;
case "narayanaguda":
System.out.println("How many Tickets do you need");
int ticket53=sc.nextInt();
System.out.println("------------------------------------------------------------------------------------");
System.out.println("You have booked "+ticket53 +" Tickets |");
System.out.println("------------------------------------------------------------------------------------");
int Amount53 =ticket53*45;
new Metro().meth2(Pick,Desti,ticket53,Amount53);
break;
case "sulthanbazar":
System.out.println("How many Tickets do you need");
int ticket54=sc.nextInt();
System.out.println("-------------------------------------------------------------------------------------");
System.out.println("You have booked "+ticket54 +" Tickets                                               |");
System.out.println("-------------------------------------------------------------------------------------");
int Amount54 =ticket54*50;
new Metro().meth2(Pick,Desti,ticket54,Amount54);
break;
}
}
void meth2(String Pick,String Desti,int ticket,int Amount)
{
System.out.println(" ○ Starting from                         ➔                           ● Going to");
System.out.println( " " + Pick+"                                                               "+Desti);
System.out.println("                                     ◤▖▖▬▖▖▬▬◥ ");
System.out.println("                                     ▙▖▞▚▚▙▞▚▟ ");
System.out.println("                                     ▙▖▞▚▚▙▞▚▟ ");
System.out.println("                                     ▙▖▞▚▚▙▞▚▟ ");
System.out.println("                                     ▛▚▙■▬▟▞▚▜ ");
System.out.println("                                     ◣▚■▙▗▗▞▚◢ ");
System.out.println("                                    1103728102938373 " );
System.out.println("------------------------------------------------------------------------------------");
System.out.println("| Payment                                                                           |" );
System.out.println("-------------------------------------------------------------------------------------");
System.out.println("  Type Passengers Amount                                                            |" );
System.out.println(" One way                                    "+ticket+"                                 "+Amount+"/- |" );
System.out.println("-------------------------------------------------------------------------------------");
System.out.println(" ");
System.out.println(" ");
System.out.println("                                      ╭━ ♥━ ♥━ ♥━ ♥━ ♥━ ♥━ ♥━\r\n"
+ "                                        ╰╮┏━┳┳┳┓ ┏┳┳┳┳┳┓ ┏┳┳┳┳┳┓\r\n"
+ "                                        ┏┻╋━╋┻┻┫ ┣┻┻┻┻┻┫ ┣┻┻┻┻┻┫\r\n"
+ "                                        ┗ⓞ━━━ⓞ┻━┻ⓞ━━ⓞ┻━┻ⓞ━━ⓞ╯ ");
System.out.println("-------------------------------------------------------------------------------------");
System.out.println("|                Thank for Visiting Hyderabad Metro Station                         |");
System.out.println("-------------------------------------------------------------------------------------");
System.out.println("     With the help of this Scanner you will Enter to Metro Station To Travel         ");
System.out.println("--------------------------------------------------------------------------------------");
System.out.println("|              Go to platfrom 1 To Travel From "+Pick+" to "+Desti+"                   |");
System.out.println("--------------------------------------------------------------------------------------");
System.out.println("Type okay if you were done ");
String r=sc.next();
System.out.println("-------------------------------------------------------------------------------");
new Metro().meth8();
System.out.println(" ");
System.out.println("                                                           ⎝⎝ㅹ⎝⎝ㅹ⎝⎝ㅹ⎝⎝ㅹ⎝⎝ㅹ⎝⎝ happy &safe journey ⎝⎝ㅹ⎝⎝ㅹ⎝⎝ㅹ⎠⎠ ");
System.out.println(" ");
System.out.println("                                                                   ╭━ ♥━ ♥━ ♥━ ♥━ ♥━ ♥━ ♥━\r\n"
+ "                                                                    ╰╮┏━┳┳┳┓ ┏┳┳┳┳┳┓ ┏┳┳┳┳┳┓\r\n"
+ "                                                                    ┏┻╋━╋┻┻┫ ┣┻┻┻┻┻┫ ┣┻┻┻┻┻┫\r\n"
+ "                                                                    ┗ⓞ━━━ⓞ┻━┻ⓞ━━ⓞ┻━┻ⓞ━━ⓞ╯ ");
System.out.println("                                                          CREATED BY P.SESI KUMAR NOV7TH 7:30AM BATCH ");
System.out.println(" ");
System.out.println("▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄");
System.out.println("                 ╔═══❖•ೋ° °ೋ•❖═══╗ ");
System.out.println(" ");
System.out.println("                     THANKYOU " );
System.out.println(" ");
System.out.println("                 ╚═══❖•ೋ° °ೋ•❖═══╝ ");
System.out.println("▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄");
System.out.println("-------------------------------------------------------------------------------------");
}
void meth3()
{
System.out.println(" Metro Map ");
System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
System.out.println(" miyapur◯┅┅┅┅┅┅┅┅┅◯jntucollege");
System.out.println("                 ⋱");
System.out.println("         kphbcolony ◯");
System.out.println("                       ⋱");
System.out.println("               kukatpally ◯");
System.out.println("                             ⋱");
System.out.println("                      balanagar ◯ ");
System.out.println("   raidurg ◯                       ⋱ ");
System.out.println("             ⋱               moosapet ◯" );
System.out.println("                ⋱                     ┋" );
System.out.println("        hiteccity ◯       bhartnagar ◯ ");
System.out.println("                   ┋                  ┋" );
System.out.println("    durgamcheruvu ◯        erragadda ◯");
System.out.println("                   ┋                  ┋ " );
System.out.println("         madhapur ◯      esihosiptal ◯ ");
System.out.println("                   ┋                  ┋ " );
System.out.println("   peddammatemple ◯          srnagar ◯ ");
System.out.println("                  ┋                   ┋ ");
System.out.println("             jhcp ◯                  ┋ ");
System.out.println("                  ┋    yusufguda ameerpet prakashnagar paradise paradiseground mettugud " );
System.out.println("             jhr5 ◯ ┉┉┉┉┉┉◯┉┉┉┉┉┉◯┉┉┉┉┉┉┉┉┉┉◯┉┉┉┉┉┉┉◯┉┉┉┉┉┉┉┉◯┉┉┉┉◯┉┉┉┉┉┉◯┉┉┉┉┉┉┉◯┉┉┉┉┉┉┉┉┉◯┉┉┉┉┉┉┉┉┉┉◯┉┉┉┉┉┉┉┉┉┉┉┉◯┉┉┉┉┉┉┉┉┉┉┉┉┉◯tarnaka ");
System.out.println("                          madhuranagar┋ begumpet rasoolpura secunderabadeast                     ⋱ ");
System.out.println("                                     ┋                                ┋                               ◯habsiguda ");
System.out.println("                          punjagutta◯                                ◯secunderabadwest                  ⋱ ");
System.out.println("                                    ┋                                 ┋                                ngri ◯ ");
System.out.println("                         irrummanzil◯                                ◯gandhihospital                          ⋱ " );
System.out.println("                                       ⋱                             ┋                                     stadium ◯ ");
System.out.println("                               khairatabad◯                          ◯ museerabad                                    ⋱ " );
System.out.println("                                             ⋱                       ┋                                             uppal ◯ ");
System.out.println("                                      ladkikapul◯                    ◯rtccrossroad                                         ⋱ " );
System.out.println("                                                   ⋱                 ┋                                                         ◯ ");
System.out.println("                                              assembly◯              ◯ chikkadpally                                         nagole");
System.out.println("                                                         ⋱           ┋ ");
System.out.println("                                                   nampally◯         ◯ narayanagguda ");
System.out.println("                                                              ⋱      ┋ ");
System.out.println("                                                     gandhibhavan◯   ◯ sulthanbazar ");
System.out.println("                                                                  ┋   ┋    malakpet  musarambagh " );
System.out.println("                                             osmaniamedicalcollege◯┉┉┉┉◯┉┉┉┉┉┉◯┉┉┉┉┉┉┉┉┉┉◯┉┉┉┉┉┉┉◯┉┉┉┉┉┉┉┉◯┉┉┉┉┉┉┉┉┉┉┉┉◯chaitanyapuri ");
System.out.println("                                                                     mgbusstand newmarket dilsukhnagar   ⋱ ");
System.out.println("                                                                                                            ◯victoriamemorial ");
System.out.println("                                                                                                               ⋱ ");
System.out.println("                                                                                                                  ◯lbnagar ");
System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
}
void meth4(int e)
{
switch(e)
{
case 1:
System.out.println("The Hyderabad Metro is a rapid transit system,");
System.out.println("serving the city of Hyderabad, Telangana, India.");
System.out.println("It is the second longest operational metro network in India ");
System.out.println("after the Delhi Metro (285 stations) with 57 stations");
System.out.println(" ---------------");
System.out.println("|1)Exit        |");
System.out.println(" ---------------");
int q=sc.nextInt();
if(q==1)
new Metro().meth7();
else
System.err.println("Here There is only one option to exit Please Don't Enter >1 or <1");
new Metro().meth4(2);
break;
case 2:
System.out.println("Hyderabad Metro Rail Depot, Uppal Main Road,");
System.out.println("Uppal, Hyderabad – 500039.");
System.out.println("+91 40 2333 2555 (6:00 to 22:00 – Open All Days)\r\n"
+ "+91 40 2312 3015");
System.out.println(" ---------------");
System.out.println("|1)Exit         |");
System.out.println(" ---------------");
int k=sc.nextInt();
if(k==1)
new Metro().meth7();
else
System.err.println("Here There is only one option to exit Please Don't Enter >1 or <1");
new Metro().meth4(2);
break;
case 3:
new Metro().meth3();
System.out.println(" ---------------");
System.out.println("|1)Exit         |");
System.out.println(" ---------------");
int o=sc.nextInt();
if(o==1)
new Metro().meth7();
else
System.err.println("Here There is only one option to exit Please Don't Enter >1 or <1");
new Metro().meth4(2);
break;
case 4:
System.out.println("****************************************************************");
System.out.println("|                    enter Phone Number/email                   | ");
System.out.println("****************************************************************");
String s=sc.next();
System.out.println();
System.out.println("*****************************************************************");
System.out.println("|                         SetPassword                           | ");
System.out.println("*****************************************************************");
String w=sc.next();
System.out.println(" ---------------------------------------------------------------");
System.out.println("*****************");
System.out.println("|1)Register      |");
System.out.println("*****************");
int v=sc.nextInt();
if(v==1)
System.out.println(" You were Succesfully Register to Metro Station and Now to Login ⇊ ");
System.out.println("----------------------------------------------------------------------------------------");
System.out.println("| NOTE:This Login Page Only Accepts Your Registered Phone Number with correct Password |");
System.out.println("----------------------------------------------------------------------------------------");
System.out.println("*************************************************************");
System.out.println("|               enter Phone Number/email                    |");
System.out.println("*************************************************************");
String s1=sc.next();
System.out.println();
System.out.println("************************************************************");
System.out.println("|                      Password                            |");
System.out.println("************************************************************");
String w2=sc.next();
System.out.println(" -----------------------------------------------------------");
System.out.println("*****************");
System.out.println("|1)Login        |");
System.out.println("*****************");
String w3=sc.next();
if(w2.equals(w) && s1.equals(s))
{
new Metro().meth1();
}
else if(w2.equals(w))
{
System.out.println(" -----------------------------------");
System.out.println("|This PhoneNumber is Not Registered |");
System.out.println(" -----------------------------------");
}
else if(s1.equals(s))
{
System.out.println(" -----------------------");
System.out.println("|Your Password is Wrong |");
System.out.println(" -----------------------");
}
else
{
System.out.println(" ---------------------------");
System.out.println("|Given All Details are Wrong |");
System.out.println(" ---------------------------");
}
new Metro().meth7();
break;
}
}
void meth8()
{
System.out.println("==================================================================================================================================================");
System.out.println("***********************************************************WELCOME TO CITY GUIDE PROJECT**********************************************************");
System.out.println("==================================================================================================================================================");
System.out.println();
System.out.println();
System.out.println("                                                        ╔╗╔╗────╔╗──────────╔╗──────╔╗  \r\n"
		+ "                                                        ║╚╝║╔╦╗╔╝║╔═╗╔╦╗╔═╗─║╚╗╔═╗─╔╝║  \r\n"
		+ "                                                        ║╔╗║║║║║╬║║╩╣║╔╝║╬╚╗║╬║║╬╚╗║╬║  \r\n"
		+ "                                                        ╚╝╚╝╠╗║╚═╝╚═╝╚╝─╚══╝╚═╝╚══╝╚═╝  \r\n"
		+ "                                                        ────╚═╝───────────────────────");
System.out.println("                                                             ╔══╗╔═╗╔═╗╔══╗╔╗─╔═╗\r\n"
+ "                                                             ║╔═╣║║║║║║║╔═╣║║─║╦╝\r\n"
+ "                                                             ║╚╗║║║║║║║║╚╗║║╚╗║╩╗\r\n"
+ "                                                             ╚══╝╚═╝╚═╝╚══╝╚═╝╚═╝\r\n"
+ "                                                             ────────────────────");
System.out.println();
System.out.println();
System.out.println("=====================================================================================================================================================");
System.out.println("***********************************************PRESS 1)OPEN HYDERABAD GOOGLE********************************************************************");
System.out.println("=====================================================================================================================================================");
int a=sc.nextInt();
if(a==1)
System.out.println("    ===============================      ===============================      ===============================      =============================== ");
System.out.println("    |    HYDERABAD BEST HOTELS      |    |  HYDERABAD BEST RESTAURANTS   |    |    HYDERABAD BEST PLACES TO   |    |    HYDERABAD METRO STATION    | ");
System.out.println("    |           ______         *    |    |         ______         *      |    |        VISIT                  |    |             ***  * ****       | ");
System.out.println("    |           |----|        *     |    |         |----|        *       |    |      **    **    **    **     |    |            |*| * *    ***     | ");
System.out.println("    |         *---- ----*     _*_   |    |    *-----|^^|----*___ _*_     |    |    ([-]) ([-]) ([-]) ([-])    |    |     ______|*|________         | ");
System.out.println("    |     |^^^^^^^^|~~|^^|____| |   |    |    *-----|^^|----*    _*_     |    |     | |   | |   | |   | |     |    |    (-----------------|        | ");
System.out.println("    |     |^^^^^^^^|~~|^^|----| |   |    |   |^^^^^^^^|~~|^^|____|| | |  |    |    ([-]) ([-]) ([-]) ([-])    |    |    |     [000000]    |        | ");
System.out.println("    |     |^^^^^^^^----^^|          |    |   |^^^^^^^^|~~|^^|____|| | |  |    |     | | |-----------| | |     |    |    |   ____________  |        | ");
System.out.println("    |~~~~~|   | (__) |   |~~~~~~~~~~|    |   |^^^^^^^^|~~|^^|____|| | |  |    |    ([-])/-----------/([-])    |    |    |  |            | |        | ");
System.out.println("    |~~~~~*---| (  ) |---*~~~~~~~~~~|    |   |~~~~~~~~|~~|^^|____|| | |  |    |    | ___|^^^^^^^^^^^^|___|    |    |    |  |            | |        | ");
System.out.println("    |~~~/_________________/~~~~~~~~~|    |   |~~~~~~~~|~~|^^|____|| | |  |    |    |~~~~------------~~~~~|    |    |    |  |____________| |        | ");
System.out.println("    |-------------------------------|    |   |~~~~~~~~|~~|^^|____|| | |  |    |    |^^^^^(  ******  )^^^^|    |    |    (/[00]------[00]/ )        | ");
System.out.println("    |>>>>>>>>>>> >>>>>> >>>>>>>>>   |    |   |~~~~~~~~|~~|^^|____|| | |  |    |    |~~~~~( *      * )~~~~|    |    |     (^^^^^^^^^^^^^^^)         | ");
System.out.println("    | <<<<<|_____<<<<<<<|__<<<<|    |    |~~~/_______________________/~~~|    |    |^^^^^( *      * )^^^^|    |    |      (^^^^^^^^^^^^^)          | ");
System.out.println("    | |>>>>>>>> >>>>> |>>>>>>       |    |~~/_______________________/~~~~|    |    |~~~~~(**      **)~~~~|    |    |       (___________)           | ");
System.out.println("    | <<<<<| <<<<<<<| <<<<<<<|      |    |-------------------------------|    |-------------------------------|    |      /______________/         | ");
System.out.println("    |-------------------------------|    | |>>>>>>>> >>>>> |>>>>>>       |    |   |>>>>>>>> >>>>> |>>>>>>     |    |     /______________/          | ");
System.out.println("    |                               |    | <<<<<|_____<<<<<<<|__<<<<|    |    | <<<<<|_____<<<<<<<|__<<<<|    |    |    /______________/           | ");
System.out.println("    |                               |    |-------------------------------|    |-------------------------------|    |   /______________/            | ");
System.out.println("    |        ===============        |    |       ==================      |    |        ===============        |    |         ===============       | ");
System.out.println("    |        *1)FOR HOTELS *        |    |      *2)FOR RESTAURANTS *     |    |        *3)TO VISIT   *        |    |         *4)TO TRAVEL  *       | ");
System.out.println("    |        ===============        |    |       ==================      |    |        ===============        |    |         ===============       | ");
System.out.println("     ===============================      ===============================      ===============================      =============================== ");
System.out.println("SELECT YOUR OPTION");
switch(sc.nextInt())
{
case 1:
new Metro().meth9();
break;
case 2:
new Metro().meth11();
break;
case 3:
new Metro().meth14();
break;
case 4:
new Metro().meth7();
break;
}
}
void meth9()
{

System.out.println("***************************************************************************************************************************************************************************");
System.out.println(" THQ FOR SELECTING HOTEL OPTION ");
System.out.println("***************************************************************************************************************************************************************************");
System.out.println(" ===============================        ===============================         =============================== ");
System.out.println("|  LEMON TREE HOTEL,GACHIBOWLI, |      |    TAJ BANJARA,HYDERABAD,     |       | ITC Kohenur, Hyderabad- LEED  | ");
System.out.println("| ------ ---- ----- ----------  |      |   ---- ------- ----------     |       | --- ------- ----------- ----  | ");
System.out.println("|  HYDERABAD,                   |      |    Banjara Hills              |       |Platinum Certified Luxury Hotel| ");
System.out.println("| ---------                     |      |   -------------               |       |-------- --------- ------ -----| ");
System.out.println("|  4.1 RATING ****              |      |    4.2 RATING                 |       | Hitec City 4.7 RATING         | ");
System.out.println("|           ADDRESS             |      |           ADDRESS             |       | -----------                   | ");
System.out.println("|-------------------------------|      |-------------------------------|       |           ADDRESS             | ");
System.out.println("|Survey No.115 1 Financial Dist,|      | Rd Number 1, Mithila Nagar,   |       |-------------------------------| ");
System.out.println("| Nanakramguda, Rd Number 1,    |      | Banjara Hills,                |       | Hitec City, Plot No.5,        | ");
System.out.println("|Financial District, Gachibowli,|      | Hyderabad, Telangana          |       | Survey No. 83/1 Madhapur,     | ");
System.out.println("|    Hyderabad, Telangana       |      | 500034•040 6666 9999          |       |opposite Inorbit Mall,Hyderabad| ");
System.out.println("|    500032•040 4414 1414       |      |                               |       | Telangana 500081•040 6766 0101| ");
System.out.println("|-------------------------------|      |-------------------------------|       |-------------------------------| ");
System.out.println("|      Popular amenities        |      |      Popular amenities        |       |      Popular amenities        | ");
System.out.println("|      ------- ---------        |      |      ------- ---------        |       |      ------- ---------        | ");
System.out.println("|     POOL          SPA         |      |    OUTDOOR POOL    COSY PUB   |       |    LAKE VIEW         SPA      | ");
System.out.println("|                               |      |                               |       |                               | ");
System.out.println("|    PARKING       BREAKFAST    |      |    BREAKFAST       FREE WIFI  |       | RESTAURANT&BAR  FITNESS CENTER| ");
System.out.println("|         =============         |      |         =============         |       |         =============         | ");
System.out.println("|        *1)BOOK A ROOM*        |      |        *2)BOOK A ROOM*        |       |        *3)BOOK A ROOM*        | ");
System.out.println("|         =============         |      |         =============         |       |         =============         | ");
System.out.println(" ===============================        ===============================         =============================== ");
System.out.println("SELECT YOUR OPTION");
int q=sc.nextInt();
System.out.println("***************************************************************************************************************************************************************************");
switch (q)
{
case 1:
System.out.println("                               THANKYOU FOR VISITING LEMON TREE HOTEL WE NEED SOME DETAILS FROM YOU,SO PLEASE FILL THE DETAILS");
break;
case 2:
System.out.println("                               THANKYOU FOR VISITING TAJ BANJARA HOTEL WE NEED SOME DETAILS FROM YOU,SO PLEASE FILL THE DETAILS");
break;
case 3:
System.out.println("                               THANKYOU FOR VISITING ITC KOHENUR HOTEL WE NEED SOME DETAILS FROM YOU,SO PLEASE FILL THE DETAILS");
break;
}
System.out.println("***************************************************************************************************************************************************************************");
new Metro().meth10();
}
void meth10()
{
System.out.println("WHAT'S YOUR NAME");
String w=sc.next();
System.out.println("AADHAR NUMBER");
long aad=sc.nextLong();
new Metro().meth16();
System.out.println("1 ROOM(MAX 4PERSONS)");
System.out.println("HOW MANY ROOMS YOU NEED");
int p=sc.nextInt();
System.out.println(" -----------------------------------------------------");
System.err.println("|            PRESENT WE HAVE FOUR ROOMS ONLY          | ");
System.err.println("|       305)FOR 305             207)207               | ");
System.err.println("|       307)FOR 307             507)507               | ");
System.out.println(" -----------------------------------------------------");
int y=sc.nextInt();
System.out.println("FOR HOW MANY PERSONS YOU NEED TO STAY");
int s=sc.nextInt();
System.out.println("CHILDRENS (0-12YEARS)[BELOW 12 YEARS CHILDRENS COUNT]");
int c=sc.nextInt();
System.out.println("HOW MANY DAYS YOU NEED");
int d=sc.nextInt();
System.out.println("*****************************************************************************************************************");
if(s<=4)
{
if(p==1)
{
System.out.println("|                      YOU WERE BOOKED "+p+" ROOM FOR "+s+" PERSONS "+c+" CHILDREN                                          |");
}
else
{
System.out.println("|                      ACTUALLY YOU DONT NEED "+p+" ROOM FOR ONLY "+s+" PERSON                                                   |");
new Metro().meth9();
}
}
else if(p<=4)
{
System.out.println("|                      YOU WERE BOOKED "+p+" ROOMS FOR "+s+" PERSONS             "+c+" CHILDRENS                               |");
}
System.out.println("*****************************************************************************************************************");
System.out.println("*   CHECK IN(11:00am)                                  TO                                    CHECK OUT(11:00am) *");
System.out.println("*  -----------------                                                                         ------------------ *");
System.out.println("*                                                                                                               *");
System.out.println("*                                                                                                               *");
System.out.println("*   YOU HAVE ACCESS TO ALL POPULAR AMENITIES                                 _____________________              *");
System.out.println("*                                                                           |3rd FLOOR,ROOM NO "+y+"|             *");
System.out.println("*      _____________________________________________________________________|_____________________|             *");
System.out.println("*     | SPA OPEN SWIMMING POOL FREE WIFI COSY PUB                           |                                   *");
System.out.println("*     |                                                                     |                                   *");
System.out.println("*     | BREAKFAST RESTAURANT & BAR PARKING LAKE VIEW |                                                          *");
System.out.println("*     |_____________________________________________________________________|                                   *");
System.out.println("*                                                                                                               *");
System.out.println("*                                                                                                               *");
int e=p*2500;
System.out.println("*   BILL FOR "+p+"ROOM                                                                                       "+p*2500+"/- *");
System.out.println("*   TAX & GST                                                                                             "+e*5/100+"/- *");
int r=e*5/100;
System.out.println("*   TOTAL BILL                                                                                           "+(r+e)+"/- *");
System.out.println("*****************************************************************************************************************");
System.out.println(" ===========================");
System.out.println("*1)PROCCED TO PAY THE BILL  *");
System.out.println(" ===========================");
int l=sc.nextInt();
new Metro().meth15(w,(r+e));
System.out.println(" ===========================");
System.out.println("*     THQ FOR VISITING      *");
System.out.println(" ===========================");
System.out.println("PRESS 1 TO EXIT");
String ui=sc.next();
new Metro().meth8();
}
void meth11()
{
System.out.println("***************************************************************************************************************************************************************************");
System.out.println("                                                                      THQ FOR SELECTING RESTAURANT OPTION ");
System.out.println("***************************************************************************************************************************************************************************");
System.out.println(" ===============================           ===============================           =============================== ");
System.out.println("|   EXOTICA RESTAURANT & BAR    |         |PLATFORM65-THE TRAIN RESTAURANT|         |   TRE-FORNI BAR & RESTAURANT  | ");
System.out.println("|   ------ ------------ ------  |         |---------- --- ----- ----------|         |  ----- ----- ---- ----------  | ");
System.out.println("| HYDERABAD, NORTH INDIAN STYLE |         |  HYDERABAD,                   |         |  HYDERABAD,ITALIAN RESTAURANT | ");
System.out.println("| --------- ----- ------ -----  |         | -----------                   |         |  --------- ------- ---------- | ");
System.out.println("|  4.3 RATING ****              |         |  4.6 RATING                   |         |  4.5 RATING                   | ");
System.out.println("|            ADDRESS            |         |           ADDRESS             |         |           ADDRESS             | ");
System.out.println("|-------------------------------|         |-------------------------------|         |-------------------------------| ");
System.out.println("|  12th Square, 5th Floor,      |         |2ndFloor, Ratna Arcade Building|         | Road No. 2, Sri Nagar Colony, | ");
System.out.println("|  Building, Road No. 12,       |         | Beside Shiva Shivani Degree   |         | Kamalapuri Colony,            | ");
System.out.println("|  Banjara Hills, Hyderabad,    |         | College, above croma Store,   |         | Banjara Hills, Hyderabad,     | ");
System.out.println("|  Telangana 500034             |         | Kompally, Hyderabad,Telangana |         | Telangana 500034              | ");
System.out.println("|  500032• 040 4414 2419        |         | 500014 063091 46555           |         | 040 4949 1222                 | ");
System.out.println("|-------------------------------|         |-------------------------------|         |-------------------------------| ");
System.out.println("|        SPECIAL ITEMS          |         |        SPECIAL ITEMS          |         |        SPECIAL ITEMS          | ");
System.out.println("|       ------- -------         |         |       ------- -------         |         |       ------- -------         | ");
System.out.println("| SCHEZWAN FISH  CHILLI PRAWNS  |         |  Fish Sukkha  Royyola Vepudu  |         |  odi Finger Chips  Kodi Gare  | ");
System.out.println("|                               |         |                               |         |                               | ");
System.out.println("| KUNG PAO CHICKEN BUTTER FISH  |         |  Mutton Roast Kamzu Roast     |         |  BUTTER FISH  KUNG PAO CHICKEN| ");
System.out.println("|       =================       |         |       =================       |         |       =================       | ");
System.out.println("|      *1)RESERVE A TABLE*      |         |      *2)RESERVE A TABLE*      |         |      *3)RESERVE A TABLE*      | ");
System.out.println("|       =================       |         |       =================       |         |       =================       | ");
System.out.println(" ===============================           ===============================           =============================== ");
System.out.println("SELECT YOUR OPTION");
int q=sc.nextInt();
System.out.println("***************************************************************************************************************************************************************************");
switch (q)
{
case 1:
System.out.println("                               THANKYOU FOR VISITING EXOTICA RESTAURANT & BAR WE NEED SOME DETAILS FROM YOU,SO PLEASE FILL THE DETAILS");
break;
case 2:
System.out.println("                               THANKYOU FOR VISITING PLATFORM65-THE TRAIN RESTAURANT WE NEED SOME DETAILS FROM YOU,SO PLEASE FILL THE DETAILS");
break;
case 3:
System.out.println("                               THANKYOU FOR VISITING TRE-FORNI BAR & RESTAURANT WE NEED SOME DETAILS FROM YOU,SO PLEASE FILL THE DETAILS");
break;
}
System.out.println("***************************************************************************************************************************************************************************");
new Metro().meth12();
}
void meth12()
{
System.out.println("WHAT'S YOUR NAME?");
String w=sc.next();
new Metro().meth16();
System.out.println("WHAT'S YOUR PHONE NUMBER?");
int e=sc.nextInt();
System.out.println("******************************************************************************************************************************************************");
System.out.println("*                                                            CHOOSE WHAT YOU WANT                                                                    *");
System.out.println("******************************************************************************************************************************************************");
System.out.println("                                                                   MENU                                                                              *");
System.out.println("*                                      NON-VEGETARIAN                                                    VEGETARIAN                                  *");
System.out.println("*                                     ----------------                                                  ----------                                   *");
System.out.println("*                                     101)Fish Sukkha              ₹299.00                              201) RAGI SANKATI                ₹160.00     *");
System.out.println("*                                     102)BUTTER                   ₹339.00                              202) VEG BIRIYANI                ₹220.00     *");
System.out.println("*                                     103)Kodi Gare                ₹339.00                              203) PLANE RICE                  ₹ 90.00     *");
System.out.println("*                                     104)Mutton Roast             ₹299.00                                                                           *");
System.out.println("*                                     105)Kamzu Roast              ₹339.00                                                                           *");
System.out.println("*                                     106)SCHEZWAN FISH            ₹299.00                                                                           *");
System.out.println("*                                                                                                                                                    *");
System.out.println("*                                                                                                                                                    *");
System.out.println("*                                     BREADS RICE & NOODLES                                                                                          *");
System.out.println("*                                     -------- --------------                                                                                        *");
System.out.println("*                                     301)PULKA                   ₹ 45.00                              401) PANEER MASH FIRED RICE      ₹160.00      *");
System.out.println("*                                     302)TANDOORI ROTI           ₹ 40.00                              402) CHICKEN FIRED RICE          ₹240.00      *");
System.out.println("*                                     303)BUTTER NAAN             ₹ 60.00                              403) SCHEZWAN CHICKEN FIRED RICE ₹240.00      *");
System.out.println("*                                     304)PLAIN PARATHA           ₹ 50.00                                                                            *");
System.out.println("******************************************************************************************************************************************************");
System.out.println("SELECT YOUR OPTION");
int j=sc.nextInt();
new Metro().meth13(j);
}
void meth13(int a)
{
switch (a)
{
case 101:
System.out.println(" THANKYOU FOR ORDERING");
System.out.println("*******************************************************************");
System.out.println("*  Fish Sukkha                                         ₹299.00    *");
System.out.println("*  -----------                                                    *");
System.out.println("*  TOTAL BILL                                          ₹299.00    *");
System.out.println("*  ----------                                                     *");
System.out.println("*******************************************************************");
break;
case 102:
System.out.println("                     THANKYOU FOR ORDERING");
System.out.println("*******************************************************************");
System.out.println("* BUTTER FISH                                         ₹339.00     *");
System.out.println("* -------                                                         *");
System.out.println("* TOTAL BILL                                          ₹339.00     *");
System.out.println("* -------                                                         *");
System.out.println("*******************************************************************");
break;
case 103:
System.out.println(" THANKYOU FOR ORDERING");
System.out.println("*******************************************************************");
System.out.println("* Kodi Gare                                           ₹339.00     *");
System.out.println("* -------                                                         *");
System.out.println("* TOTAL BILL                                          ₹339.00     *");
System.out.println("* -------                                                         *");
System.out.println("*******************************************************************");
break;
case 104:
System.out.println(" THANKYOU FOR ORDERING");
System.out.println("*******************************************************************");
System.out.println("*Mutton Roast                                        ₹299.00      *");
System.out.println("* -------                                                         *");
System.out.println("* TOTAL BILL                                         ₹299.00      *");
System.out.println("* -------                                                         *");
System.out.println("*******************************************************************");
break;
case 105:
System.out.println(" THANKYOU FOR ORDERING");
System.out.println("*******************************************************************");
System.out.println("*Kamzu Roast                                         ₹339.00      *");
System.out.println("* -------                                                         *");
System.out.println("* TOTAL BILL                                         ₹339.00      *");
System.out.println("* -------                                                         *");
System.out.println("*******************************************************************");
break;
case 106:
System.out.println(" THANKYOU FOR ORDERING");
System.out.println("*******************************************************************");
System.out.println("SCHEZWAN FISH                                        ₹299.00      *");
System.out.println("* -------                                                         *");
System.out.println("* TOTAL BILL                                         ₹299.00      *");
System.out.println("* -------                                                         *");
System.out.println("*******************************************************************");
break;
case 201:
System.out.println("                   THANKYOU FOR ORDERING");
System.out.println("*******************************************************************");
System.out.println("*RAGI SANKATI                                        ₹160.00      *");
System.out.println("* -------                                                         *");
System.out.println("* TOTAL BILL                                         ₹160.00      *");
System.out.println("* -------                                                         *");
System.out.println("*******************************************************************");
break;
case 202:
System.out.println("                   THANKYOU FOR ORDERING");
System.out.println("*******************************************************************");
System.out.println("*VEG BIRIYANI                                        ₹220.00      *");
System.out.println("* -------                                                         *");
System.out.println("* TOTAL BILL                                         ₹220.00      *");
System.out.println("* -------                                                         *");
System.out.println("*******************************************************************");
break;
case 203:
System.out.println(" THANKYOU FOR ORDERING");
System.out.println("*******************************************************************");
System.out.println("* PLANE RICE                                         ₹ 90.00      *");
System.out.println("* -------                                                         *");
System.out.println("* TOTAL BILL                                         ₹ 90.00      * ");
System.out.println("* -------                                                         * ");
System.out.println("*******************************************************************");
break;
case 301:
System.out.println(" THANKYOU FOR ORDERING");
System.out.println("*******************************************************************");
System.out.println("*PULKA                                               ₹ 45.00      *");
System.out.println("* -------                                                         *");
System.out.println("* TOTAL BILL                                         ₹ 45.00      *");
System.out.println("* -------                                                         *");
System.out.println("*******************************************************************");
break;
case 302:
System.out.println(" THANKYOU FOR ORDERING");
System.out.println("*******************************************************************");
System.out.println("*TANDOORI ROTI                                       ₹ 40.00      *");
System.out.println("* -------                                                         *");
System.out.println("* TOTAL BILL                                         ₹ 40.00      *");
System.out.println("* -------                                                         *");
System.out.println("*******************************************************************");
break;
case 303:
System.out.println(" THANKYOU FOR ORDERING");
System.out.println("*******************************************************************");
System.out.println("*BUTTER NAAN                                         ₹ 60.00      *");
System.out.println("* -------                                                         *");
System.out.println("* TOTAL BILL                                         ₹ 60.00      *");
System.out.println("* -------                                                         *");
System.out.println("*******************************************************************");
break;
case 304:
System.out.println(" THANKYOU FOR ORDERING");
System.out.println("*******************************************************************");
System.out.println("*PLAIN PARATHA                                      ₹ 50.00       *");
System.out.println("* -------                                                         *");
System.out.println("* TOTAL BILL                                        ₹ 50.00       *");
System.out.println("* -------                                                         *");
System.out.println("*******************************************************************");
break;
case 401:
System.out.println(" THANKYOU FOR ORDERING");
System.out.println("*******************************************************************");
System.out.println("*PANEER MASH FIRED RICE                             ₹160.00       *");
System.out.println("* -------                                                         *");
System.out.println("* TOTAL BILL                                        ₹160.00       *");
System.out.println("* -------                                                         *");
System.out.println("*******************************************************************");
break;
case 402:
System.out.println(" THANKYOU FOR ORDERING");
System.out.println("*******************************************************************");
System.out.println("*CHICKEN FIRED RICE                                 ₹240.00       *");
System.out.println("* -------                                                         *");
System.out.println("* TOTAL BILL                                        ₹240.00       *");
System.out.println("* -------                                                         *");
System.out.println("*******************************************************************");
break;
case 403:
System.out.println(" THANKYOU FOR ORDERING");
System.out.println("*******************************************************************");
System.out.println("*SCHEZWAN CHICKEN FIRED RICE                        ₹240.00       *");
System.out.println("* -------                                                         *");
System.out.println("* TOTAL BILL                                        ₹240.00       *");
System.out.println("* -------                                                         *");
System.out.println("*******************************************************************");
break;
}
System.out.println("**********************************************************************************************************************");
System.out.println("*               1)GIVE RATING                                            2)EXIT                                      *");
System.out.println("**********************************************************************************************************************");
if(sc.nextInt()==1)
{
System.out.println("GIVE RATING LIKE 5STARS,4STARS,3STARS,2STARS,1STAR");
String w=sc.next();
new Metro().meth8();
}
else
new Metro().meth8();
}
void meth14()
{
System.out.println("**********************************************************************************************************************");
System.out.println("*                        WELCOME TO HYDERABAD CITY TOUR PACKAGES VISIT 8 FAMOUS PLACES                               *");
System.out.println("*                                 @ Rs.1495/-(IN A/C BUS) WITH TOUR GUIDE                                            *");
System.out.println("**********************************************************************************************************************");
System.out.println("*********************************************");
System.out.println("*         HYDERABAD CITY                    *");
System.out.println("*        ----------------                   *");
System.out.println("*      ---------------------------          *");
System.out.println("*     |                           |         *");
System.out.println("*     |  *BIRLA MANDHIR           |         *");
System.out.println("*     | *RAVINDRA BHARATHI        |         *");
System.out.println("*     | *QUTUB SHAHI TOMBS        |         *");
System.out.println("*     | *GOLKONDA FORT            |         *");
System.out.println("*     | *SALARJUNG MUSEUM         |         *");
System.out.println("*     | *CHARMINAR                |         *");
System.out.println("*     | *NEHRU ZOOLOGICAL PARK    |         *");
System.out.println("*     | *NTR GARDENS              |         *");
System.out.println("*     |                           |         *");
System.out.println("*      ---------------------------          *");
System.out.println("*             --------------                *");
System.out.println("*             *1)BOOK NOW *                 *");
System.out.println("*             --------------                *");
System.out.println("*********************************************");
if(sc.nextInt()==1)
{
System.out.println("***************************************************************************************************************************************************************************");
System.out.println("                             THANKYOU FOR SELECTING HYDERABAD TOUR CITY WE NEED SOME DETAILS FROM YOU,SO PLEASE FILL THE DETAILS");
System.out.println("***************************************************************************************************************************************************************************");
System.out.println("WHAT'S YOUR NAME?");
String s=sc.next();
new Metro().meth16();
System.out.println("WHAT'S YOUR PHONE NUMBER?");
Long u=sc.nextLong();
System.out.println(" JANUARY 2023");
System.out.println(" SUN MON TUE WED THU FRI SAT");
System.out.println("  1   2   3   4   5   6   7 ");
System.out.println("  8   9  10  11  12  13  14 ");
System.out.println(" 15  16  17  18  19  20  21 ");
System.out.println(" 22  23  24  25  26  27  28 ");
System.out.println(" 29  30  31 ");
System.out.println("JOURNEY STARTING DATE");
int v=sc.nextInt();
System.out.println("JOURNEY ENDING DATE");
int d=sc.nextInt();
System.out.println("HOW MANY TICKETS YOU NEED (ABOVE 21-YEARS PER HEAD 1495/-) ");
int h=sc.nextInt();
System.out.println("ADULTS (12-21YEARS)[ABOVE 12 YEARS Rs.740/-");
int b=sc.nextInt();
System.out.println("CHILDRENS (0-12YEARS)[BELOW 12 YEARS FREE]");
int c=sc.nextInt();
System.out.println("****************************************************************************************************************");
System.out.println("* STARTING DATE("+v+")                                 TO                                       ENDING DATE("+d+")    *");
System.out.println("* -----------------                                                                          --------------    *");
System.out.println("*                                                                                                              *");
System.out.println("*                                                                                                              *");
System.out.println("* YOU WERE SUCCESFULLY BOOKED "+h+" FULL TICKETS "+b+" HALF TICKET "+c+" CHILDREN                                          *");
System.out.println("*                                                                                                              *");
System.out.println("* ______________________________________________________________________________________                       *");
System.out.println("* | *BIRLA MANDHIR *RAVINDRA BHARATHI *QUTUB SHAHI TOMBS *GOLKONDA FORT                |                       *");
System.out.println("* |                                                                                    |                       *");
System.out.println("* | *SALARJUNG MUSEUM *CHARMINAR *NEHRU ZOOLOGICAL PARK *NTR GARDENS                   |                       *");
System.out.println("* |____________________________________________________________________________________|                       *");
System.out.println("*                                                                                                              *");
System.out.println("*                                                                                                              *");
System.out.println("* FOR FULL TICKETS                                                                                     "+h*1495+"/-  *");
System.out.println("* BETWEEN(12-21YEARS)                                                                                   "+b*740+"/-  *");
int a=h*1495+b*740;
int r=h*40+b*20;
System.out.println("* ONLINE CHARGES                                                                                         "+r+"/-  *");
System.out.println("* TOTAL AMOUNT                                                                                         "+(a+r)+"/-  *");
System.out.println("****************************************************************************************************************");
System.out.println("PRESS 1 TO EXIT");
int ui=sc.nextInt();
if(ui==1)
new Metro().meth8();

}

}
void meth15(String name ,int bill)
{
	System.out.println("**********************************************************");
    System.out.println("*         1)CASH                    2)PHONEPAY           *");
    System.out.println("*        ---------                 -----------           *");
    System.out.println("*        3)GOOGLEPAY                4)PAYTM              *");
    System.out.println("*        ------------              ------------          *");
    System.out.println("**********************************************************");
	int t=sc.nextInt();
	if(t>=2)
	{
	System.out.println("*************************************************************************************");
	System.out.println("*                                                                                   *");
	System.out.println("*                                                                                   *");
	System.out.println("* Mr/Mrs "+name+"                        YOU HAVE PAY Rs."+bill+"                               *");
	System.out.println("*                                                                                   *");
	System.out.println("*                                    ◤▖▖▬▖▖▬▬◥                                     *");
    System.out.println("*                                    ▙▖▞▚▚▙▞▚▟                                     *");
    System.out.println("*                                    ▙▖▞▚▚▙▞▚▟                                     *");
    System.out.println("*                                    ▙▖▞▚▚▙▞▚▟                                     *");
    System.out.println("*                                    ▛▚▙■▬▟▞▚▜                                     *");
    System.out.println("*                                    ◣▚■▙▗▗▞▚◢                                     *");
	System.out.println("*                                                                                   *");
	System.out.println("*                                    PAY"+bill+"                                        *");
	System.out.println("*                                                                                   *");
	System.out.println("*                                  ================                                 *");
	System.out.println("*                                 *1)PAY "+bill+"      *                                *");
	System.out.println("*                                  ================                                 *");
    System.out.println("*                                                                                   *");
	System.out.println("*                                                                                   *");
	System.out.println("*************************************************************************************");
	int r=sc.nextInt();
}
else
{
	
}
}
void meth16()
{
	System.out.println("WHAT'S YOUR E-mail? [MUST AND SHOULD ADD @gmail.com ]");
String m=sc.next();

		 	if(m.length()>=10)	
		 	{
		 	String w=m.substring(m.length()-10);
		 	if(w.equals("@gmail.com"))
		 	{	
		 	    System.out.println(" ---------------------------------------");
		 		System.out.println("|       THQ FOR GIVING EMAIL            ");
		 	   	System.out.println(" ---------------------------------------"); 
		 	}
		 	else
		 		{
		 		System.out.println(" ---------------------------------------");
		 		System.out.println("|PLEASE ADD CORRECTLY @gmail.com ATLAST |");
		 		System.out.println(" ---------------------------------------");
		 		new Metro().meth16();
		 		}
		 	}
		 		
		 		else
		 	   {System.out.println(" ---------------------------------------");
		 		System.out.println("|    YOUR MAIL DETAILS ARE WRONG        |");
		 		System.out.println(" ---------------------------------------");
		 		new Metro().meth16();
		 	}
}

public static void main(String[]agrs)

{

new Metro().meth8();

}

}