import org.junit.Before;
import org.junit.Test;
import staff.techstaff.DataBaseAdmin;

import static org.junit.Assert.assertEquals;

public class DataBaseAdminTest {

    DataBaseAdmin databaseadmin;

    @Before
    public void setup(){
        databaseadmin = new DataBaseAdmin("Buddy", "JM109999B", 22000);

    }

    @Test
    public void hasName() {
        assertEquals("Buddy", databaseadmin.getName());
    }

    @Test
    public void hasNationalInsuranceNumber() {
        assertEquals("JM109999B", databaseadmin.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(22000, databaseadmin.getSalary());
    }




}
