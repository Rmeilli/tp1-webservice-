import jakarta.xml.ws.Endpoint;
import ws.BanqueService;

public class ServerJWS {
    public static void main(String[] args) {
        // TODO: Implement server-side logic for generating and validating JWS tokens
        Endpoint.publish("http://localhost:8080/",new BanqueService());
        System.out.println("Server started at http://localhost:8080/");
    }
}
