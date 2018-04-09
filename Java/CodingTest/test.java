import java.util.Scanner;

public class Main {


    static String hws = "";
    static int num = 0;
    static String[] hw;

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] c = s.toCharArray();
        System.out.println("--------输出所有的回文------");
        outPalindrome(c);

	}

	public static String[] createHw() {
        return new String[num];
    }

    public static void hwsClose() {
         hws = "";
    }

    public static int judgeNumber(char[] c) {
        for (int i = 0; i < c.length - 1; i++) {
            if (c[i] == c[i + 1]) {
                num++;
            }
        }
        return num;
    }

    public static void judge(char[] c) {
        judgeNumber(c);
        if (num != 0) {
            hw = createHw();
            for (int i = 0; i < c.length - 1; i++) {
                if (c[i] == c[i + 1]) {
                    hws = hws + c[i];
                    judge2(c, i, i + 1);
                    hw[--num] = hws;
                    hwsClose();
                }
            }
        } else {
            System.out.println("该字符串没有回文");
        }
    }

    public static void judge2(char[] c, int i, int k) {
        if (i - 1 >= 0 && k + 1 < c.length) {
            if (c[i - 1] == c[k + 1]) {
                hws = hws + c[i - 1];
                judge2(c, i - 1, k + 1);
            }
        }
    }

    public static void outPalindrome(char[] c) {
         judge(c);
         if (hw!=null) {
             for (int i = 0; i < hw.length; i++) {
                 System.out.println(reverse(hw[i])+hw[i]);
             }
         } else {
             System.out.println("没有回文2");
         }
    }

    public static StringBuffer reverse(String string){
         StringBuffer sb=new StringBuffer();
         char a;
         for(int i=0;i<string.length();i++){
             a=string.charAt(string.length()-1-i);
             sb.append(a);
         }
         return sb;
    }



}