package src.main.java.stringtemplate;

/**
 * this program demonstrate String Template Feature of JDK 21 using code samples before and after
 *
 * {
 * 	"first_name": "John",
 * 	"last_name": "Doe",
 * 	"country": "Mars"
 * }
 *
 */
public class PrepareJsonDemo {

    public static void main(String[] args){
        System.out.println(prepareJsonBeforeJava21("John", "Doe", "Mars"));
        System.out.println(prepareJson("John", "Doe", "Mars"));
    }

    public static String prepareJsonBeforeJava21(String firstName, String lastName, String country){
        return String.format("{\n\t\"first_name\": \"%s\",\n\t\"last_name\": \"%s\",\n\t\"country\": \"%s\"\n}", firstName, lastName, country);
    }

    public static String prepareJson(String firstName, String lastName, String country){
        return
            """
            {
                "first_name": "%s",
                "last_name": "%s",
                "country": "%s"
            }
            """.formatted(firstName, lastName, country);
    }

}