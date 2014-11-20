package cl.sdomingu.cuentas;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by susanadominguez on 19-11-14.
 */
public class Amigos_Controller extends ListActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.amigos_medeben);

        String[] amigos_lista = getResources().getStringArray(R.array.amigos_lista);

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, R.layout.amigo_list_conf,
                amigos_lista);

        setListAdapter(adaptador);

        ListView lv = getListView();

        lv.setTextFilterEnabled(true);

        OnItemClickListener escuchador = new OnItemClickListener() {

            // MŽtodo que se ejecuta cuando se hace click en un item
            @Override
            public void onItemClick(AdapterView<?> arg0, View view, int pos,
                                    long id) {

                // Creamos una burbuja emergente que despliega el pa’s elegido
                // por un tiempo largo
                Toast.makeText(getApplicationContext(), "Usted elegió: "+((TextView) view).getText(),
                        Toast.LENGTH_SHORT).show();

            }

        };

        // Le asignamos un escuchador al ListView
        lv.setOnItemClickListener(escuchador);
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

            case R.id.action_historial: {
                Intent act = new Intent(this, Historial_Controller.class);
                startActivity(act);
                return true;
            }

            case R.id.action_inicio: {
                Intent act1 = new Intent(this, Inicio_Controller.class);
                startActivity(act1);
                return true;
            }

            case R.id.nueva_cuenta: {
                Intent act2 = new Intent(this, Cuenta_Paso1.class);
                startActivity(act2);
                return true;
            }

            default:
                return super.onOptionsItemSelected(item);
        }


    }

}
