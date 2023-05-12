package mz.ac.isutc.lecc.mt2.b370zviewpage.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import mz.ac.isutc.lecc.mt2.b370zviewpage.R;
import mz.ac.isutc.lecc.mt2.b370zviewpage.databinding.FragmentHomeBinding;


public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentHomeBinding.inflate(getLayoutInflater());


        return binding.getRoot();
    }
}