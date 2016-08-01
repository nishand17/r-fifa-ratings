package ratingRetriever;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

import org.json.JSONException;
import org.json.JSONObject;

public class retriever {
	public void start() throws Exception {
		try {
		    JSONObject json = new JSONObject(readUrl(1));
		    String title = (String) json.get("first_name");
		    System.out.println(title);
		} catch (JSONException e) {
		    e.printStackTrace();
		}
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
