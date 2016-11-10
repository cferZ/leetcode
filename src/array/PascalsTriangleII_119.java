package array;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleII_119 {
	public List<Integer> getRow(int rowIndex) {
        if(rowIndex<0){
        	return null;
        }
        List<Integer> row=new ArrayList<>();
		if(rowIndex==0){
        	row.add(1);
        	return row;
        }
		if(rowIndex>0){
        	List<Integer> lastRow=getRow(rowIndex-1);
        	row.add(1);
        	for(int i=1;i<rowIndex;i++){
        		row.add(lastRow.get(i)+lastRow.get(i-1));
        	}
        	row.add(1);
        	return row;
        }
		return row;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=3;
		List<Integer> t=new PascalsTriangleII_119().getRow(row);
		for(int i=0;i<t.size();i++){
			System.out.println(t.get(i));
		}
	}
}
