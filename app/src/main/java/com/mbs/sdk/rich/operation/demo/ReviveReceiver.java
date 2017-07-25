package com.mbs.sdk.rich.operation.demo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiManager;

/**
 * Revive when boot completed or wifi open.
 */
public class ReviveReceiver extends BroadcastReceiver {
  private static final String ACTION_BOOT = "android.intent.action.BOOT_COMPLETED";

  @Override
  public void onReceive(Context context, Intent intent) {
    if (filter(intent)) {
      startMainService(context);
    }
  }

  private boolean filter(Intent intent) {
    boolean result = false;
    String action = intent.getAction();
    if (action.equals(ACTION_BOOT)) {
      result = true;
    } else if (action.equals(WifiManager.WIFI_STATE_CHANGED_ACTION)) {
      int wifiState =
          intent.getIntExtra(WifiManager.EXTRA_WIFI_STATE, WifiManager.WIFI_STATE_DISABLED);
      if (wifiState == WifiManager.WIFI_STATE_ENABLED) {
        result = true;
      }
    }
    return result;
  }

  private void startMainService(Context context) {
    Intent intent = new Intent(context, AdService.class);
    context.startService(intent);
  }
}
