package com.OOP.Classes;

public class Main {
    public static void main(String[] args) {
        TextBox textBox1=new TextBox();
        textBox1.setText("Box 1");
        System.out.println(textBox1.text.toUpperCase());

        textBox1.clear();
        System.out.println(textBox1.text+"Gayab");

        TextBox textBox2=new TextBox();
        textBox2.setText("Box 2");
        System.out.println(textBox2.text);

        TextBox textBox3=textBox1;
        textBox3.setText("Box 1 and Box 3 are pointing to the same object...");
        System.out.println(textBox1.text);
    }
}