package array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class WordSearch_79 {
    public boolean exist(char[][] board, String word) {
    	char tmp=0;
    	boolean result=false;
    	for(int i=0;i<board.length;i++){
    		for(int j=0;j<board[i].length;j++){
    			if(board[i][j]==word.charAt(0)){
    				
    				result = searchNeighbor(board, word, i, j);
    				if(result)
    					return true;
    				
    			}
    		}
    	}
    	return result;
    }
    public boolean searchNeighbor(char[][] board,String target,int i,int j){
    	if(target.equals("")){
    		return true;
    	}
    	if(i<0||j<0||i>=board.length||j>=board[i].length||board[i][j]!=target.charAt(0)){
    		
    		return false;
    	}
    	char tmp=board[i][j];
    	board[i][j]=0;
    	boolean result=searchNeighbor(board, target.substring(1), i-1, j)
    			||searchNeighbor(board, target.substring(1), i+1, j)
    			||searchNeighbor(board, target.substring(1), i, j-1)
    			||searchNeighbor(board, target.substring(1), i, j+1);
    	board[i][j]=tmp;
    	return result;
    }
    public static void main(String[] args) {
//    	char[][] t={{'a','b','c','e'},{'s','f','c','s'},{'a','d','e','e'}};
//    	String target="abcced";
    	char[][] t={{'a'}};
    	String target="ab";
    	WordSearch_79 tt=new WordSearch_79();
    	System.out.println(tt.exist(t, target));
	}
}
