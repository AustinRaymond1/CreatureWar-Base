
/**
 * This is the Demon class.
 *
 * @author Austin Raymond
 * @version 11.18.2018
 */
public class Demon extends Creature
{
    private int magical;
    private int dmg;
    /**
     * Constructor for objects of class Demon
     */
    public Demon(int str, int hp)
    {
        super(str, hp);
    }
    public int damage(){
        magical = Randomizer.nextInt(50-1)+1;
        dmg = super.damage();
        if (magical%5 == 0){
            dmg += 50;
        }
        else{
            dmg = dmg;
        }
        return dmg;
    }
}
