package ratingRetriever;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class Ratings {
	public static void main(String[] args) {
		try {
		    JSONObject json = new JSONObject(readUrl("..."));

		    String title = (String) json.get("title");
		} catch (JSONException e) {
		    e.printStackTrace();
		}
	}
	public String retrieveText(int num) throws Exception {
		String urlString = "http://tools.fifaguide.com/api/club/" + num;
		BufferedReader reader = null;
	    try {
	        URL url = new URL(urlString);
	        reader = new BufferedReader(new InputStreamReader(url.openStream()));
	        StringBuffer buffer = new StringBuffer();
	        int read;
	        char[] chars = new char[1024];
	        while ((read = reader.read(chars)) != -1)
	            buffer.append(chars, 0, read); 

	        return buffer.toString();
	    } finally {
	        if (reader != null)
	            reader.close();
	    }
	}
}
