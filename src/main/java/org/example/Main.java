package org.example;

public class Main {
    public static void main(String[] args) {
        String text = "Съешь ещё этих французских булок и галет, да выпей же чаю с молоком, как и я.";


        boolean[] alphabet = new boolean[33];


        text = text.toLowerCase();


        for (char c : text.toCharArray()) {
            if (c >= 'а' && c <= 'я') {

                alphabet[c - 'а'] = true;
            } else if (c == 'ё') {

                alphabet[32] = true;
            }
        }


        boolean allLettersPresent = true;
        for (boolean letterPresent : alphabet) {
            if (!letterPresent) {
                allLettersPresent = false;
                break;
            }
        }

        // Выводим результат
        if (allLettersPresent) {
            System.out.println("Текст содержит все буквы русского алфавита.");
        } else {
            System.out.println("Текст НЕ содержит все буквы русского алфавита.");
        }
    }
}