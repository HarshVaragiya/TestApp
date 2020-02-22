import javax.sound.sampled.LineUnavailableException;

public class SelectTransmitFrequency {
	
	public static void testOneFrequency(int frequency) throws LineUnavailableException, InterruptedException {
	
		for(int i=0;i<5;i++) {
			SoundUtils.tone(frequency,1000);
			Thread.sleep(1000);
		}
		
		System.out.println("You should have heard a [1,0] pair 5 times clearly but barely..");
		
	}
	
	public static void testAllFrequencies() throws LineUnavailableException {
		System.out.println("Now tones with specified frequency will be played for 1 second.");
		System.out.println("Note down the tone frequency when you can barely hear it..");
		System.out.println("Later,check that frequency by using it in testOneFrequency() function");
		
	    for(int freq = 20000; freq > 16000; freq -= 50) {
        SoundUtils.tone(freq,2000);
	    }  
	}
	
	public static void main(String args[]) throws Exception{
		// testAllFrequencies();
		testOneFrequency(19999);
	}
	
	
}
