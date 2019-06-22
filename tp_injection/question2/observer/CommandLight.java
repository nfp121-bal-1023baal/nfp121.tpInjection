package question2.observer;





public class CommandLight implements Command{
  private Light light;
  public void setLight(Light light){
    this.light = light;
  }
  public void execute(){ light.on();}
  public void undo(){light.off();}
}
