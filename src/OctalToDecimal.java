public class OctalToDecimal {
    public int convertToDecimal(String octal){
        int decimalResult = 0;

        for (int i = octal.length(); i > 0; i--){
            decimalResult += Integer.parseInt(octal.substring(i-1, i)) * Math.pow(8, octal.length()-i);
        }

        return decimalResult;
    }


    public static void main(String[] args) {
        OctalToDecimal octalToDecimal = new OctalToDecimal();
        System.out.println(octalToDecimal.convertToDecimal("10"));
        System.out.println(octalToDecimal.convertToDecimal("100"));
        System.out.println(octalToDecimal.convertToDecimal("64"));
    }
}