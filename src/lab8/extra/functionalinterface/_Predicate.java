package lab8.extra.functionalinterface;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        System.out.println("Without predicate");
        System.out.println(isPhoneNumberValid("07000000000"));
        System.out.println(isPhoneNumberValid("09007730000"));
        System.out.println("With predicate");
        System.out.println(isPhoneNumberValidByPredicate.test("07000000000"));
        System.out.println(isPhoneNumberValidByPredicate.test("09007730000"));

        System.out.println(
                isPhoneNumberValidByPredicate.and(containsNumber3).test("09007730000"));

    }

    static boolean isPhoneNumberValid(String phoneNumber){
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }

    static Predicate<String> isPhoneNumberValidByPredicate = phoneNumber ->
            phoneNumber.startsWith("07") && phoneNumber.length() == 11;

    static Predicate<String> containsNumber3 = phoneNumber ->
            phoneNumber.contains("3");
}
