package FabricaDeMasini;

public class Masina {
    private String culoare;
    private String tipMotorizare;
    public int an;

    private boolean Navigatie;
    private boolean senzoriParcare;
    private boolean cruiseControl;

    public Masina(String tipMotorizare){
        culoare="Default";
        this.tipMotorizare=tipMotorizare;
        Navigatie=false;
        senzoriParcare=false;
        cruiseControl=false;
        an=1999;
    }

    public Masina()
    {
        culoare="Default";
        tipMotorizare="Hybrid";
        senzoriParcare=false;
        cruiseControl=false;
    }

    public Masina(String culoare,String tipMotorizare, boolean Navigatie, boolean senzoriParcare, boolean cruiseControl){
        this.culoare = culoare;
        this.tipMotorizare = tipMotorizare;
        this.Navigatie=Navigatie;
        this.senzoriParcare = senzoriParcare;
        this.cruiseControl = cruiseControl;
    }

    public String getCuloare() {
        return culoare;
    }

    public String getTipMotorizare() {
        return tipMotorizare;
    }

    public boolean isNavigatie() {
        return Navigatie;
    }

    public boolean isSenzoriParcare() {
        return senzoriParcare;
    }

    public boolean isCruiseControl() {
        return cruiseControl;
    }


}

