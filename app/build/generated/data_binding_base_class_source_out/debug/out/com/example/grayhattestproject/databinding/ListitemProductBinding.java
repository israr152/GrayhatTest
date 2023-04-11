// Generated by view binder compiler. Do not edit!
package com.example.grayhattestproject.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.grayhattestproject.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ListitemProductBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final CardView cvItem;

  @NonNull
  public final ImageView ivProductImage;

  @NonNull
  public final TextView tvName;

  @NonNull
  public final TextView tvPrice;

  @NonNull
  public final TextView tvType;

  private ListitemProductBinding(@NonNull CardView rootView, @NonNull CardView cvItem,
      @NonNull ImageView ivProductImage, @NonNull TextView tvName, @NonNull TextView tvPrice,
      @NonNull TextView tvType) {
    this.rootView = rootView;
    this.cvItem = cvItem;
    this.ivProductImage = ivProductImage;
    this.tvName = tvName;
    this.tvPrice = tvPrice;
    this.tvType = tvType;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static ListitemProductBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ListitemProductBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.listitem_product, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ListitemProductBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      CardView cvItem = (CardView) rootView;

      id = R.id.ivProductImage;
      ImageView ivProductImage = ViewBindings.findChildViewById(rootView, id);
      if (ivProductImage == null) {
        break missingId;
      }

      id = R.id.tvName;
      TextView tvName = ViewBindings.findChildViewById(rootView, id);
      if (tvName == null) {
        break missingId;
      }

      id = R.id.tvPrice;
      TextView tvPrice = ViewBindings.findChildViewById(rootView, id);
      if (tvPrice == null) {
        break missingId;
      }

      id = R.id.tvType;
      TextView tvType = ViewBindings.findChildViewById(rootView, id);
      if (tvType == null) {
        break missingId;
      }

      return new ListitemProductBinding((CardView) rootView, cvItem, ivProductImage, tvName,
          tvPrice, tvType);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
