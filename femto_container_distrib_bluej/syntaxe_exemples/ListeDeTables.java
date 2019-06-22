package syntaxe_exemples;

import java.util.*;
/** Un usage 'd�tourn�' de l'appel du mutateur.
 *  L'appel du mutateur ajoute le param�tre transmis � une liste interne.
 */

public class ListeDeTables{
    private List<Table> liste;
    public ListeDeTables(){
        this.liste = new ArrayList<Table>();
    }
    public void setTable(Table t){
        liste.add(t);
        //System.out.println("add(t): " + t);
    }
    public void setTables(Table[] tables){
        for(Table t:tables)
          
          setTable(t);
    }
    public int taille(){
        return liste.size();
    }
    public String toString(){
        return this.liste.toString();
    }
}
