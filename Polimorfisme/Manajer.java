/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polimorfisme;

/**
 *
 * @author aldo
 */
    public class Manajer extends Pegawai{
    public int Tunjangan;
    
    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("TUNJANGAN" + Tunjangan);
    }
}

