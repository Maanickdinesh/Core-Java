package corejava;

import java.util.Arrays;

public class CheckTwoArrayEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {12,3,14};
		int[] b = {12,13,14};
		
		Arrays.sort(a);
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		//System.out.println(a);
		boolean same =true;

		for(int i=0;i<a.length;i++) {
			if(a[i]!=b[i]) {
				same =false;
				break;
			}
		}
		if(same==true) {
			System.out.println("arrays are same");
		}
		else {
			System.out.println("not same");
		}
	}

}
