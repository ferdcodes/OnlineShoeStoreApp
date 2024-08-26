public class cart
{
  //create private variables
  private int jOne = 0, jThree = 0, jFour, lTO = 0, kobeS = 0, kobeE = 0, total = 0;
  
  //constructor
  public cart(int jo,int jt, int jf, int lt, int ke, int ks)
  {
    jOne = jo * 140; 
    jThree = jt * 250;
    jFour = jf * 275;
    lTO = lt * 125 ;
    kobeE = ke * 225;
    kobeS = ks * 400;
  }
  public void getMoney()
  {
    total = jOne + jThree + jFour + lTO + kobeE + kobeS;
    
    System.out.println("Your total is: $" + total  +"!");
  }
}