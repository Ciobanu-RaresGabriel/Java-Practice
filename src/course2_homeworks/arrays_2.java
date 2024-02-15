package course2_homeworks;

public class arrays_2 {
    public static void main(String[] args) {
        String letscheck = "Java Language";
        char c = 'e';

        boolean sufix = letscheck.endsWith(String.valueOf(c));



        if (sufix) {
            System.out.println("Da, sirul se termina cu caracterul " + c);
        } else {
            System.out.println("Nu, sirul nu se termina cu caracterul " + c);
        }
    }
}
