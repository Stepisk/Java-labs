package laba6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.println("Задание 1\n");

        System.out.print("Введите данные для Ethernet:\nПоколение = ");
        double generation = Double.parseDouble(reader.readLine());
        System.out.print("Скорость = ");
        double speed = Double.parseDouble(reader.readLine());
        System.out.print("Пинг = ");
        int ping = Integer.parseInt(reader.readLine());
        System.out.print("Тариф = ");
        String tariff = reader.readLine();

        Ethernet eth = new Ethernet(generation, speed, ping, tariff);
        eth.checkGeneration();
        eth.checkSpeed();
        eth.changeTariff("Default");
        System.out.println(eth.toString() + "\n");


        System.out.print("Введите данные для MobileConnection:\nПоколение = ");
        generation = Double.parseDouble(reader.readLine());
        System.out.print("Сигнал = ");
        double signal = Double.parseDouble(reader.readLine());
        System.out.print("Скорость = ");
        speed = Double.parseDouble(reader.readLine());
        System.out.print("Оператор = ");
        String operator = reader.readLine();

        MobileConnection mConnection = new MobileConnection(generation, signal, speed, operator);
        mConnection.checkGeneration();
        mConnection.checkSpeed();
        mConnection.changeOperator("A1");
        System.out.println(mConnection.toString() + "\n");

        System.out.print("Введите данные для ElectronicBanking:\nЛогин = ");
        String login = reader.readLine();
        System.out.print("Пароль = ");
        String password = reader.readLine();
        System.out.print("Имя = ");
        String name = reader.readLine();
        System.out.print("Фамилия = ");
        String lastname = reader.readLine();
        System.out.print("Баланс = ");
        double balance = Double.parseDouble(reader.readLine());

        ElectronicBanking eBanking = new ElectronicBanking(login, password, name, lastname, balance);
        eBanking.login("login", "password");
        if (eBanking.checkID(0) == true) System.out.println("Пользователь с id = 0 существует");
        eBanking.transferMoney(0, 100);
        System.out.println(eBanking.toString() + "\n");
    }
}
