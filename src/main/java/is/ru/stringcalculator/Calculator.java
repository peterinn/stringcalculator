package is.ru.stringcalculator;

public class Calculator {

	public static int add(String text){
			if(text.equals("")){
			return 0;
		}
		else if(text.contains(",")){
			return sum(splitNumbers(text));
		}
		else if(text.contains("\n")){
			return sum(splitnumbersbynewline(text));
		}


		else 
			return 1;
	}


	private static int toInt(String number){
		return Integer.parseInt(number);
	}

	private static String[] splitNumbersbycomma(String numbers){
	    return numbers.split(",");
	}
    
	private static String[] splitnumbersbynewline(String numbers){
	    return numbers.split('\n');
	} 
    private static int sum(String[] numbers){
 	    int total = 0;
        for(String number : numbers){
		    total += toInt(number);
		}
		return total;
    }



}