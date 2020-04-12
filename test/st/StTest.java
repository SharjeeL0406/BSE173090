/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author SHARJEEL
 */
public class StTest {
    
    public St goal = new St();
    
    public StTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class St.
     */
    @Test
  
      
    public void checktrue(){
        String a ="cricket";
      
        assertTrue(goal.cricket(a));
    }
 
        public void checkfalse(){
        String a ="playcricket";
       
        assertFalse(goal.cricket(a));
    }
 
               public void checkequal(){
        int num = 2;
        num = goal.cube(num);
        assertEquals(8,num);
    }

      
     public void checknotequal(){
        int num = 3;
        num = goal.cube(num);
        assertNotEquals(8,num);
    }
       
  
    
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        St.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
