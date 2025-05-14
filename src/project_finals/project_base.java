package P1;

import java.util.Scanner;

public class project_base {

	public static void main(String[] args) {
		//TITLE and DESCRIPTION
		System.out.println("       ====================================================================");
		System.out.println("       ||              RISK MANAGEMENT ASSESSMENT: TYPHOON               ||");
		System.out.println("       ====================================================================");
		System.out.println("       Phillipines is a Tropical Country that is prone to numerous typhoon.");
		System.out.println("       Every year it is expected to be 20 or more typhoon will hit the country");
		System.out.println("       This program Shall assess the risk of the incoming typhoon in Lucban.");
		System.out.println("\n       LUCBAN POLICE STATION: 0429118976 ");
		System.out.println("       LUCBAN FIRE STATION: 09326031222 ");
		System.out.println("       LUCBAN MMG:  0425408312 ");
		
		System.out.println("\n       	              19th Congress Senate Bill No. 1652.");
		System.out.println("       ESTABLISHING EVACUATION CENTERS IN EVERY CITY AND MUNICIPALITY");
		System.out.println("       When disaster and calamities strike, covered courts, gymnasiums, "
				+ "\n       schools, and even churches serve as evacuation areas.");
		
		//PROGRAM STARTS
		start();

	}

	public static void start() {
		//SCANNER
		Scanner input = new Scanner(System.in);
		
		//Variables For RE-RUN
		String Proceed, Feedback;
		
		do {
			System.out.println("       =====================================================================");
			System.out.print("                      Do you want to Proceed? yes or no: ");
			Proceed = input.next();
			
			if(Proceed.equals("yes")){
				do {
				
			System.out.println("       =====================================================================");
			
			//INPUT STORM INTENSITY VIA SIGNAL
			System.out.println("                      SIGNAL 1 TO 4");
			System.out.print("                      Enter Storm Intensity:  ");
			int signal = input.nextInt();
			
			//METHOD FOR SELECTING SIGNAL
			choices(signal);
			
				System.out.print("                       Do you want to Re-Run? yes or no: ");
				Feedback = input.next();
				}while (Feedback.equals("yes"));
				
			  }else
				  	System.out.println("       =====================================================================");
					System.out.print("                       Do you want to Continue? yes or no: ");
					Proceed = input.next();
		}while (Proceed.equals("yes"));
		
		//END OF THE PROGRAMMERING
		System.out.println("       =========================================================");
		System.out.println("       ||              You have Reached the End.              ||");
		System.out.println("       =========================================================");
	}
	
	public static void choices(int signal_par) {
		Scanner input01 = new Scanner(System.in);
		
		System.out.println("       =====================================================================");
		if(signal_par<5&&signal_par>0)
			switch(signal_par) {	
			case 1:
				System.out.println("                      Storm Intesity: Signal 1");
				
					//SHOWS LOCATION
					location();
					System.out.print("                Select yout location From the Following Group: ");
					int location1 = input01.nextInt();
					
					//ASSESSING LOCATION/PINPOINTING/EVACUATION 
					assessment(location1);
					
					System.out.println("                               EVALUATION");
					
					//EVALUATION OF RISK
					evaluation(signal_par,location1);
					
				break;
			case 2:
				System.out.println("                      Storm Intesity: Signal 2");
					location();
					System.out.print("                Select yout location From the Following Group: ");
					int location2 = input01.nextInt();
					assessment(location2);
					
					System.out.println("                               EVALUATION");
					
					evaluation(signal_par,location2);
					
				break;
			case 3:
				System.out.println("                      Storm Intesity: Signal 3");
					location();
					System.out.print("                Select yout location From the Following Group: ");
					int location3 = input01.nextInt();
					assessment(location3);
					
					System.out.println("                               EVALUATION");
					
					evaluation(signal_par,location3);
					
				break;
			case 4:
				System.out.println("                      Storm Intesity: Signal 4");
					location();
					System.out.print("                Select yout location From the Following Group: ");
					int location4 = input01.nextInt();
					
					assessment(location4);
					
					System.out.println("                               EVALUATION");
					
					evaluation(signal_par,location4);
				break;
			default:
				System.out.println("                   That is not Possible.\n       Please Enter Intensity/Signal 1 to 4");
				System.out.println("       =====================================================================");
		
		}else {
			System.out.println("                   That is not Possible.\n       Please Enter Intensity/Signal 1 to 4");
			System.out.println("       =====================================================================");
		
		}
	}
	
