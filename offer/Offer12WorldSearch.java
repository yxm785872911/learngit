package com.yxm.offer;

public class Offer12WorldSearch {
	
	public static void main(String[] args) {
		System.out.println(546154&~(-1<<6));
		System.out.println(Integer.toBinaryString(546154&~(-1<<6)));
		int[] arr = {2,0,1,1,2};
		
	}


	public boolean exist(char[][] board, String word) {
		if (board==null||board.length==0||board[0].length==0) {
			return false;
		}
		char[] c = word.toCharArray();
		for(int i = 0;i<board.length;i++){
			for(int j = 0;j<board[0].length;j++){
				if (board[i][j]==c[0]&&dfs(i,j,1,c,board)) {
					return true;
				}
			}
		}
		return false;
	}


	public boolean dfs(int i, int j, int k, char[] c, char[][] board) {
		if (k==c.length) {
			return true;
		}
		char ch = board[i][j];
		board[i][j] = '#';
		
		if (i>0&&c[k]==board[i-1][j]) {
			if (dfs(i-1, j, k+1, c, board)) {
				return true;
			}
		}
		
		if (i<board.length-1&&board[i+1][j]==c[k]) {
			if (dfs(i+1, j, k+1, c, board)) {
				return true;
			}
		}
		
		if (j>0&&board[i][j-1]==c[k]) {
			if (dfs(i, j-1, k+1, c, board)) {
				return true;
			}
		}
		
		if (j<board[0].length-1&&board[i][j+1]==c[k]) {
			if (dfs(i, j+1, k+1, c, board)) {
				return true;
			}
		}
		
		board[i][j] = ch;
		return false;
	}

}
