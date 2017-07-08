package filemanagementapp;
import java.io.Serializable;

public class Empleado implements Serializable {
    //atributos
    private String name;
    private int edad;
    private int legajo;
    //constructor
    public void Empleado(String name, int edad, int legajo) {
        this.name = name;
        this.edad = edad;
        this.legajo = legajo;
    }
    //propiedades
    public void setName(String value){
        this.name = value;
    }
    public void setEdad(int value){
        edad = value;
    }
    public void setLegajo(int value){
        legajo = value;
    }
    public String getName(){
        return name;
    }
    public int getEdad(){
        return edad;
    }
    public int getLegajo(){
        return legajo;
    }
    
    //constructor
    public void Empleado(){
        this.name = "";
        this.edad = 0;
        this.legajo = 0;
    }
    //metodos
    public String mostrarEmpleado(){
        return "Empleado "+name+" de edad "+edad+" y legajo " + legajo;
    }
}
