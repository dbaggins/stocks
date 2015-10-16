import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author stefanbund
 *
 */
public class mainMaket {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Market m = new Market();//create the market right away
		
		Agent a = new Agent(); //buyer/sellers/traders
		
		String l = provideTUI();
							//this gives us 2 things, the market and a stock to look for
		searchForStock(l, m.getIndex());


	}
	
	private static void searchForStock(String l, ArrayList<Stock> index) 
	{
		//get the stock in the index with the same name as the symbol I just typed in
		for(Stock s : index)
		{
			if(l.equalsIgnoreCase(s.getSymbol()))
			{
				System.out.println("bingo, I just found the stock I need..."); //worked!
				System.out.println("stock symbol: " +s.getSymbol() +
						" last sold at price: " +s.getPrice() + 
						" buy Volume: " + s.getIpoQty() );
			}
		}
	}

	public static String provideTUI()
	{ 
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);//get user input from the console
		String ui = sc.next(); //refers to what the user types, traps the user input in ui, var
		System.out.println("variable ui is now " + ui);
		
		System.out.println("input the symbol of a stock to research: ");
		String symbolName = sc.next();
											//ONCE I GET USER IN PUT, I CAN LOOK AT EACH STOCK 
											// IN OUR INDEX, AND STUDY EACH STOCK'S SYMBOL
											// FOR EQUALITY TO THE USER INPUT
		//compareInputToStocksInMyIndex(symbolName); //initiate the search for stocks of that name
		return symbolName; 
	}


}