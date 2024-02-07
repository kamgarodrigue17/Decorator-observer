import java.util.ArrayList;


public class Sujet  {
 protected   ArrayList<Observeur> observers= new ArrayList<Observeur>();

    public void ajoute(Observeur ob){
        observers.add(ob);
    }
    public void retirer(Observeur ob){
        observers.remove(ob);
    }

    public void notifie(){
        observers.forEach((Observeur ob)->{
            ob.actualiser();

        });
    }
    
}
