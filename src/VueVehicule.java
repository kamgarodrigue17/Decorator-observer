public class VueVehicule  extends  Vue{
    Vehicule Vehicule;
    @Override
    public void actualiser( ) {
        redessiner();
        System.out.println(Vehicule.toString());
    }
    
   public VueVehicule(Vehicule Vehicule) {
        this.Vehicule = Vehicule;
    }
    public VueVehicule() {
        
    }



public void redessiner(){
    System.out.println(" actualisation de la page vue vehicule  ");
  
 
    }
}
