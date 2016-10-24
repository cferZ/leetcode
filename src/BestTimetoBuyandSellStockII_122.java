
public class BestTimetoBuyandSellStockII_122 {
    public int maxProfit(int[] prices) {
    	if(prices.length<2){
    		return 0;
    	}
        int profit=0;
        int in=prices[0];
        for(int i=1;i<prices.length;i++){
        	if(prices[i]>=prices[i-1]){
        		continue;
        	}
        	else{
        		profit+=(prices[i-1]-in);
        		in=prices[i];
        	}
        }
        profit+=(prices[prices.length-1]-in);
        return profit; 	
    }
}
