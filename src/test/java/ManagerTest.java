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

}

