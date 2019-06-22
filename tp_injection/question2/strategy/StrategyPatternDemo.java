package question2.strategy;


public class StrategyPatternDemo {
   public static void main(String[] args) {
      Context context = new Context(new Addition());		
      System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

      context = new Context(new Multiplication());		
      System.out.println("10 * 5 = " + context.executeStrategy(10, 5));

      
      context = new Context(new Pow());		
      System.out.println("10 pow 5 = " + context.executeStrategy(10, 5));
      
      context = new Context(new Modulo());		
      System.out.println("10 % 5 = " + context.executeStrategy(10, 5));
   }
}