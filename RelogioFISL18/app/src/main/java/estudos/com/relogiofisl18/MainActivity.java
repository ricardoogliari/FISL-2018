package estudos.com.relogiofisl18;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.view.View;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends WearableActivity {

    private TextView mTextView;

    private DatabaseReference myRef;

    private boolean ligado = true;

    private WifiManager.WifiLock wifiLock;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = (TextView) findViewById(R.id.text);

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        myRef = database.getReference("lamp");


        // Enables Always-on
        setAmbientEnabled();

        if (wifiLock == null) {
            WifiManager wm = (WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE);
            if (wm != null) {
                wifiLock = wm.createWifiLock(WifiManager.WIFI_MODE_FULL, "fisl18");
                wifiLock.setReferenceCounted(true);
            }
        }
    }

    public void onOff(View view) {
        myRef.setValue(ligado);
        ligado = !ligado;
    }
}
