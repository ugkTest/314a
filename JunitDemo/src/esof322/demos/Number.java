package esof322.demos;

public class Number {
	private int myNumber;
	
	public Number(int myNumber){
		this.myNumber=myNumber;
	}
	
	@Override
	public int hashCode(){
		final int prime=31;
		int result=1;
		result=prime*result+myNumber;
		return result;
	}
	
	@Override
	public boolean equals(Object obj){
		if(this==obj)
			return true;
		if (obj==null)
			return false;
		if(getClass()!=obj.getClass())
			return false;
		Number other=(Number)obj;
		if(myNumber!=other.myNumber)
			return false;
		return true;
		
	}
	
	public static void main()
	

}
