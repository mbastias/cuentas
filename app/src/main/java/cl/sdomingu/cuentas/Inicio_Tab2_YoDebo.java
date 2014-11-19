package cl.sdomingu.cuentas;
import android.app.Fragment;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.os.Bundle;
import android.widget.TextView;


/**
 * Created by susanadominguez on 17-11-14.
 */
        public class Inicio_Tab2_YoDebo extends Fragment {
            public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                     Bundle savedInstanceState){
                View view = inflater.inflate(R.layout.amigos_debo, container, false);
                TextView textview = (TextView) view.findViewById(R.id.tabtextview);
        textview.setText("Dos");
        return view;
    }
}