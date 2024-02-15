package NotesPack;

public class Notes {
    public static int index=0;
    public String titlu;
    public String continut;

    public Notes(String titlu,String continut){
        this.titlu=titlu;
        this.continut=continut;
       // this.index=index;
        index++;
    }

    public Notes(String titlu){
        this.titlu=titlu;
        continut="default";
      //  this.index=index;
        index++;
    }

    public Notes(){
        this.titlu="default";
        this.continut="default";
       // this.index=index;
        index++;
    }

    public void afisareNota() {
        System.out.println("Titlu: " + this.titlu);
        System.out.println("Continut: " + this.continut);
        System.out.println("---------------------------------------");
    }
}
