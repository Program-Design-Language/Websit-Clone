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
import android.app.AlertDialog;
import com.google.android.maps.Point;
import com.google.android.maps.MapController;

public class Test07_01 extends MapActivity 
    implements OnClickListener{

    private final int FP = ViewGroup.LayoutParams.FILL_PARENT;
    private final int WC = ViewGroup.LayoutParams.WRAP_CONTENT;

    private MapView map;
    private Button buttonTokyo;
    private Button buttonNagoya;
    private Button buttonOsaka;
    private MapController mc;

    @Override public void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        setContentView(linearLayout);


        LinearLayout btnLinearLayout = new LinearLayout(this);
        btnLinearLayout.setOrientation(LinearLayout.HORIZONTAL);
        btnLinearLayout.setBackgroundColor(Color.BLACK);

        buttonTokyo = new Button(this);
        buttonTokyo.setText("Tokyo");
        buttonTokyo.setOnClickListener(this);

        buttonNagoya = new Button(this);
        buttonNagoya.setText("Nagoya");
        buttonNagoya.setOnClickListener(this);

        buttonOsaka = new Button(this);
        buttonOsaka.setText("Osaka");
        buttonOsaka.setOnClickListener(this);

        btnLinearLayout.addView(buttonTokyo, createParam(WC, WC));
        btnLinearLayout.addView(buttonNagoya, createParam(WC, WC));
        btnLinearLayout.addView(buttonOsaka, createParam(WC, WC));


        map = new MapView(this);
        mc = map.getController();

        Point p = new Point((int)(35.681099 * 1000000), (int)(139.767084 * 1000000));
        mc.centerMapTo(p, false);
        mc.zoomTo(15);

        linearLayout.addView(btnLinearLayout, createParam(FP, WC));
        linearLayout.addView(map, createParam(WC, WC));
    }

    private LinearLayout.LayoutParams createParam(int w, int h){
        return new LinearLayout.LayoutParams(w, h);
    }

    public void onClick(View v) {
        if (v == buttonTokyo){
            Point p = createPoint(35.681099f, 139.767084f);
            mc.centerMapTo(p, true);
        }else if (v == buttonNagoya){
            Point p = createPoint(35.170694f, 136.881637f);
            mc.centerMapTo(p, true);
        }else if (v == buttonOsaka){
            Point p = createPoint(34.701909f, 135.494977f);
            mc.centerMapTo(p, true);
        }
    }

    private Point createPoint(float lat, float lng){
        Point p = new Point((int)(lat * 1000000), (int)(lng * 1000000));
        return p;
    }
}
