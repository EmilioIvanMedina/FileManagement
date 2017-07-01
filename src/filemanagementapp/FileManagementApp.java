package filemanagementapp;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class FileManagementApp {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

        File archivo = new File("empleados.txt");
        ArrayList<Empleado> empleados = new ArrayList<Empleado>();
        Empleado e1 = new Empleado();
        e1.setName("Juan");
        e1.setEdad(25);
        e1.setLegajo(1000);
        
        Empleado e2 = new Empleado();
        e2.setName("Ana");
        e2.setEdad(24);
        e2.setLegajo(1001);
        
        empleados.add(e1);
        
        empleados.add(e2);
        
        FileOutputStream fos = new FileOutputStream(archivo);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        for (Empleado e : empleados){
            oos.writeObject(e);
        }
        oos.close();
        fos.close();
        
        FileInputStream fis = new FileInputStream(archivo);
        ObjectInputStream ois = new ObjectInputStream(fis);
        ArrayList<Empleado> empleadosEscribir = new ArrayList<Empleado>();
        try {
            while (true){
                Empleado e = (Empleado)ois.readObject();
                empleadosEscribir.add(e);
            }
        } catch (EOFException ex){
            
        }
        for (Empleado e : empleadosEscribir){
            System.out.println(e.mostrarEmpleado());
        }
    }
    
}
