/**
 * @filename PartA.java
 * @author Brandon London
 * @date 11/1/2020
 * @course CMP SCI 3130
 * @title Project 3
 * @purpose To benchmark a BST's functions.
 * @notes
 */
package main;

public class PartA {

  public static void main(String[] args) {
    // Create an array of integers
    int[] array = new int[] {30, 10, 45, 38, 20, 50, 25, 33, 8, 12};
    // Create a BST with the array
    BST bst = new BST(array);

    // Display preorder, inorder and postorder results of the BST
    System.out.print("Preorder: ");
    bst.traversePreorder();
    System.out.print("Inorder: ");
    bst.traverseInorder();
    System.out.print("Postorder: ");
    bst.traversePostorder();

    // Display the height of the tree
    System.out.println("Height: " + bst.getHeight());

    // Display the smallest and largest keys
    System.out.println("Smallest: " + bst.getSmallest());
    System.out.println("Largest: " + bst.getLargest());

    // Display results of searching for keys 38 and 9
    BST.DEBUG = true;
    System.out.println("38 Exists: " + bst.find(38));
    System.out.println("9 Exists: " + bst.find(9));
    BST.DEBUG = false;

    // Delete node with a key value of 10
    bst.delete(10);
    System.out.println("10 Deleted");

    // Display preorder, inorder and postorder results of the new BST
    System.out.print("Preorder: ");
    bst.traversePreorder();
    System.out.print("Inorder: ");
    bst.traverseInorder();
    System.out.print("Postorder: ");
    bst.traversePostorder();
  }

}
