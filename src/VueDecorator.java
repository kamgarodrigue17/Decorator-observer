public abstract class VueDecorator  extends Vue{
    Vehicule Vehicule;
    Vue vue;
    
    

    public VueDecorator() {
    }
    

    


    public VueDecorator(Vehicule vehicule, Vue vue) {
        Vehicule = vehicule;
        this.vue = vue;
        
    }





    public VueDecorator(Vue vue ){
        this.vue = vue;
        }





    @Override
    public void actualiser() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actualiser'");
    }

    @Override
    public void redessiner() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'redessiner'");
    }
    
}
