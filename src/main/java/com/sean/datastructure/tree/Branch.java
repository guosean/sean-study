package com.sean.datastructure.tree;

import lombok.Getter;

import com.google.common.base.Preconditions;

/**
 * @AUTHOR: guozb
 * @DATE: 2014-6-6
 */
public class Branch implements Trie {
	@Getter
	private char content;
	/**
	 * 子分支
	 */
	private Branch[] subBranches;
	/**
	 * 
	 * @param chr
	 */
	public Branch(char chr){
		this.content = chr;
	}

	/* (non-Javadoc)
	 * @see com.sean.datastructure.tree.Trie#insertBranch(com.sean.datastructure.tree.Branch)
	 */
	@Override
	public void insertBranch(Branch branch) {
		Preconditions.checkNotNull(branch);
		if(subBranches==null){
			subBranches = new Branch[0];
		}
		
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
		return content;
	}

}
