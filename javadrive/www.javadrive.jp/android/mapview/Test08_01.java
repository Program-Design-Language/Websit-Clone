package jp.javadrive.android;

import com.google.android.maps.MapActivity;
import android.os.Bundle;
import com.google.android.maps.MapView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Button;
import android.graphics.Color;
import android.view.View.OnClickListener;
import com.google.android.maps.Point;
import com.google.android.maps.MapController;

public class Test08_01 extends MapActivity 
    implements OnClickListener{

    private final int FP = ViewGroup.LayoutParams.FILL_PARENT;
    private final int WC = ViewGroup.LayoutParams.WRAP_CONTENT;

    private MapView map;
    private Button buttonShinjyuku;
    private Button buttonShibuya;
    private MapController mc;

    @Override public void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        setContentView(linearLayout);


        LinearLayout btnLinearLayout = new LinearLayout(this);
        btnLinearLayout.setOrientation(LinearLayout.HORIZONTAL);
        btnLinearLayout.setBackgroundColor(Color.BLACK);

        buttonShinjyuku = new Button(this);
        buttonShinjyuku.setText("Shinjyuku");
        buttonShinjyuku.setOnClickListener(this);

        buttonShibuya = new Button(this);
        buttonShibuya.setText("Shibuya");
        buttonShibuya.setOnClickListener(this);

        btnLinearLayout.addView(buttonShinjyuku, createParam(WC, WC));
        btnLinearLayout.addView(buttonShibuya, createParam(WC, WC));


        map = new MapView(this);
        mc = map.getController();

        Point p = createPoint(35.690921f, 139.700258f);
        mc.centerMapTo(p, false);
        mc.zoomTo(15);

        linearLayout.addView(btnLinearLayout, createParam(FP, WC));
        linearLayout.addView(map, createParam(WC, WC));
    }

    private LinearLayout.LayoutParams createParam(int w, int h){
        return new LinearLayout.LayoutParams(w, h);
    }

    public void onClick(View v) {
        if (v == buttonShinjyuku){
            Point p = createPoint(35.690921f, 139.700258f);
            mc.animateTo(p);
        }else if (v == buttonShibuya){
            Point p = createPoint(35.658517f, 139.701334f);
            mc.animateTo(p);
        }
    }

    private Point createPoint(float lat, float lng){
        Point p = new Point((int)(lat * 1000000), (int)(lng * 1000000));
        return p;
    }
}
