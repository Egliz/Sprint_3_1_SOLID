public class Validator {

    public static void stringValidator(String stringToValidated){
        if(stringToValidated == null || stringToValidated.isBlank()) {
            throw new IllegalArgumentException("Please enter a valid value");
        }
    }
}
