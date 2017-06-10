package com.example.android.assignment92;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private final int MENU_COMPUTER =1;
    private final int MENU_GAMEPAD =2;
    private final int MENU_CAMERA = 3;

    /**
     *
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * creating menu programatically
     * @param menu
     * @return
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        menu.add(0,MENU_COMPUTER,0,R.string.menu_item_1);
        menu.add(0,MENU_GAMEPAD,0,R.string.menu_item_2);
        menu.add(0,MENU_CAMERA,0,R.string.menu_item_3);
        return true;
    }

    /**
     * clicking event to display Toast
     * @param item
     * @return
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()) {
            case MENU_COMPUTER:
                //activityText.setTextColor(getResources().getColor(R.color.Red,null));
                Toast.makeText(getApplicationContext(), "Computer Selected", Toast.LENGTH_LONG).show();
                return true;
            case MENU_GAMEPAD:
                //activityText.setTextColor(getResources().getColor(R.color.Green,null));
                Toast.makeText(getApplicationContext(), "Gamepad Selected", Toast.LENGTH_LONG).show();
                return true;
            case MENU_CAMERA:
                //activityText.setTextColor(getResources().getColor(R.color.Blue,null));
                Toast.makeText(getApplicationContext(), "Camera Selected", Toast.LENGTH_LONG).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }


    }
}
