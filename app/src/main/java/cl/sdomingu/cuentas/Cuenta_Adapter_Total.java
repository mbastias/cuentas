package cl.sdomingu.cuentas;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by susanadominguez on 20-11-14.
 */
public class Cuenta_Adapter_Total extends ArrayAdapter<Single_Cuenta> {
    private final Context context;
    private final ArrayList<Single_Cuenta> values;
    int resource;


    public Cuenta_Adapter_Total(Context context, ArrayList<Single_Cuenta> values, int resource) {

        super(context, R.layout.amigos_total , values);
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
            TextView textView1 = (TextView) rowView.findViewById(R.id.total_nombre);
            TextView textView2 = (TextView) rowView.findViewById(R.id.total_monto);
            textView1.setText(values.get(position).getNombreAmigo());
            textView2.setText("Yo debo: " + values.get(position).getCantidad().toString());
        }

        else {
            TextView textView1 = (TextView) rowView.findViewById(R.id.total_nombre);
            TextView textView2 = (TextView) rowView.findViewById(R.id.total_monto);
            textView1.setText(values.get(position).getNombreAmigo());
            textView2.setText("Me deben: " + values.get(position).getCantidad().toString());
        }

        return rowView;
    }
}
