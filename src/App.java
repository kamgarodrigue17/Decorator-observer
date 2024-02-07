public class App {
    public static void main(String[] args) throws Exception {
        VueVehicule  vueVehicule=new VueVehicule();
        Vehicule vehicule=new Vehicule("ma voitue", "toyota", "rouge", "descrrtrtt", 0, 7500);
        vehicule.ajoute(vueVehicule);
        vueVehicule.Vehicule=vehicule;
        vehicule.setCouleur("vert");


        //decoration de la classe VueVehicule  avec defilement vertical
        vehicule.retirer(vueVehicule);

        VuevehiculeVerticale vuevehiculeVerticale=new VuevehiculeVerticale(vehicule,vueVehicule);
   vehicule.ajoute(vuevehiculeVerticale);
        vehicule.setCouleur("jaunatre");

        //decoration de la classe VueVehicule  avec defilement horizontal
        vehicule.retirer(vuevehiculeVerticale);

        Vuevehiculehorizontale  vuevehiculehorizontale=new Vuevehiculehorizontale(vehicule,vueVehicule);
   vehicule.ajoute(vuevehiculehorizontale);
        vehicule.setCouleur("maron");
    }
}
