package com.revature;

public class Launcher {

	public static void main(String[] args) {
		
		  	BinaryTree tree = new BinaryTree();
	        int arr[] = new int[]{1, 2, 3, 4, 5, 6, 7};
	        int n = arr.length;
	        Node root = tree.sortedArrayToBST(arr, 0, n - 1);
	       
		
	}

}
