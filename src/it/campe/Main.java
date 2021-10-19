package it.campe;

public class Main {

    public static String string1 = "Вперед";
    public static String string2 = string1;
    public static String string3 = new String(string1);

    public static void main(String[] args) {
        String same = "ссылки на строки одинаковые";
        String different = "ссылки на строки разные";
        //напишите тут ваш код
        System.out.println(same);
        System.out.println(different);
    }
}
