/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konvsuhu;

/**
 *
 * @author ASUS
 */
public class Operasi { double C;

    public Operasi(double C) {
        this.C = C;
    }
    
    double Fahrenheit(){
        return (C*1.8+32);
    }
    double Reamur(){
        return (C*0.8);
    }
    double Kelvin(){
        return (C+273.15);
    }
    String kondisi(){
        if(C <= 0){
            return "Beku";
        }
        else if(C >= 100){
            return "Mendidih";
        }
        else{
            return "Normal";
        }
    }
    
}
