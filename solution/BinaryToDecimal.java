class BinaryToDecimal {

	public static int convert(String binaries) {
		char[] digits = binaries.toCharArray();
		int result = 0;
		for (int i = 0; i < digits.length; i++) {
			if (digits[i] == '1') {
				int power = digits.length - (i + 1);
				result += Math.pow(2, power);
			} else if (digits[i] != '0') {
				return -1;
			}
		}
		return result;
	}
	
	public static int binary(String numbinaire) {
		int result = 0;
		int longueurString = numbinaire.length();
		for (int i = 1; i <= longueurString; i++){
			if (numbinaire.charAt(i - 1) == '1'){
				result = result + (int)Math.pow(2, longueurString - i);
			} 
		}

		return result;
	}
}
