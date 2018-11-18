
/**
 * Write a description of class Elf here.
 *
 * @author Austin Raymond
 * @version 11.18.2018
 */
public class Elf extends Creature
{
    // instance variables - replace the example below with your own
    private static final int max_hp = 25;
    private static final int min_hp = 8;
    private static final int max_str = 18;
    private static final int min_str = 5;
    private int magical;

    /**
     * Constructor for objects of class Elf
     */
    public Elf()
    {
        super(
            Randomizer.nextInt(max_hp-min_hp)+min_hp,
            Randomizer.nextInt(max_str-min_str)+min_str
        );
    }
    public int damage(){
        magical = Randomizer.nextInt(10-1)+1;
    }
}
