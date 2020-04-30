package app;

import java.io.IOException;

public class App {

    public static void clearConsole() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (IOException | InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void pauseConsole() throws IOException {
        System.out.print("Для продолжения нажмите любую клавишу...");
        System.in.read();
    }
}
