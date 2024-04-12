package com.example.lab2.ui.notifications;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.lab2.R;
import com.example.lab2.databinding.FragmentNotificationsBinding;
/// Szymon Kuczyński s22466
public class NotificationsFragment extends Fragment {

    private FragmentNotificationsBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        NotificationsViewModel notificationsViewModel =
                new ViewModelProvider(this).get(NotificationsViewModel.class);


        binding = FragmentNotificationsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView1 = binding.textBreakfast;
        notificationsViewModel.getText1().observe(getViewLifecycleOwner(), textView1::setText);
        final TextView textView2 = binding.textRecipe1;
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        final TextView textView3 = binding.textLunch;
        notificationsViewModel.getText3().observe(getViewLifecycleOwner(), textView3::setText);
        final TextView textView4 = binding.textRecipe2;
        textView4.setMovementMethod(LinkMovementMethod.getInstance());
        final TextView textView5 = binding.textSupper;
        notificationsViewModel.getText5().observe(getViewLifecycleOwner(), textView5::setText);
        final TextView textView6 = binding.textRecipe3;
        textView6.setMovementMethod(LinkMovementMethod.getInstance());
        return root;

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}