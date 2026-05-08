import method.JavaMethod;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
//        System.out.println("""
//
//                """);
//        JavaMethod method = new JavaMethod();
//
//        method.hi(-6);
//
//        System.out.println(
//                method.checkPalindrome("oyohd")
//        );
//
//        boolean val = method.checkPalindrome("ohaiyo");

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern(
                "EEEE-dd-MMM-yyyy:HH-mm-ss.SS"
        );
        DateTimeFormatter dateFmt = DateTimeFormatter.ofPattern(
                "dd-MM-yyyy"
        );
        System.out.println(
                "Date + time : " + LocalDateTime.now().format(fmt)
        );
        System.out.println(
                "Just Date : " + LocalDate.now().format(dateFmt)
        );

    }

}
