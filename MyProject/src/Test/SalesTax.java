package Test;

import java.util.ArrayList;
import java.util.Scanner;

public class SalesTax {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList list = new ArrayList();
		
		while (true) {
			Tax tax = new Tax();
		
			System.out.print("Quantity: ");
			int qty = sc.nextInt();
			tax.no =qty;
			
			System.out.print("Product Name: ");
			String prod = sc.next();
			tax.itemName = prod;
			String n1=sc.nextLine();

			System.out.print("Price: ");
			double p = sc.nextDouble();
			tax.price = p;
				
			System.out.print("Is it Imported[y/n]: ");
			String imp = sc.next();
			if (imp.toLowerCase().equals("y"))
				tax.imported = true;
			
			System.out.print("Is it Exempted[y/n]: ");
			String exe = sc.next();
			if (exe.toLowerCase().equals("y"))
				tax.exempted = true;
			
			tax.calculateSalesTax();
			list.add(tax);
			
			System.out.print("Add More Products [y/n]: ");
			String add = sc.next();
			if (add.toLowerCase().equals("n")) {
				break;
			}	
		}
		
		double total_price = 0.0;
		double total_tax = 0.0;
		
		for (int i = 0; i < list.size(); i++) {
			Tax tax = (Tax) list.get(i);
			total_price += tax.price;			
			total_tax += tax.total;            
			System.out.println(tax);
		}

		System.out.println("Sales Taxes:" +(total_tax));
		System.out.println("Total: " +Math.round(total_price + total_tax));
	}

}