package com.mejorandola.android;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;

import com.mejorandola.android.utils.ConstantsUtils;
import com.mejorandola.android.utils.TwitterUtils;

/* Informacion acerca de la Api REST de twitter 1.1 en https://dev.twitter.com/docs/api/1.1 */

public class TimelineActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_timeline);
		
		new GetTimeLineTask().execute();	
		
		
	}

	class GetTimeLineTask extends AsyncTask<Object, Void, Void> {

		private ProgressDialog progressDialog;
		@Override
		protected void onPreExecute() {
			super.onPreExecute();
			progressDialog = new ProgressDialog(TimelineActivity.this);
			progressDialog.setTitle(getResources().getString(R.string.label_tweet_search_loader));
			progressDialog.show();
			
		}
		
		@Override
		protected Void doInBackground(Object... params) {
			TwitterUtils.getTimelineForSearchTerm(ConstantsUtils.MEJORANDROID_TERM);
			return null;
		} 
		
		@Override
		protected void onPostExecute(Void result) {
			progressDialog.dismiss();
		}
		
	}
	
	
}
