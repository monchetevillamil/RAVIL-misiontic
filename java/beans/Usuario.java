
package beans;


public class Usuario {
    private String username;
    private String contrasena;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    private double saldo;
    private boolean premium;

    //constructor
    public Usuario(String username, String contrasena, String nombre, String apellido, String email, String telefono, double saldo, boolean premium) {
        this.username = username;
        this.contrasena = contrasena;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.saldo = saldo;
        this.premium = premium;
    }
    
    //gett and setter
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getContrasena() {
        return contrasena;
    }
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public boolean isPremium() {
        return premium;
    }
    public void setPremium(boolean premium) {
        this.premium = premium;
    }
    
    //toString()

    @Override
    public String toString() {
        return "Usuario{" + "username=" + username + ", contrasena=" + contrasena + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + ", telefono=" + telefono + ", saldo=" + saldo + ", premium=" + premium + '}';
    }
    
    
}
