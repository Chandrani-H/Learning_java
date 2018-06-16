import java.util.*;
public class Convert {

	static HashMap<Integer,String> rom;
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number between 1-5000");
		int num=sc.nextInt();
		
		//init
		rom=new HashMap<Integer,String>();
		rom.put(1, "I");
		rom.put(5,"V");
		rom.put(10,"X");
		rom.put(50,"L");
		rom.put(100,"C");
		rom.put(500,"D");
		rom.put(1000,"M");
		rom.put(5000, "Vb"); //V bar is 5000
		
		//dividing into parts
		int thousands,hundreds, tens, ones, temp=num;
		thousands=temp/1000;
		temp%=1000;
		hundreds=temp/100;
		temp%=100;
		tens=temp/10;
		temp%=10;
		ones=temp;
		String roman_val=thousandspart(thousands)+hundredspart(hundreds)+tenspart(tens)+onespart(ones);
		System.out.println(roman_val);
		sc.close();
	}			//main ends
	
	static String thousandspart(int n)
	{
		String th="";
		if(n==0)
			return th;
		if(n<4)
			th=rom.get(1000)+thousandspart(n-1);   //rom.get(1000)=M
		if(n==4)
			th=thousandspart(1)+thousandspart(5);   
		if(n==5)
			th=rom.get(5000);      //rom.get(5000)=Vb
		return th;
	}
	static String hundredspart(int n)
	{
		String hu="";
		if(n==0)
			return hu;
		if(n<4)
			hu=rom.get(100)+hundredspart(n-1); //rom.get(100)=C
		if(n==4)
			hu=hundredspart(1)+hundredspart(5);
		if(n==5)
			hu=rom.get(500);    //rom.get(500)=D
		if(n>5 && n<9)
			hu=hundredspart(5)+hundredspart(n-5);
		if(n==9)
			hu=hundredspart(1)+thousandspart(1);
		return hu;
	}
static String tenspart(int n)
{
	String te="";
	if(n==0)
		return te;
	if(n<4)
		te=rom.get(10)+tenspart(n-1);  //rom.get(1)=X
	if(n==4)
		te=tenspart(1)+tenspart(5);
	if(n==5)
		te=rom.get(50);   //rom.get(50)=L
	if(n>5 && n<9)
		te=tenspart(5)+tenspart(n-5);
	if(n==9)
		te=tenspart(1)+hundredspart(1);
	return te;
}
static String onespart(int n)
{
	String on="";
	if(n==0)
		return on;
	if(n<4)
		on=rom.get(1)+onespart(n-1); //rom.get(1)=I
	if(n==4)
		on=onespart(1)+onespart(5);
	if(n==5)
		on=rom.get(5); //rom.get(5)=V
	if(n>5 && n<9)
		on=onespart(5)+onespart(n-5);
	if(n==9)
		on=onespart(1)+tenspart(1);
	
	return on;
}

}
