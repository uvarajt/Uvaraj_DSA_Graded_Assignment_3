package com.greatlearning.main;

import com.greatlearning.services.BSTtoSkewedTree;
import com.greatlearning.services.Node;
import com.greatlearning.services.PrintRightSkewedTree;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    	//BSTtoSkewedTree tree = new BSTtoSkewedTree();
    	//PrintRightSkewedTree printRightSkew = new PrintRightSkewedTree();
    	
        BSTtoSkewedTree.node = new Node(50);
        BSTtoSkewedTree.node.left = new Node(30);
        BSTtoSkewedTree.node.right = new Node(60);
        BSTtoSkewedTree.node.left.left = new Node(10);
        BSTtoSkewedTree.node.right.left = new Node(55);
       
        BSTtoSkewedTree.bstToSkewedTree(BSTtoSkewedTree.node);
        
        PrintRightSkewedTree.printRightSkewed(BSTtoSkewedTree.headNode);

	}

}
