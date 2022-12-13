package url;

import java.io.IOException;
import java.util.Scanner;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class BuscaHttpClients {
	
	public static void main(String[] args) throws ClientProtocolException, IOException {

		Scanner sc = new Scanner(System.in);
			
		System.out.println("Informe url: ");
		String url = sc.nextLine();
	
	    CloseableHttpClient httpClient = HttpClients.createDefault();
	
	    HttpGet httpGet = new HttpGet(url);
	    
	    CloseableHttpResponse response = httpClient.execute(httpGet);
	
	    if (response.getStatusLine().getStatusCode() == 200) {
	
	    	String http = response.toString();
	
		    System.out.println(http);
	    } else {
	  
		System.out.println("Ocorreu um erro: " + response.getStatusLine().getStatusCode());
	    }
	}
}
