package com.revature;

public class BinaryTree {
	static Node root;
	
	
	 Node sortedArrayToBST(int arr[], int start, int end) {
		 
		 if (start > end) {
	            return null;
	        }
		 int mid = (start + end) / 2;
	     Node node = new Node(arr[mid]);
	     
	     node.left = sortedArrayToBST(arr, start, mid - 1);
	     
	     node.right = sortedArrayToBST(arr, mid + 1, end);
         
	     return node;
	 }
	 
	
}
