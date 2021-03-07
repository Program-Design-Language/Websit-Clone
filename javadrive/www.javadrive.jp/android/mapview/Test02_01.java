package jp.javadrive.android;

import com.google.android.maps.MapActivity;
import android.os.Bundle;
import com.google.android.maps.MapView;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Test02_01 extends MapActivity {
    private final int FP = ViewGroup.LayoutParams.FILL_PARENT; 
    private final int WC = ViewGroup.LayoutParams.WRAP_CONTENT; 

    @Override public void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        setContentView(linearLayout);

        TextView text = new TextView(this);
        text.setText("Map Sample");
        linearLayout.addView(text, createParam(WC, WC));

        MapView map = new MapView(this);

        linearLayout.addView(map, createParam(WC, WC));
    }

    private LinearLayout.LayoutParams createParam(int w, int h){
        return new LinearLayout.LayoutParams(w, h);
    }
}
