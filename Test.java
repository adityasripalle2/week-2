import java.io.IOException;
import java.net.InetSocketAddress;
import com.sun.net.httpserver.HttpServer;



public class Test {
    public static void main(String[] args) throws IOException 
         {
        int port = 8080; // Port on which the server will listen
        System.out.println("Starting server on port " + port);
        HttpServer server = HttpServer.create(new InetSocketAddress(port), 0);
        server.createContext("/", (exchange -> {
            String response = "Hello, Kubernetes!";
            exchange.sendResponseHeaders(200, response.getBytes().length);
            exchange.getResponseBody().write(response.getBytes());
            exchange.close();
        }));
        server.setExecutor(null);
        server.start();
        System.out.println("Server is running at http://localhost:" + port);
    }
}