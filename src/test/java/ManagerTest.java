import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Hannah", "qwertyuiop", 60000.00, "techStaff");
    }

    @Test
    public void managerHasNameNiNumberSalary(){
        assertEquals("Hannah", manager.getName());
        assertEquals("qwertyuiop", manager.getNiNumber());
        assertEquals(60000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void managerHasDepartment(){
        assertEquals("techStaff", manager.getDeptName());
    }

    @Test
    public void managerCanGetRaise(){
        manager.raiseSalary(5000.00);
        assertEquals(65000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void managerCanGetBonus(){
        manager.payBonus();
        assertEquals(60600.00, manager.getSalary(),0.01);
    }
}

