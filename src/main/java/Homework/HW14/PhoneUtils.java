package Homework.HW14;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.Random;

public class PhoneUtils {
    public static String generatePhone(){
        String suffixPhone=IntStream.range(0,7).boxed().map(value->new Random().nextInt(10)+"").collect(Collectors.joining());
        return "7"+MobileOperators.generateCode()+suffixPhone;


    }
}
