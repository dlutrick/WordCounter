import java.io.File;
import java.util.Scanner;
public class WordCounter {
    public static void main(String[] args) throws Exception {
        File file = new File("The-Story-of-King-Arthur-and-his-Knights.txt");
        Scanner scanner = new Scanner(file);
        int total = 0;
        while(scanner.hasNextLine()) {
            String line = scanner.nextLine();
            total += line.split(" ").length;
        }
        System.out.println("The Story of King Arthur and his Knights has a total of " + total + " words.");
    }
}
