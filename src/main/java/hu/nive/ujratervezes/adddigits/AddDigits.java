package hu.nive.ujratervezes.adddigits;

public class AddDigits {

    public int addDigits(String input) {
        int sum = 0;
        char ch;
        int n;

        if (input == null ||input.isEmpty()){
            return -1;
        }
        for (int i = 0; i < input.length(); i++) {
            ch = input.charAt(i);

            if (Character.isDigit(ch)) {
                n = Character.getNumericValue(ch);
                sum += n;
            }
        }
        return sum;
    }
}
