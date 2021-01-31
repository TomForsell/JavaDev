package demo.additionallanguagefeatures;

import java.awt.Color;

public class Varargs {

	public static void main(String[] args) {

		//Excersise 2 - varargs

		int a = 1;
		int b = 2;
		int c = 3;
		int d = 4;
		int e = 5;

		System.out.println("sum of three integers are :" + getSum(a, b, c));
		System.out.println("sum of five integers are " + getSum(a,b,c,d,e));
	}


	public static int getSum(int ...intList){
		int result  = 0;
		for (int i =0; i<intList.length;i++)
		{
			result = Integer.sum(result,intList[i]);
		}
		return result;
	}


}
