
import java.util.Random;
public class Stock{
	private String name_;
	private String symbol_;
	private double currentPrice_;
	private double nextPrice_;
	private double priceChange_;
	private double priceChangePercentage_;
	
	//not arguement constructor
	/**
	 * 
	 */
	public Stock() {
		name_="Microsoft";
		symbol_="MSFT";
		currentPrice_=46.87;
		nextPrice_=46.87;
	}//end of the constructor that has not arguements
	//constructor that contains arguements 
	/**
	 * @param name
	 * @param symbol
	 * @param currentPrice
	 * @param nextPrice
	 */
	public Stock(String name,String symbol, double currentPrice,double nextPrice) {
		name_=name;
		symbol_=symbol;
		currentPrice_=currentPrice;
		nextPrice_=nextPrice;
		
	}//end of the constructor that has arguements
	
	//setter for priceChange
	public void setPriceChange(double priceChange){
		priceChange_=priceChange;	
	}//end bracket for setPriceChange
	
	//setter for priceChangePercentage
	public void setPriceChangePercentage(double priceChangePercentage) {
		priceChangePercentage_=priceChangePercentage;
	}
	
	// setter for name
	/**
	 * @param name
	 */
	public void setName(String name) {
		name_=name;
	}//end bracket for setName
	
	//setter for symbol
	/**
	 * @param symbol
	 */
	public void setSymbol(String symbol) {
		symbol_=symbol;
	}//end bracket for setSymbol
	
	//setter for currentPrice
	/**
	 * @param currentPrice
	 */
	public void setCurrentPrice(double currentPrice ) {
		if(currentPrice>=0) {
		currentPrice_=currentPrice;
		}
		else {
			currentPrice=0;
		}
	}//end bracket for setCurrentPrice
	
	//setter for nextPrice
	/**
	 * @param nextPrice
	 */
	public void setNextPrice(double nextPrice) {
		nextPrice_=nextPrice;
		if (nextPrice>=0) {
			nextPrice_=nextPrice;
		}
		else {
			nextPrice_=0;
		}
	}//end bracket for setNextPrice
	
	//getter for currentPrice
	/**
	 * @return currentPrice_
	 */
	public double getCurrentPrice() {
		return currentPrice_;
	}//end bracket for getCurrentPrice
	
	//getter for priceChangePercentage
	/**
	 * @return priceChangePercentage_
	 */
	public double getPriceChangePercentage() {
		return priceChangePercentage_;
	}//end bracket for getPriceChangePercentage
	
	//getter for name
	/**
	 * @return
	 */
	public String getName() {
		return name_;
	}//end of bracket for name
	
	//getter for symbol
	/**
	 * @return symbol_
	 */
	public String getSymbol() {
		return symbol_;
	}//end of bracket for getSymbol
	
	 //getter for priceChange
	/**
	 * @return priceChange_
	 */
	public double getPriceChange(){
		return priceChange_;
	}//end bracket for getPriceChange
	
	//getter for nextPrice
	/**
	 * @return nextPrice_
	 */
	public double getNextPrice() {
		return nextPrice_;
	}//end of bracket for getNextPrice
	
	//increases or decreases the currentPrice by 0-10% randomly
	// deals with price_Movement and change_Percent
	/**
	 * 
	 */
	public void SimulatePrice() {
		Random random=new Random();
		//random numbers between 0-10
		int integerRandomNumber=random.nextInt(9);
		double decimalRandomNumber=random.nextDouble();
		double percent=decimalRandomNumber+integerRandomNumber;
		double decimalPercent=percent/100;
		Random randomNum=new Random();
		int signChange;
		signChange=randomNum.nextInt(2)+1;
		//to get increasing or decreasing
		if(signChange==1) {
			nextPrice_=currentPrice_+(currentPrice_*decimalPercent);
			priceChange_=(nextPrice_-currentPrice_);
			priceChangePercentage_=(priceChange_/currentPrice_);
			//possible mess up
			//nextPrice_=currentPrice_;
					
		}
		else {
			nextPrice_=currentPrice_-(currentPrice_*decimalPercent);
			priceChange_=(nextPrice_-currentPrice_);
			priceChangePercentage_=(priceChange_/currentPrice_);
			//error possible
			//nextPrice_=currentPrice_;
			
		}
		nextPrice_=currentPrice_;
		
	}//end bracket of SimulatePrice
	
	
	
	
	
}