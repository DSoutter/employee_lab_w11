import org.junit.Before;
import org.junit.Test;
import staff.Employee;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    Employee employee;

    @Before
    public void before(){
        employee = new Developer("Fred", "abcde1234", 30000);
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
        assertEquals(30000, employee.getSalary());
    }
}
