package com.lzp.Demo.NiuKeWang;

import java.util.*;

public class Main {

	public static void main(String[] args) {

        List<Coordinate> coordinate = new ArrayList<Coordinate>();

		Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        while(in.hasNextInt()){
            int x = in.nextInt();
            int y = in.nextInt();
			if(x >= 0 && y >= 0) {
				Coordinate data = new Coordinate();
                data.setCoordinate(x,y);
                coordinate.add(data);
			}
        }
        Collections.sort(coordinate, new Comparator<Coordinate>() {
            public int compare(Coordinate o1, Coordinate o2) {
                int i = o1.getX() - o2.getX();
                if(i == 0){
                    return o1.getY() - o2.getY();
                }
                return i;
            }
        });


        List result = new ArrayList();

		if(N <= 500000 && N >= 1){
            int length = coordinate.size();
            int m = length - 1;
            result.add(coordinate.get(m).getX() + " " + coordinate.get(m).getY());
            while(m >= 0){
                int y_A = coordinate.get(m).getY();
                for(int k = m - 1; k >= 0; k--){
                    int y_B = coordinate.get(k).getY();
                    if(y_B > y_A){
                        result.add(y_A + " " + y_B);
                        m = k - 1;
                    }else{
                        m--;
                    }
                }
            }
            for(int n = 0; n < result.size(); n++){
                System.out.println(result.get(n));
            }
        }
    }
}
class Coordinate{

    private int x;

    public int getX() {
        return x;
    }

    private int y;

    public int getY() {
        return y;
    }

    public void setCoordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
