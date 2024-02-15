package course2_homeworks;

public class arrays_7 {
    public static void main(String[] args) {
        String sir = "Am vrut sa mergem in Turcia.";
        String[] words = sir.split(" ");

        // Afișarea cuvintelor rezultate
        for (String word : words) {
            System.out.println(word);
        }
    }
}
