package jp.javadrive.android;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import java.io.FileNotFoundException;
import android.database.SQLException;
import android.content.ContentValues;
import android.util.Log;

public class Test08_01 extends Activity implements OnClickListener{
    private final int FP = ViewGroup.LayoutParams.FILL_PARENT; 
    private final int WC = ViewGroup.LayoutParams.WRAP_CONTENT; 

    private Button buttonInsert;
    private Button buttonDelete;
    private EditText editId;
    private EditText editName;
    private EditText editPrice;

    private SQLiteDatabase db;

    private int DB_VERSION = 1;
    private int DB_MODE = Context.MODE_PRIVATE;
    private String DB_NAME = "db_data_08";
    private String TABLE_NAME = "product";

    @Override protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        db = null;

        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        setContentView(linearLayout);


        LinearLayout dataLayout = new LinearLayout(this);
        dataLayout.setOrientation(LinearLayout.HORIZONTAL);
        linearLayout.addView(dataLayout, createParam(WC, WC));

        TextView textId = new TextView(this);
        textId.setText("id");
        dataLayout.addView(textId, createParam(WC, WC));

        editId = new EditText(this);
        editId.setWidth(40);
        dataLayout.addView(editId, createParam(WC, WC));

        TextView textName = new TextView(this);
        textName.setText("name");
        dataLayout.addView(textName, createParam(WC, WC));

        editName = new EditText(this);
        editName.setWidth(80);
        dataLayout.addView(editName, createParam(WC, WC));

        TextView textPrice = new TextView(this);
        textPrice.setText("price");
        dataLayout.addView(textPrice, createParam(WC, WC));

        editPrice = new EditText(this);
        editPrice.setWidth(80);
        dataLayout.addView(editPrice, createParam(WC, WC));


        LinearLayout buttonLayout = new LinearLayout(this);
        buttonLayout.setOrientation(LinearLayout.HORIZONTAL);
        linearLayout.addView(buttonLayout, createParam(WC, WC));

        buttonInsert = new Button(this);
        buttonInsert.setText("INSERT");
        buttonInsert.setOnClickListener(this);
        buttonLayout.addView(buttonInsert, createParam(WC, WC));

        buttonDelete = new Button(this);
        buttonDelete.setText("DELETE");
        buttonDelete.setOnClickListener(this);
        buttonLayout.addView(buttonDelete, createParam(WC, WC));

        openDatabase();
    }

    private LinearLayout.LayoutParams createParam(int w, int h){
        return new LinearLayout.LayoutParams(w, h);
    }

    private void openDatabase(){
        try {
            db = openDatabase(DB_NAME, null);
        } catch (FileNotFoundException e) {
            try {
                db = createDatabase(DB_NAME, DB_VERSION, DB_MODE, null);
                createTable();
            } catch (FileNotFoundException e2) {
                db = null;
                Log.e("ERROR", e2.toString());
            }
        }
    }

    private void createTable(){
        String sql = "create table " + TABLE_NAME + " ("
            + "id integer primary key autoincrement, "
            + "name text not null, "
            + "price integer);";

        try {
            db.execSQL(sql);
        } catch (SQLException e) {
            Log.e("ERROR", e.toString());
        }
    }

    public void onClick(View v) {
        String id =  editId.getText().toString();
        String name =  editName.getText().toString();
        String price =  editPrice.getText().toString();

        if (v == buttonInsert){
            ContentValues cv = new ContentValues();
            cv.put("name", name);
            cv.put("price", price);
            db.insert(TABLE_NAME, null, cv);
        }else if (v == buttonDelete){
            db.delete(TABLE_NAME, "id = " + id, null);
        }

        editId.setText("");
        editName.setText("");
        editPrice.setText("");
    }
}
