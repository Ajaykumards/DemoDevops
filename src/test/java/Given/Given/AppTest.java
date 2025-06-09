package Given.Given;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    private App app;
    public AppTest(String testname) {
    	super(testname);
    	this.app = app;
    }
    
    public void testfact0() {
    	assertEquals("Factorial of 0 must be 1",1,this.app.fact(0));
    }
    
    public void testfact5() {
    	assertEquals("Factorial of 0 must be 1",1,this.app.fact(5));

    }
}
