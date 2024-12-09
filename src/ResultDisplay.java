import java.io.File;

public class ResultDisplay {

    public synchronized static void showResult(File file, Count result) {

        System.out.println("Results for file: " + file.getName());
        System.out.println("Line Count: " + result.getLineCount());
        System.out.println("Word Count: " + result.getWordCount());
        System.out.println("Character Count (with spaces): " + result.getCharacterCount());
        System.out.println("Character Count (without spaces): " + result.getCharacterCountWithoutSpace());
        System.out.println("Byte Count (UTF-8): " + result.getByteCount());
        System.out.println();
    }
}
