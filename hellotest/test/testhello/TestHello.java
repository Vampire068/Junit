package testhello;
  
import hello.Hello;//���ñ����Ե���
import org.junit.Test;  //ʹ��junit�Ĺ��ߺ���
import org.junit.Before; //ʹ��junit�Ĺ��ߺ���
import static org.junit.Assert.*;  
	 
public class TestHello {  
	    private Hello _target;  //ָʾע�����������õĳ���Ԫ�ص�����      
	    @Before  //@Before������һ���û���Ϣ
	    public void beforeTest(){  
	        _target = new Hello();  
	    }  	      
	    @Test  //@Test����һ�����Է���
	    public void testGetMessage(){  
	        String expected = "Hello Junit";  	         
	        String actual = _target.getMessage();  	         
	        assertEquals(expected,actual);  //�Ա��ַ����Ƿ���ȣ�ʵ�ֵ�Ԫ����Ŀ��
	    }  
	}  

