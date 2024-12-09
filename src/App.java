import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App {
    public static void main(String[] args) throws Exception {
        if (args.length == 0) {
            System.err.println("No file paths provided.");
            return;
        }

        int numberOfThreads = Runtime.getRuntime().availableProcessors();
        ExecutorService executor = Executors.newFixedThreadPool(numberOfThreads);

        for (var filePath : args) {

            File file = new File(filePath);

            if (!FileValidator.isValidFile(file)) {
                System.err.println("Invalid File Path: " + filePath);
                continue;
            }

            executor.submit(() -> {
                processFile(file);
            });

        }

        executor.shutdown();
    }

    public static void processFile(File file) {
        FileProcessor fileProcessor = new FileProcessor();
        Count result = fileProcessor.processFile(file);
        ResultDisplay.showResult(file, result);
    }

}
