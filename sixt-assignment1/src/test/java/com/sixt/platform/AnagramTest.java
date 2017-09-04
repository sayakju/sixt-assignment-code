package test.java.com.sixt.platform;

import main.java.com.sixt.platform.Anagram;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

/**
 * Created by sghosh8 on 9/3/17.
 */
public class AnagramTest {

    private Anagram anagram;

    @Before
    public void setUp() throws Exception {
        anagram = new Anagram();
    }

    @Test
    public void testIsAnagramTrueCase() throws Exception {
        boolean result = anagram.isAnagram("anagram", "nagaram");
        assertTrue(result);
    }

    @Test
    public void testIsAnagramFalseCase() throws Exception {
        boolean result = anagram.isAnagram("anagram", "bagaram");
        assertFalse(result);
    }

    @Test
    public void testIsAnagramDifferentCaseTrueCase() throws Exception {
        boolean result = anagram.isAnagram("anagram", "NagarAm");
        assertTrue(result);
    }

    @After
    public void tearDown() throws Exception {
        anagram = null;
        assertNull(anagram);
    }
}