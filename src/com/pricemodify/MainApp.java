package com.pricemodify;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		/*
		 * For Original Items
		 */
		String[] origItems;
		float[] origPrices;
		int N = sc.nextInt();
		origItems = new String[N];
		for (int i = 0; i < N; i++) {
			origItems[i] = sc.next();
		}
		N = sc.nextInt();
		origPrices = new float[N];
		for (int i = 0; i < N; i++) {
			origPrices[i] = sc.nextFloat();
		}

		/*
		 * For modifying items
		 */
		String[] items;
		float[] prices;
		int M = sc.nextInt();
		items = new String[M];
		for (int i = 0; i < M; i++) {
			items[i] = sc.next();
		}
		M = sc.nextInt();
		prices = new float[M];
		for (int i = 0; i < M; i++) {
			prices[i] = sc.nextFloat();
		}


		sc.close();

		int count = new ModifyPrice().verifyItems(origItems, origPrices, items, prices);
		System.out.println(count);
	}

}
