package com.tealeaf.plugin.plugins;

import com.tealeaf.*;
import com.tealeaf.plugin.IPlugin;
import com.tealeaf.event.Event;
import com.tealeaf.logger;

import java.io.*;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.heyzap.sdk.ads.HeyzapAds;

import android.app.Activity;
import android.content.Intent;
import android.content.Context;
import android.os.Bundle;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;

public class HeyzapPlugin implements IPlugin {
	private Activity mActivity;
	private boolean mConsumeBackPressed;

	public HeyzapPlugin() {}
	public void onCreateApplication(Context applicationContext) {}

	public void onCreate(Activity activity, Bundle savedInstanceState) {
		mActivity = activity;

		new Thread(new Runnable() {
			public void run() {
				try {
					HeyzapAds.start(mActivity);
					logger.log("{heyzap}", "Started.");
				} catch(Exception e) {
					logger.log("{heyzap}", "Failed to start.");
					logger.log("{heyzap}", e.getMessage());
				}
			}
		}).start();
	}

	public void onResume() {}
	public void onStart() {}
	public void onPause() {}
	public void onStop() {}
	public void onDestroy() {}
	public void onNewIntent(Intent intent) {}
	public void setInstallReferrer(String referrer) {}
	public void onActivityResult(Integer request, Integer result, Intent data) {}

	public boolean consumeOnBackPressed() {
		return mConsumeBackPressed;
	}

	public void onBackPressed() {}
}
