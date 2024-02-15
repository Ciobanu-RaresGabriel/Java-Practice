package course1_homeworks;

public class Homework_1_4 {
    public static void main(String[] args) {
        int a=-10,b=3,c=7,d=45,e=5,f=2,g=20,h=-3,i=25,j=6,k=8;
        int result=a+b+c;
        System.out.println("a+b+c="+a+"+"+b+"+"+c+"="+result);
        int result2=(d+e)%b;
        System.out.println("(34+5)%3="+result2);
        result2=(d+e)%f;
        System.out.println("(34+5)%2="+result2);
        float result3=g+(float)(h*e)/f;
        System.out.println("(20+-3*5/2="+result3);
        int result4=e+((i/e)*2)-((j*k)%f);
        System.out.println("5+25/5*2-6*8%2="+result4);

    }
}
