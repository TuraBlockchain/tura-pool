package burst.pool;


import java.math.BigInteger;

import signumj.entity.SignumID;
import java.math.BigDecimal;
import signumj.util.SignumUtils;
import signumj.entity.SignumValue;
public class test {
    public static void main(String[] args) {

//        String unsignedID = "18011419053404739909";
////
////        SignumID signumID = SignumID.fromLong(unsignedID);
////        long signedLongID = signumID.getSignedLongId();
////
////        System.out.println(signedLongID);



//        long signedLongID = -4677022528552779283L;
//
//        SignumID signumID = SignumID.fromLong(signedLongID);
//        String unsignedID = signumID.getID();
//
//        System.out.println(unsignedID);


//        System.out.println(BigDecimal.valueOf(0.1));
//        BigDecimal burst = BigDecimal.valueOf(0.1);
//        System.out.println(burst.multiply(BigDecimal.TEN.pow(8)).toBigInteger());
        System.out.println(SignumUtils.getEndpoint());
        System.out.println(SignumValue.fromNQT(224780000));
        String planck = "224780000";
        System.out.println(planck.substring(0, planck.length() - 4));




    }
}
