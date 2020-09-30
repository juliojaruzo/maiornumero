package maiornumero;

import java.util.Arrays;
import java.util.Collections;
import javax.swing.JOptionPane;

public class BiggestNumberBrother {
    private int number = 0;

    public int uiBiggestNumberBrother() {
        try {
            String numberString = JOptionPane.showInputDialog("Enter a positive integer :: ");

            try {
                this.number = Integer.parseInt(numberString);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Entry does not match a positive integer", "Error message", JOptionPane.INFORMATION_MESSAGE);
                return 0;
            }

            if (this.number < 0) {
                JOptionPane.showMessageDialog(null, this.number + " does not correspond to a positive integer", "Message", JOptionPane.INFORMATION_MESSAGE);
                return 0;
            }

            int result = this.biggestNumberBrother(this.number);

            if (result == 0) {
                JOptionPane.showMessageDialog(null, "Number returned does not correspond to a positive integer ", "Message error", JOptionPane.INFORMATION_MESSAGE);
                return 0;
            }

            if (result == -1) {
                JOptionPane.showMessageDialog(null, "Result of the largest sibling number cannot exceed 100,000,000", "Message", JOptionPane.INFORMATION_MESSAGE);
                return 0;
            }

            JOptionPane.showMessageDialog(null, "largest brother number of " + this.number + " :: " + result, "Message", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e, "Message error", JOptionPane.INFORMATION_MESSAGE);
        }

        return 1;
    }

    public int biggestNumberBrother(int number) {
        try {
            String numberString = Integer.toString(number);

            String[] numberArray = numberString.split("", -1);

            Arrays.sort(numberArray, Collections.reverseOrder());

            String newNumberString = "";

            for (int i = 0; i < numberString.length(); i++) {
                newNumberString += numberArray[i];
            }

            number = Integer.parseInt(newNumberString);

            if (number > 100000000) {
                return -1;
            }

            return Integer.parseInt(newNumberString);
        } catch (Exception e) {
            return 0;
        }
    }
}