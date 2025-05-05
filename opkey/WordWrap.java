import java.util.Scanner;

public class WordWrap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a paragraph:");
        String paragraph = scanner.nextLine();

        wrapParagraph(paragraph, 10);
        scanner.close();
    }

    public static void wrapParagraph(String paragraph, int maxLength) {
        
        String[] words = paragraph.split("\\s+");
        StringBuilder line = new StringBuilder();

        if(words.length>1){

            for (String word : words) {
                // If word itself is longer than maxLength, break the word
                while (word.length() > maxLength) {
                    if (line.length() > 0) {
                        System.out.println(line);
                        line.setLength(0); // clear line
                    }
                    System.out.println(word.substring(0, maxLength));
                    word = word.substring(maxLength);
                }
    
                if (line.length() + word.length() + (line.length() > 0 ? 1 : 0) <= maxLength) {
                    if (line.length() > 0) {
                        line.append(" ");
                    }
                    line.append(word);
                } else {
                    System.out.println(line);
                    line = new StringBuilder(word);
                }
            }


            // Print the last line if any
            if (line.length() > 0) {
                System.out.println(line);
            }

        }

        else{

            int i = 0;
            while (i < paragraph.length()) {
                int end = Math.min(i + maxLength, paragraph.length());
                // Print 50 characters or the remaining characters
                System.out.println(paragraph.substring(i, end));
                i = end;
            }

        }
        
        
    }
}
