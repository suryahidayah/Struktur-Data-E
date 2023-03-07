/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strukdat;
/**
 *
 * @author LAB C-01
 */
public class Kota<E> {
    private E element;
    
    public Kota(E kota){
        element = kota;
    }
    
    public E getElement(){
        return element;
    }
    
public static void main(String[] args){
    Kota<Integer> jumlahKota = new Kota<Integer>(9);
    Kota<String> namaKota = new Kota<String>("Malang");
    System.out.println("Jumlah Kota di jawa timur : "+ jumlahKota.getElement() + " kota");
    System.out.println("Salah satu Kota di Jawa Timur : Kota "+ namaKota.getElement());
 }
}
