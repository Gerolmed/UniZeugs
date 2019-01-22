import java.io.*;
import java.util.ArrayList;

public class TextAnalyst {

    public static String filterString(String text) {
        String copy = text.toLowerCase();
        StringBuilder filteredString = new StringBuilder();

        for(int i = 0; i < copy.length(); i++) {
            char character = copy.charAt(i);
            if(character <= 'z' && character >= 'a')
                filteredString.append(copy.charAt(i));
        }

        return filteredString.toString();
    }

    public static int[] calculateLetterFrequency(String text) {
        int[] frequency = new int[26];

        for (char character : filterString(text).toCharArray()) {
            frequency[character-'a'] += 1;
        }

        return frequency;
    }

    public static ArrayList<Node> getUniqueLetters(int[] letterFrequency) {

        ArrayList<Node> nodes = new ArrayList<>();

        for(int i = 0; i < letterFrequency.length; i++) {
            if(letterFrequency[i] <= 0)
                continue;

            Node node = new Node();
            node.setLetter((char) (i+'a'));
            node.setFrequency(letterFrequency[i]);

            nodes.add(node);
        }

        return nodes;
    }

    public static String convertFileToString(String fileName) {
        File file = new File(fileName);

        StringBuilder text = new StringBuilder();

        try {
            FileReader fileReader = new FileReader(file);

            int i;
            while ((i=fileReader.read()) != -1)
                text.append((char) i);


        } catch (IOException e) {
            System.out.println("Could't find/read the file");
            return null;
        }

        return text.toString();
    }

    public static void main (String[] args) {

        for(Node node : getUniqueLetters(calculateLetterFrequency("Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet."))) {
            System.out.println(node.getLetter() + ": " + node.getFrequency());
        }
    }

}