	//method for location
	public static void location() {
	
		System.out.println("       ==============================================================");
		System.out.println("       ||     Group 1     ||    Group 2         ||     Group 3     ||");
		System.out.println("       ==============================================================");
		System.out.println("       ||      Igang      ||    Kalyaat         ||     Aliliw      ||");
		System.out.println("       ||      Samil      ||    Mahabang parang ||     Ayuti       ||");
		System.out.println("       ||      Palola     ||    Kabatete        ||     Poblacion   ||");
		System.out.println("       ||      Kakawit    ||    Piis            ||     Nagsinamo   ||");
		System.out.println("       ||      Kalangay   ||    Kulapi          ||     Abang       ||");
		System.out.println("       ||      Malupak    ||    Tinamnan        ||                 ||");
		System.out.println("       ||      Manasa     ||    Kilib           ||                 ||");
		System.out.println("       ||      May-it     ||    Atulinao        ||                 ||");
		System.out.println("       ==============================================================");
		
	
	}
	
	//method for assessing location/Evacuation Center
	public static void assessment(int location1_par){
		switch(location1_par){
		case 1:
			//PLAINES
			System.out.println("       ===========================================================================");
			System.out.println("       ||     Group 1     ||       Nearest Evacuation Center                    ||");
			System.out.println("       ===========================================================================");
			System.out.println("       ||      Igang      ||        Barangay hall of Samil                      ||");    
			System.out.println("       ||      Samil      ||        Barangay hall of Samil                      ||");
			System.out.println("       ||      Palola     ||        Banahaw View Academy, Inc.                  ||");
			System.out.println("       ||      Kakawit    ||        New Lucban Municipal Hall                   ||");
			System.out.println("       ||      Kalangay   ||        Kalangay Barangay Hall                      ||");
			System.out.println("       ||      Malupak    ||        Kamay ni hesus                              ||");
			System.out.println("       ||      Manasa     ||        Our Lady of the Most Holy Rosary Seminary   ||");  
			System.out.println("       ||      May-it     ||        Bahay Pamahalaan Barangay May-It Lucban     ||");
			System.out.println("       ===========================================================================");
			
			break;
		case 2:
			//HILLS
			System.out.println("       ===========================================================================");
			System.out.println("       ||    Group 2          ||       Nearest Evacuation Center                ||");
			System.out.println("       ===========================================================================");
			System.out.println("       ||    Kalyaat          ||       Paaralang Elementary ng Nakal            ||");    
			System.out.println("       ||    Mahabang Parang  ||       Paaralang Elementarya ng Piis            ||");
			System.out.println("       ||    Kabatete         ||       Paaralang Elementarya ng Piis            ||");
			System.out.println("       ||    Piis             ||       Paaralang Elementarya ng Piis            ||");
			System.out.println("       ||    kulapi           ||       Barangay Hall of Kulapi                  ||");
			System.out.println("       ||    Tinamnan         ||       Kamay ni hesus                           ||");
			System.out.println("       ||    nalunao          ||       Kalangay Barangay Hall                   ||");  
			System.out.println("       ||    Kilib            ||       Bahay Pamahalaan Brgy, Kilib             ||");
			System.out.println("       ||    Atulinao         ||       Atulinao Barangay Hall                   ||");
			System.out.println("       ===========================================================================");
			
			break;
		case 3:
			//URBANIZED
			System.out.println("       ===========================================================================");
			System.out.println("       ||     Group 3     ||        Nearest Evacuation Center                   ||");
			System.out.println("       ===========================================================================");
			System.out.println("       ||     Aliliw      ||      Lucban High School                            ||");    
			System.out.println("       ||     Ayuti       ||      Southern Luzon State University Ayuti         ||");
			System.out.println("       ||     Poblacion   ||      Southern Luzon State University Main          ||");
			System.out.println("       ||     Nagsinamo   ||      Nagsinamo Elementary School                   ||");
			System.out.println("       ||     Abang       ||      Nagsinamo Elementary School                   ||");
			System.out.println("       ===========================================================================");
			
			break;
		}
		
	}
	
