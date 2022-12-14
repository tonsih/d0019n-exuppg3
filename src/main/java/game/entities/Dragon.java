package game.entities;

import game.data.K;
import game.data.PrintCollection;

/**
 * This class represents an enemy monster which is a dragon.
 */
public class Dragon extends Monster
{
    /**
     * @param name Name of the dragon.
     * @param healthPoints Dragon's health-points.
     * @param maxDamage Dragon's maximal damage output.
     * @param monsterDesc Description about the dragon.
     */
    public Dragon(String name, int healthPoints, int maxDamage, String monsterDesc)
    {
        super(name, healthPoints, maxDamage, monsterDesc);
    }

    public Dragon()
    {
        this(K.DRAGON_NAME, K.DRAGON_HP, K.DRAGON_MAX_DMG, K.DRAGON_DESC);
    }

    /**
     * Prints an ASCII dragon.
     */
    @Override
    public void printObject()
    {
        PrintCollection.printDragon();
    }
}