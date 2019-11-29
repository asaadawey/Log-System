/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.jnativehook.keyboard.NativeKeyEvent;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author username
 */
public class NewJFrameTest {
    
    public NewJFrameTest() {
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
     * Test of success method, of class NewJFrame.
     */
    @Test
    public void testSuccess() {
        System.out.println("success");
        NewJFrame instance = new NewJFrame();
        instance.success();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of yy method, of class NewJFrame.
     */
    @Test
    public void testYy() {
        System.out.println("yy");
        NewJFrame instance = new NewJFrame();
        String[] expResult = null;
        String[] result = instance.yy();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of refresh method, of class NewJFrame.
     */
    @Test
    public void testRefresh() {
        System.out.println("refresh");
        NewJFrame instance = new NewJFrame();
        instance.refresh();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of register method, of class NewJFrame.
     */
    @Test
    public void testRegister() throws Exception {
        System.out.println("register");
        NewJFrame instance = new NewJFrame();
        instance.register();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of restart method, of class NewJFrame.
     */
    @Test
    public void testRestart() {
        System.out.println("restart");
        NewJFrame instance = new NewJFrame();
        instance.restart();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of contain method, of class NewJFrame.
     */
    @Test
    public void testContain() {
        System.out.println("contain");
        String senten = "";
        String search = "";
        boolean expResult = false;
        boolean result = NewJFrame.contain(senten, search);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Store method, of class NewJFrame.
     */
    @Test
    public void testStore() {
        System.out.println("Store");
        NewJFrame instance = new NewJFrame();
        instance.Store();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ifopen method, of class NewJFrame.
     */
    @Test
    public void testIfopen() {
        System.out.println("ifopen");
        NewJFrame instance = new NewJFrame();
        instance.ifopen();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ifclos method, of class NewJFrame.
     */
    @Test
    public void testIfclos() {
        System.out.println("ifclos");
        NewJFrame instance = new NewJFrame();
        instance.ifclos();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of writetolog method, of class NewJFrame.
     */
    @Test
    public void testWritetolog() {
        System.out.println("writetolog");
        String s = "";
        NewJFrame instance = new NewJFrame();
        instance.writetolog(s);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GatherWhichDoc method, of class NewJFrame.
     */
    @Test
    public void testGatherWhichDoc() {
        System.out.println("GatherWhichDoc");
        String s = "";
        NewJFrame instance = new NewJFrame();
        boolean expResult = false;
        boolean result = instance.GatherWhichDoc(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of OpenedPath method, of class NewJFrame.
     */
    @Test
    public void testOpenedPath() throws Exception {
        System.out.println("OpenedPath");
        String s = "";
        NewJFrame instance = new NewJFrame();
        instance.OpenedPath(s);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CheckChanges method, of class NewJFrame.
     */
    @Test
    public void testCheckChanges() throws Exception {
        System.out.println("CheckChanges");
        NewJFrame instance = new NewJFrame();
        instance.CheckChanges();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of LoopForCheck method, of class NewJFrame.
     */
    @Test
    public void testLoopForCheck() throws Exception {
        System.out.println("LoopForCheck");
        NewJFrame instance = new NewJFrame();
        instance.LoopForCheck();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of PrepareDocs method, of class NewJFrame.
     */
    @Test
    public void testPrepareDocs() {
        System.out.println("PrepareDocs");
        NewJFrame instance = new NewJFrame();
        instance.PrepareDocs();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class NewJFrame.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        NewJFrame.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of nativeKeyPressed method, of class NewJFrame.
     */
    @Test
    public void testNativeKeyPressed() {
        System.out.println("nativeKeyPressed");
        NativeKeyEvent nke = null;
        NewJFrame instance = new NewJFrame();
        instance.nativeKeyPressed(nke);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of nativeKeyReleased method, of class NewJFrame.
     */
    @Test
    public void testNativeKeyReleased() {
        System.out.println("nativeKeyReleased");
        NativeKeyEvent nke = null;
        NewJFrame instance = new NewJFrame();
        instance.nativeKeyReleased(nke);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of nativeKeyTyped method, of class NewJFrame.
     */
    @Test
    public void testNativeKeyTyped() {
        System.out.println("nativeKeyTyped");
        NativeKeyEvent nke = null;
        NewJFrame instance = new NewJFrame();
        instance.nativeKeyTyped(nke);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
