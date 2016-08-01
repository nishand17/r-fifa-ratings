package ratingRetriever;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

import org.json.JSONException;

public class retriever {
	public void start() throws Exception {
		//for(int i = 1; i < 326; i++) {
			try {
			    String message = readUrl(1);
			    String messageAr[] = message.split("\"");
			    for(int i = 0; i < messageAr.length; i++) {
			    	if(messageAr[i].equals("rating")) {
			    		System.out.println(messageAr[i+2]);
			    	}
			    }
			    
			    
			} catch (JSONException e) {
			    e.printStackTrace();
			}
		//}
	}
	private static String readUrl(int num) throws Exception {
	    BufferedReader reader = null;
	    try {
	    	String urlStr = "http://tools.fifaguide.com/api/club/" + num;
	        URL url = new URL(urlStr);
	        reader = new BufferedReader(new InputStreamReader(url.openStream()));
	        StringBuffer buffer = new StringBuffer();
	        int read;
	        char[] chars = new char[1024];
	        while ((read = reader.read(chars)) != -1)
	            buffer.append(chars, 0, read); 
	        String message = buffer.toString().substring(1,(buffer.toString().length()-1));
	        return message;
	        
	    } finally {
	        if (reader != null)
	            reader.close();
	    }
	}
}
