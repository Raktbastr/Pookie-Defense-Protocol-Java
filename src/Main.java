import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void getuser(String[] args) {
        String username = System.getProperty("user.name");
    }

    public static void main(String[] args) throws IOException {
        String osName = System.getProperty("os.name");
        if (osName.contains("Mac")) {
            Path path = Paths.get("~/Documents/raes-files");
            Files.createDirectories(path);
            File file1 = new File("~/Documents/raes-files/plottodestroyandewlalko.txt");
            File file2 = new File("~/Documents/raes-files/howtoSTEALpookie.txt");
            File file3 = new File("~/Documents/raes-files/System32.txt");
            File file4 = new File("~/Documents/raes-files/picture.txt");
            Files.createDirectories(Paths.get("~/Documents/raes-files/pookie-pics"));
            MACRunner.main();

        }
        if (osName.contains("Linux")) {
            Files.createDirectories(Paths.get("~/Documents/raes-files"));
            File file1 = new File("~/Documents/raes-files/plottodestroyandewlalko.txt");
            File file2 = new File("~/Documents/raes-files/howtoSTEALpookie.txt");
            File file3 = new File("~/Documents/raes-files/System32.txt");
            File file4 = new File("~/Documents/raes-files/picture.jpg");
            Files.createDirectories(Paths.get("~/Documents/raes-files/pookie-pics"));
            LinuxRunner.main();
        }
        if (osName.contains("Windows")) {
            Files.createDirectories(Paths.get("C:\\Users\\" + username + "\\Documents\\raes-files"));
            File file1 = new File("C:\\Users\\" + username + "\\Documents\\raes-files\\plottodestroyandrewlalko.txt");
            File file2 = new File("C:\\Users\\" + username + "\\Documents\\raes-files\\howtoSTEALpookie.txt");
            File file3 = new File("C:\\Users\\" + username + "\\Documents\\raes-files\\System32.txt");
            File file4 = new File("C:\\Users\\" +  + "\\Documents\\raes-files\\picture.jpg");
            Files.createDirectories(Paths.get("C:\\Users\\" + username + "\\Documents\\raes-files\\pookie-pics"));
            CMDRunner.main();
        }
    }
    static void main() {
        ProcessBuilder winpb = new ProcessBuilder();
        winpb.command("cmd.exe", "/c", "start C:\\Users\\" +  + "\\Documents\\raes-files");
    }
}

class CMDRunner {
    static void main() {
        ProcessBuilder winpb = new ProcessBuilder();
        winpb.command("cmd.exe", "/c", "start C:\\Users\\" + username + "\\Documents\\raes-files");
    }
}
class MACRunner {
    static void main() {
        ProcessBuilder macpb = new ProcessBuilder();
        macpb.command("zsh", "-c", "open ~/Documents/raes-files");
    }
}
class LinuxRunner {
    static void main() {
        ProcessBuilder linuxpb = new ProcessBuilder();
        linuxpb.command("bash", "-c", "open ~/Documents/raes-files");
    }
}
