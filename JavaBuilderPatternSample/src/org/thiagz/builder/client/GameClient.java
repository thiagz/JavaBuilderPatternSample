/*
 * This client will invoke the GameCharacterBuilder to generate different 
 * game characters
 * 
 */
package org.thiagz.builder.client;

import org.thiagz.builder.character.GameCharacter;
import org.thiagz.builder.character.GameCharacterBuilder;

/**
 *
 * @author Thiagz
 */
public class GameClient {

    public static void main(String args[]) {
        GameCharacter character1
                = new GameCharacterBuilder("Gargoil", "Monster").build();

        GameCharacter character2
                = new GameCharacterBuilder("Captain America", "Hero").addHeight(190)
                        .addWeight(100).build();

        GameCharacter character3
                = new GameCharacterBuilder("Joker", "Monster").addHeight(180)
                        .addWeight(75).addWeapon("Asid").build();

        GameCharacter character4
                = new GameCharacterBuilder("Iron Man", "Hero").addHeight(160)
                        .addWeight(80).addWeapon("Missle").build();
        
        System.out.println(character1);
        System.out.println(character2);
        System.out.println(character3);
        System.out.println(character4);
    }
}
