package com.sean.datastructure.tree;

/**
 * @AUTHOR: guozb
 * @DATE: 2014-6-6
 */
public class TreeRoot implements Trie {
	
	private Branch[] roots;
	
	public TreeRoot(final int size){
		roots = new Branch[size];
	}

	/* (non-Javadoc)
	 * @see com.sean.datastructure.tree.Trie#insertBranch(com.sean.datastructure.tree.Branch)
	 */
	@Override
	public void insertBranch(Branch branch) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.sean.datastructure.tree.Trie#getBranch(char)
	 */
	@Override
	public Trie getBranch(char chr) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.sean.datastructure.tree.Trie#getChar()
	 */
	@Override
	public char getChar() {
		// TODO Auto-generated method stub
		return 0;
	}

}
