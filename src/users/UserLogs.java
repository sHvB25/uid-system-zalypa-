package users;

public enum UserLogs {
    //пароли и роли
   FOKS("FOKSIK", "Y8b6SC!b3", Role.OWNER),
   LEETUSER("leetuser", "1337", Role.PREMIUM);


    public final String login;
    public final String password;
    public final Role role;


    UserLogs(String login, String password, Role role) {
        this.login = login;
        this.password = password;
        this.role = role;
    }
}

