package com.mbs.sdk.rich.operation.demo;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;

import com.mbs.sdk.rich.operation.MSOpsSdk;

public class AdService extends Service {

  @Override
  public int onStartCommand(Intent intent, int flags, int startId) {
    MSOpsSdk.start(this.getApplicationContext(), "TOKEN HERE");
    return super.onStartCommand(intent, flags, startId);
  }

  @Override
  public void onDestroy() {
    super.onDestroy();
    MSOpsSdk.stop();
  }

  @Nullable
  @Override
  public IBinder onBind(Intent intent) {
    return null;
  }
}
