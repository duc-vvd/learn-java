/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lession10;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Driver {
    public static void main(String[] args) {
        double fahrenheit, cecius;
        ConversionUtil cvu = new ConversionUtil();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập Fahrenheit: ");
        fahrenheit = scanner.nextDouble();
        System.out.println(fahrenheit + " độ F = " + cvu.fahrenheitToCelsius(fahrenheit) + " độ C");
        System.out.println("Nhập Celcius: ");
        cecius = scanner.nextDouble();
        System.out.println(cecius + " độ C = " + cvu.celciusToFahrenheit(cecius) + " độ F");
 

    }
}
