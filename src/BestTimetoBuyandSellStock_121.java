

public class BestTimetoBuyandSellStock_121 {
	public int maxProfit(int[] prices) {
		if(prices.length<2){
			return 0;
		}
        int max=0,minp=prices[0];
       
        for(int i=1;i<prices.length;i++){
        	
//        	if(exc>max)
//        		max=exc;
        	max=(prices[i]-minp)>max?prices[i]-minp:max;
        	if(prices[i]<minp){
        		minp=prices[i];
        	}
        	minp=prices[i]<minp?prices[i]:minp;
        	
        }
        return max;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prices={7, 1, 5, 3, 6, 4};
		BestTimetoBuyandSellStock_121 t=new BestTimetoBuyandSellStock_121();
		System.out.println(t.maxProfit(prices));
	}

}
