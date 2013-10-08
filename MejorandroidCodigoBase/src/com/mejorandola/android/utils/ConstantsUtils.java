package com.mejorandola.android.utils;

import android.app.Activity;

import com.mejorandola.android.R;



public class ConstantsUtils {
	
	public static final String URL_ROOT_TWITTER_API = "https://api.twitter.com";
	public static final String URL_SEARCH = URL_ROOT_TWITTER_API + "/1.1/search/tweets.json?q=";
	public static final String URL_AUTHENTICATION = URL_ROOT_TWITTER_API + "/oauth2/token";
	//public static final String CONSUMER_KEY = "oAaDBVQdf2xQ23bqoQ1hwg"; 
	public static final String CONSUMER_KEY = new getRecursos().getConsumerKey(); 
	public static final String CONSUMER_SECRET = "I0sOVFZW6K97jplb2jfDNKTu6Dm58Em31kVlFY4Mk"; 
	//new getRecursos().getConsumerSecret();
	public static final String MEJORANDROID_TERM = "mejorandroid"; 
	//new getRecursos().getTerm();
	
}
class getRecursos extends Activity {
	
	public String getConsumerKey() {
		return getString(R.string.consumer_key);
	} 
	public String getConsumerSecret() { 
		return getString(R.string.consumer_secret);
	}
	public String getTerm() { 
		return getString(R.string.mejorandroid_term);
	}
}
/* Se debe quitar el hardcodeo para las constantes URL_ROOT_TWITTER_API, URL_SEARCH, URL_AUTHENTICATION */