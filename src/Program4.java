import javax.print.attribute.standard.Fidelity;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a file path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        System.out.println("GetName: " + path.getName());
        System.out.println("GetParent: " + path.getParent());
        System.out.println("GetPath: " + path.getPath());
        System.out.println("GetCanonicaPath: " + path.getCanonicalPath());
    }
}
