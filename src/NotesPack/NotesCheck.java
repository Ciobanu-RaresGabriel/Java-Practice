package NotesPack;

import java.util.Scanner;

import static NotesPack.Notes.index;

public class NotesCheck {
    public static void main(String[] args) {
        Notes maria=new Notes();
        Notes andrei=new Notes("Rezervarea biletelor asap");
        Notes cumparaturi=new Notes("fructe","mere, banane, vedem ce mai gasim acolo si ne face cu ochiul");

        System.out.println("Detalii ale notelor create:");
        maria.afisareNota();
        andrei.afisareNota();
        cumparaturi.afisareNota();


        Scanner scanner = new Scanner(System.in);
        System.out.println("Hai sa creăm un nou obiect.\nIntrodu titlul dorit : ");
        String titluNou = scanner.nextLine();
        System.out.println("Introdu continutul dorit: ");
        String continutNou = scanner.nextLine();

        Notes ObiectNou = new Notes(titluNou, continutNou);
        System.out.println("\n\nAi creat nota ce contine urmatorul titlu si urmatorul continut:\n");
        ObiectNou.afisareNota();

    }
}
