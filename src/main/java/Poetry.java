
public class Poetry {
    static String output="-";
    static String[] poem={"This is the horse and the hound and the horn that belonged to\n",
    "   the farmer sowing his corn that kept\n",
    "   the rooster that crowed in the morn that woke\n",
    "   the priest all shaven and shorn that married\n",
    "   the man all tattered and torn that kissed\n",
    "   the maiden all forlorn that milked\n",
    "   that cow with the crumpled horn that tossed\n",
    "   the dog that worried\n",
    "   the cat that killed\n",
    "   the rat that ate\n",
    "   the malth that lay in\n",
    "   the house that Jack built.\n"};

    public static void main(String[] args)
    {
        //System.out.println("hello"+args[0]);
        if(args[0].equalsIgnoreCase("--reveal-for-day"))
            output=recite(Integer.parseInt(args[1]));
        else
            output=recite(0);
    }
    public static String recite(int count)
    {
        StringBuffer stringbuffer=new StringBuffer();
        if(count==0) {
            for (int i = 0; i < poem.length; i++) {
                stringbuffer.append("Day " + (i + 1) + "\n");
                for (int j = 0; j <= i; j++) {
                    stringbuffer.append(poem[j]);
                }
            }
        }
        else
        {
            for (int i = 0; i < count; i++) {

                    stringbuffer.append(poem[i]);

            }
        }
        System.out.println(stringbuffer.toString());
        return stringbuffer.toString();
    }
}
