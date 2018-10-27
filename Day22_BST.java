package Hackerrank;

import java.util.Scanner;

class BSTNode {
    BSTNode left,right;
    int data;
    
    BSTNode(int data){
        this.data = data;
        left = right = null;
    }
}

public class Day22_BST {
	
	public static int getHeight(BSTNode root) {
	    //Write your code here
		BSTNode node = root;
		if (node == null)
			return -1;
		
		int leftDepth = getHeight(node.left); 
		int rightDepth = getHeight(node.right);
			
		int max = Math.max(leftDepth,  rightDepth);
		
		return max+1;
	}
	
	 public static BSTNode insert(BSTNode root,int data) {
	        if(root == null){
	            return new BSTNode(data);
	        }
	        else{
	            BSTNode cur;
	            if(data <= root.data){
	                cur = insert(root.left,data);
	                root.left = cur;
	            }
	            else{
	                cur = insert(root.right,data);
	                root.right = cur;
	            }
	            return root;
	        }
	    }
		 public static void main(String args[]) {
	        Scanner scan = new Scanner(System.in);
	        int T = scan.nextInt();
	        BSTNode root = null;
	        
	        while(T-->0){
	            int data = scan.nextInt();
	            root = insert(root,data);
	        }
	        
	        int height = getHeight(root);
	        System.out.println(height);
	        
	        scan.close();
	    }

}
