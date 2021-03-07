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

public class Test04_01 extends MapActivity 
    implements OnClickListener{

    private final int FP = ViewGroup.LayoutParams.FILL_PARENT;
    private final int WC = ViewGroup.LayoutParams.WRAP_CONTENT;

    private MapView map;
    private Button buttonSatellite;
    private Button buttonTraffic;

    @Override public void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        setContentView(linearLayout);


        LinearLayout btnLinearLayout = new LinearLayout(this);
        btnLinearLayout.setOrientation(LinearLayout.HORIZONTAL);
        btnLinearLayout.setBackgroundColor(Color.BLACK);

        buttonSatellite = new Button(this);
        buttonSatellite.setText("Satellite Off");
        buttonSatellite.setOnClickListener(this);

        buttonTraffic = new Button(this);
        buttonTraffic.setText("Traffic Off");
        buttonTraffic.setOnClickListener(this);

        btnLinearLayout.addView(buttonSatellite, createParam(WC, WC));
        btnLinearLayout.addView(buttonTraffic, createParam(WC, WC));


        map = new MapView(this);

        linearLayout.addView(btnLinearLayout, createParam(FP, WC));
        linearLayout.addView(map, createParam(WC, WC));
    }

    private LinearLayout.LayoutParams createParam(int w, int h){
        return new LinearLayout.LayoutParams(w, h);
    }

    public void onClick(View v) {
        if (v == buttonSatellite){
            map.toggleSatellite();
            if (map.isSatellite()){
                buttonSatellite.setText("Satellite On");
            }else{
                buttonSatellite.setText("Satellite Off");
            }
        }else if (v == buttonTraffic){
            map.toggleTraffic();
            if (map.isTraffic()){
                buttonTraffic.setText("Traffic On");
            }else{
                buttonTraffic.setText("Traffic Off");
            }
        }
    }
}
