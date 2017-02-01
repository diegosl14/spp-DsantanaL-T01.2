/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.dsantanal.t01.pkg2;
import java.util.Scanner;
/**
 *
 * @author Diego Santana 
 */
public class SppDsantanaLT012 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double base,altu,per,sup; //per = Perimetro, sup = Superficie 
        Scanner T = new Scanner (System.in);
        
        System.out.println("Ingresa la base");
        base = T.nextDouble();
        System.out.println("Ingresa la altura");
        altu = T.nextDouble();
        
        sup = base * altu;
        per = base + base + altu + altu;
        
        System.out.println("La superficie es: " + sup);
        System.out.println("El perimetro es: " + per);
        
    }
    
}
