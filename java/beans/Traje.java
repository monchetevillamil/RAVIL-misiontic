
package beans;


public class Traje {
    private int traje_id;
    private String nombreTraje;
    private String tipoTraje;
    private String marcaTraje;
    private String tallaTraje;
    private int copiasTraje;
    private String estadoTraje;
    private double precio_Dia;
    private boolean novedadTraje;
   
    
   //CONSTRUCTOR

    public Traje(int traje_id, String nombreTraje, String tipoTraje, String marcaTraje, String tallaTraje, int copiasTraje, String estadoTraje, double precio_Dia, boolean novedadTraje) {
        this.traje_id = traje_id;
        this.nombreTraje = nombreTraje;
        this.tipoTraje = tipoTraje;
        this.marcaTraje = marcaTraje;
        this.tallaTraje = tallaTraje;
        this.copiasTraje = copiasTraje;
        this.estadoTraje = estadoTraje;
        this.precio_Dia = precio_Dia;
        this.novedadTraje = novedadTraje;
    }

   //get and setter

    public int getTraje_id() {
        return traje_id;
    }

    public void setTraje_id(int traje_id) {
        this.traje_id = traje_id;
    }

    public String getNombreTraje() {
        return nombreTraje;
    }

    public void setNombreTraje(String nombreTraje) {
        this.nombreTraje = nombreTraje;
    }

    public String getTipoTraje() {
        return tipoTraje;
    }

    public void setTipoTraje(String tipoTraje) {
        this.tipoTraje = tipoTraje;
    }

    public String getMarcaTraje() {
        return marcaTraje;
    }

    public void setMarcaTraje(String marcaTraje) {
        this.marcaTraje = marcaTraje;
    }

    public String getTallaTraje() {
        return tallaTraje;
    }

    public void setTallaTraje(String tallaTraje) {
        this.tallaTraje = tallaTraje;
    }

    public int getCopiasTraje() {
        return copiasTraje;
    }

    public void setCopiasTraje(int copiasTraje) {
        this.copiasTraje = copiasTraje;
    }

    public String getEstadoTraje() {
        return estadoTraje;
    }

    public void setEstadoTraje(String estadoTraje) {
        this.estadoTraje = estadoTraje;
    }

    public double getPrecio_Dia() {
        return precio_Dia;
    }

    public void setPrecio_Dia(double precio_Dia) {
        this.precio_Dia = precio_Dia;
    }

    public boolean isNovedadTraje() {
        return novedadTraje;
    }

    public void setNovedadTraje(boolean novedadTraje) {
        this.novedadTraje = novedadTraje;
    }
    
    //Tostirng

    @Override
    public String toString() {
        return "Traje{" + "traje_id=" + traje_id + ", nombreTraje=" + nombreTraje + ", tipoTraje=" + tipoTraje + ", marcaTraje=" + marcaTraje + ", tallaTraje=" + tallaTraje + ", copiasTraje=" + copiasTraje + ", estadoTraje=" + estadoTraje + ", precio_Dia=" + precio_Dia + ", novedadTraje=" + novedadTraje + '}';
    }
    
    

    

    
    
    
    
    
    
    
    
}
