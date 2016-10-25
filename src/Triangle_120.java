import java.util.List;

public class Triangle_120 {
    public int minimumTotal(List<List<Integer>> triangle) {
        int[] path=new int[triangle.get(triangle.size()-1).size()];
        for(int i=0;i<triangle.get(triangle.size()-1).size();i++)
        	path[i]=triangle.get(triangle.size()-1).get(i);
        List<Integer> row=null;
        for(int t=0;t<triangle.size();t++){
        	row=triangle.get(triangle.size()-2-t);
        	for(int i=0;i<row.size();i++){
        		path[i]=Math.min(row.get(i)+path[i],row.get(i)+path[i+1]);
        	}
        }
        return path[0];
    }
}
