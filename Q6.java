
public class Q6 {

	public static void main(String[] args) {
		int a = 100;
		
		int sumsq=(a*(a+1)*(2*(a)+1))/6;
		System.out.println(sumsq);
		int sum=0,diff=0;
		for(int i=1;i<=a;i++)
		{
			sum=sum+i;
		}
		diff=(int) (sumsq-Math.pow(sum, 2));
		System.out.println("Difference b/w sum of square and square of sum till 100 = "+diff);
		
		
		
		
		

	}

}
