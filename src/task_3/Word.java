package task_3;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Word {
    String stroka;
    int vowelCount = 0;

    public Word(String stroka) {
        this.stroka = stroka;
    }

    int skolko() {
        String[] words = stroka.split(" ");
        for (int i = 0; i < words.length; i++) {


            // Подсчет количества букв
            Matcher match = Pattern.compile("[ауеэюияыо]").matcher(words[i]);
            int count = 0;
            while (match.find()) {
                count++;
            }
            vowelCount = vowelCount + count;


        }
        return vowelCount;
    }
    int skolko1(String s) {
            // Подсчет количества букв
            Matcher match = Pattern.compile("[ауеэюияыо]").matcher(s);
            int count = 0;
            while (match.find()) {
                count++;
            }
            return count;
        }

    void sort() {
        String[] words = stroka.split(" ");
        String buf;
            for (int i = 0; i < words.length - 1; i++) {

                if (skolko1(words[i + 1]) > skolko1(words[i])) {
                    buf = words[i];
                    words[i] = words[i + 1];
                    words[i + 1] = buf;
                }
            }
        for(int i=0; i< words.length;i++){

            Matcher match = Pattern.compile("^[ауеэюияы]").matcher(words[i]);
            while(match.find()) {
                words[i] = Character.toUpperCase(words[i].charAt(0)) + words[i].substring(1);
            }
            System.out.println(words[i]);
        }
    }



}

