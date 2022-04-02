package unitTests;

import devcalc.Calc;
import org.testng.annotations.Test;

import java.sql.SQLOutput;

import static org.testng.Assert.assertEquals;

public class TestaCalc {
        @Test
    public void testarSomarDoisNumeros(){
        // 1- Prepara
        int num1 = 5;
        int num2 = 7;
        int resultadoEsperado = 12;
        // 2- Executa
        int resultadoAtual = Calc.somarDoisNumeros(num1, num2);

        // 3- Valida
            System.out.println("O resultado esperado foi " + resultadoEsperado + "\nO resultado atual foi " + resultadoAtual);
        assertEquals(resultadoEsperado,resultadoAtual);
    }
}
