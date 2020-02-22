public class Transmit {
	
	private static int TRANSMIT_FREQUENCY = 19990;    // Hertz
	private static int TRANSMIT_STEP_MS   = 400;      // millis
	private static double TRANSMIT_VOLUME    = 1.0;   // 0 - 1.0
	
	public static void transmit(String encodedString) throws Exception {
		
		System.out.println("Transmitting " + encodedString);
		
		for(int i=0;i<encodedString.length();i++) {
			char ch = encodedString.charAt(i);
			if (ch == '.') {
				System.out.print(" Tx : '.' => ");
				SoundUtils.tone(TRANSMIT_FREQUENCY, TRANSMIT_STEP_MS, TRANSMIT_VOLUME);
			} else if (ch == '-') {
				System.out.print(" Tx : '-' => ");
				SoundUtils.tone(TRANSMIT_FREQUENCY, 3*TRANSMIT_STEP_MS, TRANSMIT_VOLUME);
			}
			else if (ch == ' ') {
				System.out.println(" Tx : ' '");
				Thread.sleep(TRANSMIT_STEP_MS);
			}	
		}
		System.out.println("End of Transmssion!");
		
	}
	
	public static void main(String[] args) throws Exception {

		String transmitString = "hello world";
		String encodedTransmitString = Encode.morseEncode(transmitString);
		transmit(encodedTransmitString);
		
	}

}
