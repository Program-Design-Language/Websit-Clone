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

public class Test05_01 extends MapActivity 
    implements OnClickListener{

    private final int FP = ViewGroup.LayoutParams.FILL_PARENT;
    private final int WC = ViewGroup.LayoutParams.WRAP_CONTENT;

    private MapView map;
    private Button buttonLatLng;
    private Button buttonZoom;

    @Override public void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        setContentView(linearLayout);


        LinearLayout btnLinearLayout = new LinearLayout(this);
        btnLinearLayout.setOrientation(LinearLayout.HORIZONTAL);
        btnLinearLayout.setBackgroundColor(Color.BLACK);

        buttonLatLng = new Button(this);
        buttonLatLng.setText("LatLng");
        buttonLatLng.setOnClickListener(this);

        buttonZoom = new Button(this);
        buttonZoom.setText("Zoom Level");
        buttonZoom.setOnClickListener(this);

        btnLinearLayout.addView(buttonLatLng, createParam(WC, WC));
        btnLinearLayout.addView(buttonZoom, createParam(WC, WC));


        map = new MapView(this);

        linearLayout.addView(btnLinearLayout, createParam(FP, WC));
        linearLayout.addView(map, createParam(WC, WC));
    }

    private LinearLayout.LayoutParams createParam(int w, int h){
        return new LinearLayout.LayoutParams(w, h);
    }

    public void onClick(View v) {
        if (v == buttonLatLng){
            Point point = map.getMapCenter();

            StringBuilder latlng = new StringBuilder();
            latlng.append("Lat:");
            latlng.append(point.getLatitudeE6());
            latlng.append("\nLng:");
            latlng.append(point.getLongitudeE6());

            AlertDialog.show(this, "LatLng", latlng.toString(), "ok", false);
        }else if (v == buttonZoom){
            int level = map.getZoomLevel();

            AlertDialog.show(this, "Zoom", "Zoom:" + level, "ok", false);
        }
    }
}
