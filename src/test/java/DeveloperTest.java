import org.junit.Before;
import org.junit.Test;
import staff.techstaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void setup(){
        developer = new Developer("Mr-T", "JM000000A", 26000);

    }

    @Test
    public void hasName() {
        assertEquals("Mr-T", developer.getName());
    }

    @Test
    public void hasNINumber() {
        assertEquals("JM000000A", developer.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(26000, developer.getSalary());
    }
}
