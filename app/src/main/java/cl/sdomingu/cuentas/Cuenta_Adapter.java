package cl.sdomingu.cuentas;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by Jkrloz on 20-11-2014.
 */
public class Cuenta_Adapter extends ArrayAdapter<Single_Cuenta> {
        private final Context context;
        private final ArrayList<Single_Cuenta> values;
        int resource;


        public Cuenta_Adapter(Context context, ArrayList<Single_Cuenta> values, int resource) {

            super(context, R.layout.amigos_medeben , values);
            this.resource = resource;
            this.context = context;
            this.values = values;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            View rowView = inflater.inflate(resource, parent, false);

            if(values.get(position).getDebo()) {
                TextView textView1 = (TextView) rowView.findViewById(R.id.nombre_amigo_deuda);
                TextView textView2 = (TextView) rowView.findViewById(R.id.monto_deuda);
                textView1.setText(values.get(position).getNombreAmigo());
                textView2.setText("Yo debo: " + values.get(position).getCantidad().toString());
            }

            else {
                TextView textView1 = (TextView) rowView.findViewById(R.id.nombre_amigo_medebe);
                TextView textView2 = (TextView) rowView.findViewById(R.id.monto_medeben);
                textView1.setText(values.get(position).getNombreAmigo());
                textView2.setText("Me deben: " + values.get(position).getCantidad().toString());
            }

            return rowView;
        }
    }
