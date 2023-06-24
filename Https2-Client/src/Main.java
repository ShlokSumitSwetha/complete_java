import java.net.URI;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		String url="https://www.redbus.in/info/aboutus";
		 sendGetSyncRequest(url);

		System.out.println("Hello world!");
	}
	public static void sendGetSyncRequest(String url) throws Exception
 {
	 HttpRequest request = HttpRequest.newBuilder()
			 .uri(new URI(url))
			 .GET()
			 .build();
 }
	public static void processResponse(HttpResponse resp)
 {
		 System.out.println("Status Code:"+resp.statusCode());
		 System.out.println("Response Body:"+resp.body());
		 HttpHeaders header=resp.headers();
		 Map<String, List<String>> map=header.map();
		System.out.println("Response Headers");
		map.forEach((k,v)->System.out.println("\t"+k+":"+v));
 }

}