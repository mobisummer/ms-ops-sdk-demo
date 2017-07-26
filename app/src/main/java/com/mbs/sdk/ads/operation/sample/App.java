package com.mbs.sdk.ads.operation.sample;

import android.app.Application;

import com.mbs.sdk.ads.operation.MsOperationSdk;

public class App extends Application {
  @Override
  public void onCreate() {
    super.onCreate();
    MsOperationSdk.start(this);
  }
}
