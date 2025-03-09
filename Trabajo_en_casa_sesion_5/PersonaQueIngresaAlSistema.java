package Trabajo_en_casa_sesion_5;


public class PersonaQueIngresaAlSistema {

    private String nombre;
    private String cedula;
    private String idEmpresa;
    private String cargo;

    
    public PersonaQueIngresaAlSistema(String nombre, String cedula, String idEmpresa, String cargo) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.idEmpresa = idEmpresa;
        this.cargo = cargo;
    }



 public String getNombre() {
    return nombre;
 }

 public String getCedula() {
    return cedula;
 }

 public String getIdEmpresa() {
    return idEmpresa;
 }

 public String getCargo() {
    return cargo;
 
}
}


