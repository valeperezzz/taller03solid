# taller03solid
Integrantes: Rafael Espinoza, Pedro Santillán, Valeria Pérez



*/ I: Interface Segregation Principle /*
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



*/ D: Dependency Inversion Principle /*
public interface SistemaInicioSesion {
    void iniciarSesion();
}
public class Correo implements SistemaInicioSesion {
    @Override
    public void iniciarSesion() {
        System.out.println("Ingresa tu correo y contraseña.");
    }
}
public class Authenticator implements SistemaInicioSesion {
    @Override
    public void iniciarSesion() {
        System.out.println("Ingresa el código dentro de tu app.");
    }
}
