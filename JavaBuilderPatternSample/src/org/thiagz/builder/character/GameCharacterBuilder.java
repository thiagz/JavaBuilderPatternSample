/*
 * This is the builder class which will create the Game Characters
 * 
 */
package org.thiagz.builder.character;

/**
 *
 * @author Thiagz
 */
public class GameCharacterBuilder {

    protected String name;
    protected String type;
    protected String weapon;
    protected int height;
    protected int weight;

    public GameCharacterBuilder(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public GameCharacterBuilder addWeapon(String weapon) {
        this.weapon = weapon;
        return this;
    }

    public GameCharacterBuilder addHeight(int height) {
        this.height = height;
        return this;
    }

    public GameCharacterBuilder addWeight(int weight) {
        this.weight = weight;
        return this;
    }

    public GameCharacter build() {
        return new GameCharacter(this);
    }
}
