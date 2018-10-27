package Hackerrank;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class BSTLevelNode {
    BSTLevelNode left,right;
    int data;
    BSTLevelNode(int data) {
        this.data=data;
        left = right = null;
    }
    
    @Override
    public String toString() {
        return String.valueOf(data);
    }
}

public class Day23_BSTLevelOrderTraversal {
	
	static void levelOrder(BSTLevelNode root) {
	    //Write your code here
		Queue<BSTLevelNode> queue = new LinkedList<BSTLevelNode>();
	    queue.add(root);
			
		while (!queue.isEmpty()) {
			BSTLevelNode current = queue.remove();
	        System.out.print(current.data + " ");
	        
	        if (current.left != null)
	        	queue.add(current.left);
	        if (current.right != null)
	        	queue.add(current.right);
	    }
	}
	
	public static BSTLevelNode insert(BSTLevelNode root,int data) {
		
        if (root == null) {
            return new BSTLevelNode(data);
        }
        else {
            BSTLevelNode cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }
	
    public static void main(String args[]) {
            Scanner scan = new Scanner(System.in);
            int T = scan.nextInt();
            BSTLevelNode root = null;
            
            while(T --> 0) {
                int data = scan.nextInt();
                root = insert(root, data);
            }
            levelOrder(root);
            scan.close();
        }
}
