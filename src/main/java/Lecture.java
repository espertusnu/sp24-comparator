public class Lecture {

    public static void printItems(String[] choices) {
        try {
            int i = 0;
            while (true) {
                System.out.println(i + ". " + choices[i]);
                i++;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            // All done!
        }
    }

    public static void main(String[] args) {
        String[] choices = { "Make cat sounds", "Show gifs" };
        printItems(choices);
    }

}
