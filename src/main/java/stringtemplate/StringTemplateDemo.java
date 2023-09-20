package src.main.java.stringtemplate;

public class StringTemplateDemo{

    public static void main(String[] args){
        System.out.println(prepareJson("John", "Doe", "Mars"));
        System.out.println(prepareEmailBody("John"));
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

    public static String prepareEmailBody(String name){
        return
                """
                <html>
                <body>
                    <p> Welcome %s to our planet.</p>
                </body>
                </html>
                """.formatted(name);
    }

}