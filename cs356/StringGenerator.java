package edu.cpp.cs356;

import java.math.BigInteger;
import java.security.SecureRandom;

public class StringGenerator {

    private SecureRandom r = new SecureRandom();

    public String IDString() {
        return new BigInteger(35, r).toString(32).toUpperCase();
    }

    public String answerString(int type) {
        if (type == 1) {
            if (r.nextInt(4) == 0)
                return "A";
            else if (r.nextInt(4) == 1)
                return "B";
            else if (r.nextInt(4) == 2)
                return "C";
            else
                return "D";
        } else {
            if (r.nextInt(2) == 0)
                return "True";
            else
                return "False";
        }
    }

    public String questionString() {
        return new BigInteger(100, r).toString(32).toUpperCase();
    }

}
