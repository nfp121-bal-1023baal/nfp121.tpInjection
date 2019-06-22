package martin_fowler;

import java.util.*;

public class SemiColonMovieFinder implements MovieFinder {
  private String filename;
  
  public SemiColonMovieFinder() {
  
  }
  
  public void setFilename(String filename) {
    this.filename = filename;
  }
  
  public List<Movie> findAll(){
      System.out.println("SemiColonMovieFinder ...");
    List<Movie> list = new ArrayList<Movie>();
    // 
    list.add(new Movie("Dans les for�ts de Sib�rie","NEBBOU Safy"));
    list.add(new Movie("Demain","LAURENT M�lanie / DION Cyril"));
    list.add(new Movie("Once Upon a Time in the West","Sergio Leone"));
    return list;
  }
  
  public String toString(){
    return "ColonMovieFinder";
  }
}
