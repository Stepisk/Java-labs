package laba17_18;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;

import laba12.HillCipher;

public class CipherThread extends Thread {
    private HillCipher cipher;
    private File file;

    private static int counter = 0;

    CipherThread(String key, String msg, File file) {
        super("cipherThread");
        cipher = new HillCipher(key, msg);
        this.file = file;
    }

    @Override
    public void run() {
        synchronized (file) {
            try (FileWriter writer = new FileWriter(file, true)) {
                writer.write("Поток №" + counter++);
                writer.append('\n');
                writer.write("Название объекта: " + cipher.getName());
                writer.append('\n');
                writer.write("Название класса: " + cipher.getClass().getName());
                writer.append('\n');
                Field[] fields = cipher.getClass().getDeclaredFields();
                for (Field field : fields) {
                    field.setAccessible(true);
                    writer.write(field.getName() + ": " + field.get(cipher).toString());
                    writer.append('\n');
                }
                writer.append('\n');
                writer.flush();
                writer.close();
            } catch (IOException | IllegalAccessException e) {
                e.printStackTrace();
                return;
            }       
        }
    }
}
