import java.io.File;
public class Filehandling {
    public static void main(String[] args) {
        File folder = new File("/home/chandru/prp/java");
        File[] folders = folder.listFiles(File::isDirectory);
        File[] javaFiles = folder.listFiles(
            file -> file.isFile() && file.getName().endsWith(".java")
        );
        System.out.println("Folders:");
        for (File file : folders) {
            System.out.println(file.getName());
        }
        System.out.println("\nJava Files:");
        for (File file : javaFiles) {
            System.out.println(file.getName());
        }
    }
}

