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
public class Makanan extends Hidangan{
    @Override
    public String disantap(){
        return this.getNamaHidangan() + " dimakan";
    }  
}
