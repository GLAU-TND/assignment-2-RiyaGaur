/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.mybst;

import problem1.node.TreeNode;

// to implement BinarySearchTree
public class MyBinarySearchTree{
    TreeNode root;
    int count;

    public MyBinarySearchTree(){
        root = null;
        count = 0;
    }

    public void insert(int data){
        TreeNode tn = new TreeNode();
        tn.setdata(data);
        if(root == null){
            root = tn;
        }
        else{
            TreeNode current = root;
            while(true){
                if(data > current.getdata()){
                    if(current.getRight()==null){
                        current.setRight(tn);
                        break;
                    }
                    else{
                        current = current.getRight();
                    }
                }
                else{
                    if(current.getLeft()==null){
                        current.setLeft(tn);
                        break;
                    }
                    else{
                        current = current.getLeft();
                    }
                }
            }
        }
    }
    private void LeftNode(TreeNode root){
        if(root == null)    return;
        else{
            if(root.getLeft()!=null){
                System.out.print(root.getLeft().getdata()+" ");
            }
            else{
                count++;
            }
            LeftNode(root.getLeft());
            LeftNode(root.getRight());
        }
    }

    public void printLeftNode(){
        LeftNode(root);
    }

    public void NotLeftcount(){
        System.out.println(count);
    }

    public void preorder(TreeNode root){
        if(root == null)    return;
        else{
            System.out.print(root.getdata()+"\t");
            preorder(root.getLeft());
            preorder(root.getRight());

        }
    }

    public void postorder(TreeNode root){
        if(root == null)    return;
        else{
            postorder(root.getLeft());
            postorder(root.getRight());
            System.out.print(root.getdata()+"\t");
        }
    }

    public void postVSpre(){
        System.out.println("PostOrder------------------- ");
        postorder(root);
        System.out.println();
        System.out.println("PreOrder---------------------");
        preorder(root);
    }

    public TreeNode getroot(){
        return root;
    }
}

