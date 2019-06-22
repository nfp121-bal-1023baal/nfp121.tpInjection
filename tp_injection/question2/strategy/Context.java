package question2.strategy;


public class Context {
   private Strategy strategy;

   public Context(Strategy strategy){
      this.strategy = strategy;
   }
   public Context(){}
   public void setStrategy(Strategy strategy){
      this.strategy = strategy;
   }

   public int executeStrategy(int a, int b){
      return strategy.action(a, b);
   }
}
