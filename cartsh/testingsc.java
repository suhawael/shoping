package cartsh;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class testingsc {
    @Before
	public void before() throws Exception{
    	sc shc= new sc();
    	shc.value=0;
    	shc.count=0;
    }
	
	@Test
	public void test() {
	sc shc= new sc();
	int s =shc.count;
	assertTrue(s==0);
	
	}
    @Test
    public void test2() {
    sc shc= new sc();
    shc.add(1,"java",127);
    assertTrue(sc.count==1);
    assertTrue(sc.value==127);
    
    }
    @Test
    public void test3() {
    sc w=new sc();
    w.add(1,"java",127); 
    w.add(1,"web",100);
    w.add(3, "suha", 3);
    assertTrue(sc.count==5);
    assertTrue(sc.value==236);
    
    }
    
    
    
    
    
    
    
    
}
