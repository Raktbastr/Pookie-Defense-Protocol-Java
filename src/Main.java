import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        String osName = System.getProperty("os.name");
        String username = System.getProperty("user.name");
        if (osName.contains("Mac")) {
            Files.createDirectories(Paths.get("/users/" + username + "/Documents/raes-files"));
            Files.createFile(Paths.get("/users/" + username + "/Documents/raes-files/plottodestroyandewlalko.txt"));
            Files.createFile(Paths.get("/users/" + username + "/Documents/raes-files/howtoSTEALpookie.txt"));
            Files.createFile(Paths.get("/users/" + username + "/Documents/raes-files/System32.txt"));
            Files.createFile(Paths.get("/users/" + username + "/Documents/raes-files/picture.txt"));
            Files.createDirectories(Paths.get("/users/" + username + "/Documents/raes-files/pookie-pics"));
            MACShell.main();
            Threats.main();
            Files.delete(Paths.get("/users/" + username + "/Documents/raes-files/plottodestroyandewlalko.txt"));
            TimeUnit.SECONDS.sleep(1);
            Files.delete(Paths.get("/users/" + username + "/Documents/raes-files/howtoSTEALpookie.txt"));
            TimeUnit.SECONDS.sleep(1);
            Files.delete(Paths.get("/users/" + username + "/Documents/raes-files/System32.txt"));
            TimeUnit.SECONDS.sleep(1);
            Files.delete(Paths.get("/users/" + username + "/Documents/raes-files/picture.txt"));
            TimeUnit.SECONDS.sleep(1);
            Files.delete(Paths.get("/users/" + username + "/Documents/raes-files/pookie-pics"));
            TimeUnit.SECONDS.sleep(1);
            Files.delete(Paths.get("/users/" + username + "/Documents/raes-files"));
            Threats2.main();
            System.out.println("So umm, i cant actually shutdown your computer from here, so could you kindly type 'sudo shutdown -h now' in the terminal pls :)");

        }
        if (osName.contains("Linux")) {
            Files.createDirectories(Paths.get("/home/" + username + "/Documents/raes-files"));
            Files.createFile(Paths.get("/home/" + username + "/Documents/raes-files/plottodestroyandewlalko.txt"));
            Files.createFile(Paths.get("/home/" + username + "/Documents/raes-files/howtoSTEALpookie.txt"));
            Files.createFile(Paths.get("/home/" + username + "/Documents/raes-files/System32.txt"));
            Files.createFile(Paths.get("/home/" + username + "/Documents/raes-files/picture.jpg"));
            Files.createDirectories(Paths.get("/home/" + username + "/Documents/raes-files/pookie-pics"));
            LinuxShell.main();
            Threats.main();
            Files.delete(Paths.get("/home/" + username + "/Documents/raes-files/plottodestroyandewlalko.txt"));
            TimeUnit.SECONDS.sleep(1);
            Files.delete(Paths.get("/home/" + username + "/Documents/raes-files/howtoSTEALpookie.txt"));
            TimeUnit.SECONDS.sleep(1);
            Files.delete(Paths.get("/home/" + username + "/Documents/raes-files/System32.txt"));
            TimeUnit.SECONDS.sleep(1);
            Files.delete(Paths.get("/home/" + username + "/Documents/raes-files/picture.jpg"));
            TimeUnit.SECONDS.sleep(1);
            Files.delete(Paths.get("/home/" + username + "/Documents/raes-files/pookie-pics"));
            TimeUnit.SECONDS.sleep(1);
            Files.delete(Paths.get("/home/" + username + "/Documents/raes-files"));
            Threats2.main();
            System.out.println("So umm, i cant actually shutdown your computer from here, so could you kindly type 'sudo shutdown -h now' in the terminal pls :)");
        }
        if (osName.contains("Windows")) {
            Files.createDirectories(Paths.get("C:\\Users\\" + username + "\\Documents\\raes-files"));
            Files.createFile(Paths.get("C:\\Users\\" + username + "\\Documents\\raes-files\\plottodestroyandrewlalko.txt"));
            Files.createFile(Paths.get("C:\\Users\\" + username + "\\Documents\\raes-files\\howtoSTEALpookie.txt"));
            Files.createFile(Paths.get("C:\\Users\\" + username + "\\Documents\\raes-files\\System32.txt"));
            Files.createFile(Paths.get("C:\\Users\\" + username + "\\Documents\\raes-files\\picture.jpg"));
            Files.createDirectories(Paths.get("C:\\Users\\" + username + "\\Documents\\raes-files\\pookie-pics"));
            WinShell.main();
            Threats.main();
            Files.delete(Paths.get("C:\\Users\\" + username + "\\Documents\\raes-files\\plottodestroyandrewlalko.txt"));
            TimeUnit.SECONDS.sleep(1);
            Files.delete(Paths.get("C:\\Users\\" + username + "\\Documents\\raes-files\\howtoSTEALpookie.txt"));
            TimeUnit.SECONDS.sleep(1);
            Files.delete(Paths.get("C:\\Users\\" + username + "\\Documents\\raes-files\\System32.txt"));
            TimeUnit.SECONDS.sleep(1);
            Files.delete(Paths.get("C:\\Users\\" + username + "\\Documents\\raes-files\\picture.jpg"));
            TimeUnit.SECONDS.sleep(1);
            Files.delete(Paths.get("C:\\Users\\" + username + "\\Documents\\raes-files\\pookie-pics"));
            TimeUnit.SECONDS.sleep(1);
            Files.delete(Paths.get("C:\\Users\\" + username + "\\Documents\\raes-files"));
            Threats2.main();
            WinShell.shutdown();
        }
}

class WinShell {
    static void main() {
        String username = System.getProperty("user.name");
        ProcessBuilder winpb = new ProcessBuilder();
        winpb.command("cmd.exe", "/c", "start C:\\Users\\" + username + "\\Documents\\raes-files");
    }
    static void shutdown() throws IOException {
        String shutdownCmd = "shutdown -s";
        Process child = Runtime.getRuntime().exec(shutdownCmd);
    }
    } 
class MACShell {
    static void main() {
        String username = System.getProperty("user.name");
        ProcessBuilder macpb = new ProcessBuilder();
        macpb.command("zsh", "-c", "open /users/" + username + "/Documents/raes-files");
    }
}
class LinuxShell {
    static void main() {
        String username = System.getProperty("user.name");
        ProcessBuilder linuxpb = new ProcessBuilder();
        linuxpb.command("bash", "-c", "open /home/" + username + "/Documents/raes-files");
    }
}
class Threats {
    static void main() throws InterruptedException {
        System.out.println("HA, it is I... ANDREW LALKO, and I have infected your computer with the POOKIE DEFENSE PROTOCOL!!!!!! MUAH HA HA!");
        TimeUnit.SECONDS.sleep(5);
        System.out.println("For trying to steal my pookie i am going to delete all of your files and RESET your computer!!!!");
        TimeUnit.SECONDS.sleep(5);
        System.out.println("DELETING FILES...");
    }
    }
class Threats2 {
    static void main() throws InterruptedException {
        System.out.println("DELETING DONE");
        TimeUnit.SECONDS.sleep(5);
        System.out.println("NOW YOUR COMPUTER IS GOING TO SHUT DOWN!!!");
        TimeUnit.SECONDS.sleep(5);
        System.out.println("heh, consider your device... HACKED");
    }
    }
}