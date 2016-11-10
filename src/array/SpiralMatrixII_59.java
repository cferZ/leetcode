package array;
public class SpiralMatrixII_59 {
    public int[][] generateMatrix(int n) {
        int[][] result=new int[n][n];
        int x0=1,xn=n-1;
        int y0=0,yn=n-1;
        int stat=0;//0:y++ 1:x++ 2:y-- 3:x--
    	for(int i=0,x=0,y=0;i<n*n;i++){
        	result[x][y]=i+1;
        	switch(stat){
        	case 0:
        		if(y==yn){
        			stat=1;
        			yn--;
        			x++;
        		}
        		else
        			y++;
        		break;
        	case 1:
        		if(x==xn){
        			stat=2;
        			xn--;
        			y--;
        		}
        		else
        			x++;
        		break;
        	case 2:
        		if(y==y0){
        			stat=3;
        			y0++;
        			x--;
        		}
        		else
        			y--;
        		break;
        	case 3:
        		if(x==x0){
        			stat=0;
        			x0++;
        			y++;
        		}
        		else
        			x--;
        	}
    	}
    	return result;
    }
}
