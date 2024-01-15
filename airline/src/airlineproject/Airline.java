package airlineproject;
import java.util.*;

class booking {
	static Scanner scan = new Scanner(System.in);

	public static String From;
	public static String To;
	public static int day;
	public static int month;
	public static int year;
	public static double price1;
	public static double price2;
	public static double price3;
	public static double price4;

	 void Booking_Information() {
		System.out.print("Enter your origin :-");
		From = scan.nextLine();

		System.out.print("Enter your destiny :-");
		To = scan.nextLine();
//		 To+=scan.next();
		System.out.print("journey Date:-");
		day = scan.nextInt();
		month = scan.nextInt();
		year = scan.nextInt();

	}

	void menu() {
		price1 = year + month + 5;
		price2 = year + month + day - 20;
		price3 = year + day + 7;
		price4 = year + day - month + 9;

		System.out.println("         vistara                 fare:-" + "rs." + price1);

		System.out.println();
		System.out.println("         indigo                  fare:-" + "rs." + price2);

		System.out.println();
		System.out.println("         SpiceJet                fare:-" + "rs." + price3);
		System.out.println();
		System.out.println("         AirIndia                fare:-" + "rs." + price4);
		System.out.println();
		System.out.println("Enter your Airline name for flight booking");

	}
//

}

class aboutFlight extends booking {
	public static String name;
	public static char Gender;
	public static  int prevday;
	public static int prevmonth;
	public static int prevyear;
	public static long phone_no;
	public static String email;
	public static int seat;
	public static int n;
	public static String input;
	
	

	private String input_comparision1 = "vistara";
	private String input_comparision2 = "indigo";
	private String input_comparision3 = "spicejet";
	private String input_comparision4 = "Airindia";
	public static double Total;
	static Scanner scan1 = new Scanner(System.in);

	public void vistra() {
		System.out.println(".......................Welcome to visatra airlines.........................");
		System.out.println("Enter number of seat :-");
		n = scan1.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Enter details of " + i + " passanger");
			System.out.println();

			System.out.print("Enter passanger name :-");
			name = scan1.nextLine();
			
			
			name += scan1.nextLine();

			System.out.print("Enter DOB :-");
			prevday = scan1.nextInt();
			prevmonth = scan1.nextInt();
			prevyear = scan1.nextInt();
			System.out.print("Enter phone number :-");
			phone_no = scan1.nextLong();
			System.out.print("enter email :-");
			email = scan1.nextLine();
			email += scan1.nextLine();

		}

	}

	public void indigo() {

		System.out.println(".......................Welcome to indigo airlines.........................");
		System.out.println("Enter number of seat :-");
		n = scan1.nextInt();

		for (int i = 1; i <= n; i++) {

			System.out.println("Enter details of " + i + " passanger");
			System.out.println();

			System.out.print("Enter passanger name :-");
			name = scan1.nextLine();
			
			
			
			name += scan1.nextLine();

			System.out.print("Enter DOB :-");
			prevday = scan1.nextInt();
			prevmonth = scan1.nextInt();
			prevyear = scan1.nextInt();
			System.out.print("Enter phone number :-");
			phone_no = scan1.nextLong();
			System.out.print("enter email :-");
			email = scan1.nextLine();
			email += scan1.nextLine();

		}

	}

	public void spicejet() {
		System.out.println(".......................Welcome to spicejet airlines.........................");
		System.out.println("Enter number of seats :-");
		n = scan1.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Enter details of " + i + " passanger");
			System.out.println();

			System.out.print("Enter passanger name :-");
			name = scan1.nextLine();
			name += scan1.nextLine();

			System.out.print("Enter DOB :-");
			prevday = scan1.nextInt();
			prevmonth = scan1.nextInt();
			prevyear = scan1.nextInt();
			System.out.print("Enter phone number :-");
			phone_no = scan1.nextLong();
			System.out.print("enter email :-");
			email = scan1.nextLine();
			email += scan1.nextLine();

		}

	}

	public void Airindia() {
		System.out.println(".......................Welcome to Airindia airlines.........................");
		System.out.println("Enter number of seats :-");
		n = scan1.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Enter details of " + i + " passanger");
			System.out.println();

			System.out.print("Enter passanger name :-");
			name = scan1.nextLine();
			name += scan1.nextLine();

			System.out.print("Enter DOB :-");
			prevday = scan1.nextInt();
			prevmonth = scan1.nextInt();
			prevyear = scan1.nextInt();
			System.out.print("Enter phone number :-");
			phone_no = scan1.nextLong();
			System.out.print("enter email :-");
			email = scan1.nextLine();
			email += scan1.nextLine();

		}

	}

	void manager() {

		input = scan1.next();
		switch (input) {
		case "vistara":
			aboutFlight af = new aboutFlight();
			af.vistra();
			break;

		case "indigo":
			aboutFlight io = new aboutFlight();
			io.indigo();
			break;

		case "spicejet":
			aboutFlight spj = new aboutFlight();
			spj.spicejet();
			break;

		case "Airindia":
			aboutFlight airindia = new aboutFlight();
			airindia.Airindia();
			break;

		default:
			System.out.println("You have entered wrong input ......................search not found");

		}
	}

	void getPayment() {
		System.out.println("--------------------------------------------------------------------------------");
//		int PNR=900000+day+month+year+prevday+prevmonth+prevyear;
		if (input_comparision1.equals(input)) {
			System.out.println("You have booked " + n + " seats");
			System.out.println("Fare of one Ticket is :-" + price1);
			price1 = price1 * n;
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("Total Fare :-" + price1);

			System.out.println("Please enter your total amount :-");
			Total = scan1.nextDouble();
			if (price1 == Total) {
				System.out.println("Your Transcation has completed ");
				System.out.println("Your ticket has booked");

			} else {
				System.out.println("Connection problem.........sorry transcation not done");
			}

		} else if (input_comparision2.equals(input)) {
			System.out.println("You have booked " + n + " seats");
			System.out.println("Fare of one Ticket is :-" + price2);
			price2 = price2 * n;
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("Total Fare :-" + price2);

			System.out.println("Please enter your total amount :-");
			Total = scan1.nextDouble();
			if (price2 == Total) {
				System.out.println("Your Transcation has completed ");
				System.out.println("Your ticket has booked");

			} else {
				System.out.println("Connection problem.........sorry transcation not done");
			}

		} else if (input_comparision3.equals(input)) {
			System.out.println("You have booked " + n + " seats");
			System.out.println("Fare of one Ticket is :-" + price3);
			price3 = price3 * n;
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("Total Fare :-" + price3);

			System.out.println("Please enter your total amount :-");
			Total = scan1.nextDouble();
			if (price3 == Total) {
				System.out.println("Your Transcation has completed ");
				System.out.println("Your ticket has booked");

			} else {
				System.out.println("Connection problem.........sorry transcation not done");
			}

		} else if (input_comparision4.equals(input)) {
			System.out.println("You have booked " + n + " seats");
			System.out.println("Fare of one Ticket is :-" + price4);
			price4 = price4 * n;
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("Total Fare :-" + price4);

			System.out.println("Please enter your total amount :-");
			Total = scan1.nextDouble();
			if (price4 == Total) {
				System.out.println("Your Transcation has completed ");
				System.out.println("Your ticket has booked");

			} else {
				System.out.println("Connection problem.........sorry transcation not done");
			}

		} else {
			System.out.println("You have entered wrong input");

		}
	}
}

