
package beans;

import java.sql.Date;


public class Alquiler {
    private int traje_id;
    private String username;
    private Date fecha;
    private int tiempoAlquiler;
    private double total;
    
    
    //pordefecto
    private boolean novedadTraje;
    private String tipoTraje;
    
    //constructor

    public Alquiler(int traje_id, String username, Date fecha, int tiempoAlquiler, double total, boolean novedadTraje, String tipoTraje) {
        this.traje_id = traje_id;
        this.username = username;
        this.fecha = fecha;
        this.tiempoAlquiler = tiempoAlquiler;
        this.total = total;
        this.novedadTraje = novedadTraje;
        this.tipoTraje = tipoTraje;
    }

    //get and setter

    public int getTraje_id() {
        return traje_id;
    }

    public void setTraje_id(int traje_id) {
        this.traje_id = traje_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getTiempoAlquiler() {
        return tiempoAlquiler;
    }

    public void setTiempoAlquiler(int tiempoAlquiler) {
        this.tiempoAlquiler = tiempoAlquiler;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public boolean isNovedadTraje() {
        return novedadTraje;
    }

    public void setNovedadTraje(boolean novedadTraje) {
        this.novedadTraje = novedadTraje;
    }

    public String getTipoTraje() {
        return tipoTraje;
    }

    public void setTipoTraje(String tipoTraje) {
        this.tipoTraje = tipoTraje;
    }
    
    //

    @Override
    public String toString() {
        return "Alquiler{" + "traje_id=" + traje_id + ", username=" + username + ", fecha=" + fecha + ", tiempoAlquiler=" + tiempoAlquiler + ", total=" + total + ", novedadTraje=" + novedadTraje + ", tipoTraje=" + tipoTraje + '}';
    }
    
    
    
    
    
}
