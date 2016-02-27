package base;

public class MyInteger {
	private int iValue;
	
	public MyInteger(int iValue){
		this.iValue = iValue;
	}
		
	public int getiValue(){
		return this.iValue;
	}
	
	public boolean isEven(){
		if ((this.iValue % 2) == 0)
			return true;
		else 
			return false;
	}
	public boolean isOdd(){
		if ((this.iValue % 2) != 0)
				return true;
		else
			return false;
	}

	public boolean isPrime(){
		if ((this.iValue % 2) == 0)
			return false;
		else if ((this.iValue % 3) == 0)
			return false;
		else if ((this.iValue % 4) == 0)
			return false;
		else if ((this.iValue % 5) == 0)
			return false;
		else if ((this.iValue % 6) == 0)
			return false;
		else if ((this.iValue % 7) == 0)
			return false;
		else if ((this.iValue % 8) == 0)
			return false;
		else if ((this.iValue % 9) == 0)
			return false;
		else
			return true;
	}
	
	public static boolean isEven(int iValue){
		return isEven(iValue);
	}
	
	public static boolean isOdd(int iValue){
		return isOdd(iValue);
	}
	
	public static boolean isPrime(int iValue){
		return isPrime(iValue);
	}
	
	public static boolean isEven(MyInteger myinteger){
		return myinteger.isEven(myinteger.getiValue());
	}
	
	public static boolean isOdd(MyInteger myinteger){
		return myinteger.isOdd(myinteger.getiValue());
	}
	
	public static boolean isPrime(MyInteger myinteger){
		return myinteger.isPrime(myinteger.getiValue());
	}
	
	public boolean equals(int x){
		if (iValue == x)
			return true;
		else
			return false;
	}
	
	public boolean equals(MyInteger val2){
		return equals(val2);
	}
	
	}

