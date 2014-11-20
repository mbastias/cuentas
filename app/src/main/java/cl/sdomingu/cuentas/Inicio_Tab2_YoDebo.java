package cl.sdomingu.cuentas;
import android.app.Fragment;
import android.app.ListFragment;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * Created by susanadominguez on 17-11-14.
 */
        public class Inicio_Tab2_YoDebo extends ListFragment {
            public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                     Bundle savedInstanceState){
                View view = inflater.inflate(R.layout.amigos_debo, container, false);


                return view;
        }


        @Override
        public void onActivityCreated(Bundle savedInstanceState) {
            super.onActivityCreated(savedInstanceState);
            Mis_Cuentas nueva_cuenta = new Mis_Cuentas();
            ArrayList<Single_Cuenta> lista_debo= new ArrayList<Single_Cuenta>();

            lista_debo = nueva_cuenta.getDeudas();

            //String[] amigos_lista = getResources().getStringArray(R.array.amigos_lista);

            Cuenta_Adapter adapter = new Cuenta_Adapter(getActivity(), lista_debo, R.layout.deuda_list_conf);
            setListAdapter(adapter);
        }

        @Override
        public void onListItemClick(ListView l, View v, int position, long id) {
            // do something with the data
        }
}