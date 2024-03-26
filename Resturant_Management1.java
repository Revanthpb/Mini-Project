 import java.util.*;
public class Resturant_Management1
{
public static void main(String args[])
{
Scanner in = new Scanner(System.in);

int d ,vstr,tvstr=0,nvstr,tnvstr=0,vfd,tvfd=0,nvfd,tnvfd=0,fd,tfd=0,amt=0,tamt=0,
 tamt1=0,tamt2=0,totald=0,damt=0,ch;

double gst=0,tot , gtotal;

String str="",choice,choice1 ="Y";

System.out.println("Welcome to the Multi Cuisine Restaurant!!!");

System.out.println("Starter Corner: 1");

System.out.println("Main Course: 2"); 
System.out.println("Desserts: 3");

System.out.println();

while(choice1.equalsIgnoreCase("Y"))
{
System.out.println("Enter 1 for Starter");
System.out.println("Enter 2 for Main Course");
System.out.println("Enter 3 for Desserts");
System.out.println();
System.out.println("enter Your Choice");

ch=in.nextInt();

switch(ch)
{
case 1:
System.out.println("Welcome to Starter Menu!!!!!!");

System.out.println("Enter 'VS' for Veg Starter and 'NVS' for Non-Veg Starter");

str=in.next();
if(str.equalsIgnoreCase("VS"))
{
System.out.println("Starters\t\t\t\t\tPrice in Rs.");
System.out.println("1.Paneer Tikkariiritl \t\t\t\t10");
System.out.println("2. Veg Seekh Kababririt\t\t\t\t110");
System.out.println("3.Hara Bhara Kababitv\t\t\t\t110");
System.out.println("4. Shanghai Spring Rollw\t\t\t150");
System.out.println("5.American Corn Ballrine\t\t\t150");
 System.out.println("6.Crispy American Comitirit\t\t\t140");
System.out.println("7.Crispy Baby CornM\t\t\t\t140");
System.out.println("8.Crispy Mushroom\t\t\t\t\t120");
System.out.println("9.Crispy Chilly Potato\t\t\t\t 120");
System.out.println("10.Crispy Chilly Chana\t\t\t\t50");
System.out.println();
choice="Y";
while(choice.equalsIgnoreCase("Y"))
{
System.out.println("Choose the veg starter by entering number");

vstr =in.nextInt();

System.out.println("Enter the quantity");

tvstr=in.nextInt();

if(vstr >=1 && vstr <=3)

amt= tvstr *110;

if (vstr ==4 || vstr ==5||vstr==10)

amt= tvstr* 150;

if(vstr==6|| vstr ==7)
amt= tvstr* 140;
if(vstr ==8|| vstr ==9)
amt=vstr* 120;
tamt=tamt+amt;

System.out.println("Do you want to place more order? Enter Y/N");
choice=in.next();
}
}
if(str.equalsIgnoreCase("NVS"))
{
System.out.println("Non-Veg Starters\t\t\t\t Price in Rs.");
System.out.println("1.Chicken Tikka\t\t\t\t170");
System.out.println("2.Murg Reshmi Kabab\t\t\t170");
System.out.println("3.Murg Chilli Kabab\t\t\t160");
System.out.println("4.Chicken Seekh Kabab\t\t\t180");
System.out.println("5.Tangdi Kabab\t\t\t\t180");
System.out.println("6.Murg Tandoori\t\t\t\t190");
System.out.println("7 Fish Ajwani Tikkaw\t\t\t\t190");
System.out.println("8.Chilli Chicken\t\t\t\t160");
System.out.println("9.Drums of Heaven\t\t\t\t180");
System.out.println("10.Shanghai Chiken\t\t\t\t180");

choice="Y";

while(choice.equalsIgnoreCase("Y"))
{
System.out.println("Choose the non-veg starter by entering number.");

nvstr=in.nextInt();

System.out.println("Enter the quantity:");

tnvstr=in.nextInt();

if(nvstr==1||nvstr==2)

amt=nvstr*170;

if(nvstr==3||nvstr==8)

amt=nvstr*160;

if(nvstr==4||nvstr==5||nvstr==9||nvstr== 10)

amt=tnvstr*180;

if(nvstr==6||nvstr==7)

amt=tnvstr *190;

System.out.println("Do you want to place more order? Enter Y/N");

choice=in.next();
}
}
break;
case 2:
System.out.println("Main Course: Indian and Chinese Dihes");
System.out.println("Enter 'V' for Indian  Dishes, 'NV' for non veg dishes and 'c' for chineese dishes");

str=in.next();

System.out.println(str.equalsIgnoreCase("V"));

if(str.equalsIgnoreCase("V"))
{
System.out.println("Welcome to Indian Veg Dishes");

System.out.println("Indian Veg Dishes \t\t\t Price in Rs.");
System.out.println("1. Shahi Paneer\t\t\t\t 180");
System.out.println("2.Navratan Korma \t\t\t 180");
System.out.println("3. Kadahi Paneert\t\t\t\t 150"); 
System.out.println("4.Malai Kofta\t\t\t140");
System.out.println("5.Kadahi Vegetable\t\t\t140");
System.out.println("6. Vegetable Pakeeza\t\t\t 140");
System.out.println("7 Shabnam Curry\t\t\t150");
System.out.println("8.Makai Corn Palak\t\t\t150");
System.out.println("9. Veg. Pulao \t\t\t110"); 
System.out.println("10. Kashmiri Pulao\t\t\t\t140");
System.out.println("11 Butter Naan\t\t\t\t40");
System.out.println("12.Stuffed Kulcha\t\t\t\t60");

choice="Y";

while(choice.equalsIgnoreCase("Y"))
{
System.out.println("Choose the order by entering number:");
vfd=in.nextInt();

System.out.println("Enter the quantity");

tvfd=in.nextInt();

if(vfd==1||vfd==2)
amt=tvfd* 180;
if(vfd==3||vfd==7||vfd==8)

amt=tvfd *150;

if(vfd==4||vfd==5||vfd==6||vfd==10)

amt=tvfd *140;

if(vfd==9)
amt=tvfd*110;
if(vfd==11)
amt=tvfd*40;
if(vfd==12)
amt=tvfd *60;

tamt1=tamt1+amt;

System.out.println("Do you want to place more order? Enter Y/N");

choice=in.next();
}
}
if(str.equalsIgnoreCase("NV"))
{
System.out.println("Welcome to Indian Non-Veg Dishes"); 
System.out.println("Indian Non-Veg Dishes\t\t\t\t Price in Rs");
System.out.println("1.Chicken Tikka Masala\t\t\t180");
System.out.println("2 Chicken Tikka Lahadar\t\t\t180");
System.out.println("3.Chicken Bharta\t\t\t150");
System.out.println("4 Kadahi Chicken\t\t\t160");
System.out.println("5 Mughlai Chicken\t\t\t160");
System.out.println("6 Murg Navratan Korma\t\t\t\t\t160");
System.out.println("7.Chicken Do Pyaza\t\t\t\t\t170");
System.out.println("8.Murg Masallam\t\t\t\t170");
System.out.println("9. Mutton Rogan Josh\t\t\t\t190");
System.out.println("10.Prawo Malai Curry\t\t\t\t 190");
System.out.println("11.Fish Sarsowala\t\t\t\t\t 140");
System.out.println("12. Fish Dhaniawala \t\t\t\t\t260");

choice="Y";

while(choice.equalsIgnoreCase("Y"))
{
System.out.println("Choose the order by entering number: ");
nvfd=in.nextInt();

System.out.println("Enter the quantity");
tnvfd=in.nextInt();

if(nvfd==1||nvfd==2)

amt=tnvfd* 180;

if(nvfd==3)

amt=tnvfd *150;

if(nvfd==4||nvfd==5||nvfd==6||nvfd==12)

amt =tnvfd*160;

if(nvfd==7||nvfd==8)

amt=tnvfd*170;

if(nvfd==9||nvfd==10)

amt=tnvfd*190;

if(nvfd==11)

amt=tnvfd*140;

tamt1=tamt1+amt;

System.out.println("Do you want to place more order? Enter Y/N");

choice=in.next();
}
}
if(str.equalsIgnoreCase("C"))
{
System.out.println("Welcome to Chinese Dishes");
System.out.println("Chinese Dishes\t\t\t\t Price in Rs.");
System.out.println("1.Schezwan Fried Rice\t\t\t240");
System.out.println("2 Schezwan Chicken\t\t\t280");
System.out.println("3.Chilly Chicken\t\t\t280");
System.out.println("4 Chicken Noodle\t\t\t210");
System.out.println("5. Veg. Hakka Noodle\t\t\t210");
System.out.println("6.Chicken Manchurian\t\t\t190");
System.out.println("7. Paneer Manchurian \t\t\t 190");
System.out.println( "8. Chilly Paneer\t\t\t 190");
System.out.println("9.Sanghai Fried Rice\t\t\t 240");
System.out.println("10. Veg. Fried rice\t\t\t210");
System.out.println("11.Chicken Fried Rice\t\t\t210");
System.out.println("12. Kimchi Rice Veg \t\t\t210");

choice="Y";

while(choice.equalsIgnoreCase("Y"))
{
System.out.println("Choose the order by entering number: ");
fd=in.nextInt();

System.out.println("Enter the quantity");
tfd=in.nextInt();

if(fd==1||fd==9)

amt= tfd*240;

if(fd==2||fd==3)

amt=tfd*280;

if(fd==4||fd==5||fd==10||fd==11||fd==12)

amt=tfd*210;

if(fd==6||fd==7||fd==8)

amt=tfd*190;

tamt1=tamt1+amt;

System.out.println("Do you want to place more order? Enter Y/N");
choice=in.next();
}
}
break;
case 3: 
System.out.println("Deserts\t\t\t\t\t Price in Rs.");
System.out.println();
System.out.println("1.Softy Pineapple\t\t\t 110");
System.out.println("2.Softy Crunchy Chocolate\t\t\t110");
System.out.println("3.Chocolate Walnut Brownie \t\t\t 90");
System.out.println("4.Chocolate doughnut \t\t\t 90");
System.out.println("5.Marble Cake\t\t\t70");
System.out.println("6.Mocha Magic\t\t\t90");
System.out.println("7.Black Forest \t\t\t\190");
System.out.println("8.Mango Shake\t\t\t\t80");
System.out.println("9. Pineapple Shake\t\t\t 80");
System.out.println("10. Tooty Fruity\t\t\t\t120");

choice="Y";

while(choice.equalsIgnoreCase("Y"))
{
System.out.println("Choose your desert by entering your number!!");
d=in.nextInt();

System.out.println("Enter the total number of items you want to buy!!");
totald=in.nextInt();

if(d==1||d==2)
damt=totald*110;

if(d==3||d==4||d==6||d==7)
damt=totald*90;

if(d==5)
damt=totald*70;

if(d==8||d==9)
damt=totald*80;

if(d==10)
damt=totald*120;

tamt2=tamt2+damt;

System.out.println("Do you want to place more order? Enter Y/N");
choice=in.next();
}
break;
default:
System.out.println("you have entered a wrong choice");
}
System.out.println("enter Y to go to main menu");
choice1=in.next();
}
System.out.println("*************Multi Cuisine Restaurant *********");
System.out.println("-**************Starter*******************");
System.out.println("Total cost of starter = Rs."+tamt);
System.out.println("********************Main Course*****************");
System.out.println("Total cost of main course= Rs."+tamt1);
System.out.println("************************Desserts******************");
System.out.println("Total cost of desserts = Rs."+tamt2);

tot=tamt+tamt1+tamt2;
gst=tot*18.0/100.0;

System.out.println("GST =Rs. "+gst);
gtotal=tot+gst;

System.out.println("Amount to be paid Rs. "+gtotal);
System.out.println("Thanks for visiting Multi Cuisine Restaurant!!");
System.out.println("Your Pleasure Our Comfort!!!");
System.out.println("Visit Again!!!");
System.out.println("program ends!!!!!");
}
}


