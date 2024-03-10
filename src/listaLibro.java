import java.util.Scanner;
public class listaLibro {
    Scanner scanner = new Scanner(System.in);

    Libro[] listaLibros = new Libro[15];

    listaLibro(){

    }

    public void agregarLibro(Libro libro,int posicion){
        try{
            if(posicion < listaLibros.length & listaLibros[posicion] == null){
                listaLibros[posicion] = libro;
                System.out.println("El libro se ha ingresado correctamente a la " + posicion + " posicion de la lista");
            }
        } catch (java.lang.ArrayIndexOutOfBoundsException e){
            System.out.println("El indice ingresado esta fuera del alacance del Array");
        }

    }

    public void eliminarLibro(int posicion ){
        listaLibros[posicion] = null;
    }

    public void actualizarLibro(int posicion,Libro libro){
        System.out.println("ACTUALIZACION DEL LIBRO " + libro.nombre);
        System.out.println("Ingrese el nuevo codigo del libro");
        String cod = scanner.next();
        System.out.println("Ingrese el nuevo nombre del libro");
        String nombre = scanner.next();
        System.out.println("Ingrese el nuevo autor del libro");
        String autor = scanner.next();
        System.out.println("Ingrese la nueva editorial del libro");
        String editorial = scanner.next();
        System.out.println("Ingrese la nueva ciudad del libro");
        String ciudad = scanner.next();
        System.out.println("Ingrese la nueva fecha del publicacion del libro");
        String fecha = scanner.next();

        // ACTUALIZACION DEL LIBRO CON LOS DATOS DADOS
        libro.setCodigoLibro(cod);
        libro.nombre = nombre;
        libro.autor = autor;
        libro.editorial = editorial;
        libro.ciudad = ciudad;
        libro.fechaPublicacion = fecha;

        System.out.println("LIBRO ACTUALIZADO CON EXITO");
        mostarLibro(libro);
    }

    public Libro libroPosicion(int posicion){
        try{
            if(listaLibros[posicion] != null){
                return listaLibros[posicion];

            }
        }catch(java.lang.ArrayIndexOutOfBoundsException e){
            System.out.println("Ingrese un index que sea correcto y este dentro del rango del Array");
                return null;
        }
    return null;
    }

    public void mostarLibro(Libro libro ){
        System.out.println("------------------------------------------------------------------");
        System.out.println("El nombre del libro es: " + libro.getCodigoLibro());
        System.out.println("El Autor del libro es: " + libro.autor);
        System.out.println("La Editorial del libro es: " + libro.editorial);
        System.out.println("La ciudad de la publicacion del libro es: " + libro.ciudad);
        System.out.println("La fecha de publicacion del libro es: " + libro.fechaPublicacion);
        System.out.println("------------------------------------------------------------------");
    }

    public void mostrarPosicionesDisponibles(){
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        for(int libro = 0; libro < listaLibros.length;libro++){
            try{
                String title = listaLibros[libro].nombre;
                System.out.println("POSICION " +  libro  + " == TITULO LIBRO = "  + title);
            } catch(java.lang.NullPointerException e){
                System.out.println("POSICION " +  libro  + " ==  ESPACIO DISPONIBLE ");
            }finally {
                System.out.println("------------------------------------------------");
            }
        }
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
    }
}
