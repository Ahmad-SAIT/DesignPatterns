package compositepattern;

/**
 *
 * @author ahxxm
 */
public class FileSystemCompositeExample {
    public static void main(String[] args) {
        // Creating individual files
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");


        // Creating directories and adding files to them
        Directory documentsDir = new Directory("Documents");
        // Files inside the Documents DIR
        documentsDir.addComponent(file1);
        documentsDir.addComponent(file2);


        // Creating the main file system structure
        Directory rootDir = new Directory("Root");
        rootDir.addComponent(documentsDir);


        // Displaying the file system structure
        rootDir.showDetails();
    }
}

