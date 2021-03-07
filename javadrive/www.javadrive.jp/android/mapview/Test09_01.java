package jp.javadrive.android;

import com.google.android.maps.MapActivity;
import android.os.Bundle;
import com.google.android.maps.MapView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Button;
import android.widget.TextView;
import android.graphics.Color;
import android.view.View.OnClickListener;
import com.google.android.maps.Point;
import com.google.android.maps.MapController;

public class Test09_01 extends MapActivity 
    implements OnClickListener{

    private final int FP = ViewGroup.LayoutParams.FILL_PARENT;
    private final int WC = ViewGroup.LayoutParams.WRAP_CONTENT;

    private MapView map;
    private Button buttonZoomin;
    private Button buttonZoomout;
    private MapController mc;
    private TextView textZoomlevel;

    @Override public void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        setContentView(linearLayout);


        LinearLayout btnLinearLayout = new LinearLayout(this);
        btnLinearLayout.setOrientation(LinearLayout.HORIZONTAL);
        btnLinearLayout.setBackgroundColor(Color.BLACK);

        buttonZoomin = new Button(this);
        buttonZoomin.setText("+");
        buttonZoomin.setOnClickListener(this);

        buttonZoomout = new Button(this);
        buttonZoomout.setText("-");
        buttonZoomout.setOnClickListener(this);

        textZoomlevel = new TextView(this);
        textZoomlevel.setText("Level:15");
        textZoomlevel.setTextColor(Color.WHITE);

        btnLinearLayout.addView(buttonZoomin, createParam(WC, WC));
        btnLinearLayout.addView(buttonZoomout, createParam(WC, WC));
        btnLinearLayout.addView(textZoomlevel, createParam(WC, WC));


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
        if (v == buttonZoomin){
            int level = map.getZoomLevel();
            mc.zoomTo(level + 1);
            textZoomlevel.setText("Level:" + map.getZoomLevel());
        }else if (v == buttonZoomout){
            int level = map.getZoomLevel();
            mc.zoomTo(level - 1);
            textZoomlevel.setText("Level:" + map.getZoomLevel());
        }
    }

    private Point createPoint(float lat, float lng){
        Point p = new Point((int)(lat * 1000000), (int)(lng * 1000000));
        return p;
    }
}
