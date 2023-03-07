/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strukdat;
import java.util.ArrayList;
/**
 *
 * @author LAB C-01
 */
public class Main {
 public static void main(String [] args){
     ArrayList<Konsumsi> listKonsumsi = new ArrayList<>();
     Konsumsi<Makanan, Minuman> breakfast = new Konsumsi<>();
     Konsumsi<Makanan, Minuman> lunch = new Konsumsi<>();
     
     Makanan roti = new Makanan();
     roti.setNamaHidangan("Roti Gandum");
     Minuman susu = new Minuman();
     susu.setNamaHidangan("Susu Coklat");
     breakfast.setKonsumsi(roti, susu);
     listKonsumsi.add(breakfast);
     
     Makanan nasi = new Makanan();
     nasi.setNamaHidangan("Nasi Uduk");
     Minuman teh = new Minuman();
     teh.setNamaHidangan("Teh Tarik");
     lunch.setKonsumsi(nasi, teh);
     listKonsumsi.add(lunch);
     
     System.out.println("Menu Konsumsi");
     for(Konsumsi<Makanan, Minuman> konsumsi: listKonsumsi){
         Makanan makanan = konsumsi.getM();
         Minuman minuman = konsumsi.getI();
         
         
         System.out.println(makanan.disantap());
         System.out.println(minuman.disantap());
     }
 }  
}
