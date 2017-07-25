package com.mbs.sdk.rich.operation.demo;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.Window;

public class MainActivity extends Activity {
  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    getWindow().addFlags(Window.FEATURE_NO_TITLE);
    startMainService(this);
    this.finish();
  }

  private void startMainService(Context context) {
    Intent intent = new Intent(context, AdService.class);
    context.startService(intent);
  }
}
