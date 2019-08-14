/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author SSAM
 */
public class EmployeeTest {
    
    /*
        Escenario en que el empleado Worker utiliza la moneda EUR y calcula
        el decimo en el mes de agosto
    */
    @Test
    public void testCsCurrencyIsNotUSD() {
        Employee e = new Employee( 450f, "EUR", 0.5f, EmployeeType.Worker);
        assertTrue(e.cs() == (450.0f * 0.95));
    }
    
    /*
        Escenario en el que se prueba  que cuando se envia un tipo de empleado 
        que no exista se devuelva el decimo correspondiente
    */
    @Test
    public void EmployeeTestNull() {
        Employee e = new Employee( 450f, "EUR", 0.5f, null);
        assertTrue(e.cs() == 0.0f);
    }
}
