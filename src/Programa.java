import java.util.Scanner;


public class Programa {
    Scanner scanner = new Scanner(System.in);
    listaLibro lista = new listaLibro();


    public void Menu(){
        System.out.println("╔══════════════════════════════════════════════════════════════╗");
        System.out.println("║                   MENU DEL PROGRAMA                          ║");
        System.out.println("║ OPCIONES DEL PROGRAMA                                        ║");
        System.out.println("║ OPCION 0 = AÑADIR LIBROS A LA LISTA                          ║");
        System.out.println("║ OPCION 1 = EDITAR LIBROS                                     ║");
        System.out.println("║ OPCION 2 = MOSTRAR LIBRO POR POSICION                        ║");
        System.out.println("║ OPCION 3 = MOSTRAR LISTA DE LIBROS                           ║");
        System.out.println("║ OPCION 4 = BORRAR UN LIBRO DE LA LISTA                       ║");
        System.out.println("║ OPCION 5 = SALIR DEL PROGRAMA                                ║");
        System.out.println("╚══════════════════════════════════════════════════════════════╝");
    }

    public void option0(){
        System.out.println("Ingrese la cantidad de libros a digitar");
        int limit = scanner.nextInt();
        int counter = 0;
        while (counter < limit){
            System.out.println("Ingrese el codigo del libro");
            String codigoLibro = scanner.next();
            System.out.println("Ingrese el nombre del libro");
            String nombreLibro = scanner.next();
            System.out.println("Ingrese el autor del libro");
            String autorLibro = scanner.next();
            System.out.println("Ingrese la editorial del libro");
            String editorialLibro = scanner.next();
            System.out.println("Ingrese la ciudad donde fue publicado el libro");
            String ciudadLibro = scanner.next();
            System.out.println("Ingrese la fecha del Libro");
            String fechaLibro = scanner.next();
            Libro libro = new Libro(codigoLibro,nombreLibro,autorLibro,editorialLibro,ciudadLibro,fechaLibro);
            try{
                System.out.println("Ingrese la posicion del libro a agregar a la Lista");
                lista.mostrarPosicionesDisponibles();
                int posicion = scanner.nextInt();
                lista.agregarLibro(libro,posicion);
            } catch(java.util.InputMismatchException e){
                System.out.print("Ingrese una posicion que sea Integer");
            }finally {
                counter ++;
            }
        }
    }
    //Editar Libro
    public void option1(){
        lista.mostrarPosicionesDisponibles();
        try{
            System.out.println("Ingrese la posicion del libro a Actualizar");
            int posicion = scanner.nextInt();
            Libro libroEditar = lista.libroPosicion(posicion);
            lista.actualizarLibro(posicion,libroEditar);

        } catch (java.util.InputMismatchException e) {
            System.out.print("Ingrese una posicion que sea Integer");
        }

    }

    public void option2(){
        System.out.println("Ingrese la Posicion del Libro que Quiera ver");
        int posicion = scanner.nextInt();
        Libro libroMostrar = lista.libroPosicion(posicion);
        if(libroMostrar != null){
            lista.mostarLibro(libroMostrar);
        } else{
            System.out.println("Libro no encontrado");
        }
    }

    public void option3(){
        lista.mostrarPosicionesDisponibles();
    }

    public void option4(){
        System.out.println("Ingrese la posicion del libro que desea eliminar");
        int posicion = scanner.nextInt();
        lista.eliminarLibro(posicion);
    }
}
