package GsCg.petfinder.ui.lostpet;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class LostViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public LostViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is LostPet");
    }

    public LiveData<String> getText() {
        return mText;
    }
}