package cl.sdomingu.cuentas;

import android.app.Fragment;
import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.FragmentTransaction;

/**
 * Created by susanadominguez on 17-11-14.
 */
public class MyTab_Listener implements ActionBar.TabListener {
    Fragment fragment;

    public MyTab_Listener(Fragment fragment) {
        this.fragment = fragment;
    }

    public void onTabSelected(Tab tab, FragmentTransaction ft) {
        ft.replace(R.id.fragment_container, fragment);
    }

    public void onTabUnselected(Tab tab, FragmentTransaction ft) {
        ft.remove(fragment);
    }

    public void onTabReselected(Tab tab, FragmentTransaction ft) {
        // nothing done here
    }
}