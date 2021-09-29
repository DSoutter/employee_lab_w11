import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {
    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Sally", "1234abcde", 40000.00);
    }

    @Test
    public void adminHasName(){
        assertEquals("Sally", databaseAdmin.getName());
    }

    @Test
    public void adminHasniNumber(){
        assertEquals("1234abcde", databaseAdmin.getNiNumber());
    }

    @Test
    public void adminHasSalary(){
        assertEquals(40000.0, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void adminCanGetRaise(){
        databaseAdmin.raiseSalary(1000.00);
        assertEquals(41000.00, databaseAdmin.getSalary(),0.01);
    }

    @Test
    public void adminCanGetBonus(){
        databaseAdmin.payBonus();
        assertEquals(40400.0, databaseAdmin.getSalary(), 0.01);
    }
}
