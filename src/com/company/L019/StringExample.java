package com.company.L019;

import java.util.Locale;
import java.util.stream.Stream;

public class StringExample {

    private static String str() {
        return "Добро пожаловать на FoodTech School";
    }

    private static void runContentEquals() {
        System.out.println("runContentEquals");
        String str1 = "Добро пожаловать на FoodTech School";
        String str2 = "Сайт для изучения java";

        StringBuffer str3 = new StringBuffer("Добро пожаловать на FoodTech School");
        StringBuffer str4 = new StringBuffer("Добро пожаловать");

        boolean result = str1.contentEquals(str3);
        System.out.println("str1 == str2: " + result);

        result = str2.contentEquals(str3);
        System.out.println("str2 == str3: " + result);

        result = str1.contentEquals(str4);
        System.out.println("str1 == str4: " + result);


    }

    private static void runEqualsIgnoreCase() {
        System.out.println("runEqualsIgnoreCase");
        String str1 = "Добро пожаловать на FoodTech School";
        String str2 = str1;

        String str3 = "Сайт для изучения Java";
        String str4 = "Добро пОжаЛОвать на FoodTeCH School";

        boolean result = str1.equalsIgnoreCase(str2);
        System.out.println("str1 == str2: " + result);

        result = str1.equalsIgnoreCase(str3);
        System.out.println("str2 == str3: " + result);

        result = str1.equalsIgnoreCase(str4);
        System.out.println("str1 == str4: " + result);

    }

    private static void runCompareTo() {
        System.out.println(" ");
        System.out.println("runCompareTo");
        String str1 = "Я вызываю метод!";
        String str2 = "Я вызываю метод!";
        String str3 = "Я Вызываю класс!";

        System.out.println(str1.compareTo(str2));
        System.out.println(str2.compareTo(str3));
        System.out.println(str3.compareTo(str1));

    }

    private static void runCompareToIgnoreCase() {
        System.out.println(" ");
        System.out.println("runCompareToIgnoreCase");
        String str1 = "Я вызываю метод!";
        String str2 = "Я Вызываю Метод!";
        String str3 = "Я Вызываю класс!";

        System.out.println(str1.compareToIgnoreCase(str2));
        System.out.println(str2.compareToIgnoreCase(str3));
        System.out.println(str3.compareToIgnoreCase(str1));

    }

    private static void runToLowerCase() {
        System.out.println(" ");
        System.out.println("runToLowerCase");
        String str1 = "Я вызываю метод!";

        System.out.println(str1.toLowerCase());
    }

    private static void runToUpperCase() {
        System.out.println(" ");
        System.out.println("runToUpperCase");
        String str1 = "Я вызываю метод!";

        System.out.println(str1.toUpperCase());
    }

    private static void runConcat() {
        System.out.println(" ");
        System.out.println("runConcat");

        String s = "Я вызываю метод!";
        s = s.concat(" runConcat");

        s = s + " String";

        System.out.println(s);
    }

    private static void runMatches() {
        System.out.println(" ");
        System.out.println("runMatches");
        String s = "Добро пожаловать на FoodTechSchool";

        System.out.println(s.matches("(.*)FoodTech(.*)"));
        System.out.println(s.matches("Добро(.*)"));

    }

    private static void runContains() {
        System.out.println(" ");
        System.out.println("runContains");
        String s = "twinkle twinkle little star";
        boolean got = s.contains("little");
        System.out.println(got);
        System.out.println(s.contains("331"));
    }

    private static void runRegionMatches() {
        System.out.println(" ");
        System.out.println("runRegionMatches");

        String s1 = "Добро пожаловать на FoodTech School";
        String s2 = "FoodTech School";
        String s3 = "Java";
        String s4 = "FOODTECH SCHOOL";

        System.out.println(s1.regionMatches(20, s2, 0, 8));
        System.out.println(s1.regionMatches(20, s3, 0, 8));
        System.out.println(s1.regionMatches(true, 20, s4, 0, 8));
    }

