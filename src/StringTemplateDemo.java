
public class StringTemplateDemo{

    public static void main(String[] args){
        String name    = "Joan Smith";  
        String phone   = "555-123-4567";
        String address = "1 Maple Drive, Anytown";
        String json = """
            {
                "name":    "%s",
                "phone":   "%s",
                "address": "%s"
            }
            """.formatted(name, phone, address);
        System.out.println(json);
    }
}