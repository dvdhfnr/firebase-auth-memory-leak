package org.openbot.myapplication;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
  }

  public void showDialog(View v) {
    new MyDialogFragment().show(getSupportFragmentManager(), "MyDialog");
  }
}
