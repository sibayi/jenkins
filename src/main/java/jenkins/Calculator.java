package jenkins;

public class Calculator {
	
	public static Integer addNum(Integer a, Integer b) {
		
		if(a == null || b == null)
			return null;
		
		return (a + b);
		
	}
	public static Integer subNum(Integer a, Integer b) {
		
		if(a == null || b == null)
			return null;
		
		return (a - b);
		
	}
	
}