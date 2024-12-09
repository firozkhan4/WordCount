import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileProcessor extends Thread {

    public Count processFile(File file) {
        WordCount wordCount = new WordCount();

        try (Scanner reader = new Scanner(file)) {
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                wordCount.count(line);
            }
        } catch (IOException e) {
            System.err.println("Error processing file: " + file.getName());
            System.err.println("Reason: " + e.getMessage());
        }

        return wordCount.getCount();
    }
}
