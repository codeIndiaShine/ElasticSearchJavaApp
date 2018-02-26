package com.elastic.search;

/**
 * 
 *
 *         This class is used for Functionality Related to Strings
 */
public class StringUtil {

	private StringUtil() {

	}

	public static String[] splitByDot(String str) {
		return str.split("\\.");
	}

	public static String getUrl(String url) {
		String[] splitUrl = url.split("/");

		StringBuilder builder = new StringBuilder("");
		for (int i = 2; i < splitUrl.length; i++) {
			builder.append("/" + splitUrl[i]);
		}
		return builder.toString();
	}

	public static String monotonixcallyIncreaseString(String parameter) {
		char[] charArray = parameter.toCharArray();

		int length = charArray.length;

		int charAscii = (int) charArray[length - 1];

		charArray[length - 1] = (char) (charAscii + 1);
		return String.valueOf(charArray);
	}

}
