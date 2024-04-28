
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите 3 строки");
        String[] inputStrings = new String[3];
        for (int i = 0; i < inputStrings.length; i++) {
            // записываем строки из консоли в массив, с корорым будем дальше работать
            inputStrings[i] = scanner.nextLine();
        }

        // 1 задание, находим самую короткую и самую длинную строку и выводим
//        firstTask(inputStrings);
        // 2 задание, сортируем массив строк в пордке возрастания и выводим его
//        secondTask(inputStrings);
        // 3 задание, выводим строки мешьше среденей и их длинну (среденей по начальной позиции в массиве)
//        thirdTask(inputStrings);
        // 4 задание, выводим первую строку у которой все символы разные

//        fourthTask(inputStrings);

// 5 задание, принимаем строку и выводим строку с дублированием всех символов
        System.out.println(doubleChar(inputStrings[0]));


    }

    static int findLongestStr(String[] strings) {
        int maxIndex = 0;
        for (int i = 0; i < strings.length; i++) {
            if (strings[maxIndex].length() < strings[i].length()) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    static int findShortestStr(String[] strings) {
        int minIndex = 0;
        for (int i = 0; i < strings.length; i++) {
            if (strings[minIndex].length() > strings[i].length()) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    static void firstTask(String[] strings) {
        int maxIndex = findLongestStr(strings);
        int minIndex = findShortestStr(strings);
        System.out.println("Самая длинная строка " + strings[maxIndex] + " её длинна " + strings[maxIndex].length());
        System.out.println("Самая короткая строка " + strings[minIndex] + " её длинна " + strings[minIndex].length());

    }

    static void secondTask(String[] strings) {
        int maxIndex = findLongestStr(strings);
        int minIndex = findShortestStr(strings);
        String[] sortedStrings = new String[3];
        sortedStrings[0] = strings[minIndex];
        sortedStrings[2] = strings[maxIndex];
        sortedStrings[1] = strings[3 - maxIndex - minIndex];

        for (String str : sortedStrings) {
            System.out.println(str);
        }
    }

    static void thirdTask(String[] strings) {
        // Если среднюю иметестя в виду по длинне, а не по позиции, тогда
//        int midleLength = strings[3 - findLongestStr(strings) - findShortestStr(strings)].length();
        int midleLength = strings[1].length();
        System.out.println("Выводим строки которые меньше средней");
        for (String str: strings) {
            if (str.length() < midleLength) {
                System.out.println(str + " её длинна " + str.length());
            }
        }
    }

    static String fourthTask (String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            boolean isDiferentsChar = true;
            char[] stringChars = strings[i].toCharArray();
            for (int j = 0; j < stringChars.length; j++) {
                for (int k = j+1; k < stringChars.length; k++) {
                    if (stringChars[j] == stringChars[k]) {
                        isDiferentsChar = false;
                        break;
                    }
                }
            }
            if (isDiferentsChar == true) {
                System.out.println("Первая строка в которой все символы разные");
                System.out.println(strings[i]);
                return strings[i];
            }
        }
        return "";
    }

    static String doubleChar(String str) {
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < sb.length(); i+=2) {
            sb.insert(i, sb.charAt(i));
        }
        return sb.toString();
    }

}