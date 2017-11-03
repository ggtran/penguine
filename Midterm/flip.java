//Write a method Flip that takes a Random object as a parameter and that prints information about a coin-flipping simulation.

//Your method should use the Random object to produce a sequence of simulated coin flips, 
//printing whether each flip comes up "heads" or "tails". Each outcome should be equally likely. 
//Your method should stop flipping when you see three heads in a row.

static void Flip(Random r)
{
    int heads = 0;
    while (heads < 3)
    {
        if (r.Next(2) == 0)
        {
            Console.WriteLine("heads");
            heads++;
        }
        else
        {
            Console.WriteLine("tails");
            heads = 0;
        }
    }
}
