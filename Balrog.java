
/**
 * Write a description of class Balrog here.
 *
 * @author Austin Raymond
 * @version 11.18.2018
 */
public class Balrog extends Creature
{
    private static final int max_hp = 200;
    private static final int min_hp = 80;
    private static final int max_str = 100;
    private static final int min_str = 20;
    private int count;
    private int dmg1;
    private int dmg2;
    private int damage;
    /**
     * Constructor for objects of class Balrog
     */
    public Balrog()
    {
        super(Randomizer.nextInt(max_hp-min_hp)+min_hp,
            Randomizer.nextInt(max_str-min_str)+min_str);
    }
    public int damage(){
        dmg1 = super.damage();
        dmg2 = super.damage();
        damage = dmg1 + dmg2;
        return damage;
    }
}
