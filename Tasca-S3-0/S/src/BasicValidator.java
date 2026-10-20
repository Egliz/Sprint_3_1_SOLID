public class BasicValidator {

    public static void stringValidator(String stringToValidated){
        if(stringToValidated == null || stringToValidated.isBlank()) {
            throw new IllegalArgumentException("Text entered in " + stringToValidated + " is invalid. Please enter a valid value");
        }
    }
}
