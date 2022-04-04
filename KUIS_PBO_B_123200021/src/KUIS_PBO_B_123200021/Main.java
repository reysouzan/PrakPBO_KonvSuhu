/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KUIS_PBO_B_123200021;

/**
 *
 * @author ACER
 */
public class Main {
    public static void CetakAnimal(Animal animal) {      
        System.out.print(animal.getName() + " adalah " + animal.getType() + " dengan bunyi ");animal.makeVoice();  
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animals ml = new Animals ("ml", "macan", "p");
        Animals ml2 = new Animals ("ml", "macan", "pp");
        Animals k =  new Animals ("k", "kambing", "k");
        Animals a =  new Animals ("a", "ayam", "a");
        CetakAnimal(ml);
        CetakAnimal(ml2);
        CetakAnimal(k);
        CetakAnimal(a);
    }
    
}
