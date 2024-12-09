public class WordCount {

    private Count count;

    public WordCount() {
        count = new Count();
    }

    public void count(String line) {
        if (line == null) {
            System.err.println("Something went wrong");
            return;
        }

        lineCount();
        wordCount(line);
        characterCount(line);
        characterCountWithoutSpace(line);
        byteCount(line);
    }

    public Count getCount() {
        return count;
    }

    private void lineCount() {
        count.setLineCount(count.getLineCount() + 1);
    }

    private void wordCount(String line) {
        String[] words = line.trim().split("\\s+");
        count.setWordCount(count.getWordCount() + words.length);
    }

    private void characterCount(String line) {
        count.setCharacterCount(count.getCharacterCount() + line.length());
    }

    private void characterCountWithoutSpace(String line) {
        long nonSpaceCount = line.replace(" ", "").length();
        count.setCharacterCountWithoutSpace(count.getCharacterCountWithoutSpace() + nonSpaceCount);
    }

    private void byteCount(String line) {
        try {
            long totalCount = line.getBytes("UTF-8").length;
            count.setByteCount(count.getByteCount() + totalCount);
        } catch (Exception e) {
            System.err.println("Something went wrong");
        }
    }

}
