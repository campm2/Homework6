import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/* ========================================================================== */
/* PROGRAM: Stock Price Simulator 
    AUTHOR: Megan Camp, Tejash P.
    COURSE NUMBER: CIS 210
    COURSE SECTION NUMBER: 02
    INSTRUCTOR NAME: Dr.Tian
    PROJECT NUMBER: 6
    DUE DATE: 10/05/2017
SUMMARY


INPUT
This program requires that you read in the following data values: A stock’s name, symbol, and current price.
o E.g., Microsoft Corporation, MSFT, 45.87.
You will use interactive I/O in this program.
All of the input must be validated if it is needed. 
You can assume that for a numeric input value, the grader will enter a numeric value in the testing cases.

OUTPUT

ASSUMPTIONS
You can assume that for a numeric input value, the grader will enter a numeric value in the testing cases.

/* MAIN FUNCTION */
public class StockPriceSimulator {
	public static void main(String [] args) throws IOException {
		double currentPrice=0;
		double nextPrice=0;
		String symbol="";
		String name="";
		int NUMBER_OF_DAYS=30;
		Stock stock=null;
		//Write to CSV file
		PrintWriter outFile =new PrintWriter("output.csv");
		
		//scanner to receive information from user
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter the name of the stock: "+name);
		name=keyboard.nextLine();
		System.out.print("Please enter the symbol of the stock: "+ symbol);
		symbol=keyboard.nextLine();
		System.out.print("Please enter yesterday's price: " +  currentPrice);
		currentPrice=keyboard.nextDouble();
	
		if(name.equals("NONE") && symbol.equals("NA") ) {
			stock =new Stock();
		}
		else {
			stock=new Stock(name,symbol,currentPrice,nextPrice);
			stock.setName(name);
			stock.setSymbol(symbol);
			stock.setCurrentPrice(currentPrice);
		}
		//headers
		System.out.println("STOCK\t\tSYMBOL\tYESTERDAY_PRICE\tTODAY_PRICE\tPRICE_MOVEMENT\tCHANGE_PERCENT");
		outFile.println("STOCK\t\tSYMBOL\tYESTERDAY_PRICE\tTODAY_PRICE\tPRICE_MOVEMENT\tCHANGE_PERCENT");
		for (int i=1;i<=NUMBER_OF_DAYS;i++) {
			stock.SimulatePrice();
			System.out.printf("%s\t%s\t%.2f\t\t%.2f\t\t%.2f\t\t%.2f%%\n",stock.getName(),stock.getSymbol(),stock.getCurrentPrice(),stock.getNextPrice(), stock.getPriceChange(),stock.getPriceChangePercentage());
			outFile.printf("%s\t%s\t%.2f\t\t%.2f\t\t%.2f\t\t%.2f%%\n",stock.getName(),stock.getSymbol(),stock.getCurrentPrice(),stock.getNextPrice(), stock.getPriceChange(),stock.getPriceChangePercentage());
			
		}
		keyboard.close();
		outFile.close();
		
		
	
	}
	
}