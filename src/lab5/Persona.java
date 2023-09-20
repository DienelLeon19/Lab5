package lab5;


public class Persona {
  
    private String Nombre;
    private String Apellido;
    private String Codigo;
    
    public Persona(){}
    
    public Persona(String Nombre, String Apellido, String Codigo)
    {   this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Codigo = Codigo;}
    
    
    
    
    
    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

  
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

   
    String getTexto()
    {
        return this.Apellido+" , "+this.Nombre+" | "+this.Codigo;
    }
    
    
    
}
