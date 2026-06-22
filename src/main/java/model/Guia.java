package model;

/**
 * @author Michael Salgado
 * @since 1.1.0
 */
public class Guia extends Persona {

    private String especialidad;

    public Guia(String nombre, String apellido, String rut, String telefono) {
        super(nombre, apellido, rut, telefono);
    }
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {}

}
