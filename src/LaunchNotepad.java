import java.io.IOException;
import java.util.Scanner;

//1. metoda care verifica compatbilitatea user-parola; 2 - metoda care ruleaza notepad
public class LaunchNotepad{
    //db
    String user = "Mihai";
    String parola = "password1";

    public static void main(String[] args) {
        Main method = new Main();

    }


    public void framework() {
        boolean nimerit = false;
        while (!nimerit) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter Username: ");
            String u = scanner.nextLine();
            System.out.print("Enter Password: ");
            String p = scanner.nextLine();
            nimerit = checkUsrPass(u, p);
            if (nimerit) {
                launch();
                break;
            } else {
                System.out.println("\n Username or password is incorrect. Try again. \n");
            }

        }
    }

    public boolean checkUsrPass(String a, String b) {
//
        if (a.equals(user) && b.equals(parola)) {
            System.out.println("\n Welcome, " + a);
            System.out.println("\n");
            return true;
        } else {
            return false;
        }
//        //returneaza true daca is alea din db

    }

    public static void launch() {
        try {
            ProcessBuilder pb = new ProcessBuilder("Notepad.exe");
            pb.start();
        } catch (IOException e) {
        }
    }
}
