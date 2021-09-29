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
}
