// Generated by view binder compiler. Do not edit!
package com.example.carsevices.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.carsevices.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityLoginBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button button;

  @NonNull
  public final CheckBox chkbx;

  @NonNull
  public final ImageView imageView3;

  @NonNull
  public final TextView textView3;

  @NonNull
  public final TextView textView4;

  @NonNull
  public final EditText txtpass;

  @NonNull
  public final EditText txtuser;

  private ActivityLoginBinding(@NonNull ConstraintLayout rootView, @NonNull Button button,
      @NonNull CheckBox chkbx, @NonNull ImageView imageView3, @NonNull TextView textView3,
      @NonNull TextView textView4, @NonNull EditText txtpass, @NonNull EditText txtuser) {
    this.rootView = rootView;
    this.button = button;
    this.chkbx = chkbx;
    this.imageView3 = imageView3;
    this.textView3 = textView3;
    this.textView4 = textView4;
    this.txtpass = txtpass;
    this.txtuser = txtuser;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_login, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityLoginBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button;
      Button button = ViewBindings.findChildViewById(rootView, id);
      if (button == null) {
        break missingId;
      }

      id = R.id.chkbx;
      CheckBox chkbx = ViewBindings.findChildViewById(rootView, id);
      if (chkbx == null) {
        break missingId;
      }

      id = R.id.imageView3;
      ImageView imageView3 = ViewBindings.findChildViewById(rootView, id);
      if (imageView3 == null) {
        break missingId;
      }

      id = R.id.textView3;
      TextView textView3 = ViewBindings.findChildViewById(rootView, id);
      if (textView3 == null) {
        break missingId;
      }

      id = R.id.textView4;
      TextView textView4 = ViewBindings.findChildViewById(rootView, id);
      if (textView4 == null) {
        break missingId;
      }

      id = R.id.txtpass;
      EditText txtpass = ViewBindings.findChildViewById(rootView, id);
      if (txtpass == null) {
        break missingId;
      }

      id = R.id.txtuser;
      EditText txtuser = ViewBindings.findChildViewById(rootView, id);
      if (txtuser == null) {
        break missingId;
      }

      return new ActivityLoginBinding((ConstraintLayout) rootView, button, chkbx, imageView3,
          textView3, textView4, txtpass, txtuser);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
