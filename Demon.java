
/**
 * This is the Demon class.
 *
 * @author Austin Raymond
 * @version 11.18.2018
 */
public class Demon extends Creature
{
    private static final int max_hp = 25;
    private static final int min_hp = 8;
    private static final int max_str = 18;
    private static final int min_str = 5;
    private int magical;
    private int dmg;
    /**
     * Constructor for objects of class Demon
     */
    public Demon()
    {
        super(
            Randomizer.nextInt(max_hp-min_hp)+min_hp,
            Randomizer.nextInt(max_str-min_str)+min_str
        );
    }
    public int damage(){
        magical = Randomizer.nextInt(50-1)+1;
        dmg = super.damage();
        if (magical%50 == 0){
            dmg += 50;
        }
        else{
            dmg = dmg;
        }
        return dmg;
    }
    public String toString(){
        return "Demon";
    }
}
