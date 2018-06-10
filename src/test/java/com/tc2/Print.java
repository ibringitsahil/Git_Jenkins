package com.tc2;

public class Print {
	
	public void print(){
		int[] arr = {2,4,6};
		
		for(int i=0;i<arr.length;i++){
		  System.out.println(arr[i]);
		}
	}
	
	public void print2(){
		int[] arr = {2,4,6};
		
		for(int a: arr){
			System.out.println(a);
		}
	}
	
	public static void main(String[] args) {
		Print print = new Print();
		print.print();
		
		Print print2 = new Print();
		print2.print2();
	}
}
