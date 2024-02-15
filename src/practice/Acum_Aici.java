package practice;

import java.util.Scanner;

public class Acum_Aici {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        float r=scanner.nextFloat();
        float x=(float)(r+10.5);
        System.out.println("x="+x);
        float y=x%2;
        System.out.println("x="+y);

        for(int i=2;i<=30;i++)
        {
            boolean divizibil=false;
            for(int j=2;j<i;j++) {
                if(i!=j && i%j==0) {
                    divizibil = true;
                    break;
                }
            }
            if(divizibil==false)
            System.out.println(i);
        }
    }

}
