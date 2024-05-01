// Generated by view binder compiler. Do not edit!
package com.example.contact.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.contact.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentRandomContactBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final NestedScrollView nestedSv;

  @NonNull
  public final ProgressBar progressbar;

  @NonNull
  public final RecyclerView rvContactlist;

  @NonNull
  public final EditText searchEt;

  @NonNull
  public final LinearLayout topPanel;

  private FragmentRandomContactBinding(@NonNull RelativeLayout rootView,
      @NonNull NestedScrollView nestedSv, @NonNull ProgressBar progressbar,
      @NonNull RecyclerView rvContactlist, @NonNull EditText searchEt,
      @NonNull LinearLayout topPanel) {
    this.rootView = rootView;
    this.nestedSv = nestedSv;
    this.progressbar = progressbar;
    this.rvContactlist = rvContactlist;
    this.searchEt = searchEt;
    this.topPanel = topPanel;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentRandomContactBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentRandomContactBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_random_contact, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentRandomContactBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.nested_sv;
      NestedScrollView nestedSv = ViewBindings.findChildViewById(rootView, id);
      if (nestedSv == null) {
        break missingId;
      }

      id = R.id.progressbar;
      ProgressBar progressbar = ViewBindings.findChildViewById(rootView, id);
      if (progressbar == null) {
        break missingId;
      }

      id = R.id.rv_contactlist;
      RecyclerView rvContactlist = ViewBindings.findChildViewById(rootView, id);
      if (rvContactlist == null) {
        break missingId;
      }

      id = R.id.search_et;
      EditText searchEt = ViewBindings.findChildViewById(rootView, id);
      if (searchEt == null) {
        break missingId;
      }

      id = R.id.topPanel;
      LinearLayout topPanel = ViewBindings.findChildViewById(rootView, id);
      if (topPanel == null) {
        break missingId;
      }

      return new FragmentRandomContactBinding((RelativeLayout) rootView, nestedSv, progressbar,
          rvContactlist, searchEt, topPanel);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}