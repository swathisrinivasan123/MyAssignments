package week1.day2;

public class FindFibonaaci {

	public static void main(String[] args) {
		int n=8;
		int x=0;
		int y=1;
		int z;
		System.out.println(x);
				for(int i=2;i<=n;i++) {
			z=x+y;
		System.out.println(z);
			y=x;
			x=z;
		}

	}

}
