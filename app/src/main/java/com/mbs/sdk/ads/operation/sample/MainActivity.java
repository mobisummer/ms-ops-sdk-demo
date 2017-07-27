package com.mbs.sdk.ads.operation.sample;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

public class MainActivity extends Activity {
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    getWindow().addFlags(Window.FEATURE_NO_TITLE);
    this.finish();
  }
}