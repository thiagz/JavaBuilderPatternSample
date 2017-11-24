/*
 * This is an immutable class. It can be changed as per your need
 * 
 * 
 */
package org.thiagz.builder.character;

/**
 *
 * @author Thiagz
 */
public final class GameCharacter {
    
    private final String name;
    private final String type;
    private final String weapon;
    private final int height;
    private final int weight;
    
    protected GameCharacter(GameCharacterBuilder builder){
        name = builder.name;
        type = builder.type;
        weapon = builder.weapon;
        height = builder.height;
        weight = builder.weight;
    }
    
    @Override
    public String toString(){
        return "Character Name: " + name + "\nCharacter Type: " + type 
                + "\nWeapon: " + weapon + "\nHeight: " + height + "cm \nWeight: " 
                + weight + " Kg\n\n";
                
    }
}
