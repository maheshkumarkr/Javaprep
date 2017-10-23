package games;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class CowBull {

	String numberPlayedByUser;
	final static int noOfAttempts = 20;
	int attemptCounter = 1;
	Scanner in = new Scanner(System.in);
	
	String currentPrediction = "";
	
	Map<Character,Integer> predictions = new HashMap<Character, Integer>();
	
	public static void main(String args[]) {
		/*
		 * Problem Statement: "System" to predict Number played by User - by responses
		 * from user
		 * 
		 * For Ex: If number played by user is 315 - System initially (Random) predicts
		 * (after many trials - leeway for initial random) - 124 - user responds with 1C
		 * for 1 @ wrong position System should now start predicting based on user
		 * response rather than complete random.
		 * 
		 */

		CowBull beginGame = new CowBull();
		beginGame.init();

	}

	public void init() {

		numberPlayedByUser = "315";
		String firstResponse = firstGuess();
		System.out.println("First Response:"+firstResponse);
		
		parseResponse(firstResponse);
		System.out.println("Predictions:"+predictions);
		
		continueGame(currentPrediction);
		
		//if(firstResponse.contains("B"))
		//	System.out.println("Good Start !!");
		
		//parseResponse(firstResponse);
	}

	private void continueGame(String firstPred) {
		in = new Scanner(System.in);
		
		//Bull Check
		if(predictions.containsKey('B')) {
			// Good beginnings !
			// Get the Bull Number and location
			int bullIndex = 0;
			String bullValue = null;
			for(int i=0;i<firstPred.length();i++) {
				if(firstPred.charAt(i)==numberPlayedByUser.charAt(i))
				{
					bullIndex = i;
					bullValue = firstPred.charAt(i)+"";
				}
			}
			System.out.println("Bull Value:"+bullValue+" @"+bullIndex);
			
		}
		
		in.close();
		
	}
	
	private String firstGuess() {
		Random rnd = new Random();

		String resp;
		
		System.out.println("Number Played By User ===="+numberPlayedByUser);
		System.out.println("Please respond to System predictions - ex if System predicted number has 1bull and 1 cow - 1B1C, if No number matches return 0");
		String rand;
		while (true) {

			rand = (rnd.nextInt(900) + 100)+"";

			if (ensureRandomness(rand)) {

				// rnd.nextInt();
				
				System.out.println("System Prediction@"+(attemptCounter++)+" = "+rand);
				String response = in.next();
				if(response.equals("0"))
					continue;
				else
				{
					resp=response;
					currentPrediction=rand;
					System.out.println("Good going, now continue onto next predictions!!");
					break;
				}

			} else {
				// continue to generate Random Numbers from System.
				System.out.println("Wrong Rand "+rand+"; onto next prediction");
				continue;
			}
		}
		in.close();
		return resp;
	}

	private boolean ensureRandomness(String rand) {

		//String number = rand + "";
		boolean goodFlag = true;
		if (rand.contains("0"))
		{
			//System.out.println("Contains Zero !");
			
			goodFlag = false;
		}
		else { // check for duplicate numbers
			char[] inp = rand.toCharArray();
			for (int i = 0; i < rand.length(); i++) 
				   for (int j = i + 1; j < rand.length(); j++) 
				    if (inp[i] == inp[j])
				    	goodFlag = false;
			}
		return goodFlag;
	}
	
	private void parseResponse(String response){
		
		//String userResp = response.split("\\*")[0];
		//String numPred = response.split("\\*")[1];
		
		for(int i=0;i<response.length();i+=2) {
			//if(userResp.charAt(i+1)=='C')
				predictions.put(response.charAt(i+1), Integer.parseInt(response.charAt(i)+""));
			//else
			//	predictions.put(response.charAt(i+1), response.charAt(i)+'0');
		}
		
		//return predictions;
	}
	
	private ArrayList<Integer> toList(String number){
		ArrayList<Integer> numList = new ArrayList<Integer>();
		for(int i=0;i<number.length();i++) {
			numList.add(number.charAt(i)+'0');
		}
		return numList;
	}
}
