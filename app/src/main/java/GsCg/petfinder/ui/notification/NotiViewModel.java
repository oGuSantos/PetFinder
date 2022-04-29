package GsCg.petfinder.ui.notification;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class NotiViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public NotiViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Notification");
    }

    public LiveData<String> getText() {
        return mText;
    }
}