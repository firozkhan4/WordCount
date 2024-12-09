# Word Count Project

This is a **Word Count Tool** developed in **Java**, designed for efficient and accurate text analysis. The tool supports processing multiple files and leverages multithreading for optimized performance. It provides detailed counts of words, lines, characters, and bytes for UTF-8 encoding.

---

## Features

### 1. **Multi-File Processing:**

- Analyze multiple text files in a single run.
- Display combined results or individual statistics for each file.

### 2. **Counts Provided:**

- **Lines**: Total number of lines in the file.
- **Words (With Spaces)**: Word count including all delimiters.
- **Words (Without Spaces)**: Word count excluding delimiters.
- **Characters**: Total number of characters.
- **Bytes (UTF-8)**: Total file size in bytes.

### 3. **Multithreading:**

- Multithreading is used to process multiple files simultaneously for improved performance.
- Ensures optimal resource usage for large datasets.

### 4. **Customizable Options:**

- Display results for each file

---

## Getting Started

### 1. **Clone the Repository:**

```bash
git clone https://github.com/firozkhan4/word-count.git
cd WordCount
```

### 2. **Compile the Source Code:**

```bash
javac -d bin src/*.java
```

### 3. **Run the Application:**

```bash
java -cp bin App
```

---

## Usage

### Command-Line Instructions:

1. **Single File Input:**

   ```bash
   java -cp bin App <file-path>
   ```

2. **Multi-File Input:**
   ```bash
   java -cp bin App <file1-path> <file2-path> ... <fileN-path>
   ```

---

## Output Example:

For a sample file, the output might look like this:

```
File: sample.txt
Lines: 120
Words (With Spaces): 2500
Words (Without Spaces): 2400
Characters: 15000
Bytes (UTF-8): 15200

```

---

## Dependencies

- **Java SE Development Kit (JDK)**: Version 8 or later.
- No additional libraries required.

---

## Future Enhancements

- Add a graphical user interface (GUI) for easier usage.
- Support for different file encodings.
- Include visual charts for data representation.
- Output results to CSV or JSON files for further analysis.

---

## Author

Developed by **[Firoz Khan](https://github.com/firozkhan4)**  
&copy; 2024

If you find this project helpful, feel free to ⭐️ the repository!

---

## License

This project is open-source and available under the [MIT License](https://opensource.org/licenses/MIT).
