package binaryTree;
import java.util.*;

class Node
{
	int key;
	Node left,right;
	
	public Node(int key)
	{
		this.key=key;
		left=right=null;
	}
}

public class BinaryTree {
	
	Node root;
	
	BinaryTree(int key)
	{
		root=new Node(key);
	}
	
	public BinaryTree() {
		root=null;
	}
	
	public static void preorder(Node root)
	{
		if(root==null)
		{
//			System.out.print("-1 ");
			return;
		}
		System.out.print(root.key+" ");
		preorder(root.left);
		preorder(root.right);
	}
	
	public static void Inorder(Node root)
	{
		if(root==null)
		{
//			System.out.print("-1 ");
			return;
		}
		Inorder(root.left);
		System.out.print(root.key+" ");
		Inorder(root.right);
	}
	
	public static void Postorder(Node root)
	{
		if(root==null)
		{
			return;
		}
		Postorder(root.left);
		Postorder(root.right);
		System.out.print(root.key+" ");
	}

	public static void levelorder(Node root)
	{
		if(root==null)
		{
			return;
		}
		Queue<Node> queue=new LinkedList<Node>();
		queue.add(root);
		queue.add(null);
		while(!queue.isEmpty())
		{
			Node currnode=queue.remove();
			if(currnode==null)
			{
				System.out.println();
				if(queue.isEmpty())
				{
					break;
				}
				else {
					queue.add(null);	
				}
			}
			else {
				System.out.print(currnode.key+" ");
				if(currnode.left !=null)
				{
					queue.add(currnode.left);
				}
				if(currnode.right !=null)
				{
					queue.add(currnode.right);
				}
			}
			
		}
		
	}
	
	public static int count(Node root)
	{
		if(root==null)
		{
			return 0;
		}
		int leftnodes=count(root.left);
		int rigthnodes=count(root.right);
		
		return leftnodes+rigthnodes+1;
	}
	
	public static int sumnodes(Node root)
	{
		if(root==null)
		{
			return 0;
		}
		int leftnodes=sumnodes(root.left);
		int rightnodes=sumnodes(root.right);
		return leftnodes+rightnodes+root.key;
	}
	
	public static int height(Node root)
	{
		if(root==null)
		{
			return 0;
		}
		int leftnodes=height(root.left);
		int rigthnodes=height(root.right);
		int myheigth=Math.max(leftnodes, rigthnodes)+1;
		return myheigth;
		
	}
	
	public static int diameternn(Node root)
	{
		if(root==null)
		{
			return 0;
		}
		int dia1=diameternn(root.left);
		int dia2=diameternn(root.right);
		int dia3=height(root.left)+height(root.right)+1;
		return Math.max(dia3, Math.max(dia1, dia2));
	}
	
	static class TreeInfo{
		int ht;
		int diam;
		
		TreeInfo(int ht,int diam)
		{
			this.ht=ht;
			this.diam=diam;
		}
	}
	
	public static TreeInfo diametern(Node root)
	{
		if(root==null)
		{
			return new TreeInfo(0,0);
		}
		TreeInfo left=diametern(root.left);
		TreeInfo right=diametern(root.right);
		
		int myheight=Math.max(left.ht,right.ht)+1;
		int dia1=left.diam;
		int dia2=right.diam;
		
		int dia3=left.ht+right.ht+1;
		int mydiam=Math.max(dia3, Math.max(dia1, dia2));
		TreeInfo myInfo=new TreeInfo(myheight,mydiam);
		return myInfo;
		
	}
	
	public static void main(String[] args) {
		
		BinaryTree Tree=new BinaryTree();
		Tree.root=new Node(1);
		Tree.root.left=new Node(2);
		Tree.root.right=new Node(3);
		Tree.root.left.left=new Node(4);
		Tree.root.left.right=new Node(5);
		Tree.root.right.left=new Node(6);
		preorder(Tree.root);
		System.out.println("\n");
		
		Inorder(Tree.root);
		System.out.println("\n");
		
		Postorder(Tree.root);
		System.out.println("\n");
		
		levelorder(Tree.root);
		System.out.print ("\n");
		
		System.out.print(count(Tree.root));
		System.out.println("\n");
		
		System.out.print(sumnodes(Tree.root));
		
		System.out.println("\n");
		System.out.println(height(Tree.root));
		
		System.out.println();
		System.out.println(diameternn(Tree.root));
		
		System.out.println();
		System.out.println(diametern(Tree.root).diam);
		
	}

}
