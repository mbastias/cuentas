package cl.sdomingu.cuentas;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.app.Fragment;
import android.app.ActionBar;
import android.content.Intent;


/**
 * Created by susanadominguez on 19-11-14.
 */
public class Historial_Controller extends Activity{


    ActionBar.Tab tab1, tab2;

    Fragment fragmentTab1 = new Inicio_Tab1_MeDeben();
    Fragment fragmentTab2 = new Inicio_Tab2_YoDebo();


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_controller);

        ActionBar actionBar = getActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        tab1 = actionBar.newTab().setText("Actividades");
        tab2 = actionBar.newTab().setText("Gastos");


        tab1.setTabListener(new MyTab_Listener(fragmentTab1));
        tab2.setTabListener(new MyTab_Listener(fragmentTab2));


        actionBar.addTab(tab1);
        actionBar.addTab(tab2);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_historial, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        // Handle presses on the action bar items
        switch (item.getItemId()) {
            case R.id.action_friends:{
                //si estoy en frieds, no hacer nada
                Intent act = new Intent(this, Amigos_Controller.class); startActivity(act);

                return true;

            }

            case R.id.action_inicio:{
                Intent act = new Intent(this, Inicio_Controller.class);
                startActivity(act);
                return true;
            }
            case R.id.nueva_cuenta:{
                Intent act = new Intent(this, Cuenta_Paso1.class);
                startActivity(act);
                return true;
            }

            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
