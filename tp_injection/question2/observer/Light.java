package question2.observer;


import java.util.Observable;
import java.util.Observer;


public class Light extends Observable implements Receiver{
  private String state="Off";
  
  public void setObserver(Observer obs){
    this.addObserver(obs);
  }
  public void on(){
    if("Off".equals(getState())){
      state = "On";setChanged();notifyObservers();
    }
  }
  public void off(){
    if("On".equals(getState())){
      state = "Off";setChanged();notifyObservers();
    }
  }
  public String getState(){return state;}
}
