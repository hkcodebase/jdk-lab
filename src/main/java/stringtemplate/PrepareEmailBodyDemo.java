package src.main.java.stringtemplate;

/**
 * this program demonstrate String Template Feature of JDK 21 using code samples before and after
 *
 * <html>
 *  <body><p> Welcome John to our planet.</p>
 * </body>
 * </html>
 *
 */
public class PrepareEmailBodyDemo {

    public static void main(String[] args){
        System.out.println("=====================================");
        System.out.println("Before JDK 21 Email Body preparation");
        System.out.println("=====================================");
        System.out.println(prepareEmailBodyBeforeJDK21("John"));
        System.out.println("=====================================");

        System.out.println("After JDK 21 Email Body preparation");
        System.out.println("=====================================");
        System.out.println(prepareEmailBody("John"));
    }

    public static String prepareEmailBodyBeforeJDK21(String name){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<html>\n <body>");
        stringBuilder.append(String.format("<p> Welcome %s to our planet.</p> \n", name));
        stringBuilder.append("</body>\n</html>");
       return stringBuilder.toString();
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