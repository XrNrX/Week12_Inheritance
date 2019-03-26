import com.sun.tools.doclint.Entity;
import org.junit.Before;
import org.junit.Test;
import staff.Employee;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    Manager manager;

    @Before
    public void setup() {
        manager = new Manager("Jerry", "JM109911B", 20000, "Sales");
    }

    @Test
    public void getEmployeeName() {
        assertEquals("Jerry", manager.getName());
    }

    @Test
    public void canIGetEmployeesSalary() {
        assertEquals(20000, manager.getSalary());
    }

    @Test
    public void getNiNumber() {
        assertEquals("JM109911B", manager.getNiNumber());
    }

    @Test
    public void getDeptName() {
        assertEquals("Sales", manager.getDeptName());
    }

    @Test
    public void raiseSalary() {
        assertEquals(20200, manager.raiseSalary(), 2);

    }

    @Test
    public void payBonus() {
        assertEquals(200, manager.payBonus());
    }

    @Test
    public void changeName() {
        manager.setName("Scooby-Doo");
        assertEquals("Scooby-Doo", manager.getName());
    }
}
