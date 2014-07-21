package func;

public class Calculator {

	public int add(int x, int y) {
		int result1 = x+y;
		return result1;
	}

	public int minus(int x, int y) {
		int result2 = x-y;
		return result2;
	}
	
	public int multi(int x, int y) {
		int result3 = x*y;
		return result3;
	}
	
	public int divi(int x, int y) {
		if(y==0){
			//割る数が0の場合
			System.out.println(x + "/" + y + "=∞です");
			System.out.println("0では割れません。強いて言えば∞です");
			throw new ArithmeticException("0では割れません");
		}
		int result4 = x/y;
		return result4;
	}
}
