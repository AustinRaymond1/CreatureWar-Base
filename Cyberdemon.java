
/**
 * Write a description of class Cyberdemon here.
 *
 * @author Austin Raymond
 * @version 11.18.2018
 */
public class Cyberdemon extends Demon
{
    private static final int max_hp = 100;
    private static final int min_hp = 25;
    private static final int max_str = 40;
    private static final int min_str = 20;

    /**
     * Constructor for objects of class Cyberdemon
     */
    public Cyberdemon()
    {
        super(Randomizer.nextInt(max_hp-min_hp)+min_hp,
            Randomizer.nextInt(max_str-min_str)+min_str);
    }
}
