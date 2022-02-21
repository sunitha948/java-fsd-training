package training_java;


class Node{
	int key;
	Node left,right;
	public Node(int item)
	{
		key=item;
		left=right=null;
	}
}
class BinaryTree1
{
	Node root;
	BinaryTree1(int key)
	{
		root=new Node(key);
	}
	BinaryTree1()
	{
		root=null;
	}
	public static void main(String[] args) {
		BinaryTree1 tree=new BinaryTree1();
		tree.root=new Node(1);
		tree.root.left=new Node(6);
		tree.root.right=new Node(9);
		tree.root.right.right=new Node(3);
		tree.Inorder();
	}
	void Inordertrav(Node root)
	{
		if(root!=null)
		{
			Inordertrav(root.left);
			System.out.println(root.key);
			Inordertrav(root.right);
		}
	}
	void Inorder()
	{
		Inordertrav(root);
	}
	
}