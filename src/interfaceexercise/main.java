/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaceexercise;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        PartTimeEmployee partTime = new PartTimeEmployee("Minh", 15, 20);
        FullTimeEmployee fullTime = new FullTimeEmployee("Tien", 25);
        System.out.println("Part time salary: " + partTime.calculateSalary());
        System.out.println("Full time salary: " + fullTime.calculateSalary());   
    }
}
