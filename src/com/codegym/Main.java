package com.codegym;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float width;
        float height;

        Scanner scanner = new Scanner(System.in); // khai báo đối tượng Scanner
        System.out.println("Enter Width");
        width = scanner.nextFloat(); // nhập chiều rộng

        System.out.println("Enter Height");
        height = scanner.nextFloat(); // nhập chiều dài

        float area = width*height; // khai báo biến area có kiểu dữ liệu là float để tính diện tích hình chữ nhật
        System.out.println("area = "+area);
    }
}
