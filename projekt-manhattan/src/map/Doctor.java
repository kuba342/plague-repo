package map;

import random.Dice;

public final class Doctor extends Man
{
    public Doctor()
    {
        super(Dice.d2(), 25 + Dice.d20(2), 'd');
    }

    public void heal(Man patient)
    {
        
    }
}