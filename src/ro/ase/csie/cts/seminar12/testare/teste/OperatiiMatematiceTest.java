package ro.ase.csie.cts.seminar12.testare.teste;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import ro.ase.csie.cts.seminar12.testare.modele.OperatiiMatematice;

import static org.junit.Assert.*;

public class OperatiiMatematiceTest {

    @BeforeClass
    public static void setUpBeforeClass(){
        System.out.println("salut");
    }

    @AfterClass
    public static void tearDownAfterClass(){
        System.out.println("La revedere");
    }

    @org.junit.Before
    public void setUp() throws Exception {
        System.out.println("Pregatire Test");
    }

    @org.junit.After
    public void tearDown() throws Exception {
        System.out.println("Stergere Resurse Test");
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