	//OVERALL EVALUATION OF RISK
	public static void evaluation(int intexsity_par, int point_par) {
		if(intexsity_par==1&&point_par==1) {
				System.out.println("       ================================================================");
				System.out.println("       ||               Risk Assessment: MODERATE                    ||");
				System.out.println("       ||                 Please Be Cautious of:                     ||");
				System.out.println("       ||                      Landside                              ||");
				System.out.println("       ||                      Heavy rain                            ||");
				System.out.println("       ||                     Strong Winds                           ||");
				System.out.println("       ================================================================");	
				System.out.println("      || Follow the advisory of Philippines Emergency Response Team ||");
				System.out.println("       ================================================================");			
		}else if(intexsity_par==2&&point_par==1){
				System.out.println("       ================================================================");
				System.out.println("       ||               Risk Assessment: HIGH                        ||");
				System.out.println("       ||                 Please Be Cautious of:                     ||");
				System.out.println("       ||                      Landside                              ||");
				System.out.println("       ||                      Heavy rain                            ||");
				System.out.println("       ||                     Strong Winds                           ||");
				System.out.println("       ||                     Falling Objects                        ||");
				System.out.println("       ================================================================");	
				System.out.println("       || Follow the advisory of Philippines Emergency Response Teams||");
				System.out.println("       || Seek immediate Shelter if not possible, Wait for rescue    ||");
				System.out.println("       ================================================================");	
		}else if(intexsity_par==3&&point_par==1) {
				System.out.println("       ================================================================");
				System.out.println("       ||               Risk Assessment:  VERY HIGH                  ||");
				System.out.println("       ||                 Please Be Cautious of:                     ||");
				System.out.println("       ||                      Landside                              ||");
				System.out.println("       ||                      Heavy rain                            ||");
				System.out.println("       ||                     Strong Winds                           ||");
				System.out.println("       ================================================================");	
				System.out.println("       || Follow the advisory of Philippines Emergency Response Teams||");
				System.out.println("       || Seek immediate Shelter, if not possible Wait for rescue    ||");
				System.out.println("       ================================================================");
		}else if(intexsity_par==4&&point_par==1) {
				System.out.println("       ================================================================");
				System.out.println("       ||               Risk Assessment:  VERY HIGH                  ||");
				System.out.println("       ||                 Please Be Cautious of:                     ||");
				System.out.println("       ||                      Landside                              ||");
				System.out.println("       ||                      Heavy rain                            ||");
				System.out.println("       ||                     Strong Winds                           ||");
				System.out.println("       ================================================================");	
				System.out.println("       || Follow the advisory of Philippines Emergency Response Teams||");
				System.out.println("       || Seek immediate Shelter, if not possible Wait for rescue    ||");
				System.out.println("       ================================================================");
		}else if(intexsity_par==1&&point_par==2) {
				System.out.println("       ================================================================");
				System.out.println("       ||               Risk Assessment: LOW                         ||");
				System.out.println("       ||                 Please Be Cautious of:                     ||");
				System.out.println("       ||                      Heavy rain                            ||");
				System.out.println("       ||                     Strong Winds                           ||");
				System.out.println("       ================================================================");	
				System.out.println("       || Stay inside as Much as possible, Going oustide is possible ||");
				System.out.println("       || Be wary of falling object such as tree branch etc.          ||");
				System.out.println("       ================================================================");
		}else if(intexsity_par==2&&point_par==2) {
				System.out.println("       ================================================================");
				System.out.println("       ||               Risk Assessment: MODERATE                    ||");
				System.out.println("       ||                 Please Be Cautious of:                     ||");
				System.out.println("       ||                      Heavy rain                            ||");
				System.out.println("       ||                     Strong Winds                           ||");
				System.out.println("       ||                     Flying Objects                         ||");
				System.out.println("       ================================================================");	
				System.out.println("       || If your area is advised to be evacuated, Follow throughly  ||");
				System.out.println("       || Stay inside as Much as possible, Going oustide is Risky    ||");
				System.out.println("       ================================================================");
		}else if(intexsity_par==3&&point_par==2) {
				System.out.println("       ================================================================");
				System.out.println("       ||               Risk Assessment: HIGH                        ||");
				System.out.println("       ||                 Please Be Cautious of:                     ||");
				System.out.println("       ||                      Heavy rain                            ||");
				System.out.println("       ||                     Strong Winds                           ||");
				System.out.println("       ||                     Flying Objects                         ||");
				System.out.println("       ||                     Falling Trees                          ||");
				System.out.println("       ================================================================");	
				System.out.println("       || If your area is advised to be evacuated, Follow throughly  ||");
				System.out.println("       || Stay inside as Much as possible, Do not go outside         ||");
				System.out.println("       ================================================================");
		}else if(intexsity_par==4&&point_par==2) {
				System.out.println("       ================================================================");
				System.out.println("       ||               Risk Assessment: VERY HIGH                   ||");
				System.out.println("       ||                 Please Be Cautious of:                     ||");
				System.out.println("       ||                      Heavy rain                            ||");
				System.out.println("       ||                     Strong Winds                           ||");
				System.out.println("       ||                     Flying Objects                         ||");
				System.out.println("       ||                     Falling Trees                          ||");
				System.out.println("       ================================================================");	
				System.out.println("       || The Area is advised to be evacuated.                       ||");
				System.out.println("       || Please wait For the emergency Response team.               ||");
				System.out.println("       ================================================================");
		}else if(intexsity_par==1&&point_par==3) {
				System.out.println("       ================================================================");
				System.out.println("       ||               Risk Assessment: VERY LOW                    ||");
				System.out.println("       ||                 Please Be Cautious of:                     ||");
				System.out.println("       ||                      Heavy rain                            ||");
				System.out.println("       ||                     Strong Winds                           ||");
				System.out.println("       ================================================================");	
				System.out.println("       || The Area is Safe, Be wary of sudden change of Winds        ||");
				System.out.println("       || Call for Emergency response team if Needed                  ||");
				System.out.println("       ================================================================");
		}else if(intexsity_par==2&&point_par==3) {
				System.out.println("       ================================================================");
				System.out.println("       ||               Risk Assessment: MODERATE                    ||");
				System.out.println("       ||                 Please Be Cautious of:                     ||");
				System.out.println("       ||                      Heavy rain                            ||");
				System.out.println("       ||                     Strong Winds                           ||");
				System.out.println("       ||                    Flying Objects                          ||");
				System.out.println("       ================================================================");	
				System.out.println("       || The Area is risky for Going Outside                        ||");
				System.out.println("       || Stay inside as much as possible                            ||");
				System.out.println("       ================================================================");
		}else if(intexsity_par==3&&point_par==3) {
				System.out.println("       ================================================================");
				System.out.println("       ||               Risk Assessment: HIGH                        ||");
				System.out.println("       ||                 Please Be Cautious of:                     ||");
				System.out.println("       ||                      Heavy rain                            ||");
				System.out.println("       ||                      Strong Winds                          ||");
				System.out.println("       ||                      Flying Objects                        ||");
				System.out.println("       ||                      Falling Post                          ||");
				System.out.println("       ||                      Flash Floods                          ||");
				System.out.println("       ================================================================");	
				System.out.println("       || Do not go outside, Evacuate immediately if advised         ||");
				System.out.println("       || Call for Emergency response team is Needed                 ||");
				System.out.println("       ================================================================");
		}else if(intexsity_par==4&&point_par==3) {
				System.out.println("       ================================================================");
				System.out.println("       ||               Risk Assessment: VERY HIGH                   ||");
				System.out.println("       ||                 Please Be Cautious of:                     ||");
				System.out.println("       ||                      Heavy rain                            ||");
				System.out.println("       ||                      Strong Winds                          ||");
				System.out.println("       ||                      Flying Objects                        ||");
				System.out.println("       ||                      Falling Post                          ||");
				System.out.println("       ||                      Flash Floods                          ||");
				System.out.println("       ================================================================");	
				System.out.println("       || Do not go outside, Evacuate immediately if advised         ||");
				System.out.println("       || Emergency response team is on their way                    ||");
				System.out.println("       ================================================================");
		}else {
			System.out.println("       ================================================================");	
			System.out.println("       || Not Possible                                               ||");
			System.out.println("       || Please Re-Evaluate your answer.                            ||");
			System.out.println("       ================================================================");
			
		}
	}
	
	
}
