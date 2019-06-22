package question2.observer;


import java.util.*;

public class LightObserver implements Observer{
    public int compte;

    public void update(Observable o, Object obj){
      compte++;
    }
}
