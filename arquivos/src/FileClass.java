import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileClass {
    public static void main(String[] args) {

        //Representação abstrata de um arquivo e seu caminho
        File file = new File("C:\\temp\\in.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            if (sc != null) {
                sc.close();
            }
        }
    }
}

