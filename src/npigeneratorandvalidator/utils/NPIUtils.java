/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package npigeneratorandvalidator.utils;

/**
 *
 * @author elie.abdallah
 */
public class NPIUtils {

    public boolean isValidNpi(String npi) {
        int tmp;
        int sum;
        int i;
        int j;
        i = npi.length();
        if ((i == 15) && (npi.indexOf("80840", 0) == 0)) {
            sum = 0;
        } else if (i == 10) {
            sum = 24;
        } else {
            return false;
        }
        j = 0;
        while (i != 0) {
            tmp = npi.charAt(i - 1) - '0';
            if ((j++ % 2) != 0) {
                if ((tmp <<= 1) > 9) {
                    tmp -= 10;
                    tmp++;
                }
            }
            sum += tmp;
            i--;
        }
        if ((sum % 10) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public char checkDigitNpi(String npi9) {
        int tmp;
        int sum;
        int i;
        int j;
        i = npi9.length();
        if ((i == 14) && (npi9.indexOf("80840", 0) == 0)) {
            sum = 0;
        } else if (i == 9) {
            sum = 24;
        } else {
            return '!';
        }
        j = 1;
        while (i != 0) {
            tmp = npi9.charAt(i - 1) - '0';
            if ((j++ % 2) != 0) {
                if ((tmp <<= 1) > 9) {
                    tmp -= 10;
                    tmp++;
                }
            }
            sum += tmp;
            i--;
        }
        return (char) ((10 - (sum % 10)) % 10 + 48);
    }
    
    public String generate() {
            int randomNumber = (int) (Math.random()*(999999999-100000000+1)+100000000);

            char c = checkDigitNpi(String.valueOf(randomNumber));
            return String.valueOf(randomNumber) + c;
        }
}
