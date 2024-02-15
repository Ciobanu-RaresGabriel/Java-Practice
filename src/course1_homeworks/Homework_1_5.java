package course1_homeworks;

public class Homework_1_5 {
    public static void main(String[] args) {
        int x=5,y=34,z=23;
        operation(x,y);
        operation(y,x);
        operation(x,z);
        operation(z,x);
        operation(z,y);
        operation(y,z);
    }
    public static void operation(int a,int b)
    {
        int sum;
        sum=a+b;
        System.out.println(+a+"+"+b+"="+sum);
        int dif=a-b;
        System.out.println(+a+"-"+b+"="+dif);
        int mult=a*b;
        System.out.println(+a+"*"+b+"="+mult);
        double div=(double)a/b;
        System.out.println(+a+"/"+b+"="+div);
        int rem=a%b;
        System.out.println(+a+"%"+b+"="+rem+"\n\n");
    }
}
