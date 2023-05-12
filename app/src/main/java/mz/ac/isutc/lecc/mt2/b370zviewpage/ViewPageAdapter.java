package mz.ac.isutc.lecc.mt2.b370zviewpage;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import mz.ac.isutc.lecc.mt2.b370zviewpage.fragments.HomeFragment;
import mz.ac.isutc.lecc.mt2.b370zviewpage.fragments.SettingsFragments;
import mz.ac.isutc.lecc.mt2.b370zviewpage.fragments.UserFragment;

public class ViewPageAdapter extends FragmentStateAdapter {
    public ViewPageAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new HomeFragment();
            case 1:
                return new UserFragment();
            case 2:
                return new SettingsFragments();
            default:
                return new HomeFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