class Flight_Ticket extends aboutFlight {
	
private int flight=day+month;
	void information() {
		final int PNR=900000+day+month+year+prevday+prevmonth+prevyear;

//		System.out.println((price1 == Total) + " " + (price2 == Total) + " " + (price3 == Total) + " " + (price4 == Total));
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println();
		System.out.println();
		System.out.println("...................Welcome to " + input + " Airlines....................");
		
		System.out.println();
		if ((price1 == Total) || (price2 == Total) || (price3 == Total) || (price4 == Total)) {
			System.out.print("BOADING PASS"+"                          "+input+"COMPANY");
			System.out.println();
			System.out.println();
			
			System.out.print("FLIGHT:"+input+flight+"        "+"CLASS:"+"ECONOMY"+"     "+"GATE:"+prevmonth);
			System.out.println();
			System.out.println("FROM: "+From+"---------------->"+"TO: "+To);

			System.out.print("PASSENGER NAME:"+name+ "          "+"BODING TIME->"+prevmonth+":"+(prevday+20));
			System.out.println();
			System.out.print("SEAT NO:");
			for(int i=1;i<=n;i++) {
				System.out.print(i+"/");
				
			}
			System.out.print("     "+"DATE:"+day+"/"+month+"/"+year);
			System.out.println();
			
			System.out.println("PASSENGER EMAIL:"+email+"                   "+"PASSENGER PHONE NO.:"+phone_no);
			System.out.print("                PNR:");
			for(int i=1;i<=n;i++) {
				System.out.print(PNR+i+"/");
				
				
				
			}
			
			
			
			

		} else {
			System.out.println("Ticket not confirm");

			System.out.println("You have entered wrong price............please try again");

		}
	}
}


public class Airline {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		booking Booking = new booking();
		Booking.Booking_Information();
		Booking.menu();
		aboutFlight af = new aboutFlight();
		af.manager();
		af.getPayment();

		Flight_Ticket ft = new Flight_Ticket();
		ft.information();

	}

}
