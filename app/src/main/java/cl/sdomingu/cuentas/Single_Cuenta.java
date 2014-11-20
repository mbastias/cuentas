package cl.sdomingu.cuentas;

/**
 * Created by Jkrloz on 20-11-2014.
 */
public class Single_Cuenta {

    private String amigo = "";
    private Boolean debo = null;
    private Integer cantidad = 0;

    public Single_Cuenta() {

    }

    public Single_Cuenta(String amigo, Boolean debo, Integer cantidad) {
        this.amigo = amigo;
        this.debo = debo;
        this.cantidad = cantidad;
    }

    public void setDatos(String amigo, Boolean debo, Integer cantidad){
        this.amigo = amigo;
        this.debo = debo;
        this.cantidad = cantidad;
    }

    public void setCantidad(Integer cantidad){
        this.cantidad = cantidad;
    }

    public String getNombreAmigo(){
        return amigo;
    }

    public Boolean getDebo()
    {
        return debo;
    }

    public Integer getCantidad(){
        return cantidad;
    }
}
