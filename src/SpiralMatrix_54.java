import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix_54 {

    public List<Integer> spiralOrder(int[][] matrix) {
        
    	List<Integer> result=new ArrayList<>();
    	if(matrix.length<1)
            return result;
        int stat=0;//0 y++ 1:x++ 2:y-- 3:x--
        int x0=1,xn=matrix.length-1;
        int y0=0,yn=matrix[0].length-1;
        
        for(int i=0,x=0,y=0;i<matrix.length*matrix[0].length;i++){
        	result.add(matrix[x][y]);
        	switch(stat){
        	case 0:
        		if(y==yn){
        			x++;
        			yn--;
        			stat=1;
        		}
        		else
        			y++;
        		break;
        	case 1:
        		if(x==xn){
        			y--;
        			xn--;
        			stat=2;
        		}
        		else
        			x++;
        		break;
        	case 2:
        		if(y==y0){
        			x--;
        			y0++;
        			stat=3;
        		}
        		else
        			y--;
        		break;
        	case 3:
        		if(x==x0){
        			y++;
        			x0++;
        			stat=0;
        		}
        		else
        			x--;
        		break;
        	}
        }
        return result;
    
    }

}
