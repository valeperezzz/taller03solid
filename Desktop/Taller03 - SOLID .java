

//Ejemplos de Principios SOLID
//Single Responsability Principle

public class Empleado{
    private String nombre;
    private String apellido;
    private double edad;
    //Constructores, Getters and Setters
}


class EmpleadoAccesoSistema{
    private Empleado p;
    public void login(){
        //cuerpo del metodo
    }
    public void cerrarSesion(){
        //cuerpo del metodo
    }
}

//Open Closed Principle
public interface PlayableInstrument{
    void play();
}
public class Guitar implements PlayableInstrument{
    @Override
    public void play(){
        //cuerpo del metodo
    };
}
public class ElectricGuitar implements  PlayableInstrument{
     @Override
    public void play(){
        //cuerpo del metodo
    };
}
public class Piano implements  PlayableInstrument{
     @Override
    public void play(){
        //cuerpo del metodo
    };
}

//Liskov Substitution Principle

public interface Instrument {
    String getName();
}


public interface PlayableInstrument extends Instrument {
    void play();
}


public class Guitar implements PlayableInstrument {
    @Override public void play() {}
    @Override public String getName() { return "Guitarra Acústica"; }
}


public class GuitarraDeUtileria implements Instrument {
    @Override public String getName() { return "Guitarra de Plástico"; }
}
   
//Interface Segregation Principle

public interface RegistrarMatricula {
    void seleccionarTeorico();
    void seleccionarPractico();
}
public interface VisorCalificaciones {
    void revisarCalificaciones();
}
public interface IngresodeNotas {
    void ingresarNotas();
}


public class AccesoEstudiante implements RegistrarMatricula, VisorCalificaciones {
    @Override
    public void seleccionarTeorico() {
        System.out.println("Teórico seleccionado.");
    }
    @Override
    public void seleccionarPractico() {
        System.out.println("Práctico seleccionado.");
    }
    @Override
    public void revisarCalificaciones() {
        System.out.println("Viendo mi reporte de notas.");
    }


public class AccesoProfesor implements IngresodeNotas {
    @Override
    public void ingresarNotas() {
        System.out.println("Ingresando notas.");}}



//Dependency Inversion Principle

public interface SistemaInicioSesion {
    void iniciarSesion(); 
}

public class Correo implements SistemaInicioSesion {
    @Override
    public void iniciarSesion() {
        System.out.println("Ingresa tu correo y contraseña");
    }
}

public class Authenticator implements SistemaInicioSesion {
    @Override
    public void iniciarSesion() {
        System.out.println("Ingresa el código dentro de tu app de contraseñas");
    }
}
}
