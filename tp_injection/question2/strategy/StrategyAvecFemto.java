package question2.strategy;

import container.*;

public class StrategyAvecFemto
 {
   public static void main(String[] args) throws Exception{
      ApplicationContext ctx = Factory.createApplicationContext("./question2/patron_strategie/README.TXT");
      Context context = ctx.getBean("contextAdd");
      System.out.println("3 + 4 = " + context.executeStrategy(3, 4));
      
      context =  ctx.getBean("contextMod");
      System.out.println("12 % 4 = " + context.executeStrategy(12, 4));
      
      context =  ctx.getBean("contextPow");
      System.out.println("12 pow 4 = " + context.executeStrategy(12, 4));
 	
      context =  ctx.getBean("contextMul");
      System.out.println("12 * 4 = " + context.executeStrategy(12, 4));
   }
}
