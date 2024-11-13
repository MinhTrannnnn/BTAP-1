/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaceexercise;

/**
 *
 * @author Admin
 */
public class FullTimeEmployee extends Employee{
    
    public FullTimeEmployee(String name, int paymentPerHour){
        super(name, paymentPerHour);
    }
    
    @Override
    public int calculateSalary() {
        return paymentPerHour * 10; // làm 10 giờ 1 ngày
    }
    
    
}
