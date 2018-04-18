import java.util.Scanner;

public class Main {
    import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int years = sc.nextInt();
		int weeks = sc.nextInt();
		if(years<=0||weeks<0||weeks>6||years>400){
			System.out.println(-1);
			return;
		}
		int[] days = {31,31,28,31,30,31,30,31,31,30,31,30};
		int today = (13-31)%7;
		int thisYear = 1900;
		int count=0;

		for(int i=0;i<years;i++){
			boolean isR = false;
			if(thisYear%100==0){
				if(thisYear%400==0){
					isR=true;
				}
			}else if(thisYear%4==0){
				isR=true;
			}
			thisYear++;
			for(int j=0;j<12;j++){
				today = (today+days[j])%7;
				if(j==2&&isR){
					today++;
					today=today%7;
				}
				if(today==weeks){
					count++;
				}
			}
		}

		System.out.println(count);

	}

}
}