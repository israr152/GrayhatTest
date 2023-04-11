// Generated by view binder compiler. Do not edit!
package com.example.grayhattestproject.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.example.grayhattestproject.R;
import com.google.android.material.tabs.TabLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TabLayout brandsTabLayout;

  @NonNull
  public final EditText etSearch;

  @NonNull
  public final ImageView ivDrawer;

  @NonNull
  public final TextView tvTitle;

  @NonNull
  public final ViewPager2 vpSlider;

  private ActivityMainBinding(@NonNull ConstraintLayout rootView,
      @NonNull TabLayout brandsTabLayout, @NonNull EditText etSearch, @NonNull ImageView ivDrawer,
      @NonNull TextView tvTitle, @NonNull ViewPager2 vpSlider) {
    this.rootView = rootView;
    this.brandsTabLayout = brandsTabLayout;
    this.etSearch = etSearch;
    this.ivDrawer = ivDrawer;
    this.tvTitle = tvTitle;
    this.vpSlider = vpSlider;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.brandsTabLayout;
      TabLayout brandsTabLayout = ViewBindings.findChildViewById(rootView, id);
      if (brandsTabLayout == null) {
        break missingId;
      }

      id = R.id.etSearch;
      EditText etSearch = ViewBindings.findChildViewById(rootView, id);
      if (etSearch == null) {
        break missingId;
      }

      id = R.id.ivDrawer;
      ImageView ivDrawer = ViewBindings.findChildViewById(rootView, id);
      if (ivDrawer == null) {
        break missingId;
      }

      id = R.id.tvTitle;
      TextView tvTitle = ViewBindings.findChildViewById(rootView, id);
      if (tvTitle == null) {
        break missingId;
      }

      id = R.id.vpSlider;
      ViewPager2 vpSlider = ViewBindings.findChildViewById(rootView, id);
      if (vpSlider == null) {
        break missingId;
      }

      return new ActivityMainBinding((ConstraintLayout) rootView, brandsTabLayout, etSearch,
          ivDrawer, tvTitle, vpSlider);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}