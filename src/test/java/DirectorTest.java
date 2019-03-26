import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void setup(){
        director = new Director("Fat Sam", "JM666666C", 50000, "Sales", 500000);

    }

    @Test
    public void hasName() {
        assertEquals("Fat Sam", director.getName());
    }

    @Test
    public void hasNINumber() {
        assertEquals("JM666666C", director.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(50000, director.getSalary());
    }

    @Test
    public void hasBudget() {
        assertEquals(500000, director.getBudget(), 1);
    }

    @Test
    public void hasPayRise() {
        assertEquals(51000, director.raiseSalary(), 2);
    }


}
