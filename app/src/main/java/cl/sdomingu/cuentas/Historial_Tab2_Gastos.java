package cl.sdomingu.cuentas;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by susanadominguez on 19-11-14.
 */
public class Historial_Tab2_Gastos {
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.tab1_inicio, container, false);
        TextView textview = (TextView) view.findViewById(R.id.tabtextview);
        textview.setText("Uno");
        return view;
    }
}
