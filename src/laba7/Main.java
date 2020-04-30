package laba7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        ElectronicBanking ebank = new ElectronicBanking();
        ebank.say("String1", "String2", "String3", "String4");

        System.out.println("Задание 1\n");

        System.out.print("Введите данные для Ethernet:\nПоколение = ");
        float generation = Float.parseFloat(reader.readLine());
        System.out.print("Скорость = ");
        float speed = Float.parseFloat(reader.readLine());
        System.out.print("Пинг = ");
        int ping = Integer.parseInt(reader.readLine());

        Ethernet eth = new Ethernet(generation, speed, ping);
        eth.say();
        System.out.println(eth.toString() + "\n");


        System.out.print("Введите данные для MobileConnection:\nПоколение = ");
        generation = Float.parseFloat(reader.readLine());
        System.out.print("Сигнал = ");
        float signal = Float.parseFloat(reader.readLine());
        System.out.print("Оператор = ");
        String operator = reader.readLine();

        MobileConnection mConnection = new MobileConnection(generation, signal, operator);
        mConnection.say();
        System.out.println(mConnection.toString() + "\n");

        System.out.print("Введите данные для ElectronicBanking:\nЛогин = ");
        String login = reader.readLine();
        System.out.print("Пароль = ");
        String password = reader.readLine();

        ElectronicBanking eBanking = new ElectronicBanking("login", "drowssap");
        eBanking.say();
        eBanking.login(login, password);
        System.out.println(eBanking.toString() + "\n");
    }
}
