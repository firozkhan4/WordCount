public class Count {

    private long lineCount;
    private long wordCount;
    private long characterCount;
    private long byteCount;
    private long characterCountWithoutSpace;

    public Count() {
    }

    public Count(long lineCount, long wordCount, long characterCount, long byteCount, long characterCountWithoutSpace) {
        this.lineCount = lineCount;
        this.wordCount = wordCount;
        this.characterCount = characterCount;
        this.byteCount = byteCount;
        this.characterCountWithoutSpace = characterCountWithoutSpace;
    }

    public long getCharacterCountWithoutSpace() {
        return characterCountWithoutSpace;
    }

    public void setCharacterCountWithoutSpace(long characterCountWithoutSpace) {
        this.characterCountWithoutSpace = characterCountWithoutSpace;
    }

    public long getLineCount() {
        return lineCount;
    }

    public void setLineCount(long lineCount) {
        this.lineCount = lineCount;
    }

    public long getWordCount() {
        return wordCount;
    }

    public void setWordCount(long wordCount) {
        this.wordCount = wordCount;
    }

    public long getCharacterCount() {
        return characterCount;
    }

    public void setCharacterCount(long characterCount) {
        this.characterCount = characterCount;
    }

    public long getByteCount() {
        return byteCount;
    }

    public void setByteCount(long byteCount) {
        this.byteCount = byteCount;
    }

    @Override
    public String toString() {
        return "Count [lineCount=" + lineCount + ", wordCount=" + wordCount + ", characterCount=" + characterCount
                + ", byteCount=" + byteCount + ", characterCountWithoutSpace=" + characterCountWithoutSpace + "]";
    }

}
