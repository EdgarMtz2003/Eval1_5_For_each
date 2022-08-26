/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moviles
 */
public class Eval1_5_For_each {
    public static void main(String[]args){
        
        int[]arregloDatos=new int [50];
        for (int i=0; i<arregloDatos.length; i++){
        arregloDatos[i]= (int) (Math.random()*100);           
        }
        for (int arregloDato : arregloDatos) {
            System.out.print("["+arregloDato+"]");
            
        }
        
        
    }
    
}
