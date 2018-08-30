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

/////////////
import java.util.Scanner;
public class Main{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String source=null;
source=sc.nextLine();
char[] chars=source.toCharArray();
System.out.println(timeOfChange(chars));
}
public static int timeOfChange(char[] chars){
char[] chars1=new char[chars.length];
char[] chars2=new char[chars.length];
for(int i=0;i<chars.length;i++){
chars1[i]=chars[i];
chars2[i]=chars[i];
}
int reverse=reverseSort(chars1);
int ascend=ascendSort(chars2);
return reverse>ascend?ascend:reverse;
}
public static int reverseSort(char[] a){
int count=0;
for(int i=1;i<a.length;i++){
for(int j=i;j>0&&a[j]<a[j-1];j--){
char temp=a[j];
a[j]=a[j-1];
a[j-1]=temp;
count++;
}
}
return count;
}
public static int ascendSort(char[] a){
int count=0;
for(int i=1;i<a.length;i++){
for(int j=i;j>0&&a[j]>a[j-1];j--){
char temp=a[j];
a[j]=a[j-1];
a[j-1]=temp;
count++;
}
}
return count;
}
}

///////
class Solution {
    public int minEatingSpeed(int[] piles, int H) {
        int lo = 1;
        int hi = 1_000_000_000;
        while (lo < hi) {
            int mi = (lo + hi) / 2;
            if (!possible(piles, H, mi))
                lo = mi + 1;
            else
                hi = mi;
        }

        return lo;
    }

    // Can Koko eat all bananas in H hours with eating speed K?
    public boolean possible(int[] piles, int H, int K) {
        int time = 0;
        for (int p: piles)
            time += (p-1) / K + 1;
        return time <= H;
    }
}







