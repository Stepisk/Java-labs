package laba17_18;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        File file = new File("cipher.txt");
        if (!file.exists() || file.delete()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
                return;
            }
        }

        String key = "GYBNQKURP";
        String msg = "ACT";
        CipherThread[] threads = new CipherThread[5];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new CipherThread(key, msg, file);
            threads[i].start();
            threads[i].join();
        }

        try (FileReader fr = new FileReader(file)) {
            BufferedReader br= new BufferedReader(fr);

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }    

        System.out.println("Работа с потоками закончена!");
    }
}
