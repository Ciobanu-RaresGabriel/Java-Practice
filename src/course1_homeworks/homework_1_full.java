package course1_homeworks;

import java.util.Scanner;

public class homework_1_full {
    public static void main(String[] args) {
        /*1. Scrieti un program care afiseaza “Imi place Java”
2. Scrieti un program care afiseaza de 6 ori propozitia “Cursul acesta este foarte fain!”3. Ana are 24 de ani. Fratele ei, David, e cu 6 ani mai mic. Scrieti un program care afiseaza varsta lui David.
4. Scrieti un program in care cititi o propozitie de la tastatura
5. Scrieti un program in care definiti 3 variabile in metoda “myVariables”, un int, un
String si un boolean, apoi apelati metoda din metoda “main”
6. Scrieti un program in care creati o metoda unde cititi 2 numere de la tastatura, le
stocati in variabile, si dupa ce le-ati citit, afisati-le pe ecran.
7. Scrieti un program incare cititi de la tastatura un numar, si
calculati:
- rezultatul sumei cu 5
- rezultatul scaderii cu 12.3
- rezultatul inmultirii cu -3.2
- rezultatul impartirii cu 4
- rezultatul modulului cu 6
8. Stergeti un singur comment din programul acesta in asa fel incat rezultatul afisat sa
fie 12 si 2:
public class Solution {
public static void main(String[] args) {
int x = 2;
int y = 12;

// y = x * y;
// y = x + y;

x = y - x;
y = y - x;

System.out.println(x);
System.out.println(y);
}
}
*/
        System.out.println("Imi place Java");

        for(int i=0;i<6;i++)
            System.out.println("Cursul acesta este foarte fain!");

        int Ana=24,David;
        David=Ana-6;
        System.out.println("David are varsta de "+David+" ani.");

        Scanner scanner=new Scanner(System.in);
        System.out.println("Introdu propozitia dorita: ");
        String text=scanner.nextLine();
        System.out.println("Textul introdus este: "+text);

        myVariables();
        inputvars();
        System.out.println("Introdu numarul asupra caruia urmeaza sa se faca 5 operatii:");
    float no= scanner.nextFloat();
    operations(no);

    /*
        Stergeti un singur comment din programul acesta in asa fel incat rezultatul afisat sa
        fie 12 si 2:
        public class Solution {
            public static void main(String[] args) {
                int x = 2;
                int y = 12;

        // y = x * y;
        // y = x + y;

                x = y - x;
                y = y - x;

                System.out.println(x);
                System.out.println(y);
                */

        int x = 2;
        int y = 12;

        // y = x * y;
        y = x + y;

        x = y - x;
        y = y - x;

        System.out.println(x);
        System.out.println(y);
    }
    public static void operations(float nr) {
        float q,w,e,r,t;
        q=nr+5;
        w= (float) (nr-12.3);
        e= (float) (nr*(-3.2));
        r=nr/4;
        t=nr%6;
        System.out.println(nr+"+5="+q);
        System.out.println(nr+"-12.3="+w);
        System.out.println(nr+"*(-12.3)="+e);
        System.out.println(nr+"/4="+r);
        System.out.println(nr+"%6="+t);
            }
   public static void myVariables() {
       int x = 27;
       String y = "Hellooo! X_X";
       boolean z= true;
       System.out.println("X="+x+"\nY="+y+"\nZ="+z);
   }
   public static void inputvars() {
        int a,b;
       Scanner scanner=new Scanner(System.in);
       System.out.println("Introdu valoarea variabilei a: ");
        a=scanner.nextInt();
       System.out.println("Introdu valoarea variabilei b: ");
        b=scanner.nextInt();
       System.out.println("Valorile introduse sunt:\na="+a+"\tb="+b);
   }
}
