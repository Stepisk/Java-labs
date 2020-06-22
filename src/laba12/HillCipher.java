package laba12;

import java.text.Normalizer;

public class HillCipher {
    private int n;
    private String key, plainText;

    public HillCipher(String key) {
        setKey(key);
    }

    public HillCipher(String key, String msg) {
        this(key);
        setMessage(msg);
    }

    public String encrypt() {
        String enc = "";
        int[][] keyNum = keyToMatrix();

        for (int i = 0, len = plainText.length(); i < len; i += n) {
            String temp = plainText.substring(i, i + n);
            int[] block = new int[n];

            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    block[j] += keyNum[j][k] * charToNum(temp.charAt(k));
                }
            }

            for (int j = 0; j < n; j++) {
                block[j] %= 26;
            }
            enc += arrayToString(block);
        }

        return enc;
    }

    private String normalizeText(String str) {
        return Normalizer.normalize(str.toLowerCase(), Normalizer.Form.NFD).replaceAll("[^a-z]", "");
    }

    private static char numToChar(int num) {
        return (char)(num + 97);
    }

    private static int charToNum(char ch) {
        return (int)(ch) - 97;
    }

    private static String arrayToString(int[] arr) {
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            result += numToChar(arr[i]);
        }
        return result;
    }

    private int[][] keyToMatrix() {
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = charToNum(key.charAt(i * n + j));
            }
        }
        return matrix;
    }

    private boolean checkKeySquare() {
        n = (int)Math.sqrt(key.length());
        if ((int)Math.pow(n, 2) != key.length()) {
            setKey("HILLMAGIC");
            System.out.println("\nМатрица ключа должна быть квадратной!\nБерётся ключ по умолчанию: " + this.key);
            return false;
        }
        return true;
    }

    public int getN() { return n; }

    public String getKey() { return key; }
    public void setKey(String key) {
        this.key = normalizeText(key);
        checkKeySquare();
    }

    public String getMessage() { return plainText; }
    public void setMessage(String msg) {
        plainText = normalizeText(msg);
        while (plainText.length() % n != 0) {
            plainText += "x";
        }
    }

    public String getName() { return "Cipher"; }
}