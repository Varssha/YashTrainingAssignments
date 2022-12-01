package com.demo.exception_10;

public class Test {

	public static void main(String[] agrs) {
		int arr[] = { 1, 4, 3, 2, 5, 6, 10 };
		Parent p = new Parent();
		p.largest(arr);
		Child c = new Child();
		c.largest(arr);
	}

}


