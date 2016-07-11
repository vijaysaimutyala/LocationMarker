package abc.com.example.vijsu.trackbus;

import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created by vijsu on 14-04-2016.
 */
public class FirebaseConnect extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
    }
}
