import java.util.Scanner;

/**
*Create online ordering system for on-campus coffee shop
*@author Megan Schmidt
*@version September 27
*/

public class CoffeeShop{
		/**
		* Create Coffee Shop class
		* @params - command line arguments
		*/
	public static void main(String[] args)
	{	
		System.out.println("Welcome to the Wolfpack Coffee Shop!");
		System.out.println("We deliver on-campus and to nearby locations. There is a $2 delivery fee, but orders of $25 or more receive free delivery! Orders must be placed between 7:00 AM and 5:59 PM. When prompted, please enter the type and your location. You will then be asked to enter the number of each beverage youu would like to purchase - Small Coffee, Medium Coffee, Large Coffee, Banana Berry Smoothie, Mocha Shake, Rasberry Green Tea. The cost of you order and the estimated delivery time will then be output.");
		getValidTime();
	}
	/**
	*Get time from user
	* @return true, if hour is a value ranging from 7 to 12 or 1 to 5 and min is a value from 0 to 59
	* @return false, otherwise
	*/
	public static void getValidTime() {
		Scanner scan=new Scanner(System.in);
		System.out.print("Please enter time (hour minutes, ex: 8 59):");
		int hour = scan.nextInt();
		int min = scan.nextInt();
		System.out.print("Is AM or PM?");
		String amOrPM = scan.next();
		if (amOrPM.equals("AM")) {
			if (hour > 6){
				if (hour < 12) {
					if (min > -1) { 
						if (min < 60) {
							checkBusyTime(hour);
							}
						}
					}
				}
			else{
				System.out.println("Sorry, we don't do delivery at this time!");
			}
		}		
		else if (amOrPM.equals("PM")) {
			if (hour == 12){
				if (min> -1){
					if (min<60) {
						onOffCampus(1);
					}
				}
			}
			else{
				int hourMil = hour + 12;
				if (hourMil >11){
					if (hourMil<18) {
						if (min> -1){
							if (min<60) {
								onOffCampus(1);
							}
						}
					}
					else{
					System.out.println("Sorry, we don't do delivery at this time!");
					}
				}
			}
		}			
		else {
			System.out.println("You have entered an incorrect time. Please try again");
		}
	}

	/*
	*Check to see if the delivery time will be multiplied by 2 or not.
	*/
	public static void checkBusyTime(int hour){
		if (hour == 7){
			int busyTime = 2;
			onOffCampus(busyTime);
		}
		else if (hour==8){
			int busyTime = 2;
			onOffCampus(busyTime);
		}
		else{
			int busyTime = 1;
			onOffCampus(busyTime);
		}
	}

	/**
	*Computes valid and invalid times
	* @return true, if hour is a value ranging from 7 to 12 or 1 to 5 and min is a value from 0
	* @return false, otherwise
	*/
	/*
	public static boolean isValidTime(){
		Scanner scan=new Scanner(System.in);
		System.out.print("Please enter time (hr mn, eeg: 8 59)");
		hour = scan.nextInt();
		min = scan.nextInt();
		if((hour>=7) && (hour >=12)){
			return hour;
		}
		if((min >= 0) && (min <= 59)){
			return min;
		}
		else{
			System.out.println("Invalid time");
			System.exit(1);
		}
	}
	*/
	/*
	* Determine is student is on campus or not
	* Set value for onCampus variable
	*/
	public static void onOffCampus (int busyTime){
		Scanner scan = new Scanner(System.in);
		System.out.println("Are you on campus? ");
		String onCampus = scan.nextLine();
		if (onCampus.charAt(0) == 'Y'){
			System.out.println("You have indicated you are on campus.");
			int deliveryTime = 10 * busyTime;
			getOrderCost(deliveryTime);
		}
		else if (onCampus.charAt(0)=='y'){
			System.out.println("You have indicated you are on campus.");
			int deliveryTime = 10 * busyTime;
			getOrderCost(deliveryTime);
		}
		else {
			System.out.println("You have indicated you are off campus.");
			isValidZipcode(busyTime);

		}
	}
	/**
	* Determines if zipcode entered is valid
	*if true, calculate cost
	*false, print error
	*/
	public static void isValidZipcode (int busyTime){
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your zipcode?");
		int zipCode = scan.nextInt();
		if (zipCode == 27605) {
			int deliveryTime = 15 *busyTime;
			getOrderCost(deliveryTime);
		}
		else if(zipCode == 27606) {
			int deliveryTime = 20 * busyTime;
			getOrderCost(deliveryTime);
		}
		else{
			System.out.println("You have entered an incorrect zipcode.");
		}
	}

	/**
	*Calculate the total of the order
	*@return total of the order
	*/
		public static void getOrderCost(int deliveryTime){
			Scanner scan = new Scanner(System.in);
			System.out.println("How many Small Coffees would you like?");
			int smallCoffee = scan.nextInt();
			System.out.println("How many Medium Coffees would you like?");
			int mediumCoffee = scan.nextInt();
			System.out.println("How many Large Coffees would you like?");
			int largeCoffee = scan.nextInt();
			System.out.println("How many Banana Berry Smoothies would you like?");
			int smoothieBananaBerry = scan.nextInt();
			System.out.println("How many Mocha Shakes would you like?");
			int mochaShake = scan.nextInt();
			System.out.println("How many Raspberry Green Teas would you like?");
			int raspberryGreenTea = scan.nextInt();
			System.out.println("You requested the following: ");
			System.out.println(smallCoffee+ " Small Coffees ");
			System.out.println(mediumCoffee+ " Medium Coffees ");
			System.out.println(largeCoffee+ " Large Coffees ");
			System.out.println(smoothieBananaBerry+ " Banana Berry Smoothies ");
			System.out.println(mochaShake+ " Mocha Shakes ");
			System.out.println(raspberryGreenTea + " Raspbery Green Teas ");
			System.out.println("Is this correct? Enter Y for yes and N for no.");
			String yOrN = scan.next();
			if (yOrN.equals("N")){
				getOrderCost(deliveryTime);
			}
			else{
				double orderTotal = smallCoffee*1.49+mediumCoffee*1.99+largeCoffee*2.49+4.50*(smoothieBananaBerry+mochaShake+raspberryGreenTea);
				if (orderTotal >25.00){
					double deliveryFee = 0.00;
					double orderPlusFee = orderTotal + deliveryFee;
					System.out.println("Your order subtotal is $"+orderTotal);
					System.out.println("You have a delivery fee of $"+deliveryFee);
					System.out.println("The total cost of your order is $"+orderPlusFee);
					System.out.print("Your order will be delivered in "+deliveryTime);
					System.out.println(" minutes.");
				}
				else{
					double deliveryFee = 2.00;
					double orderPlusFee = orderTotal + deliveryFee;
					System.out.println("Your order subtotal is $"+orderTotal);
					System.out.println("You have a delivery fee of $"+deliveryFee);
					System.out.println("The total cost of your order is $"+orderPlusFee);
					System.out.print("Your order will be delivered in "+deliveryTime);
					System.out.println(" minutes.");
				}
			}
	}
}	