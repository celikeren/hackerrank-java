package solutions;

public class Hack2_VowelsSubstring {

	public static void main(String[] args) {
		
		/*
		Find the substring of size "k" that has the most number of vowels
		 */

		String s = "caberqiitefg";
		int k = 5;
		System.out.println(findSubstring(s, k));

		String s2 = "aeiouaiou";
		int k2 = 3;
		System.out.println(findSubstring(s2, k2));

		String s3 = "azerdii";
		int k3 = 5;
		System.out.println(findSubstring(s3, k3));

	}

	public static String findSubstring(String s, int k) {
		String result = "";
		int current = 0;
		int calculated = 0;
		int[] converted = convertToArray(s);

		for (int i=0; i <= s.length()-k; i++) {
			calculated = calculate(converted, i, i+k);
			if (calculated > current) {
				result = s.substring(i, i+k);
				current = calculated;
			}
		}

		if (result == "") {
			return "Not found!";
		}

		return result;
	}

	public static int[] convertToArray(String s) {
		final String vowels = "aeoui";
		int[] result = new int[s.length()];
		for (int i=0; i<s.length(); i++) {
			if (vowels.contains(s.charAt(i) + "")) {
				result[i] = 1;
			}
		}
		return result;
	}

	public static int calculate(int[] array, int i, int j) {
		int sum = 0;
		while (i<j) {
			sum += array[i];
			i++;
		}
		return sum;
	}

}
