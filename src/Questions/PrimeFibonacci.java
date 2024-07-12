package Questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;

public class PrimeFibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		while (a < b) {
			boolean flag = false;
			for (int i = 2; i <= a / 2; ++i) {
				// condition for non-prime number
				if (a % i == 0) {
					flag = true;
					break;
				}
			}
			if (!flag && a != 0 && a != 1) {
				list.add(a);
			}
			++a;// incrementing the value in interval
		}
		// System.out.println(list);
		LinkedHashSet<Integer> set = new LinkedHashSet<>();
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list.size(); j++) {
				if (i == j) {
					continue;
				}
				set.add(Integer.parseInt(list.get(i) + "" + list.get(j)));
			}
		}
		// System.out.println(set);
		// int count=0;
		List<Integer> flist = new ArrayList<>();
		for (Integer c : set) {
			boolean flag = false;
			for (int i = 2; i <= c / 2; ++i) {
				// condition for non-prime number
				if (c % i == 0) {
					flag = true;
					break;
				}
			}
			if (!flag && c != 0 && c != 1) {
				flist.add(c);
			}
		}
		Collections.sort(flist);
		// System.out.println(flist);
		long x = flist.get(0);
		long y = flist.get(flist.size() - 1);
		long sum = x + y;
		for (int i = 1; i < flist.size() - 2; i++) {
			x = y;
			y = sum;
			sum = x + y;
		}
		System.out.println(sum);
		sc.close();
	}
}
