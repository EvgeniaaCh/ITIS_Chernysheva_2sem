public class BinaryTree {
    public static  Node root;

    public BinaryTree(){
        this.root = null;
    }

    public boolean find(int id){
        Node current = root;
        while(current!=null){
            if(current.data==id){
                return true;
            }else if(current.data>id){
                current = current.left;
            }else{
                current = current.right;
            }
        }
        return false;
    }
    public boolean delete(int id){
        Node parent = root;
        Node current = root;
        boolean isLeftChild = false;
        while(current.data!=id){
            parent = current;
            if(current.data>id){
                isLeftChild = true;
                current = current.left;
            }else{
                isLeftChild = false;
                current = current.right;
            }
            if(current ==null){
                return false;
            }
        }
       
        if(current.left==null && current.right==null){
            if(current==root){
                root = null;
            }
            if(isLeftChild ==true){
                parent.left = null;
            }else{
                parent.right = null;
            }
        }
        else if(current.right==null){
            if(current==root){
                root = current.left;
            }else if(isLeftChild){
                parent.left = current.left;
            }else{
                parent.right = current.left;
            }
        }
        else if(current.left==null){
            if(current==root){
                root = current.right;
            }else if(isLeftChild){
                parent.left = current.right;
            }else{
                parent.right = current.right;
            }
        }else if(current.left!=null && current.right!=null){

            Node nasl	 = getNasl(current);
            if(current==root){
                root = nasl;
            }else if(isLeftChild){
                parent.left = nasl;
            }else{
                parent.right = nasl;
            }
            nasl.left = current.left;
        }
        return true;
    }

    public Node getNasl(Node deleleNode){
        Node nasl =null;
        Node naslParent =null;
        Node current = deleleNode.right;
        while(current!=null){
            naslParent = nasl;
            nasl = current;
            current = current.left;
        }
        if(nasl!=deleleNode.right){
            naslParent.left = nasl.right;
            nasl.right = deleleNode.right;
        }
        return nasl;
    }
    public void insert(int id){
        Node newNode = new Node(id);
        if(root==null){
            root = newNode;
            return;
        }
        Node current = root;
        Node parent = null;
        while(true){
            parent = current;
            if(id<current.data){
                current = current.left;
                if(current==null){
                    parent.left = newNode;
                    return;
                }
            }else{
                current = current.right;
                if(current==null){
                    parent.right = newNode;
                    return;
                }
            }
        }
    }
    public void display(Node root){
        if(root!=null){
            display(root.left);
            System.out.print(" " + root.data);
            display(root.right);
        }
    }
}