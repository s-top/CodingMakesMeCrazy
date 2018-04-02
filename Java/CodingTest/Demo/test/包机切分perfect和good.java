package com.lzp.Demo.NiuKeWang;

import java.util.*;

public class Main {

	//5 100
    //10 20 30 40 50
    //perfect 和 good
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

	    String n_sum = scanner.nextLine();

		String[] s = n_sum.split(" |\t");

	    int n =  Integer.parseInt(s[0]);

	    int sum =  Integer.parseInt(s[1]);

	    String list = scanner.nextLine();

	    String[] s_1 = list.split(" |\t");

		int[] numbers = new int[n];

		for(int i = 0; i < n; i++) {

			numbers[i] = Integer.valueOf(s_1[i]);

		}

	    scanner.close();

	    if(count(numbers,sum).size() == 0) {

	    	System.out.println("good");

	    }else {

	    	System.out.println("perfect");

	    }
	}

    private static void find(int[] candidates, int from, int sum, List<Integer> nums, List<List<Integer>> results) {
        if (sum == 0) {
            results.add(new ArrayList<>(nums));
            return;
        }
        if (from >= candidates.length || sum < 0 || candidates[from] > sum) return;
        for(int i=from; i<candidates.length && candidates[i]<=sum; i++) {
            if (i>from && candidates[i]==candidates[i-1]) continue;
            nums.add(candidates[i]);
            find(candidates, i+1, sum - candidates[i], nums, results);
            nums.remove(nums.size()-1);
        }
    }
    public static List<List<Integer>> count(int[] candidates, int target) {
        List<List<Integer>> results = new ArrayList<>();
        if (candidates == null) return results;
        Arrays.sort(candidates);
        find(candidates, 0, target, new ArrayList<>(), results);
        return results;
    }
}
