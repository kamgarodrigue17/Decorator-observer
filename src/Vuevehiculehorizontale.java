public class Vuevehiculehorizontale extends VueDecorator {
    public Vuevehiculehorizontale(){

    }
    public Vuevehiculehorizontale( Vehicule Vehicule,Vue vue){
        super(Vehicule, vue);
    }


    @Override
    public void actualiser() {
        redessiner() ;
        System.out.println(Vehicule.toString());
    }

    @Override
    public void redessiner() {
        vue.redessiner();
        System.out.println(" defilement des vehicules de maniere horizontal");
   
    }


}
