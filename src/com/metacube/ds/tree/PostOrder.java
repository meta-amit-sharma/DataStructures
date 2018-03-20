package com.metacube.ds.tree;

import java.util.ArrayList;
import java.util.List;

import com.metacube.utils.Node;

/**
 * returns the traversed nodes in post ordered traversal using recursive calling
 * @author Amit Sharma
 *
 */
public class PostOrder<T> {
	List<T> traversedPath = new ArrayList<>();
	public List<T> postOrder(Node<T> root) {
		/*Visits the left subtree recursively*/
		if(root.left!=null) {
			postOrder(root.left);
		}
		/*Visits the right subtree recursively*/
		if(root.right!=null) {
			postOrder(root.right);
		}
		/*Adds the current node data*/
		traversedPath.add(root.data);
		return traversedPath;
	}
}
