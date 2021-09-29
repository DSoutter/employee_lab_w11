import org.junit.Before;
import org.junit.Test;
import staff.management.director.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    Director director;

    @Before
    public void before(){
        director = new Director("Colin", "123456789", 100000.00, 50000.00);
    }

    @Test
    public void directorHasNameNiNumberSalary(){
        assertEquals("Colin", director.getName());
        assertEquals("123456789", director.getNiNumber());
        assertEquals(100000.00, director.getSalary(), 0.01);
    }

    @Test
    public void directorCanGetRaise(){
        director.raiseSalary(10000.00);
        assertEquals(110000.00, director.getSalary(), 0.01);
    }

    @Test
    public void directorCanGetBonus(){
        director.payBonus();
        assertEquals(102000.00, director.getSalary(), 0.01);
    }

    @Test
    public void directorHasBudget(){
        assertEquals(50000.00, director.getBudget(), 0.01);
    }

}
