/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polimorfisme;

/**
 *
 * @author aldo
 */
    public class Programer extends Pegawai {
    public int bonus;
    int Bonus;
    
    @Override
    public void tampilData(){
        super.tampilData();
        System.out.println("BONUS" + bonus);
    }
    
}

