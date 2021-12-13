package org.openbot.myapplication;

import android.app.Dialog;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;

public class MyDialogFragment extends DialogFragment {

  @NonNull
  @Override
  public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
    return new MaterialAlertDialogBuilder(requireContext()).setMessage("Message").create();
  }
}
