package com.greatlearning.services;

public class Node {
	
    int val;
    public Node left;
	public Node right;
    
    public Node(int item) {
    	
        val = item;
        left = right = null;
    }
}
