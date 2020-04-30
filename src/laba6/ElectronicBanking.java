package laba6;

/**
 * ElectronicBanking
 */
public class ElectronicBanking {

    private String login, password;
    private String name, lastname;
    private double balance;
    private int id;
    private static int ID = 0;

    public ElectronicBanking() {
        this("noLogin", "noPassword", "Unknown", "Unknown", 0d);
    }

    public ElectronicBanking(String login, String password, String name, String lastname, double balance) {
        this.login = login;
        this.password = password;
        this.name = name;
        this.lastname = lastname;
        this.balance = balance;
        this.id = ID++;
    }

    public int getID() { return id; }
    public double getBalance() { return balance; }
    public String getName() { return name; }
    public String getLastname() { return lastname; }

    public boolean checkID(int id) { return id < ElectronicBanking.ID ? true : false; }

    public void login(String login, String password) {
        if (this.login.equals(login) && this.password.equals(password)) {
            System.out.println("Вы успешно залогинились:)");
        } else {
            System.out.println("Введён неправильный логин или пароль!");
        }
    }

    public boolean transferMoney(int idToTransfer, double money) {
        if (balance < money) {
            System.out.println("У вас недостаточно денег на балансе!");
            return false;
        } else if (checkID(idToTransfer) == false) {
            System.out.println("Пользователя с таким ИД не существует!");
            return false;
        }
        balance -= money;
        System.out.println("Вы успешно перечислили " + money + " пользователю с ИД = " + idToTransfer);
        return true;
    }

    @Override
    public String toString() {
        return "name: " + name + " | lastname: " + lastname + " | id: " + id;
    }
}