/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pembagian;

import java.util.Scanner;
import static java.lang.System.out;

/**
 *
 * @author USER
 */
public class Pembagian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Baca = new Scanner(System.in);
        int intA,intB;
        out.print("Pembilang = "); intA= Baca.nextInt();
        out.print("Penyebut  = "); intB= Baca.nextInt();
        
        out.print(intA+"/"+intB+" = ");
        if (intB !=0) out.println(intA/intB);
        else if (intA != 0) out.println("tak berhingga");
        else out.println("tidak terdefinisi");
    }
    
}
