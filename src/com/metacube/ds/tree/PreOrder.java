package com.metacube.ds.tree;

import java.util.ArrayList;
import java.util.List;

import com.metacube.utils.Node;

/**
 * returns the traversed nodes in pre ordered traversal using recursive calling
 * @author Amit Sharma
 *
 */
public class PreOrder<T> {
	List<T> traversedPath = new ArrayList<>();
	public List<T> preorder(Node<T> root) {
		/*Adds the current node data*/
		traversedPath.add(root.data);
		/*Visits the left subtree recursively*/
		if(root.left != null) {
			preorder(root.left);
		}
		/*Visits the right subtree recursively*/
		if(root.right != null) {
			preorder(root.right);
		}
		return traversedPath;
	}
}