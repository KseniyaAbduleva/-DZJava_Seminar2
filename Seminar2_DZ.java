import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * DZ_01
 * Напишите программу, чтобы найти вхождение в строке (содержащей все символы другой строки).

public class Seminar2_DZ {
    
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите первую строку: ");
        String firstStr = iScanner.nextLine();
        System.out.printf("Введите вторую строку: ");
        String secondStr = iScanner.nextLine();
        iScanner.close();

        Pattern pattern = Pattern.compile(secondStr);
        Matcher matcher = pattern.matcher(firstStr);
        if (matcher.find()) {
            System.out.println(
                "Вхождений в строке (содержащей все символы другой строки): "
                + firstStr.substring(matcher.start(), matcher.end()));
        } else {
            System.out.println("Вхождений в строке НЕТ!");
        }
    }   
}
*/



/** Напишите программу, чтобы проверить, 
 * являются ли две данные строки вращением друг друга (вхождение в обратном порядке).
 

public class Seminar2_DZ {
    
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите первую строку: ");
        String firstStr = iScanner.nextLine();
        System.out.printf("Введите вторую строку: ");
        String secondStr = iScanner.nextLine();
        iScanner.close();
        
        if (firstStr.equals(new StringBuilder(secondStr).reverse().toString())) {
            System.out.println("Данные строки являются вращением друг друга!");
        } else
            System.out.println("Данные строки НЕ являются вращением друг друга!");
    }
}
*/



/**
 * DZ_03
 * *Напишите программу, чтобы перевернуть строку с помощью рекурсии.

import java.util.Scanner;
public class Seminar2_DZ {

    public static String reverseString(String string) {
        if (string.isEmpty())
            return string;
        return reverseString(string.substring(1)) + string.charAt(0);
    }
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите строку: ");
        String string = iScanner.nextLine();
        iScanner.close();
        
        System.out.println("Введенная строка: " + string);
        String rev = reverseString(string);
        System.out.println("Перевернутая строка: " + rev);
    }
}
 */



 /**
 * DZ_04
 * Дано два числа, например 3 и 56, необходимо составить следующие строки: 
 * 3 + 56 = 59 
 * 3 – 56 = -53 
 * 3 * 56 = 168 
 * Используем метод StringBuilder.append().

public class Seminar2_DZ {

    public static String compilerStr(int a, int b, char sign) {
        StringBuilder str = new StringBuilder();
        str.append(a).append(" ").append(sign).append(" ").append(b).append(" = ");
        switch (sign) {
            case '+':
                str.append(a + b);
                break;
            case '-':
                str.append(a - b);
                break;
            case '*':
                str.append(a * b);
                break;
        }
        return str.toString();
    }

    public static void main(String[] args) {
        int a = 3, b = 56;
        System.out.println("Примеры в виде строк:");
        System.out.println(compilerStr(a, b, '+'));
        System.out.println(compilerStr(a, b, '-'));
        System.out.println(compilerStr(a, b, '*'));
    }
}
 */


/**
 * DZ_05
 * Замените символ “=” на слово “равно”. 
 * Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().

public class Seminar2_DZ {

    public static String compilerStr(int a, int b, char sign) {
        StringBuilder str = new StringBuilder();
        str.append(a).append(" ").append(sign).append(" ").append(b).append(" = ");
        switch (sign) {
            case '+':
                str.append(a + b);
                break;
            case '-':
                str.append(a - b);
                break;
            case '*':
                str.append(a * b);
                break;
        }
        return str.toString();
    }

    public static String replacEqual(String mathTask) {
        StringBuilder task = new StringBuilder(mathTask);
        int index = task.indexOf("=");
        return task.deleteCharAt(index).insert(index, "равно").toString();
    }

    public static void main(String[] args) {
        int a = 3, b = 56;
        System.out.println("Примеры в виде строк:");
        System.out.println(compilerStr(a, b, '+'));
        System.out.println(compilerStr(a, b, '-'));
        System.out.println(compilerStr(a, b, '*'));
        System.out.println("Замена символа '=' на слово 'равно':");
        System.out.println(replacEqual(compilerStr(a, b, '+')));
        System.out.println(replacEqual(compilerStr(a, b, '-')));
        System.out.println(replacEqual(compilerStr(a, b, '*')));
    }
}
*/