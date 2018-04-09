import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] nArr=new long[n];
		for(int i=0;i<n;i++){
			nArr[i]=sc.nextLong();
		}
		for(int i=0;i<n;i++){
			long number=nArr[i];
			long x=number,y=1;


			while(x%2==0){
				x=x/2;
				y=y*2;
			}
			if(y==1){
				System.out.println("No");
			}else{
				System.out.println(x+" "+y);
			}

		}

	}

}