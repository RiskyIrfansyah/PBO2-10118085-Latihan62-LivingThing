/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118085.latihan62.livingthing;

/**
 *
 * @author Risky
 * Nama     : Risky Irfansyah
 * Kelas    : PBO2
 * Nim      : 10118085
 * Deskripsi Tugas : Living Thing
 */
public class Tester {
    public static void main(String[] args) {
        Human human = new Human();
        human.setNama("Risky Irfansyah");
        human.walk(human.getNama());
        human.breath(human.getNama());
        human.eat(human.getNama());
    }
}