    private static void runStartWith() {
        System.out.println(" ");
        System.out.println("runStartWith");

        String s1 = "Добро пожаловать на FoodTech School";
        String s2 = "Добро";
        String s3 = "Java";
        String s4 = "FOODTECH SCHOOL";

        System.out.println(s1.startsWith(s2));
        System.out.println(s1.startsWith(s3));
        System.out.println(s1.startsWith(s4));
    }

    private static void runEndWith() {
        System.out.println(" ");
        System.out.println("runEndWith");

        String s1 = "Добро пожаловать на FoodTech School";
        String s2 = "School";
        String s3 = "Java";
        String s4 = "FOODTECH SCHOOL";

        System.out.println(s1.endsWith(s2));
        System.out.println(s1.endsWith(s3));
        System.out.println(s1.endsWith(s4));
    }

    private static void runLines() {
        System.out.println(" ");
        System.out.println("runLines");
        String s = "stafwf\n" + "dqwfw\n" + "fqfqfw\n" + "dqdqwqdwdqdf";

        System.out.println(s);
        Stream<String> lines = s.lines();
        lines.forEach(System.out::println);
//        System.out.println(lines);
    }
    private static void runToCharArray() {
        System.out.println(" ");
        System.out.println("runToCharArray");
        String s1 = "Добро пожаловать на FoodTech School";
        System.out.println(s1.toCharArray()[4]);
    }

    private static void runFormat() {
        System.out.println(" ");
        System.out.println("runFormat");

        float floatVar = 1.2f;
        int intVar = 12;
        String stringVar = "String";

        String fs;

        fs = String.format("Значение float = %f , значение int = %d, значение string = %s",floatVar,intVar,stringVar);
        System.out.println(fs);
    }

    private static void runValueOf() {
        System.out.println(" ");
        System.out.println("runValueOf");
        double d = 12312.2;
        boolean b = true;
        long l = 111l;
        char[] chars = {'d','r'};

        System.out.println(String.valueOf(d));
        System.out.println(String.valueOf(b));
        System.out.println(String.valueOf(l));
        System.out.println(String.valueOf(chars));
    }

    private static void runRepeat() {
        String str = "string";
        String repeat = str.repeat(10);
        System.out.println(repeat);
    }

    private static void runIndexOf() {
        String str = str();
        String sub1 = "Food", sub2 = "Tech";
        System.out.println(str.indexOf(sub1));
        System.out.println(str.indexOf(sub2));
        System.out.println(str.indexOf("dwdwq"));
    }

    private static void runLastIndexOf() {
        String str = str();
        String sub1 = "o";
        System.out.println(str.lastIndexOf(sub1));
    }

    private static void runSubString() {
        String str = str();
        System.out.println(str.substring(11));
    }
    private static void runSubSequence() {
        String str = str();
        System.out.println(str.subSequence(0,10));
    }
    private static void runSplit() {
        String str = "Добро-Пожалова-На-Сайт";
        for (String s : str.split("-")) {
            System.out.println(s);
        }
    }
    private static void runJoin() {
        String join = String.join(", ", "1", "2", "3");
        System.out.println(join);
    }
    private static void runTrim() {
        String s = "           String";
        s = s.trim();
        System.out.println(s);
    }
    private static void runReplace() {
        String s = str();
        System.out.println(s.replace("o", "-"));
        System.out.println(s.replaceFirst("o", "-"));
        System.out.println(s.replaceAll("o", "-"));
    }
    public static void run() {
        runContentEquals();
        runEqualsIgnoreCase();
        runCompareTo();
        runCompareToIgnoreCase();
        runToLowerCase();
        runToUpperCase();
        runConcat();
        runMatches();
        runContains();
        runRegionMatches();
        runStartWith();
        runEndWith();
        runLines();
        runToCharArray();
        runFormat();
        runValueOf();
        runRepeat();
        runIndexOf();
        runLastIndexOf();
        runSubString();
        runSubSequence();
        runSplit();
        runJoin();
        runTrim();
        runReplace();
    }
}
