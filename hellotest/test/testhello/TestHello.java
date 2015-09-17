package testhello;
  
import hello.Hello;//调用被测试的类
import org.junit.Test;  //使用junit的工具函数
import org.junit.Before; //使用junit的工具函数
import static org.junit.Assert.*;  
	 
public class TestHello {  
	    private Hello _target;  //指示注释类型所适用的程序元素的种类      
	    @Before  //@Before来插入一条用户信息
	    public void beforeTest(){  
	        _target = new Hello();  
	    }  	      
	    @Test  //@Test定义一个测试方法
	    public void testGetMessage(){  
	        String expected = "Hello Junit";  	         
	        String actual = _target.getMessage();  	         
	        assertEquals(expected,actual);  //对比字符串是否相等，实现单元测试目的
	    }  
	}  

