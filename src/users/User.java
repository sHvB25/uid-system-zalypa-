package users;

public class User {

    private static int idCounter = 1;

    // final означает, что эти данные нельзя случайно изменить после создания юзера
    public final int uid;
    public final String username;
    public final String role;


    public User(String username, String role) {
        this.uid = idCounter++;
        this.username = username;
        this.role = role;
    }
}

