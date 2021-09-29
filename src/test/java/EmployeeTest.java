import org.junit.Before;
import org.junit.Test;
import staff.Employee;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    Employee employee;

    @Before
    public void before(){
        employee = new Developer("Fred", "abcde1234", 30000.0);
    }

    @Test
    public void employeeHasName(){
        assertEquals("Fred", employee.getName());
    }

    @Test
    public void employeeHasniNumber(){
        assertEquals("abcde1234", employee.getNiNumber());
    }

    @Test
    public void employeeHasSalary(){
        assertEquals(30000.0, employee.getSalary(), 0.01);
    }

    @Test
    public void employeeCanGetRaise(){
        employee.raiseSalary(1000.00);
        assertEquals(31000.00, employee.getSalary(),0.01);
    }

    @Test
    public void employeeCanGetBonus(){
        employee.payBonus();
        assertEquals(30300.0, employee.getSalary(), 0.01);
    }

    @Test
    public void employeeRaiseCantBeNegative(){
        employee.raiseSalary(-5000.00);
        assertEquals(30000.00, employee.getSalary(),0.01);
    }

    @Test
    public void canSetNameTrue(){
        employee.setName("Frederick");
        assertEquals("Frederick", employee.getName());
    }

    @Test
    public void canSetNameFalse(){
        employee.setName(null);
        assertEquals("Fred", employee.getName());
    }
}
