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
public class Animals implements Animal{
    String name, type, sound;

    public Animals(String name, String type, String sound) {
        this.name = name;
        this.type = type;
        this.sound = sound;
    }
    
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void makeVoice() {
        System.out.println(sound);
    }
}
