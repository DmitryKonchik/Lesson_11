
public class HardTask {

    static boolean isPalindromWord(String str, int numberOfWord) {
//        Проверяем есть ли такое слово(по номеру)
        if (!isEnoughWords(str, numberOfWord)) {
            System.out.println("Такого слова нет, введите число меньше");
            return false;
        }
        String[] arrStr = str.split(" ");
//        Убираем знаки пунктуации, чтобы сравнивать только слова(и цифры)
        for (int i = 0; i < arrStr.length; i++) {
            arrStr[i] = arrStr[i].replaceAll("\\p{Punct}", "");
        }

        StringBuilder sb = new StringBuilder(arrStr[numberOfWord]);

        StringBuilder reversSB = new StringBuilder(arrStr[numberOfWord]);
        reversSB.reverse();

        if (sb.compareTo(reversSB) == 0) {
            System.out.println("это слово является полиндромом");
            return true;
        }

        System.out.println("это слово не является полиндромом");
        return false;
    }

    static boolean isEnoughWords(String str, int number) {
        String[] arrStr = str.split(" ");
        if (arrStr.length - 1 >= number) {
            return true;
        }
        return false;
    }
}
