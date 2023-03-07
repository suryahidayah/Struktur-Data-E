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
public class Konsumsi<M, I> {
    private M m;
    private I i;
    
    public M getM(){
        return m;
    }
    
    public I getI(){
        return i;
    }
    
    public void setKonsumsi (M makanan, I minuman){
        this.m = makanan;
        this.i = minuman;
    }
}