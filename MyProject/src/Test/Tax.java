package Test;

public class Tax{
	
	int no = 0;
	String itemName = null;
	double price=0.0;
	boolean imported = false;
	boolean exempted = false;
	double total=0.0;

	void calculateSalesTax() {
				double totalTax = 0.0;
				
				if (!exempted)
							totalTax = 0.05; 
						
				if ((imported) && (!exempted))
								totalTax = 0.1;
				
				total = totalTax * price;
						
				System.out.println(total);
	}

	public String toString() {
				double p = price + total;
				return no + " \t" + itemName +"\t" + " : \t" +(p) ;
	}
}