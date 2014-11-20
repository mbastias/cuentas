package cl.sdomingu.cuentas;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Jkrloz on 20-11-2014.
 */
public class Mis_Cuentas {

    ArrayList<Single_Cuenta> mi_lista_cuentas;

    public Mis_Cuentas(){
        mi_lista_cuentas = new ArrayList<Single_Cuenta>();

        mi_lista_cuentas.add(new Single_Cuenta("Susana",true,1000));
        mi_lista_cuentas.add(new Single_Cuenta("Susana",false,500));
        mi_lista_cuentas.add(new Single_Cuenta("Mariana",true,10000));
        mi_lista_cuentas.add(new Single_Cuenta("Mariana",true,1000));
        mi_lista_cuentas.add(new Single_Cuenta("Jorge",false,1000));
        mi_lista_cuentas.add(new Single_Cuenta("Jorge",false,500));
        mi_lista_cuentas.add(new Single_Cuenta("Pamela",true,5000));

    }

    public ArrayList<Single_Cuenta> getDeudas(){

        ArrayList<Single_Cuenta> mi_lista_deudas = new ArrayList<Single_Cuenta>();

        for(int i = 0; i < mi_lista_cuentas.size(); i++) {

            if ( mi_lista_cuentas.get(i).getDebo() )
            {
                mi_lista_deudas.add(mi_lista_cuentas.get(i));
            }

        }

        return mi_lista_deudas;

    }

    public ArrayList<Single_Cuenta> getMeDeben(){

        ArrayList<Single_Cuenta> mi_lista_pagos = new ArrayList<Single_Cuenta>();

        for(int i = 0; i < mi_lista_cuentas.size(); i++) {

            if( !mi_lista_cuentas.get(i).getDebo() ) {
                mi_lista_pagos.add(mi_lista_cuentas.get(i));
            }
        }

        return mi_lista_pagos;

    }

    public ArrayList<Single_Cuenta> getTotalDeudas()
    {

        return mi_lista_cuentas;

    }


}
