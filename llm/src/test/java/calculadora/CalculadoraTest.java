package calculadora;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class CalculadoraTest {

    private Calculadora calc;

    @Before
    public void setUp() {
        calc = new Calculadora();
    }

    // ==================== TESTES DE SOMA ====================

    @Test
    public void testSomarPositivos() {
        assertEquals(5, calc.somar(2, 3));
    }

    @Test
    public void testSomarNegativos() {
        assertEquals(-5, calc.somar(-2, -3));
    }

    @Test
    public void testSomarPositivoComNegativo() {
        assertEquals(1, calc.somar(5, -4));
    }

    @Test
    public void testSomarComZero() {
        assertEquals(7, calc.somar(7, 0));
        assertEquals(7, calc.somar(0, 7));
    }

    @Test
    public void testSomarComMaximos() {
        assertEquals(Integer.MAX_VALUE, calc.somar(Integer.MAX_VALUE, 0));
        assertEquals(Integer.MAX_VALUE - 1, calc.somar(Integer.MAX_VALUE - 1, 0));
    }

    // ==================== TESTES DE SUBTRAÇÃO ====================

    @Test
    public void testSubtrairPositivos() {
        assertEquals(2, calc.subtrair(5, 3));
    }

    @Test
    public void testSubtrairNegativos() {
        assertEquals(1, calc.subtrair(-2, -3));
    }

    @Test
    public void testSubtrairComZero() {
        assertEquals(5, calc.subtrair(5, 0));
        assertEquals(-5, calc.subtrair(0, 5));
    }

    // ==================== TESTES DE MULTIPLICAÇÃO ====================

    @Test
    public void testMultiplicarPositivos() {
        assertEquals(15, calc.multiplicar(3, 5));
    }

    @Test
    public void testMultiplicarNegativos() {
        assertEquals(15, calc.multiplicar(-3, -5));
    }

    @Test
    public void testMultiplicarPositivoNegativo() {
        assertEquals(-15, calc.multiplicar(3, -5));
    }

    @Test
    public void testMultiplicarComZero() {
        assertEquals(0, calc.multiplicar(5, 0));
        assertEquals(0, calc.multiplicar(0, 5));
        assertEquals(0, calc.multiplicar(0, 0));
    }

    // ==================== TESTES DE DIVISÃO ====================

    @Test
    public void testDividirPositivos() {
        assertEquals(3, calc.dividir(15, 5));
    }

    @Test
    public void testDividirNegativos() {
        assertEquals(3, calc.dividir(-15, -5));
    }

    @Test
    public void testDividirPositivoNegativo() {
        assertEquals(-3, calc.dividir(15, -5));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDividirPorZero() {
        calc.dividir(10, 0);
    }

    @Test
    public void testDividirZeroPorNumero() {
        assertEquals(0, calc.dividir(0, 5));
    }

    // ==================== TESTES DE PAR/ÍMPAR ====================

    @Test
    public void testIsParComPar() {
        assertTrue(calc.isPar(4));
        assertTrue(calc.isPar(0));
        assertTrue(calc.isPar(-6));
    }

    @Test
    public void testIsParComImpar() {
        assertFalse(calc.isPar(3));
        assertFalse(calc.isPar(-5));
    }

    // ==================== TESTES DE FATORIAL ====================

    @Test
    public void testFatorialZero() {
        assertEquals(1, calc.fatorial(0));
    }

    @Test
    public void testFatorialUm() {
        assertEquals(1, calc.fatorial(1));
    }

    @Test
    public void testFatorialPequeno() {
        assertEquals(2, calc.fatorial(2));
        assertEquals(6, calc.fatorial(3));
        assertEquals(24, calc.fatorial(4));
        assertEquals(120, calc.fatorial(5));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFatorialNegativo() {
        calc.fatorial(-3);
    }

    // ==================== TESTES DE BORDA ====================

    @Test
    public void testFatorialMaximo() {
        // Fatorial de 12 já é 479001600 (dentro do limite de int)
        // Fatorial de 13 excede int (6227020800 > 2^31-1)
        assertEquals(479001600, calc.fatorial(12));
    }

    @Test
    public void testSomarOverflow() {
        // Teste de overflow - Java não lança exceção, mas podemos verificar o comportamento
        int max = Integer.MAX_VALUE;
        int resultado = calc.somar(max, 1);
        // Esperado: overflow para Integer.MIN_VALUE
        assertEquals(Integer.MIN_VALUE, resultado);
    }
}