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
    Creature[] army1 = new Creature[100];
    Creature[] army2 = new Creature[100];
    private int index1 = 0;
    private int index2 = 0;
    Creature soldier1;
    Creature soldier2;
    private int b = 0;
    private int b2 = 0;
    /**
     * Constructor for objects of class War
     */
    public War()
    {
        for (counter = 0; counter < 100; ++counter){
            c = Randomizer.nextInt(25-1)+1;
            if (c >= 1 && c <= 5){
                army1[counter] = new Human();
            }
            else if (c >= 6 && c <= 10){
                army1[counter] = new Elf();
            }
            else if (c >= 11 && c <= 15){
                army1[counter] = new Cyberdemon();
            }
            else if (c >= 16 && c <= 20){
                army1[counter] = new Demon();
            }
            else if (c >= 21 && c <= 25){
                if (b <= 2){
                    army1[counter] = new Balrog();
                    ++b;
                }
                else{
                    --counter;
                }
            }
        }
        for (counter = 0; counter < 100; ++counter){
            c = Randomizer.nextInt(25-1)+1;
            if (c >= 1 && c <= 5){
                army2[counter] = new Human();
            }
            else if (c >= 6 && c <= 10){
                army2[counter] = new Elf();
            }
            else if (c >= 11 && c <= 15){
                army2[counter] = new Cyberdemon();
            }
            else if (c >= 16 && c <= 20){
                army2[counter] = new Demon();
            }
            else if (c >= 21 && c <= 25){
                if (b2 <= 2){
                    army2[counter] = new Balrog();
                    ++b2;
                }
                else{
                    --counter;
                }
                
            }
        }
    }
    public void doBattle(){
        while(index1 < 100 && index2 < 100){
            soldier1 = army1[index1];
            soldier2 = army2[index2];
            while (soldier1.isAlive() && soldier2.isAlive()){
                soldier1.takeDamage(soldier2.damage());
                soldier2.takeDamage(soldier2.damage());
            }
            if (soldier1.isDead()){
                index1++;
            }
            if (soldier2.isDead()){
                index2++;
            }
        }
        if (index1 == 100 && index2 != 100){
            System.out.println("Army 1 has won");
        }
        else if (index2 == 100 && index1 != 100){
            System.out.println("Army 2 has won");
        }
        else if (index1 == 100 && index2 == 100){
            System.out.println("It was a Draw");
        }
    }
}
