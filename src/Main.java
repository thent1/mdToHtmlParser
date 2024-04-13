import java.io.FileNotFoundException;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws Exception {
        String mdFilePath;
        String outputFilePath;
        boolean outArgSuccesCondition = (args.length == 3 && args[1].equals("--out"));

        if (args.length == 0) {
            System.out.println("Enter arguments for program");
        } else if (args.length == 1) {
            mdFilePath = args[0];
            stdOut(mdFilePath);
        } else if (outArgSuccesCondition) {
            mdFilePath = args[0];
            outputFilePath = args[2];
            saveAsFile(mdFilePath, outputFilePath);
        } else {
            System.out.println("Wrong arguments");
        }


    }

    public static void stdOut(String filePath) throws Exception {
        String fileText = FileScanner.toString(filePath);
        String[] output = Editor.mdToHtmlStringArr(fileText);
        outputStrings(output);
    }

    public static void saveAsFile(String filePath, String outputPath) throws Exception {
        String fileText = FileScanner.toString(filePath);
        String output = Editor.mdToHtmlString(fileText);
        FileSaver.stringToFile(output, outputPath);
    }
    public static void outputStrings(String[] array) {
        for (String str : array) {
            System.out.println(str);
        }
    }
}