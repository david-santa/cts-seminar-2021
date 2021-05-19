package ro.ase.csie.cts.seminar12.testare.teste;

import org.junit.Test;
import ro.ase.csie.cts.seminar12.testare.modele.OperatiiMatematice;

import static org.junit.Assert.*;

public class OperatiiMatematiceTest {


    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @Test
    public void test() {
        fail("Not yet implemented");
    }

    @Test
    public void testAdunaValori() {
        int a = 5;
        int b = 5;
        int rezultatAsteptat = 10;
        int rezultatCalculat = OperatiiMatematice.aduna(a, b);

        assertEquals("Suma cu numere pozitive", rezultatAsteptat, rezultatCalculat);
    }
}