import java.util.ArrayList;
/**
 * Write a description of class War here.
 *
 * @author Austin Raymond
 * @version 11.18.2018
 */
public class War
{
    private int counter;
    private int c;
    /**
     * Constructor for objects of class War
     */
    public War()
    {
        ArrayList<Creature> army = new ArrayList<Creature>();
        for (counter = 0; counter < 100; ++counter){
            c = Randomizer.nextInt(16-1)+1;
            if (c >= 1 || c <= 4){
                army.add(new Human());
            }
            else if (c >= 5 || c <= 8){
                
            }
        }
    }
}
