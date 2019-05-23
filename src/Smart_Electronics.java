import java.util.*;// importing util class
public class Smart_Electronics// Class name
{// main class Begins
Scanner s=new Scanner(System.in);// Creating Scanner Object
String N[]=new String[2];// Array for Name of Products
String GS[]=new String[5];// Array for Name of Gaming Consoles
String SP[]=new String[5];// Array for Name of Companies of Smart Phones
String A[]=new String[5];// Array for Name of Products of Apple
String S[]=new String[5];// Array for Name of Products of Smasung
String B[]=new String[3];// Array for Name of Products of Blackberry
String H[]=new String[5];// Array for Name of Products of HTC
String No[]=new String[5];// Array for Name of Products of Nokia
int i,y;// used in loops
int n,no,a;// used for claculations 
int GameC,phone,SmartP,bout;// used in switch Statement
long sum=0;static long total=0;// used to calculate Price
int shop;// used to run the do-while loop
long cno;// used to store Credit/Debit Card Number
int dis,qz;long d,dprice;// Used in the Discount Quesion
String comt;// used to store the comments of the people
public static void main(String args[]){
       Smart_Electronics ob1=new Smart_Electronics();//Creating Object
       ob1.main1(args);
}
public void main1 (String args[])// Function Parameter 
{// main function Begins
System.out.println("            <>-------------------------------<>             ");
System.out.println("                      SMART ELECTRONICS                     ");
System.out.println("            <>-------------------------------<>             ");
System.out.println("            ***********************************             ");
System.out.println("            *          WELCOME                *             ");
System.out.println("            *    If you are looking for       *             ");
System.out.println("            *     some GAMING CONSOLES or     *             ");
System.out.println("            *     SMARTPHONES then this is    *             ");
System.out.println("            *        the right Shop.          *             ");
System.out.println("            *   -->Enjoy your Shopping<--     *             ");
System.out.println("            ***********************************             ");
System.out.println();
Smart_Electronics ob=new Smart_Electronics();//Creating Object
do// do-while loop for shopping
{// do-while loop starts
sum=0;//initialising sum to Zero
System.out.println("No.    PRODUCT");
String N[]={"1.    Gaming Console","2.    Smart Phones"};//Elements for Array of Products
for(i=0;i<=1;i++)// for loop to display Products
{// for loop begins
System.out.println(N[i]);// It will display the elements of the Product Array
}// for loop ends
System.out.println();
System.out.println("Enter the No. of Product you want");
a=s.nextInt();
System.out.println();
switch(a)// switch statement for Products
{// switch case begins
case 1:System.out.println("  GAMING CONSOLES");//case for Gamong Consoles
       System.out.println("-|----------------|-");
       System.out.println();
       System.out.println("We have the following Gaming Consoles:");
       String GS[]={"1.PlayStation 2","2.PlayStationPortable(PSP)","3.Nintendo Wii","4.PlayStation 3","5.XBox360"};
       for(i=0;i<=4;i++)//for loop to display Gaming Consoles
       {
       System.out.println(GS[i]);
       }
       System.out.println();
       System.out.println("Enter The Number Corrosponding to the Item you Want to buy");
       GameC=s.nextInt();
       System.out.println();
       switch(GameC)// switch for items of GS
       {//switch case begins
       case 1:System.out.println("PlayStation 2");//case for PlayStation 2
              System.out.println("-------------");
              System.out.println("Specifications:-\n1.Built in DVD Player\n2.OneController\n3.Warranty= 1 Year\n4.Price=Rs.6,000");
              System.out.println();
              System.out.println("Do you want to buy This item ?\nIf Yes type 1 else type any other Number");
              y=s.nextInt();
              if(y==1)
              {
              System.out.println("Type the number of PlayStation 2 you want to buy:");
              n=s.nextInt();
              sum=n*6000;
              System.out.println("The Price you have to pay for "+n+" Number of PlayStation 2 is Rs."+sum);
              }
              else 
              System.out.println("Thank You for Looking ");
              break;
       case 2:System.out.println("PlayStationPortable(PSP)");//case for PlayStationPortable(PSP) 
              System.out.println("------------------------");
              System.out.println("Specifications:-\n1.Built in Controller\n2.Sleek Design\n3.Warranty= 1 Year\n4.Price=Rs.8,000");
              System.out.println();
              System.out.println("Do you want to buy This item ?\nIf Yes type 1 else type any other Number");
              y=s.nextInt();
              if(y==1)
              {
              System.out.println("Type the number of PlayStationPortable(PSP) you want to buy:");
              n=s.nextInt();
              sum=n*8000;
              System.out.println("The Price you want to pay for "+n+" Number of PlayStationPortable(PSP) is Rs."+sum);
              }
              else
              System.out.println("Thankyou for Looking");
              break;
       case 3:System.out.println("Nintendo Wii");//case for Nintendo Wii
              System.out.println("------------");
              System.out.println("Specifications:-\n1.Built in DVD Player\n2.OneController\n3.Warranty= 3 Year\n4.Price=Rs.15,490");
              System.out.println();
              System.out.println("Do you want to buy This item ?\nIf Yes type 1 else type any other Number");
              y=s.nextInt();
              if(y==1)
              {
              System.out.println("Type the number of Nintendo Wii you want to buy:");
              n=s.nextInt();
              sum=n*15490;
              System.out.println("The Price you have to pay for "+n+" Number of Nintendo Wii is Rs."+sum); 
              }
              else
              System.out.println("Thank You for Looking");
              break;       
       case 4:System.out.println("PlayStation 3");//case for PlayStation 3
              System.out.println("-------------");
              System.out.println("Specifications:-\n1.Built in BlueRay Player\n2.OneController\n3.Warranty= 3 Year\n4.Price=Rs.19,000");
              System.out.println();
              System.out.println("Do you want to buy This item ?\nIf Yes type 1 else type any other Number");
              y=s.nextInt();
              if(y==1)
              {
              System.out.println("Type the number of PlayStation 3 you want to buy:");
              n=s.nextInt();
              sum=n*19000;
              System.out.println("The Price you have to pay for "+n+" Number of PlayStation 2 is Rs."+sum);
              }
              else
              System.out.println("Thank You for Looking");
              break; 
       case 5:System.out.println(" XBox360");//case for XBox360
              System.out.println("---------");
              System.out.println("Specifications:-\n1.Built in DVD Player\n2.OneController\n3.Warranty= 4 Year\n4.Price=Rs.20,000");
              System.out.println();
              System.out.println("Do you want to buy This item ?\nIf Yes type 1 else type any other Number");
              y=s.nextInt();
              if(y==1)
              {
              System.out.println("Type the number of XBox360 you want to buy:");
              n=s.nextInt();
              sum=n*20000;
              System.out.println("The Price you have to pay for "+n+" Number of XBox360 is Rs."+sum);
              }
              else
              System.out.println("Thank You for Looking");
              break; 
       default:System.out.println("Sorry Wrong Choice");
    }// switch for GS ends
    break;
case 2:System.out.println("  SMART PHONES");//case for Smart Phones
       System.out.println("-|------------|-");
       System.out.println("");
       System.out.println("We have the Following Companies:");
       String SP[]={"1.Apple","2.Samsung","3.Blackberry","4.HTC","5.Nokia"};
       for(i=0;i<=4;i++)//for loop to display items of Smart Phones
       {
        System.out.println(SP[i]);
       }  
       System.out.println("Enter The Number Corrosponding to the Company whoes SmartPhone you want to buy");
       SmartP=s.nextInt();
       System.out.println();
       switch(SmartP)// switch case for SP
       {// switch case begins
       case 1:System.out.println(" APPLE");//case for Apple
              System.out.println("|-----|");
              System.out.println();
              System.out.println("We Have The Following SmartPhones of Apple Company:-");
              String A[]={"1.iPhone 3G","2.iPhone 3GS","3.iPhone 4","4.iPhone 4S","5.iPhone 5"};
              for(i=0;i<=4;i++)//for loop to display phones of Apple
              {
              System.out.println(A[i]);
              }
              System.out.println("Enter The Number Corrosponding to the Item you Want to buy");
              phone=s.nextInt();
              System.out.println();
              switch(phone)// switch case for Apple
              {// switch case begins
              case 1:System.out.println("iPhone 3G");//case for iPhone 3G
                     System.out.println("---------");
                     System.out.println("Specifications:-\n1.Weight= 133g\n2.Screen Size= 3.5inch\n3.Memory= 16GB\n4.Thickness= 12.3mm\n5.CPU= 412MHz\n6.Camera=2MegaPixel\n7.Price= Rs.28,000");
                     System.out.println();
                     System.out.println("Do you want to buy This item ?\nIf Yes type 1 else type any other Number");
                     y=s.nextInt();
                     if(y==1)
                     {
                     System.out.println("Type the no of iPhone 3G you want to buy");
                     n=s.nextInt();
                     sum=n*28000;
                     System.out.println("The price you have to pay for "+n+" Number of iPhone 3G is Rs."+sum);
                     }
                     else
                     System.out.println("Thank You for Looking");
                     break;
              case 2:System.out.println("iPhone 3GS");//case for iPhone 3GS
                     System.out.println("----------");
                     System.out.println("Specifications:-\n1.Weight= 135g\n2.Screen Size= 3.5inch\n3.Memory= 16GB\n4.Thickness= 12.3mm\n5.CPU= Cortex A8 600MHz\n6.Camera=5MegaPixel\n7.Price= Rs.36,000");
                     System.out.println();
                     System.out.println("Do you want to buy This item ?\nIf Yes type 1 else type any other Number");
                     y=s.nextInt();
                     if(y==1)
                     {
                     System.out.println("Type the no of iPhone 3GS you want to buy");
                     n=s.nextInt();
                     sum=n*36000;
                     System.out.println("The price you have to pay for "+n+" Number of iPhone 3GS is Rs."+sum);
                     }
                     else
                     System.out.println("Thank You for Looking");
                     break;
              case 3:System.out.println("iPhone 4");//case for iPhone 4
                     System.out.println("--------");
                     System.out.println("Specifications:-\n1.Weight= 137g\n2.Screen Size= 3.5inch\n3.Memory= 32GB\n4.Thickness= 9.3mm\n5.CPU= Cortex A8 1GHz\n6.Camera=5MegaPixels\n7.Price= Rs.42,000");
                     System.out.println();
                     System.out.println("Do you want to buy This item ?\nIf Yes type 1 else type any other Number");
                     y=s.nextInt();
                     if(y==1)
                     {
                     System.out.println("Type the no of iPhone 4 you want to buy");
                     n=s.nextInt();
                     sum=n*42000;
                     System.out.println("The price you have to pay for "+n+" Number of iPhone 4 is Rs."+sum);
                     }
                     else
                     System.out.println("Thank You for Looking");
                     break;
              case 4:System.out.println("iPhone 4S");//case for iPhone 4S
                     System.out.println("---------");
                     System.out.println("Specifications:-\n1.Weight= 140g\n2.Screen Size= 3.5inch\n3.Memory= 32GB\n4.Thickness= 9.3mm\n5.CPU= Dual-Core 1GHz Cortex A9 \n6.Camera=8MegaPixel\n7.Price= Rs.45,000");
                     System.out.println();
                     System.out.println("Do you want to buy This item ?\nIf Yes type 1 else type any other Number");
                     y=s.nextInt();
                     if(y==1)
                     {
                     System.out.println("Type the no of iPhone 4S you want to buy");
                     n=s.nextInt();
                     sum=n*45000;
                     System.out.println("The price you have to pay for "+n+" Number of iPhone 4S is Rs."+sum);
                     }
                     else
                     System.out.println("Thank You for Looking");
                     break; 
              case 5:System.out.println("iPhone 5");//case for iPhone 5
                     System.out.println("---------");
                     System.out.println("Specifications:-\n1.Weight= 112g\n2.Screen Size= 4.0inch\n3.Memory= 64GB\n4.Thickness= 7.6mm\n5.CPU= Dual-Core 1.2GHz\n6.Camera=8MegaPixel\n7.Price= Rs.60,500");
                     System.out.println();
                     System.out.println("Do you want to buy This item ?\nIf Yes type 1 else type any other Number");
                     y=s.nextInt();
                     if(y==1)
                     {
                     System.out.println("Type the no of iPhone 5 you want to buy");
                     n=s.nextInt();
                     sum=n*60500;
                     System.out.println("The price you have to pay for "+n+" Number of iPhone 5 is Rs."+sum);
                     }
                     else
                     System.out.println("Thank You for Looking");
                     break;       
              default:System.out.println("Sorry Wrong Choice");
            }//switch case for Apple ends
            break;
       case 2:System.out.println(" SAMSUNG");
              System.out.println("|-------|");
              System.out.println("We have the following SmartPhones of Samsung Company:-");
              String S[]={"1.Samsung Galaxy Y","2.Samsung Galaxy Ace Duos","3.Samsung Galaxy SII","4.Samsung Galaxy SIII","5.Samsung Galaxy SIII Mini"};
              for(i=0;i<=4;i++)//for loop to display phoes of Samsung
              {
              System.out.println(S[i]);
              }
              System.out.println("Enter The Number Corrosponding to the Item you Want to buy");
              phone=s.nextInt();
              switch(phone)// switch case for Samsung
              {// switch case begins
              case 1:System.out.println("Smasung Galaxy Y");//case for Samsung Galaxy Y
                     System.out.println("----------------");
                     System.out.println("Specifications:-\n1.Weight= 97.5g\n2.Screen Size= 3.0inch\n3.Memory= 250 Builtin(Extended to 32GB)\n4.Thickness= 11.5mm\n5.CPU= ArmV6 830MHz\n6.Camera=2MegaPixel\n7.Price= Rs.7000");
                     System.out.println();
                     System.out.println("Do you want to buy This item ?\nIf Yes type 1 else type any other Number");
                     y=s.nextInt();
                     if(y==1)
                     {
                     System.out.println("Type the no of Samsung Galaxy Y you want to buy");
                     n=s.nextInt();
                     sum=n*7000;
                     System.out.println("The price you have to pay for "+n+" Number of Samsung Galaxy Y is Rs."+sum);
                     }
                     else
                     System.out.println("Thank You for Looking");
                     break;
              case 2:System.out.println("Samsung Galaxy Ace Duos");//case for Samsung Galaxy Ace Duos
                     System.out.println("-----------------------");
                     System.out.println("Specifications:-\n1.Weight= 125g\n2.Screen Size= 3.5inch\n3.Memory= microSD(up to 32 GB)\n4.Thickness= 12.5mm\n5.CPU= 800MHz\n6.Camera=3.25MegaPixel\n7.Price= Rs.13,000");
                     System.out.println();
                     System.out.println("Do you want to buy This item ?\nIf Yes type 1 else type any other Number");
                     y=s.nextInt();
                     if(y==1)
                     {
                     System.out.println("Type the no of Samsung Galaxy Ace Duos you want to buy");
                     n=s.nextInt();
                     sum=n*13000;
                     System.out.println("The price you have to pay for "+n+" Number of Samsung Galaxy Ace Duos is Rs."+sum);
                     }
                     else
                     System.out.println("Thank You for Looking");
                     break;
              case 3:System.out.println("Samsung Galaxy SII");//case for Samsung Galaxy SII
                     System.out.println("------------------");
                     System.out.println("Specifications:-\n1.Weight= 119g\n2.Screen Size= 4.3inch\n3.Memory=MicroSD upto 32GB\n4.Thickness= 8.5mm\n5.CPU= Dual-core 1.2 GHz Cortex-A9\n6.Camera=8MegaPixels\n7.Price= Rs.24,500");
                     System.out.println();
                     System.out.println("Do you want to buy This item ?\nIf Yes type 1 else type any other Number");
                     y=s.nextInt();
                     if(y==1)
                     {
                     System.out.println("Type the no of Samsung Galaxy SII you want to buy");
                     n=s.nextInt();
                     sum=n*24500;
                     System.out.println("The price you have to pay for "+n+" Number of Samsung Galaxy SII is Rs."+sum);
                     }
                     else
                     System.out.println("Thank You for Looking");
                     break;
              case 4:System.out.println("Samsung Galaxy SIII");//case for Samsung Galaxy SIII
                     System.out.println("-------------------");
                     System.out.println("Specifications:-\n1.Weight= 133g\n2.Screen Size= 4.8inch\n3.Memory= MicroSD upto 32GB\n4.Thickness= 8.6mm\n5.CPU= Quad-core 1.4 GHz Cortex-A9 \n6.Camera=8MegaPixel\n7.Price= Rs.34,500");
                     System.out.println();
                     System.out.println("Do you want to buy This item ?\nIf Yes type 1 else type any other Number");
                     y=s.nextInt();
                     if(y==1)
                     {
                     System.out.println("Type the no of Samsung Galaxy SIII you want to buy");
                     n=s.nextInt();
                     sum=n*34500;
                     System.out.println("The price you have to pay for "+n+" Number of Samsung Galaxy SIII is Rs."+sum);
                     }
                     else
                     System.out.println("Thank You for Looking");
                     break; 
              case 5:System.out.println("Samsung Galaxy SIII Mini");//case for Samsung Galaxy SIII Mini
                     System.out.println("------------------------");
                     System.out.println("Specifications:-\n1.Weight= 111.5g\n2.Screen Size= 4.0inch\n3.Memory= MicroSD upto 32GB \n4.Thickness= 9.9mm\n5.CPU= Dual-core 1 GHz\n6.Camera=5MegaPixel\n7.Price= Rs.27000");
                     System.out.println();
                     System.out.println("Do you want to buy This item ?\nIf Yes type 1 else type any other Number");
                     y=s.nextInt();
                     if(y==1)
                     {
                     System.out.println("Type the no of Samsung Galaxy SIII Mini you want to buy");
                     n=s.nextInt();
                     sum=n*27000;
                     System.out.println("The price you have to pay for "+n+" Number of Samsung Galaxy SIII Mini is Rs."+sum);
                     }
                     else
                     System.out.println("Thank You for Looking");
                     break;       
              default:System.out.println("Sorry Wrong Choice");  
            }// switch case for Samsung ends
            break;
       case 3:System.out.println(" BLACKBERRY");//case for Blackberry
              System.out.println("|----------|");
              System.out.println("We have the following SmartPhones of Blackberry Company:-");
              String B[]={"1.Blackberry Torch","2.Blackberry Bold","3.Blackberry Style"};
              for(i=0;i<=2;i++)//for loop to Display phones of Blackberry
              {
              System.out.println(B[i]);
              }
              System.out.println("Enter The Number Corrosponding to the Item you Want to buy");
              phone=s.nextInt();
              switch(phone)// switch case for Blackberry
              {// switch case begins
              case 1:System.out.println("Blackberry Torch");//case for Blackberry Torch
                     System.out.println("----------------");
                     System.out.println("Specifications:-\n1.Weight= 135g\n2.Screen Size= 3.7inch\n3.Memory= microSD, up to 32GB\n4.Thickness= 11.5mm\n5.CPU= ArmV6 830MHz\n6.Camera=2MegaPixel\n7.Price= Rs.21500");
                     System.out.println();
                     System.out.println("Do you want to buy This item ?\nIf Yes type 1 else type any other Number");
                     y=s.nextInt();
                     if(y==1)
                     {
                     System.out.println("Type the no of Blackberry Torch you want to buy");
                     n=s.nextInt();
                     sum=n*21000;
                     System.out.println("The price you have to pay for "+n+" Number of Blackberry Torch is Rs."+sum);
                     }
                     else
                     System.out.println("Thank You for Looking");
                     break;
              case 2:System.out.println("Blackberry Bold");//case for Blackberry Bold
                     System.out.println("---------------");
                     System.out.println("Specifications:-\n1.Weight= 130g\n2.Screen Size= 2.8inch\n3.Memory= microSD(up to 32 GB)\n4.Thickness= 10.5mm\n5.CPU= 1.2 GHz QC 8655\n6.Camera=5MegaPixel\n7.Price= Rs.28,000");
                     System.out.println();
                     System.out.println("Do you want to buy This item ?\nIf Yes type 1 else type any other Number");
                     y=s.nextInt();
                     if(y==1)
                     {
                     System.out.println("Type the no of Blackberry Bold you want to buy");
                     n=s.nextInt();
                     sum=n*28000;
                     System.out.println("The price you have to pay for "+n+" Number of Blackberry Bold is Rs."+sum);
                     }
                     else
                     System.out.println("Thank You for Looking");
                     break;
              case 3:System.out.println("Blackberry Style");//case for Blackberry Style
                     System.out.println("----------------");
                     System.out.println("Specifications:-\n1.Weight= 131g\n2.Screen Size= 1.4inch\n3.Memory=MicroSD upto 16GB\n4.Thickness= 11.8mm\n5.CPU= Inbuilt\n6.Camera=5MegaPixels\n7.Price= Rs.20,000");
                     System.out.println();
                     System.out.println("Do you want to buy This item ?\nIf Yes type 1 else type any other Number");
                     y=s.nextInt();
                     if(y==1)
                     {
                     System.out.println("Type the no of Blackberry Style you want to buy");
                     n=s.nextInt();
                     sum=n*20000;
                     System.out.println("The price you have to pay for "+n+" Number of Blackberry Style is Rs."+sum);
                     }
                     else
                     System.out.println("Thank You for Looking");
                     break;
              default:System.out.println("Sorry Wrong Choice"); 
            }// switch case for Blackberry ends
            break;
       case 4:System.out.println(" HTC");//case for HTC
              System.out.println("|---|");
              System.out.println("We have the following SmartPhones of HTC Company:-");
              String H[]={"1.HTC Desire C","2.HTC Desire X","3.HTC One S","4.HTC One X","5.HTC One X+"};
              for(i=0;i<=4;i++)//for loop to display phones of HTC
              {
              System.out.println(H[i]);
              }
              System.out.println("Enter The Number Corrosponding to the Item you Want to buy");
              phone=s.nextInt();
              switch(phone)// switch case for HTC
              {// switch case begins
              case 1:System.out.println("HTC Desire C");//case for HTC Desire C
                     System.out.println("------------");
                     System.out.println("Specifications:-\n1.Weight= 100g\n2.Screen Size= 3.5inch\n3.Memory= microSD, up to 32 GB\n4.Thickness= 12.3mm\n5.CPU= 600 MHz Cortex-A5\n6.Camera=5MegaPixel\n7.Price= Rs.12000");
                     System.out.println();
                     System.out.println("Do you want to buy This item ?\nIf Yes type 1 else type any other Number");
                     y=s.nextInt();
                     if(y==1)
                     {
                     System.out.println("Type the no of HTC Desire C you want to buy");
                     n=s.nextInt();
                     sum=n*12000;
                     System.out.println("The price you have to pay for "+n+" Number of HTC Desire C is Rs."+sum);
                     }
                     else
                     System.out.println("Thank You for Looking");
                     break;
              case 2:System.out.println("HTC Desire X");//case for HTC Desire X
                     System.out.println("-------------");
                     System.out.println("Specifications:-\n1.Weight= 114g\n2.Screen Size= 4.0inch\n3.Memory= microSD(up to 32 GB)\n4.Thickness= 9.3mm\n5.CPU= Dual-core 1 GHz\n6.Camera=5MegaPixel\n7.Price= Rs.18,300");
                     System.out.println();
                     System.out.println("Do you want to buy This item ?\nIf Yes type 1 else type any other Number");
                     y=s.nextInt();
                     if(y==1)
                     {
                     System.out.println("Type the no of HTC Desire X you want to buy");
                     n=s.nextInt();
                     sum=n*18300;
                     System.out.println("The price you have to pay for "+n+" Number of HTC Desire X is Rs."+sum);
                     }
                     else
                     System.out.println("Thank You for Looking");
                     break;
              case 3:System.out.println("HTC One S");//case for HTC One S
                     System.out.println("---------");
                     System.out.println("Specifications:-\n1.Weight= 119.5g\n2.Screen Size= 4.3inch\n3.Memory=MicroSD upto 32GB\n4.Thickness= 7.8mm\n5.CPU= Dual-core 1.5 GHz Krait\n6.Camera=8MegaPixels\n7.Price= Rs.31,000");
                     System.out.println();
                     System.out.println("Do you want to buy This item ?\nIf Yes type 1 else type any other Number");
                     y=s.nextInt();
                     if(y==1)
                     {
                     System.out.println("Type the no of HTC One S you want to buy");
                     n=s.nextInt();
                     sum=n*31000;
                     System.out.println("The price you have to pay for "+n+" Number of HTC One S is Rs."+sum);
                     }
                     else
                     System.out.println("Thank You for Looking");
                     break;
              case 4:System.out.println("HTC One X");//case for HTC One X
                     System.out.println("---------");
                     System.out.println("Specifications:-\n1.Weight= 130g\n2.Screen Size= 4.8inch\n3.Memory= MicroSD upto 32GB\n4.Thickness= 8.6mm\n5.CPU= Quad-core 1.5 GHz\n6.Camera=8MegaPixel\n7.Price= Rs.34,500");
                     System.out.println();
                     System.out.println("Do you want to buy This item ?\nIf Yes type 1 else type any other Number");
                     y=s.nextInt();
                     if(y==1)
                     {
                     System.out.println("Type the no of HTC One X you want to buy");
                     n=s.nextInt();
                     sum=n*34500;
                     System.out.println("The price you have to pay for "+n+" Number of HTC One X is Rs."+sum);
                     }
                     else
                     System.out.println("Thank You for Looking");
                     break; 
              case 5:System.out.println("HTC One X+");//case for HTC One X+
                     System.out.println("----------");
                     System.out.println("Specifications:-\n1.Weight= 135g\n2.Screen Size= 4.7inch\n3.Memory= MicroSD upto 32GB \n4.Thickness= 8.9mm\n5.CPU= Quad-core 1.7 GHz\n6.Camera=8MegaPixel\n7.Price= Rs.47000");
                     System.out.println();
                     System.out.println("Do you want to buy This item ?\nIf Yes type 1 else type any other Number");
                     y=s.nextInt();
                     if(y==1)
                     {
                     System.out.println("Type the no of HTC One X+ you want to buy");
                     n=s.nextInt();
                     sum=n*47000;
                     System.out.println("The price you have to pay for "+n+" Number of HTC One X+ is Rs."+sum);
                     }
                     else
                     System.out.println("Thank You for Looking");
                     break;       
              default:System.out.println("Sorry Wrong Choice");  
            }// switch case for HTC ends
            break;
       case 5:System.out.println(" NOKIA");//case for Nokia
              System.out.println("|-----|");
              System.out.println("We have the following SmartPhones of HTC Company:-");
              String No[]={"1.Nokia Asha","2.Nokia Lumia 610","3.Nokia Lumia 800","4.Nokia lumia 900","5.Nokia Lumia 920"};
              for(i=0;i<=4;i++)//for loop to display phones of Nokia
              {
              System.out.println(No[i]);
              }
              System.out.println("Enter The Number Corrosponding to the Item you Want to buy");
              phone=s.nextInt();
              switch(phone)// switch case for Nokia
              {// switch case begins
              case 1:System.out.println("Nokia Asha");//case for Nokia Asha
                     System.out.println("----------");
                     System.out.println("Specifications:-\n1.Weight= 95g\n2.Screen Size= 3.0inch\n3.Memory= microSD, up to 32 GB\n4.Thickness= 9.3mm\n5.CPU= 1 GHz\n6.Camera=3.25MegaPixel\n7.Price= Rs.7200");
                     System.out.println();
                     System.out.println("Do you want to buy This item ?\nIf Yes type 1 else type any other Number");
                     y=s.nextInt();
                     if(y==1)
                     {
                     System.out.println("Type the no of Nokia Asha you want to buy");
                     n=s.nextInt();
                     sum=n*7200;
                     System.out.println("The price you have to pay for "+n+" Number of Nokia Asha is Rs."+sum);
                     }
                     else
                     System.out.println("Thank You for Looking");
                     break;
              case 2:System.out.println("Nokia Lumia 610");//case for Nokia Lumia 610
                     System.out.println("---------------");
                     System.out.println("Specifications:-\n1.Weight= 131.5g\n2.Screen Size= 3.7inch\n3.Memory= microSD(up to 32 GB)\n4.Thickness= 12mm\n5.CPU= 800 MHz ARM Cortex-A5\n6.Camera=5MegaPixel\n7.Price= Rs.11,300");
                     System.out.println();
                     System.out.println("Do you want to buy This item ?\nIf Yes type 1 else type any other Number");
                     y=s.nextInt();
                     if(y==1)
                     {
                     System.out.println("Type the no of Nokia Lumia 610 you want to buy");
                     n=s.nextInt();
                     sum=n*11300;
                     System.out.println("The price you have to pay for "+n+" Number of Nokia Lumia 610 is Rs."+sum);
                     }
                     else
                     System.out.println("Thank You for Looking");
                     break;
              case 3:System.out.println("Nokia Lumia 800");//case for Nokia Lumia 800
                     System.out.println("---------------");
                     System.out.println("Specifications:-\n1.Weight= 142g\n2.Screen Size= 3.7inch\n3.Memory=MicroSD upto 32GB\n4.Thickness= 12.1mm\n5.CPU= 1.4 GHz Scorpion\n6.Camera=8MegaPixels\n7.Price= Rs.19,000");
                     System.out.println();
                     System.out.println("Do you want to buy This item ?\nIf Yes type 1 else type any other Number");
                     y=s.nextInt();
                     if(y==1)
                     {
                     System.out.println("Type the no of Nokia Lumia 800 you want to buy");
                     n=s.nextInt();
                     sum=n*19000;
                     System.out.println("The price you have to pay for "+n+" Number of Nokia Lumia 800 is Rs."+sum);
                     }
                     else
                     System.out.println("Thank You for Looking");
                     break;
              case 4:System.out.println("Nokia lumia 900");//case for Nokia Lumia 900
                     System.out.println("---------------");
                     System.out.println("Specifications:-\n1.Weight= 160g\n2.Screen Size= 4.3inch\n3.Memory= MicroSD upto 32GB\n4.Thickness= 11.5mm\n5.CPU= 1.4 GHz Scorpion\n6.Camera=8MegaPixel\n7.Price= Rs.31,200");
                     System.out.println();
                     System.out.println("Do you want to buy This item ?\nIf Yes type 1 else type any other Number");
                     y=s.nextInt();
                     if(y==1)
                     {
                     System.out.println("Type the no of Nokia lumia 900 you want to buy");
                     n=s.nextInt();
                     sum=n*31200;
                     System.out.println("The price you have to pay for "+n+" Number of Nokia lumia 900 is Rs."+sum);
                     }
                     else
                     System.out.println("Thank You for Looking");
                     break;       
              case 5:System.out.println("Nokia Lumia 920");//case for Nokia Lumia 920
                     System.out.println("---------------");
                     System.out.println("Do you want to buy This item ?\nIf Yes type 1 else type any other Number");
                     y=s.nextInt();
                     if(y==1)
                     {
                     System.out.println("Specifications:-\n1.Weight= 184g\n2.Screen Size= 4.5inch\n3.Memory=InBuilt 32GB \n4.Thickness= 10.7mm\n5.CPU= Dual-core 1.5 GHz Krait\n6.Camera=8.7MegaPixel\n7.Price= Rs.25000");
                     System.out.println();
                     System.out.println("Type the no of Nokia Lumia 920 you want to buy");
                     n=s.nextInt();
                     sum=n*25000;
                     System.out.println("The price you have to pay for "+n+" Number of Nokia Lumia 920 is Rs."+sum);
                     }
                     else
                     System.out.println("Thank You for Looking");
                     break;       
              default:System.out.println("Sorry Wrong Choice");     
            }// switch case for Nokia ends
            break;
          }// switch case for Smart Phones ends
      }// switch case for Products ends   
       System.out.println("Do you wish to continue shopping?");
       System.out.println("If you wish to continue please type '1' else type any other number.");
       shop=s.nextInt();
       System.out.println();
       total=total+sum;
      }//do-while loop for Shopping ends
   while(shop==1);//while statement to run do-while loop
   if(total>1)// this if statement will execute if you shop
   {// if begins
   System.out.println("Total amount of articles Rs."+total);
   System.out.println("Would you like to buy these things ?");
   System.out.println("If yes please type '1' else type any other number.");
   bout=s.nextInt();
    if(bout==1)//this will execute if you buy things Finally
     {//if else statement for payment of purchased item
       System.out.println("You can get a discount of 20 percent press 1 if you want and press any other if you dont want");
       dis=s.nextInt();
       switch(dis)//switch for Quiz
       {
       case 1://case for Question
       System.out.println("You have to answer a simple question\nWhich is the second highest Mountain in the World ?");
       System.out.println("1.Mt.Kunchenjunga\t2.Mt.Everest\n3.Mt.K2          \t4.Mt.Killimanjaro");
       System.out.println();
       System.out.println("Enter the no corrosponding to the correct Mountain");
       qz=s.nextInt();
       switch(qz)//switch for options
       {
       case 1://case for Wrong Answer
       ob.WrongAnswer();//calling function WrongAnswer()
       ob.Sell();////calling function Sell()
       break;
       case 2://case for Wrong Answer
       ob.WrongAnswer();//calling function WrongAnswer()
       ob.Sell();//calling function Sell()
       break;
       case 3://case for Correct Answer
       d=20*total/100;
       dprice=total-d;
       System.out.println("Congracts you have given the Correct Answer !\nYou get a discount of Rs."+d+"\nThe Price after Discount you have to pay is Rs."+dprice);
       System.out.println(); 
       ob.Sell();//calling function Sell()
       break;
       case 4:
       ob.WrongAnswer();//calling function WrongAnswer()
       ob.Sell();//calling function Sell()
       break;
       default:
       ob.WrongAnswer();//calling function WrongAnswer()
       ob.Sell();//calling function Sell()
       }
       break;
       default:
       ob.Sell();//calling function Sell()
      }
    }
   else
   ob.NoSell();//calling function NoSell()
   }//if statement ends
   else
   ob.NoSell();
 }// main function ends
 public void Sell()//Function for selling to be called in main Function
   {//Function Begins
       System.out.println("Enter your credit card/debit card number.");
       cno=s.nextInt();
       System.out.println("Your Payement is Conformed.");
       System.out.println();
       System.out.println("                                   Thanks for shopping from SMART ELECTRONOTICS                                          ");
       System.out.println();
       System.out.println();
       System.out.println("We would like to hear from You.");
       System.out.println("Please enter your comments.");
       s.nextLine();
       comt=s.nextLine();
       System.out.println();
       System.out.println("                                    Thanks for your comments                                   ");
       System.out.println("                                        Have a nice day!                                       ");
       System.out.println();
       System.out.println();
       System.out.println("***********************************************************************************************************************************************************************************************************");
     }//Function Ends
  public void NoSell()//Function of NoSelling to be called in main Function
   {//Function Begins
      System.out.println("Hope you will shop next time");      
      System.out.println("We would like to hear from you.");
      System.out.println("Please enter your comments.");
      comt=s.nextLine();
      System.out.println();
      System.out.println();
      System.out.println("                                    Thanks for your comments                                   ");
      System.out.println("                                        Have a nice day!                                       ");
      System.out.println();
      System.out.println();
      System.out.println("************************************************************************************************************************************************************************************************************");
    }//Function Ends
  public void WrongAnswer()//Function WrongAnswer to be called in main Function
  {//Function Begins
      System.out.println("Sorry Wrong Answer you cant get any Discount");
      System.out.println("The Correct answer is 3.Mt.K2");
      System.out.println(); 
      System.out.println("The Price you have to pay is Rs."+total);
      System.out.println();
    }//Function Ends   
}//Class Ends
// THE PROGRAM SUCESSFULLY ENDS
             


              
       
       
       
       
            
          
       
