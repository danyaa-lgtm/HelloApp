package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        StringBuilder nameBuilder = new StringBuilder();
        for (String name : args) {
            nameBuilder.append(name).append(", ");
        }
        if (nameBuilder.length() > 0) {
            String names = nameBuilder.substring(0, nameBuilder.length() - 2);
            System.out.println("Hello, " + names + "!");
        } else {
            System.out.println("Hello, World!");
        }
    }
}