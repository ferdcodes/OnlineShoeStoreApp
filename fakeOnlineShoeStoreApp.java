/*
 * fakeOnlineShoeStoreApp
 * This application is separated between 2 classes. The client code generates a random amount of
 * of shoes available for certain shoes. Then the user is prompted to add things to their carts.
 * Then, the things in the cart is transfered to another class to calculate their total.
 */

// next updates: 1. (indicate what model of the shoe, show prices of the shoe), 2. maybe shoe sizes? (BIG update)
import java.util.Random;
import java.util.Scanner;

public class fakeOnlineShoeStoreApp
{
  public static void main (String [] args)
  {
    Scanner input = new Scanner(System.in);
    Random r = new Random ();
    int jOne = 0, jThree = 0, jFour = 0, lTO = 0, kobeF = 0, kobeS = 0;
    int joRan = 0, jtRan = 0, jfRan = 0, ltoRan = 0, kfRan = 0, ksRan = 0;
    int joTotal = 0, jtTotal = 0, jfTotal = 0, ltoTotal = 0, kfTotal = 0, ksTotal = 0;
    int cont = 2, shoe = 0, valid = 0;
    
    //generate random numbers for inventory
    joRan = r.nextInt(10);
    jtRan = r.nextInt(10);
    jfRan = r.nextInt(10);
    ltoRan = r.nextInt(10);
    kfRan = r.nextInt(10);
    ksRan = r.nextInt(10);
    
    do
    {
    System.out.println("Shoe Model:             Quantity:");
    System.out.println("1.Jordan 1's                " + joRan);
    System.out.println("2.Jordan 3's                " + jtRan);
    System.out.println("3.Jordan 4's                " + jfRan);
    System.out.println("4.LeBron 21's               " + ltoRan);
    System.out.println("5.Kobe 4's                  " + kfRan);
    System.out.println("6.Kobe 8's                  " + ksRan);
    System.out.println("\n What shoe would you like to add to your cart?(Enter number) (0 to check out)");
    shoe = input.nextInt();
    
    if(shoe == 1)
    {
      do{
        System.out.println("How many Jordan 1's would you like?");
        jOne = input.nextInt();
        if(jOne <= joRan)
        {
          System.out.println("Added to cart, would you like to continue to shop? (1 to checkout, 2 to continue)");
          joRan -= jOne;
          joTotal = jOne;
          cont = input.nextInt();
        }
        else
        {
          System.out.println("Invalid amount, please pick a valid amount.");
        }
      }while(valid == 1);
    }
        
    else if(shoe == 2)
    {
      do{
        System.out.println("How many Jordan 3's would you like?");
        jThree = input.nextInt();
        if(jThree <= jtRan)
        {
          System.out.println("Added to cart, would you like to continue to shop? (1 to checkout, 2 to continue)");
          jtRan -= jThree;
          jtTotal = jThree;
          cont = input.nextInt();
        }
        else
        {
          System.out.println("Invalid amount, please pick a valid amount.");
        }
      }while(valid == 1); 
    }
    else if(shoe == 3)
    {
     do{
        System.out.println("How many Jordan 3's would you like?");
        jFour = input.nextInt();
        if(jFour <= jfRan)
        {
          System.out.println("Added to cart, would you like to continue to shop? (1 to checkout, 2 to continue)");
          jfRan -= jFour;
          jfTotal = jFour;
          cont = input.nextInt();
        }
        else
        {
          System.out.println("Invalid amount, please pick a valid amount.");
        }
      }while(valid == 1); 
      
    }
    else if(shoe == 4)
    {
     do{
        System.out.println("How many LeBron 21's would you like?");
        lTO = input.nextInt();
        if(lTO <= ltoRan)
        {
          System.out.println("Added to cart, would you like to continue to shop? (1 to checkout, 2 to continue)");
          ltoRan -= lTO;
          ltoTotal = lTO;
          cont = input.nextInt();
        }
        else
        {
          System.out.println("Invalid amount, please pick a valid amount.");
        }
      }while(valid == 1); 
      
    }
    else if (shoe == 5)
    {
      do{
        System.out.println("How many Kobe 8's would you like?");
        kobeF = input.nextInt();
        if(kobeF <= kfRan)
        {
          System.out.println("Added to cart, would you like to continue to shop? (1 to checkout, 2 to continue)");
          kfRan -= kobeF;
          kfTotal = kobeF;
          cont = input.nextInt();
        }
        else
        {
          System.out.println("Invalid amount, please pick a valid amount.");
        }
      }while(valid == 1);
      
    }
    else if (shoe == 6)
    {
      
      do{
        System.out.println("How many Kobe 6's would you like?");
        kobeS = input.nextInt();
        if(kobeS <= ksRan)
        {
          System.out.println("Added to cart, would you like to continue to shop? (1 to checkout, 2 to continue)");
          ksRan -= kobeS;
          ksTotal = kobeS;
          cont = input.nextInt();
        }
        else
        {
          System.out.println("Invalid amount, please pick a valid amount.");
        }
      }while(valid == 1);  
    }
    else if (shoe > 6)
    {
      System.out.println("Please choose a valid shoe");
    }
    else
    {
      cont = 1;
    }
    }while(cont == 2);
    //create object and call method from a different class
    cart checkout = new cart (joTotal, jtTotal, jfTotal, ltoTotal, kfTotal, ksTotal);
    checkout.getMoney();
  }
}
    