
import users.User;
import users.UserLogs;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String asciiLogo = """
                 ____  __  __ _  ____  _  _   __   ____  ____\s
                (  __)╱  ╲(  ╱ )╱ ___)╱ )( ╲ ╱ _╲ (  _ ╲(  __)
                 ) _)(  O ))  ( ╲___ ╲╲ ╱╲ ╱╱    ╲ )   ╱ ) _)\s
                (__)  ╲__╱(__╲_)(____╱(_╱╲_)╲_╱╲_╱(__╲_)(____)
            """;
        System.out.println(asciiLogo);

        // 2. Включаем сканер для ввода
        Scanner scanner = new Scanner(System.in);

        System.out.print("login: ");
        String inputLogin = scanner.nextLine();

        System.out.print("password: ");
        String inputPassword = scanner.nextLine();

        Loader loader = new Loader();
        loader.startLoading();
        System.out.println();


        UserLogs matchedLog = null;


        for (UserLogs log : UserLogs.values()) {

            if (log.login.equals(inputLogin) && log.password.equals(inputPassword)) {
                matchedLog = log;
                break;
            }
        }


        if (matchedLog != null) {
            User currentUser = new User(matchedLog.login, matchedLog.role.name());
            System.out.println("Welcome back! " + currentUser.username);
            System.out.println("comands: sys - information about client  | donate - pls | logout - leave");
            boolean sessionActive = true;

            while (sessionActive) {
                String command = scanner.nextLine();

                if(command.equals("sys")) {
                    System.out.println("User: " + currentUser.username);
                    System.out.println("Uid: " + currentUser.uid);
                    System.out.println("Role: " + currentUser.role);
                } else if (command.equals("logout")) {
                    System.out.println("\nleave in acс:" + currentUser.username + "... \n");
                    System.out.println("bye bye!");
                    sessionActive = false;
                } else if (command.equals("donate")) {
                    System.out.println("https://www.donationalerts.com/r/aetheria");
                    System.out.println("pls pls pls i need it((((");
                    System.out.println("alt link: https://www.donationalerts.com/c/aetheria");
                } else {
                    System.out.println("incorrect command");
                }
            }

        } else {

            System.out.println("[AUTH ERROR] Incorrect data (dolbaeb?)");
        }
    }
}
