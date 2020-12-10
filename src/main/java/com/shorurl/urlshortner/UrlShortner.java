package com.shorurl.urlshortner;

/**
 * This class used to provide the short url. 
 * 
 * @author SURENDRA GUPTA
 * @Date : 10-DEC-2020 
 */
public class UrlShortner {
	private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static final int BASE = ALPHABET.length();

	/**
	 * This method provide short url based on the time that long url is requested for short url.
	 * 
	 * @param num
	 * @return String
	 */
	public static String encode(long num) {
		StringBuilder sb = new StringBuilder();
		while (num > 0) {
			sb.append(ALPHABET.charAt((int) (num % BASE)));
			num /= BASE;
		}
		return sb.reverse().toString();
	}
}
