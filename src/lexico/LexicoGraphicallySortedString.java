package lexico;

import java.util.Scanner;

public class LexicoGraphicallySortedString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LexicoGraphicallySortedString lex = new LexicoGraphicallySortedString();
		
		lex.init();
		
	}
	private void init(){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter String to check");
		String input = in.next();
		in.close();
		boolean result = lexicoSort(input);
		System.out.println(" Input String ="+input+" is "+((result)?"LexicoGraphically sorted !":"LexicoGraphically not sorted !"));
		
	}
	public boolean lexicoSort(String inp){
		for(int i=1;i<inp.length();i++){
			if(inp.charAt(i-1) > inp.charAt(i))
				return false;
		}
		return true;
	}

}
