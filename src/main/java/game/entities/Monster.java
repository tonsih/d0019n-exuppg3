package game.entities;

import game.data.K;
import game.data.PrintCollection;
import game.interfaces.Printable;

/**
 * This class represents an enemy in the game, which is some kind of monster.
 *
 * @author Toni Sihvola
 * @author Ludwig Ahnqvist
 */
public class Monster extends Entity implements K, Printable
{
    /**
     * The description of the monster.
     */
    private final String monsterDesc;

    /**
     * @param name The name of the monster.
     * @param healthPoints Monster's health-points.
     * @param maxDamage The maximal damage output of the monster.
     * @param monsterDesc A description about the monster.
     */
    public Monster(String name,
                   int healthPoints,
                   int maxDamage,
                   String monsterDesc)
    {
        super(name, healthPoints, maxDamage);
        this.monsterDesc = monsterDesc;
    }

    public Monster()
    {
        this("Odjur", K.CREATURE_HP, K.CREATURE_MAX_DMG, "En ful varelse");
    }

    /**
     * Prints an ASCII monster.
     */
    @Override
    public void printObject()
    {
        PrintCollection.printMonster();
    }

    /**
     * @return The description of the monster.
     */
    public String getMonsterDesc()
    {
        return monsterDesc;
    }
}