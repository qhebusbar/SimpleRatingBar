package com.example.simpleratingbar;

import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.iarcuschin.simpleratingbar.SimpleRatingBar;

public class BackgroundColorsFragment extends Fragment {

  @BindView(R.id.ratingBar1) SimpleRatingBar ratingBar1;
  @BindView(R.id.ratingBar2) SimpleRatingBar ratingBar2;
  @BindView(R.id.ratingBar3) SimpleRatingBar ratingBar3;
  @BindView(R.id.ratingBar4) SimpleRatingBar ratingBar4;
  @BindView(R.id.ratingBar5) SimpleRatingBar ratingBar5;
  private Unbinder unbinder;

  @Nullable
  @Override
  public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
      @Nullable Bundle savedInstanceState) {
    View view = inflater.inflate(R.layout.fragment_background_colors, container, false);
    unbinder = ButterKnife.bind(this, view);

    setHasOptionsMenu(true);

    return view;
  }

  @Override public void onDestroyView() {
    super.onDestroyView();
    unbinder.unbind();
  }
}

