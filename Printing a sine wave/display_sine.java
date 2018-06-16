import java.math.*;
public class display_sine {

	public static void main(String[] args) {
		//scale
		//y axis: -1 to +1 in 80, 0 to 0.25 in 10
		//x axis: 0 to 360 radians
		char [][] sin=new char[201][361];
		//init
		for(int i=0;  i<=200; i++)
		{
			for(int j=0; j<=360; j++)
			{
				sin[i][j]='`';
			}
	}
		int deg=0;
		for( ; deg<=360; deg++)
		{
			double sin_value=Math.sin(Math.toRadians(deg));
			//System.out.println(deg+"  "+sin_value);
			int mapped=0;
			if(sin_value<0)
			{
				sin_value=Math.abs(sin_value);
				mapped=100-(int)(sin_value*100);
			}
			else
			{
				sin_value=Math.abs(sin_value);
				mapped=100+(int)(sin_value*100);
			}
			
			
			System.out.println(deg+"  "+mapped);
			sin[mapped][deg]='*';
		}
		
		//change the values of a and b to larger values 
		//to display a smaller sine wave
		//a is for x axis
		//b is for y axis (in radians)
		int a=2;
		int b=1;
		
		for(int i=0;  i<200; i=i+a)
		{
			for(int j=0; j<360; j=j+b)
			{
				System.out.print(sin[i][j]);
		}
		System.out.println();
	}
	

}
}
