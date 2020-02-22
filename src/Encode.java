class Encode{
    private static String morseEncodeChar(char x){
        switch (x){ 
        	case ' ':
        		return "   "; // 4 units
            case 'a': 
                return ". -"; 
            case 'b': 
                return "- . . ."; 
            case 'c': 
                return "- . - ."; 
            case 'd': 
                return "- . ."; 
            case 'e': 
                return "."; 
            case 'f': 
                return ". . - ."; 
            case 'g': 
                return "- - ."; 
            case 'h': 
                return ". . . ."; 
            case 'i': 
                return ". ."; 
            case 'j': 
                return ". - - -"; 
            case 'k': 
                return "- . -"; 
            case 'l': 
                return ". - . ."; 
            case 'm': 
                return "- -"; 
            case 'n': 
                return "- ."; 
            case 'o': 
                return "- - -"; 
            case 'p': 
                return ". - - ."; 
            case 'q': 
                return "- - . -"; 
            case 'r': 
                return ". - ."; 
            case 's': 
                return ". . ."; 
            case 't': 
                return "-"; 
            case 'u': 
                return ". . -"; 
            case 'v': 
                return ". . . -"; 
            case 'w': 
                return ". - -"; 
            case 'x': 
                return "- . . -"; 
            case 'y': 
                return "- . - -";
            case 'z': 
                return "- - . .";
            case '1':
            	return ". - - - -";
            case '2':
            	return ". . - - -";
            case '3':
            	return ". . . - -";
            case '4':
            	return ". . . . -";
            case '5':
            	return ". . . . .";
            case '6':
            	return "- . . . .";
            case '7':
            	return "- - . . .";
            case '8':
            	return "- - - . .";
            case '9':
            	return "- - - - .";
            case '0':
            	return "- - - - -";
        } 
        return ""; 
    } 
      
    public static String morseEncode(String string){ 
    	String encodedString = "";
        for (int i = 0;i<string.length(); i++) 
            encodedString += (morseEncodeChar(string.charAt(i)) + "   ") ; 
        // 3 units space after each letter
        // 7 units (4 from func + 3 by default) between words
        // 1 unit space between dots so : 1 ' ' = 1 unit of space
        return encodedString;
    } 
} 