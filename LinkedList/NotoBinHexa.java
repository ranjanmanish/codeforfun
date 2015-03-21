import java.math.*;
/**
*	this class is suppose to take a string in Hex and another String in 
*	binary and find if both of them equal
*/
public class NotoBinHexa{
	public static void main (String args[]){
	System.out.println("This code wil check  if given Binary and Hexa are equal!");
	NotoBinHexa obj = new NotoBinHexa();
	boolean flag = obj.compareBinToHex("7DE", "101");
	if (flag){
		System.out.println("No are equal!");
	}
	else{
		System.out.println("Not Equal!");
	}
			
}
	boolean compareBinToHex(String hex, String binary){
	int hexNo = getNoOfHex(hex);
	int binNo = getNoOfBin(binary);
	System.out.println("Binary No -->" +binNo);
	if(hexNo == binNo)
		return true;
	else
		return false;
}
	/**
	* get no eq of Hexa decimal String
	*/
 
	int getNoOfHex(String hex){
	int nHex = 0;
	char[] charArray = hex.toCharArray();
		// 1-9 direct 
		// 10-15 A-F
		int val = 0;
		for(char ch : charArray){
			System.out.println(ch);
			if((ch >= 'A') && (ch <= 'F')){
				val = 10 + ch - 'A';
				
			}			
			if((ch >= 'a') && (ch <= 'f')){
				val = 10 + ch - 'a';
			}
			if(ch >= '0' && ch <= '9'){
				val = ch - '0';
			}
		nHex+= val;
		System.out.println("BValue of this char "+ch+"is: "+val);
		}
		
	return nHex;
	}

	/**
	* convert a binary to no eq
	*/
	int getNoOfBin(String binary){
		int binEq = 0;
		int counter = 0;
	 	int tempNo = Integer.parseInt(binary);
		while(tempNo > 0){
			if(tempNo % 10 == 1)
				binEq+=Math.pow(2,counter);
			System.out.println("tempNo" + tempNo +"binEq" +binEq);
			tempNo = tempNo / 10;
			counter++;
		}
		return binEq;
	}
}
