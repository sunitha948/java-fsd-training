package training_java;

public class BinarySearchTree1 {
 class Node{
	 int key;
	 Node right,left;
	 public Node(int item)
	 {
		 key=item;
		 right=left=null;
	 }
 }
 Node root;
 BinarySearchTree1()
 {
	 root=null;
 }
 void insert(int key)
 {
	 root=insertRec(root, key);
 }
 Node insertRec(Node root,int key)
 {
	 if(root==null)
	 {
		 root=new Node(key);
		 return root;
	 }
	 if(key<root.key)
	 {
		 root.left=insertRec(root.left,key);
	 }
	 if(key>root.key)
	 {
		root.right= insertRec(root.right,key);
	 }
	 return root;
 }
 void inorder()
 {
	 inorderRec(root);
 }
 void inorderRec(Node root)
 {
	 if(root!=null)
	 {
		 inorderRec(root.left);
		 System.out.println(root.key);
		 inorderRec(root.right);
	 }
 }
 public static void main(String[] args) {
	BinarySearchTree1 tree=new BinarySearchTree1();
	tree.insert(5);
	tree.insert(78);
	tree.insert(1);
	tree.insert(30);
	tree.insert(38);
	tree.inorder();
}
}
