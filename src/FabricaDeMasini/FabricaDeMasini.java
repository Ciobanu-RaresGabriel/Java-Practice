package FabricaDeMasini;

public class FabricaDeMasini{
    public static void main(String[] args) {
        Masina defaultt=new Masina();
       Masina laalegere = new Masina("rosie","electrica",true,false,true);
        Masina Dacia=new Masina("albastra","hybrid", false, false, true);
        System.out.println("Masina aleasa este:\n*culoare: "+defaultt.getCuloare()+"\n*tip motorizare: "+ defaultt.getTipMotorizare()+"\n*navigatie: "+defaultt.isNavigatie()+"\n*senzori parcare: "+defaultt.isSenzoriParcare()+"\n*Cruise control: "+defaultt.isCruiseControl()+"\n_X_X_X_X_X_X_X_X_X_X_X_X_X_X_X_X_X_X_X_X_X_X_X_X_X_X");


        System.out.println("Masina aleasa este:\n*culoare: "+laalegere.getCuloare()+"\n*tip motorizare: "+ laalegere.getTipMotorizare()+"\n*navigatie: "+laalegere.isNavigatie()+"\n*senzori parcare: "+laalegere.isSenzoriParcare()+"\n*Cruise control: "+laalegere.isCruiseControl()+"\n_X_X_X_X_X_X_X_X_X_X_X_X_X_X_X_X_X_X_X_X_X_X_X_X_X_X");


        System.out.println("Masina aleasa este:\n*culoare: "+Dacia.getCuloare()+"\n*tip motorizare: "+ Dacia.getTipMotorizare()+"\n*navigatie: "+Dacia.isNavigatie()+"\n*senzori parcare: "+Dacia.isSenzoriParcare()+"\n*Cruise control: "+Dacia.isCruiseControl()+"\n_X_X_X_X_X_X_X_X_X_X_X_X_X_X_X_X_X_X_X_X_X_X_X_X_X_X");
    }
    
    
}
