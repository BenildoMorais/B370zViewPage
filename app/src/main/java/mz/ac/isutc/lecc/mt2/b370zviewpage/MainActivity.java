package mz.ac.isutc.lecc.mt2.b370zviewpage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import mz.ac.isutc.lecc.mt2.b370zviewpage.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}