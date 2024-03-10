public class Libro {

    private String codigoLibro;
    public String nombre;
    public String autor;
    public String editorial;
    public String ciudad;
    public String fechaPublicacion;

    public Libro(){

    }

    public Libro(String codigoLibro, String nombre, String autor, String editorial, String ciudad, String fechaPublicacion) {
        this.codigoLibro = codigoLibro;
        this.nombre = nombre;
        this.autor = autor;
        this.editorial = editorial;
        this.ciudad = ciudad;
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getCodigoLibro() {
        return codigoLibro;
    }

    public void setCodigoLibro(String codigoLibro) {
        this.codigoLibro = codigoLibro;
    }
}