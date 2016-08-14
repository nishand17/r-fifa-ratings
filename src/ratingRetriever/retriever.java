package ratingRetriever;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import org.json.JSONException;

public class retriever {
	public void start() throws Exception {
		String filename= "ratingsColor.csv";
		String cardType = "";
	    FileWriter fw = new FileWriter(filename,true);
		for(int i = 1; i < 326; i++) {
			try {
			    String message = readUrl(1);
			    String messageAr[] = message.split("\"");
			    for(int j = 0; j < messageAr.length; j++) {
			    	if(messageAr[j].equals("rating")) {
			    		try {
			    			int messageInt = Integer.parseInt(messageAr[j+2]);
			    			/*
			    			if(messageInt>=74) {
			    				cardType = "gold";
			    			} else if(messageInt<74 && messageInt>67) {
			    				cardType = "silver";
			    			} else {
			    				cardType = "bronze";
			    			}
			    			*/
			    			fw.write(messageAr[j+2] + ", \n");//appends the string to the file
			    		    System.out.println("appended");
			    		} catch (IOException ioe) {
			    			System.err.println("IOException: " + ioe.getMessage());
			    		}
			    	}
			    }
			} catch (JSONException e) {
			    e.printStackTrace();
			}
		}
		fw.close();
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
	        while ((read = reader.read(chars)) != -1) {
	            buffer.append(chars, 0, read); 
	        }
	        String message = buffer.toString().substring(1,(buffer.toString().length()-1));
	        return message;
	        
	    } finally {
	        if (reader != null)
	            reader.close();
	    }
	}
}
