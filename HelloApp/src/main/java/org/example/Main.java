package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        StringBuilder nameBuilder = new StringBuilder();
        boolean first = true;
        for (String name : args) {
            if (!first) {
                nameBuilder.append(", ");
            }
            nameBuilder.append(name);
            first = false;
        }
        if (nameBuilder.isEmpty()) {
            System.out.println("Hello, World!");
        } else {
            System.out.println("Hello, " + nameBuilder.toString() + "!");
        }

    }
}