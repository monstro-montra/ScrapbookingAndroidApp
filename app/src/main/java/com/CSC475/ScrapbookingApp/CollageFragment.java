package com.CSC475.ScrapbookingApp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.CSC475.ScrapbookingApp.databinding.FragmentCollageBinding;

public class CollageFragment extends Fragment {
    ImageView machu_picchu, rome, tokyo;
    private FragmentCollageBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        binding = FragmentCollageBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //initialize images
        machu_picchu = view.findViewById(R.id.machu_picchu_image);
        rome = view.findViewById(R.id.rome_image);
        tokyo = view.findViewById(R.id.tokyo_image);

        //set onClick to move from CollageFragment to MachuPicchuFragment
        binding.machuPicchuImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(CollageFragment.this)
                        .navigate(R.id.action_CollageFragment_to_MachuPicchuFragment);
            }
        });

        //set onClick to move from CollageFragment to RomeFragment
        binding.romeImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(CollageFragment.this)
                        .navigate(R.id.action_CollageFragment_to_RomeFragment);
            }
        });

        //set onClick to move from CollageFragment to TokyoFragment
        binding.tokyoImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(CollageFragment.this)
                        .navigate(R.id.action_CollageFragment_to_TokyoFragment);
            }
        });

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}