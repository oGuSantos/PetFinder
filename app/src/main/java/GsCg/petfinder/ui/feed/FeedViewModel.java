package GsCg.petfinder.ui.feed;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FeedViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public FeedViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is feed");
    }

    public LiveData<String> getText() {
        return mText;
    }
}