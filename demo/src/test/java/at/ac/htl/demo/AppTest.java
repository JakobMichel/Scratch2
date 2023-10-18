package at.ac.htl.demo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void givenAddFunctionWhenAdding2And3ThenResult5() {
        var app = new App();
        var result = app.add(2, 3);
        assertEquals(5, result);
    }
}
