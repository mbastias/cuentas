package cl.sdomingu.cuentas;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

/**
 * Created by susanadominguez on 19-11-14.
 */
public class Amigos_Controller extends Activity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tab1_inicio);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_amigos, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        // Handle presses on the action bar items
        switch (item.getItemId()) {

            case R.id.action_historial:{
                Intent act = new Intent(this, Historial_Controller.class); startActivity(act);

                return true;
            }

            case R.id.action_inicio:{
                Intent act = new Intent(this, Inicio_Controller.class);
                startActivity(act);
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
