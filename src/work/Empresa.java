package work;

import java.util.ArrayList;

public class Empresa {

    private String nombre;
    private int nit;
    private ArrayList<Empleado> empleados;
    private ArrayList<Departamento> departamentos;
    public Empresa(String nombre, int nit) {
        this.nombre = nombre;
        this.nit = nit;
        
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    @Override
    public String toString() {
        return "Empresa{" + "nombre=" + nombre + ", nit=" + nit + '}';
    }
    public boolean addEmpleado(Empleado empleado){
     if(this.empleados.add(empleado)==true){
         return true;
     }
     else{
         return false;
     }
    }
    public boolean addDepartamento(Departamento departamento){
       if(this.departamentos.add(departamento)==true){
           return true;
       }
       else{
           return false;
       }
    }
    public ArrayList<Departamento> listarDepartamentos(){
        return this.departamentos;
    } 
    public Empleado darDirector(String nombreDepartamento){
        Empleado director=null;
        for (int i = 0; i < this.departamentos.size(); i++) {
            Departamento aux=this.departamentos.get(i);
            if(aux.getNombre().equals(nombreDepartamento)){
               director=aux.darDirector();
               
            }
            
        }
        return director;
    }

}
