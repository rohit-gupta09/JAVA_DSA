package binarySearchTree;
import java.util.*;
import java.io.*;
public class BinarySearch {

	static class Node{
		int data;
		Node left;
		Node right;
		
		Node(int data)
		{
			this.data=data;
		}
	}
	
	
	
	public static Node insert(Node root,int val)
	{
		if(root==null)
		{
			root=new Node(val);
			return root;
		}
		if(root.data>val)
		{
			root.left=insert(root.left,val);
		}
		else {
			root.right=insert(root.right,val);
		}
		return root;
	}
	
	
	public static void inorder(Node root)
	{
		if(root==null)
		{
			return;
		}
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
		
	}
	
	public static void preorder(Node root)
	{
		if(root==null)
		{
			return;
		}
		System.out.print(root.data+" ");
		preorder(root.left);
		preorder(root.right);
		
	}
	
	public static void postorder(Node root)
	{
		if(root==null)
		{
			return;
		}
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.data+" ");
	}
	
	public static boolean search(Node root,int key)
	{
		if(root==null)
		{
			return false;
		}
		if(root.data>key)
		{
			return search(root.left,key);
		}
		else if(root.data==key)
		{
			return true;
		}
		else {
			return search(root.right,key);
		}
	}
	
	public static Node delete(Node root,int val)
	{
		if(root.data>val)
		{
			root.left=delete(root.left,val);
		}
		else if(root.data<val)
		{
			root.right=delete(root.right,val);
		}
		else { //root.data==val
			//case 1 : no child
			if(root.left==null && root.right==null)
			{
				return null;
			}
			//case 2 : one child
			if(root.left==null)
			{
				return root.right;
			}
			else if(root.right==null)
			{
				return root.left;
			}
			
			// case 3:
			Node IS=inorderSuccessor(root.right);
			root.data=IS.data;
			root.right=delete(root.right,IS.data);
		}
		return root;
		
	}
	
	public static Node inorderSuccessor(Node root)
	{
		while(root.left != null)
		{
			root=root.left;
		}
		return root;
	}
	public static void printRange(Node root,int x,int y)
	{
		if(root==null)
		{
			return;
		}
		if(root.data>=x && root.data<=y)
		{
			printRange(root.left, x, y);
			System.out.print(root.data+" ");
			printRange(root.right, x, y);
		}
		else if(root.data>=y)
		{
			printRange(root.left, x, y);
		}
		else {
			printRange(root.right, x, y);
		}
	}
	
	public static void printPath(ArrayList<Integer> path)
	{
		for(int i=0;i<path.size();i++)
		{
			System.out.print(path.get(i)+"->");
		}
		System.out.println();
	}
	
	public static void roottoreaf(Node root,ArrayList<Integer> path)
	{
		if(root==null)
		{
			return;
		}
		path.add(root.data);
		
		//leaf
		if(root.left == null && root.right == null)
		{
			printPath(path);
		}
		else {//non-leaf
			roottoreaf(root.left, path);
			roottoreaf(root.right, path);
		}
	
		path.remove(path.size()-1);
		
	}
	
	public static void main(String[] args) {
		int values[]= {8,5,3,6,10,11,14};
		Node root=null;
		int key=4;
		int key2=7;
		int key3=14;
		for(int i=0;i<values.length;i++)
		{
			root=insert(root,values[i]);
		}
		
		inorder(root);
		System.out.println("\n");
		
		preorder(root);
		System.out.println("\n");
		
		postorder(root);
		System.out.println("\n");
		
		
//		if(search(root,key))
//		{
//			System.out.print("found");
//		}
//		else {
//			System.out.print("Not found");
//		}
//		System.out.println("\n");
//		
//		
//		if(search(root,key2))
//		{
//			System.out.print("found");
//		}
//		else {
//			System.out.print("Not found");
//		}
//		System.out.println("\n");
//		
//		
//		if(search(root,key3))
//		{
//			System.out.print("found");
//		}
//		else {
//			System.out.print("Not found");
//		}
//		
//		System.out.print("\n");
//		
//		delete(root,5);
//		inorder(root);
		
//		System.out.println("\n");	
//		printRange(root, 6, 10);
		
		roottoreaf(root, new ArrayList<>());

	}

}
