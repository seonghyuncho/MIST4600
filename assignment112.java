public class TipCalculator {

	public static void main(String[] args) {
       Scanner money = new Scanner(System.in);
		
	   Double billAmount;
	   int nosOfDiners;
	    
	   System.out.println("Enter bill amount :");
	   billAmount = money.nextDouble();
	   System.out.println("Enter number of diners :");
	   nosOfDiners = money.nextInt();
	
	   System.out.println("Please consider the following tips:");
	   Double totalBillAmount = billAmount + billAmount * .15;
	   System.out.println("15 % :" + (billAmount * .15) + " | Total bill: " +  totalBillAmount);
	   totalBillAmount = billAmount + billAmount * .18;
	   System.out.println("18 % :" + (billAmount * .18) + " | Total bill: " +  totalBillAmount);
	   totalBillAmount = billAmount + billAmount * .2;
	   System.out.println("20 % :" + (billAmount * .20) + " | Total bill: " +  totalBillAmount);
	   
	   System.out.println("Amount due from each diner based on tip percentage:");
	   totalBillAmount = billAmount + billAmount * .15;
	   System.out.println("Tip Amount 15% : " +  (totalBillAmount / nosOfDiners) + " due");
	   totalBillAmount = billAmount + billAmount * .18;
	   System.out.println("Tip Amount 18% : " +  (totalBillAmount / nosOfDiners) + " due");
	   totalBillAmount = billAmount + billAmount * .2;
	   System.out.println("Tip Amount 20% : " +  (totalBillAmount / nosOfDiners) + " due");
	    
	}
}
