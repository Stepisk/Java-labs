package laba7;

/**
 * ElectronicBanking
 */
public class ElectronicBanking extends Telecommunications {

    private String login, password;
    private int id;
    private static int ID = 0;

    public ElectronicBanking() {
        this("noLogin", "");
    }

    public ElectronicBanking(String login, String password) {
        super("EBanking");
        this.login = login;
        this.password = password;
        this.id = ID++;
    }

    public int getID() {
        return id;
    }

    public void login(String login, String password) {
        if (this.login.equals(login) && this.password.equals(password)) {
            System.out.println("Вы успешно залогинились:)");
        } else {
            System.out.println("Введён неправильный логин или пароль!");
        }
    }

    public void say() {
        System.out.println("Я Электронный Банкинг!");
    }

    public void say(String str) {
        System.out.println(str);
    }

    public void say(String str, int number) {
        for (int i = 0; i < number; i++) {
            say(str);
        }
    }

    public void say(String... strs) {
        for (String str : strs) {
            say(str);
        }
    }

    @Override
    public String toString() {
        return "type = " + type + " | id = " + id;
    }
}