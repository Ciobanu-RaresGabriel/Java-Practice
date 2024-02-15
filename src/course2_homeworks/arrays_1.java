package course2_homeworks;

import java.util.Scanner;

public class arrays_1 {
    public static void main(String[] args) {
        String text="Java Language";
      //  int car_len=text.length();
       // Scanner scanner=new Scanner(System.in);

       // char c =scanner.next();
char c='v';
        // Verificarea dacă caracterul se află în șir
        boolean exista = text.contains(String.valueOf(c));

        // Afișarea rezultatului
        if (exista) {
            System.out.println("Caracterul '" + c + "' se află în șir.");
        } else {
            System.out.println("Caracterul '" + c + "' nu se află în șir.");
        }
    }
}
