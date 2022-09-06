package project.main;

import static project.util.TextUtil.*;

public class Menu {

    public static StringBuilder menu() {
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println(symbol);
        stringBuilder.append(text1);
        stringBuilder.append(text2);
        stringBuilder.append(text3);
        stringBuilder.append(text4);
        stringBuilder.append(text5);
        stringBuilder.append(text6);
        stringBuilder.append(text7);
        stringBuilder.append(text8);
        stringBuilder.append(text9);
        stringBuilder.append(text10);
        stringBuilder.append(questionText1);
        return stringBuilder;
    }

    public static StringBuilder forEdit() {
        System.out.println(symbol);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(text11);
        stringBuilder.append(text12);
        stringBuilder.append(text13);
        stringBuilder.append(questionText2);
        return stringBuilder;
    }
}
