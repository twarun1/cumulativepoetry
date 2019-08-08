import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PoetryTest {

    //private Poetry poetry;

    @Before
    public void setUp() {
        //poetry = new Poetry();
    }
    @Test
    public void testrevealforday2() {
        String[] input={"--reveal-for-day","2"};
        Poetry.main(input);
        assertEquals("This is the horse and the hound and the horn that belonged to\n   the farmer sowing his corn that kept\n", Poetry.output);
    }
    @Test
    public void testrevealforday1() {
        String[] input={"--reveal-for-day","1"};
        Poetry.main(input);
        assertEquals("This is the horse and the hound and the horn that belonged to\n", Poetry.output);
    }
    @Test
    public void testRecite() {
        String[] input={"--recite"};
        Poetry.main(input);
        String expected="Day 1\n" +
                "This is the horse and the hound and the horn that belonged to\n" +
                "Day 2\n" +
                "This is the horse and the hound and the horn that belonged to\n" +
                "   the farmer sowing his corn that kept\n" +
                "Day 3\n" +
                "This is the horse and the hound and the horn that belonged to\n" +
                "   the farmer sowing his corn that kept\n" +
                "   the rooster that crowed in the morn that woke\n" +
                "Day 4\n" +
                "This is the horse and the hound and the horn that belonged to\n" +
                "   the farmer sowing his corn that kept\n" +
                "   the rooster that crowed in the morn that woke\n" +
                "   the priest all shaven and shorn that married\n" +
                "Day 5\n" +
                "This is the horse and the hound and the horn that belonged to\n" +
                "   the farmer sowing his corn that kept\n" +
                "   the rooster that crowed in the morn that woke\n" +
                "   the priest all shaven and shorn that married\n" +
                "   the man all tattered and torn that kissed\n" +
                "Day 6\n" +
                "This is the horse and the hound and the horn that belonged to\n" +
                "   the farmer sowing his corn that kept\n" +
                "   the rooster that crowed in the morn that woke\n" +
                "   the priest all shaven and shorn that married\n" +
                "   the man all tattered and torn that kissed\n" +
                "   the maiden all forlorn that milked\n" +
                "Day 7\n" +
                "This is the horse and the hound and the horn that belonged to\n" +
                "   the farmer sowing his corn that kept\n" +
                "   the rooster that crowed in the morn that woke\n" +
                "   the priest all shaven and shorn that married\n" +
                "   the man all tattered and torn that kissed\n" +
                "   the maiden all forlorn that milked\n" +
                "   that cow with the crumpled horn that tossed\n" +
                "Day 8\n" +
                "This is the horse and the hound and the horn that belonged to\n" +
                "   the farmer sowing his corn that kept\n" +
                "   the rooster that crowed in the morn that woke\n" +
                "   the priest all shaven and shorn that married\n" +
                "   the man all tattered and torn that kissed\n" +
                "   the maiden all forlorn that milked\n" +
                "   that cow with the crumpled horn that tossed\n" +
                "   the dog that worried\n" +
                "Day 9\n" +
                "This is the horse and the hound and the horn that belonged to\n" +
                "   the farmer sowing his corn that kept\n" +
                "   the rooster that crowed in the morn that woke\n" +
                "   the priest all shaven and shorn that married\n" +
                "   the man all tattered and torn that kissed\n" +
                "   the maiden all forlorn that milked\n" +
                "   that cow with the crumpled horn that tossed\n" +
                "   the dog that worried\n" +
                "   the cat that killed\n" +
                "Day 10\n" +
                "This is the horse and the hound and the horn that belonged to\n" +
                "   the farmer sowing his corn that kept\n" +
                "   the rooster that crowed in the morn that woke\n" +
                "   the priest all shaven and shorn that married\n" +
                "   the man all tattered and torn that kissed\n" +
                "   the maiden all forlorn that milked\n" +
                "   that cow with the crumpled horn that tossed\n" +
                "   the dog that worried\n" +
                "   the cat that killed\n" +
                "   the rat that ate\n" +
                "Day 11\n" +
                "This is the horse and the hound and the horn that belonged to\n" +
                "   the farmer sowing his corn that kept\n" +
                "   the rooster that crowed in the morn that woke\n" +
                "   the priest all shaven and shorn that married\n" +
                "   the man all tattered and torn that kissed\n" +
                "   the maiden all forlorn that milked\n" +
                "   that cow with the crumpled horn that tossed\n" +
                "   the dog that worried\n" +
                "   the cat that killed\n" +
                "   the rat that ate\n" +
                "   the malth that lay in\n" +
                "Day 12\n" +
                "This is the horse and the hound and the horn that belonged to\n" +
                "   the farmer sowing his corn that kept\n" +
                "   the rooster that crowed in the morn that woke\n" +
                "   the priest all shaven and shorn that married\n" +
                "   the man all tattered and torn that kissed\n" +
                "   the maiden all forlorn that milked\n" +
                "   that cow with the crumpled horn that tossed\n" +
                "   the dog that worried\n" +
                "   the cat that killed\n" +
                "   the rat that ate\n" +
                "   the malth that lay in\n" +
                "   the house that Jack built.\n";
        assertEquals(expected,Poetry.output);

    }

}