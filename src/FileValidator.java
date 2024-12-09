import java.io.File;

public class FileValidator {

    public static boolean isValidFile(File file) {
        return (file.exists() && file.isFile());
    }

}
