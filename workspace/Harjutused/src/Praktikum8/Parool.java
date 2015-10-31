package Praktikum8;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Parool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			char[] sumbolid = "abcdefghijklmnopqrstuvwxzy1234567890".toCharArray();
			for (char c1 : sumbolid) {
				for (char c2 : sumbolid) {
					for (char c3 : sumbolid) {
						for (char c4 : sumbolid) {
							String parool = "" + c1 + c2 + c3 + c4;
							String hash = MD5(parool);
							if (Kontrolli(hash))
								System.out.println(parool + " " + hash);

						}

					}

				}

			}

			// System.out.println(MD5("rait"));
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
	}

	private static boolean Kontrolli(String s) {
		String voti = "fd21ae5b17d8a85257936fc23c78ca5c";

		return voti.equals(s);

	}

	private static String MD5(String parool) throws NoSuchAlgorithmException {
		MessageDigest md = MessageDigest.getInstance("MD5");
		md.update(parool.getBytes());
		byte[] digest = md.digest();
		return convertByteArrayToHexString(digest);
	}

	private static String convertByteArrayToHexString(byte[] arrayBytes) {
		StringBuffer stringBuffer = new StringBuffer();
		for (int i = 0; i < arrayBytes.length; i++) {
			stringBuffer.append(Integer.toString((arrayBytes[i] & 0xff) + 0x100, 16).substring(1));
		}
		return stringBuffer.toString();
	}

}
