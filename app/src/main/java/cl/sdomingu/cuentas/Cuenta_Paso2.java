package cl.sdomingu.cuentas;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;


public class Cuenta_Paso2 extends FragmentActivity implements QuienPagaDialog.quienPagaDialogListener {

    private static final String TAG = "dialog";

    String[] countriesArray;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuenta_paso2);

        Resources res = getResources();
        countriesArray = res.getStringArray(R.array.quienPagoArray);
    }



    public void mostrarDialogo (View v){

        DialogFragment dialog = new QuienPagaDialog();
        dialog.show(getSupportFragmentManager(), TAG);
    }

    @Override
    public void onOkay(ArrayList<Integer> arrayList) {
        StringBuilder stringBuilder = new StringBuilder();
        if (arrayList.size() != 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                String country = countriesArray[arrayList.get(i)];
                stringBuilder = stringBuilder.append(" " + country);

            }

            Toast.makeText(this,"Has seleccionado: "
                    + stringBuilder.toString(), Toast.LENGTH_SHORT).show();
        }
    }

    public void onCancel(){}

}
