package question2.strategy;


public class Pow implements Strategy
{
  
   public int action(int n1, int n2) 
   {
       return (int)Math.pow(n1,n2);
      
   }
   
   
}
