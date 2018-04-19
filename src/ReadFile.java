import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;


public class ReadFile {
    public static void main(String[] args) throws IOException {
        try (PrintWriter out = new PrintWriter("C:\\Users\\HP\\IdeaProjects\\readOnFile\\mifile.txt", "UTF-8")){
            out.print("Привет!!!! Я записал это в файл при помощи программы");
        }

        Scanner in = new Scanner(Paths.get("C:\\Users\\HP\\IdeaProjects\\readOnFile\\mifile.txt"), "UTF-8");
        System.out.println(in.nextLine());

        }

    }

