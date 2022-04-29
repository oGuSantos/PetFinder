package GsCg.petfinder.ui.notification;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import GsCg.petfinder.databinding.FragmentNotiBinding;

public class NotiFragment extends Fragment {

    private FragmentNotiBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        NotiViewModel notiViewModel =
                new ViewModelProvider(this).get(NotiViewModel.class);

        binding = FragmentNotiBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textNoti;
        notiViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}