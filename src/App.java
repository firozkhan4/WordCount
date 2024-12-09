import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        if (args.length == 0) {
            System.err.println("No file paths provided.");
            return;
        }

        File file = new File(args[0]);

        if (!file.exists() || !file.isFile()) {
            System.err.println("Invalid File Path: " + args[0]);
            return;
        }

        System.out.println("Processing file: " + args[0]);
        processFile(file);
    }

    public static void processFile(File file) {
        WordCount wc = new WordCount();

        try (Scanner reader = new Scanner(file)) {

            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                wc.count(line);
            }
        } catch (IOException e) {
            System.err.println("Something went wrong: " + e.getMessage());
        }

        showResult(file, wc.getCount());
    }

    public static void showResult(File file, Count result) {

        System.out.println("Results for file: " + file.getName());
        System.out.println("Line Count: " + result.getLineCount());
        System.out.println("Word Count: " + result.getWordCount());
        System.out.println("Character Count (with spaces): " + result.getCharacterCount());
        System.out.println("Character Count (without spaces): " + result.getCharacterCountWithoutSpace());
        System.out.println("Byte Count (UTF-8): " + result.getByteCount());
        System.out.println();
    }

}
