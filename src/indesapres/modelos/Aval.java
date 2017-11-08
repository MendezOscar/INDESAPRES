package indesapres.modelos;

/**
 *
 * @author Oscar Mendez
 */
public class Aval {

    String idAval;
    String Nombre;
    String Direccion;
    String Profesion;
    String Empresa;
    String LaborArea;
    String Departamento;
    String Anios;
    String Meses;
    float Salario;
    String Telefono;
    int Contador;
    String idCliente;
    String idPrestamo;
    String Responsabilidad;
    String identidad;

    public Aval(String idAval, String Nombre, String Direccion, String Profesion, String Empresa, String LaborArea,
            String Departamento, String Anios, String Meses, float Salario, String Telefono, int Contador, 
            String idCliente, String idPrestamo, String Responsabilidad, String identidad) {
        this.idAval = idAval;
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.Profesion = Profesion;
        this.Empresa = Empresa;
        this.LaborArea = LaborArea;
        this.Departamento = Departamento;
        this.Anios = Anios;
        this.Meses = Meses;
        this.Salario = Salario;
        this.Telefono = Telefono;
        this.Contador = Contador;
        this.idCliente = idCliente;
        this.idPrestamo = idPrestamo;
        this.Responsabilidad = Responsabilidad;
        this.identidad = identidad;
    }
    
    

    public String getIdAval() {
        return idAval;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getIdentidad() {
        return identidad;
    }

    public String getIdPrestamo() {
        return idPrestamo;
    }

    public void setIdentidad(String identidad) {
        this.identidad = identidad;
    }

    public void setIdPrestamo(String idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

    public String getDireccion() {
        return Direccion;
    }

    public String getProfesion() {
        return Profesion;
    }

    public String getEmpresa() {
        return Empresa;
    }

    public String getLaborArea() {
        return LaborArea;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public String getAnios() {
        return Anios;
    }

    public String getMeses() {
        return Meses;
    }

    public float getSalario() {
        return Salario;
    }

    public String getTelefono() {
        return Telefono;
    }

    public int getContador() {
        return Contador;
    }

    public void setIdAval(String idAval) {
        this.idAval = idAval;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public void setProfesion(String Profesion) {
        this.Profesion = Profesion;
    }

    public void setEmpresa(String Empresa) {
        this.Empresa = Empresa;
    }

    public void setLaborArea(String LaborArea) {
        this.LaborArea = LaborArea;
    }

    public void setDepartamento(String Departamento) {
        this.Departamento = Departamento;
    }

    public void setAnios(String Anios) {
        this.Anios = Anios;
    }

    public void setMeses(String Meses) {
        this.Meses = Meses;
    }

    public void setSalario(float Salario) {
        this.Salario = Salario;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public void setContador(int Contador) {
        this.Contador = Contador;
    }

    public String getResponsabilidad() {
        return Responsabilidad;
    }

    public void setResponsabilidad(String Responsabilidad) {
        this.Responsabilidad = Responsabilidad;
    }

}
