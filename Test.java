public class Test{    
    public static void main(String args[]){    
     int i,m=0,flag=0;      
     int n=3;//it is the number to be checked    
     m=n/2;      
     if(n==0||n==1){  
      System.out.println(n+" is not prime number");      
     }else{  
      for(i=2;i<=m;i++){      
       if(n%i==0){      
        System.out.println(n+" is not prime number");      
        flag=1;      
        break;      
       }      
      }      
      if(flag==0)  { System.out.println(n+" is prime number"); }  
     }//end of else  
   }    
   }   


import java.io.IOException;
import java.net.InetSocketAddress;
import com.sun.net.httpserver.HttpServer;

//9

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
   
