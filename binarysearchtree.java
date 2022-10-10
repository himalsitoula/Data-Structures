package lab4;



public class binarysearchtree {
	class node{
		int item;
		node right;
		node left;
		node(int item){
			this.item=item;
			this.right=right;
			this.left=left;
			
		}
	}
	node root;
	public binarysearchtree() {
		root=null;
	}
	public node leaf=null;
	public void search(node n,int key) {
		if (n.left==null && n.right==null) {
			if(n.item==key)
				System.out.println(key+" Found ");
			else 
				System.out.println(key+"not Found");
			
		}
		else if(n.item>key){
			search(n.left,key);
		}
		else if(n.item<key) {
			search(n.right,key);
			
		}
		else {
			System.out.println(key+" Not Found ");
			
		}
	
	}
	
	public void deleteleaf(node n,int key) {
		if (n.left==null && n.right==null) {
			if(n.item==key)
				n=null;
		}
		else if(n.item>key){
			search(n.left,key);
		}
		else if(n.item<key) {
			search(n.right,key);
			
		}
		else {
			System.out.println(key+" Element not present ");
			
		}
	}
	public void delchild(node n, int key ) {
		if (n.left==null && n.right!=null||n.left!=null && n.right==null) {
			if(n.item==key)
				n=null;
		}
		else if(n.item>key){
			search(n.left,key);
		}
		else if(n.item<key) {
			search(n.right,key);
			
		}
		else {
			System.out.println(key+" Element not present ");
			
		}
	}
	
	static void postorder(node current){
		if (current!=null) {
			
			postorder(current.left);
            postorder(current.right);
            System.out.println(current.item + " ");
		}
    }
	public void insert(node n , int val) {
		if (root==null) {
			root=new node(val);
		}
		else if(val<n.item) {
			if(n.left!=null) {
				insert(n.left,val);
			}
			else {
				System.out.println(val+"insert to left of "+n.item);
				n.left=new node(val);
			
			}
		}
		else if (val>n.item) {
			if (n.right!=null) {
				insert(n.right,val);
			}else {
				//System.out.println(val+"insert to the right");
				n.right=new node(val);
			}
		}
		
	
	}
	
	
	
	
	
	 

	public static void main(String[] args) {
		binarysearchtree t = new binarysearchtree();
		t.insert(t.root, 10);
		t.insert(t.root, 11);
		t.insert(t.root, 12);
		t.insert(t.root, 13);
		t.insert(t.root, 17);
		binarysearchtree.postorder(t.root);
		
	}

}
