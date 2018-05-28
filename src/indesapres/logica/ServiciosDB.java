package indesapres.logica;

import indesapres.modelos.Aval;
import indesapres.modelos.Clientes;
import indesapres.modelos.Deducciones;
import indesapres.modelos.Prestamos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author oscme
 */
public class ServiciosDB {

    public Connection con = null;
    Statement st;
    String url = "jdbc:oracle:thin:@localhost:1521/xe";
    String username = "INDESAPRES";
    String password = "prestamos2017";

    public ServiciosDB() {
        try {
            con = DriverManager.getConnection(url, username, password);
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "Error al conectar " + se.toString());
        }

    }

    public void abrirConexion() {
        try {
            con = DriverManager.getConnection(url, username, password);
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "Error al conectar " + se.toString());
        }
    }

    public void createCliente(Clientes clie) {
        String query = "INSERT INTO CLIENTES "
                + "(IDCLIENTE, NOMBRE, APELLIDO, IDENTIDAD, DEPARTAMENTO, MUNICIPIO, DIRECCION, ESTADOCIVIL, "
                + "TELEFONO, GENERO, EDAD, PROFESION, TIPO, CONTADOR, AREA, DEPTO, RESPONSABILIDAD) "
                + "VALUES (? , ? , ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = con.prepareStatement(query)) {
            stmt.setString(1, clie.getIdCliente());
            stmt.setString(2, clie.getNombre());
            stmt.setString(3, clie.getApellido());
            stmt.setString(4, clie.getIdentidad());
            stmt.setString(5, clie.getDepartamento());
            stmt.setString(6, clie.getMunicipio());
            stmt.setString(7, clie.getDireccion());
            stmt.setString(8, clie.getEstadocivil());
            stmt.setString(9, clie.getTelefono());
            stmt.setString(10, clie.getGenero());
            stmt.setInt(11, clie.getEdad());
            stmt.setString(12, clie.getProfesion());
            stmt.setString(13, clie.getTipo());
            stmt.setInt(14, clie.getNumero());
            stmt.setString(15, clie.getArea());
            stmt.setString(16, clie.getDepto());
            stmt.setString(17, clie.getResponsabilidad());
            stmt.executeUpdate();
            stmt.close();
            con.close();
            JOptionPane.showMessageDialog(null, " El Cliente: " + clie.getIdCliente() + " se ha guardado Exitosamente.");
        } catch (SQLException se) {
            System.out.println(se.toString());
            JOptionPane.showMessageDialog(null, "Error El Cliente: " + clie.getIdCliente() + " no se ha guardado Exitosamente.");
        }
    }

    public void updateCliente(String id, Clientes clie) throws SQLException {
        String query = "UPDATE CLIENTES "
                + "SET NOMBRE= ?, APELLIDO= ?, IDENTIDAD= ?, DEPARTAMENTO= ?, MUNICIPIO= ?, DIRECCION= ?, ESTADOCIVIL= ?, "
                + "TELEFONO= ?, GENERO= ?, EDAD= ?, PROFESION= ?, TIPO=?, AREA=?, DEPTO=?, RESPONSABILIDAD=?"
                + "WHERE IDCLIENTE=?";
        try (PreparedStatement stmt = con.prepareStatement(query)) {
            stmt.setString(1, clie.getNombre());
            stmt.setString(2, clie.getApellido());
            stmt.setString(3, clie.getIdentidad());
            stmt.setString(4, clie.getDepartamento());
            stmt.setString(5, clie.getMunicipio());
            stmt.setString(6, clie.getDireccion());
            stmt.setString(7, clie.getEstadocivil());
            stmt.setString(8, clie.getTelefono());
            stmt.setString(9, clie.getGenero());
            stmt.setInt(10, clie.getEdad());
            stmt.setString(11, clie.getProfesion());
            stmt.setString(12, clie.getTipo());
            stmt.setString(13, clie.getArea());
            stmt.setString(14, clie.getDepto());
            stmt.setString(15, clie.getResponsabilidad());
            stmt.setString(16, clie.getIdCliente());
            stmt.executeUpdate();
            stmt.close();
            con.close();
            JOptionPane.showMessageDialog(null, "El Ciente: " + id + " se ha actualizado correctamente.");
        } catch (SQLException se) {
            System.out.println(se.toString());
            JOptionPane.showMessageDialog(null, "ERROR El Ciente: " + id + " no ha actualizado correctamente." + se.toString());
        }
    }

    public void deleteCliente(String id) throws SQLException {
        Clientes clie = findByIdClientes(id);
        if (clie == null) {
            JOptionPane.showMessageDialog(null, "Codigo de cliente: " + id + " no existe.");
        }
        abrirConexion();
        String query = "DELETE FROM CLIENTES WHERE IDCLIENTE = ?";
        try (PreparedStatement stmt = con.prepareStatement(query)) {
            stmt.setString(1, id);
            stmt.executeUpdate();
            stmt.close();
            con.close();
            JOptionPane.showMessageDialog(null, "Codigo de cliente: " + id + "se ha borrado.");
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "ERROR Codigo de cliente: " + id + "no se ha borrado." + se.toString());
        }
    }

    public Clientes findByIdClientes(String id) throws SQLException {
        abrirConexion();
        String query = "SELECT * FROM CLIENTES WHERE IDCLIENTE = ?";
        try (PreparedStatement stmt = con.prepareStatement(query)) {
            stmt.setString(1, id);
            ResultSet rs = stmt.executeQuery();
            if (!rs.next()) {
                return null;
            }
            Clientes cli = new Clientes(rs.getString("IDCLIENTE"), rs.getString("NOMBRE"), rs.getString("APELLIDO"),
                    rs.getString("IDENTIDAD"), rs.getString("DEPARTAMENTO"), rs.getString("MUNICIPIO"),
                    rs.getString("DIRECCION"), rs.getString("ESTADOCIVIL"), rs.getString("TELEFONO"),
                    rs.getString("GENERO"), rs.getInt("EDAD"), rs.getString("PROFESION"), rs.getString("TIPO"),
                    rs.getInt("CONTADOR"), rs.getString("AREA"), rs.getString("DEPTO"), rs.getString("RESPONSABILIDAD"));
            rs.close();
            stmt.close();
            con.close();
            return cli;
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "ERROR Codigo de cliente: " + id + "no se ha encontrado." + se.toString());
        }
        return null;
    }

    public Clientes findByIdentidadCliente(String identidad) throws SQLException {
        String query = "SELECT * FROM CLIENTES WHERE IDENTIDAD = " + "'" + identidad + "'";
        try (PreparedStatement stmt = con.prepareStatement(query)) {
            ResultSet rs = stmt.executeQuery();
            if (!rs.next()) {
                return null;
            }
            Clientes cli = new Clientes(rs.getString("IDCLIENTE"), rs.getString("NOMBRE"), rs.getString("APELLIDO"),
                    rs.getString("IDENTIDAD"), rs.getString("DEPARTAMENTO"), rs.getString("MUNICIPIO"),
                    rs.getString("DIRECCION"), rs.getString("ESTADOCIVIL"), rs.getString("TELEFONO"),
                    rs.getString("GENERO"), rs.getInt("EDAD"), rs.getString("PROFESION"), rs.getString("TIPO"),
                    rs.getInt("CONTADOR"), rs.getString("AREA"), rs.getString("DEPTO"), rs.getString("RESPONSABILIDAD"));
            rs.close();
            stmt.close();
            con.close();
            return cli;
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "ERROR Codigo de cliente: " + identidad + "no se ha encontrado." + se.toString());
        }
        return null;
    }

    public List<Clientes> obtenerClientesByTipo(String Tipo) {
        try {
            String query = "SELECT * FROM CLIENTES WHERE TIPO = " + "'" + Tipo + "'";
            ArrayList<Clientes> depts;
            try (PreparedStatement stmt = con.prepareStatement(query)) {
                ResultSet rs = stmt.executeQuery();
                depts = new ArrayList<>();
                while (rs.next()) {
                    depts.add(new Clientes(rs.getString("IDCLIENTE"), rs.getString("NOMBRE"), rs.getString("APELLIDO"),
                            rs.getString("IDENTIDAD"), rs.getString("DEPARTAMENTO"), rs.getString("MUNICIPIO"),
                            rs.getString("DIRECCION"), rs.getString("ESTADOCIVIL"), rs.getString("TELEFONO"),
                            rs.getString("GENERO"), rs.getInt("EDAD"), rs.getString("PROFESION"), rs.getString("TIPO"),
                            rs.getInt("CONTADOR"), rs.getString("AREA"), rs.getString("DEPTO"), rs.getString("RESPONSABILIDAD")));
                }
                stmt.close();
                rs.close();
                con.close();
            }
            return depts;
        } catch (SQLException ex) {
            Logger.getLogger(ServiciosDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public List<Clientes> obtenerUltimoCleinteByTipo(String Tipo) {
        try {
            String query = "SELECT * FROM CLIENTES WHERE TIPO = " + "'" + Tipo + "'" + " ORDER BY CONTADOR DESC";
            ArrayList<Clientes> depts;
            try (PreparedStatement stmt = con.prepareStatement(query)) {
                ResultSet rs = stmt.executeQuery();
                depts = new ArrayList<>();
                while (rs.next()) {
                    depts.add(new Clientes(rs.getString("IDCLIENTE"), rs.getString("NOMBRE"), rs.getString("APELLIDO"),
                            rs.getString("IDENTIDAD"), rs.getString("DEPARTAMENTO"), rs.getString("MUNICIPIO"),
                            rs.getString("DIRECCION"), rs.getString("ESTADOCIVIL"), rs.getString("TELEFONO"),
                            rs.getString("GENERO"), rs.getInt("EDAD"), rs.getString("PROFESION"), rs.getString("TIPO"),
                            rs.getInt("CONTADOR"), rs.getString("AREA"), rs.getString("DEPTO"), rs.getString("RESPONSABILIDAD")));
                }
                stmt.close();
                rs.close();
                con.close();
            }
            return depts;

        } catch (SQLException ex) {
            Logger.getLogger(ServiciosDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public List<Clientes> findAllClientes() throws SQLException {
        try (Statement stmt = con.createStatement()) {
            String query = "SELECT * FROM CLIENTES ORDER BY CONTADOR ASC";
            ResultSet rs = stmt.executeQuery(query);
            ArrayList<Clientes> depts = new ArrayList<>();
            while (rs.next()) {
                depts.add(new Clientes(rs.getString("IDCLIENTE"), rs.getString("NOMBRE"), rs.getString("APELLIDO"),
                        rs.getString("IDENTIDAD"), rs.getString("DEPARTAMENTO"), rs.getString("MUNICIPIO"),
                        rs.getString("DIRECCION"), rs.getString("ESTADOCIVIL"), rs.getString("TELEFONO"),
                        rs.getString("GENERO"), rs.getInt("EDAD"), rs.getString("PROFESION"), rs.getString("TIPO"),
                        rs.getInt("CONTADOR"), rs.getString("AREA"), rs.getString("DEPTO"), rs.getString("RESPONSABILIDAD")));
            }
            stmt.close();
            rs.close();
            con.close();
            return depts;
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "ERROR." + se.toString());
        }
        return null;
    }

    //PRESTAMOS --------------------------------------------------------------------------------------
    public void createPrestamos(Prestamos pres) {
        String query = "INSERT INTO PRESTAMOS "
                + "(IDPRESTAMO, FECHA, IDCLIENTE, NOMBRE, PRESTAMO, PLAZO, INTERESANUAL, INTERESACUMULADO, TOTALINTERESES,"
                + " CAPITALINTERES, DEDUCCION, ABONOCAPITAL, INTERESGANADO, CONTADOR, TIPOPAGO) "
                + "VALUES (? , ? , ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = con.prepareStatement(query)) {
            stmt.setString(1, pres.getIdPrestamo());
            stmt.setString(2, pres.getFecha());
            stmt.setString(3, pres.getIdCliente());
            stmt.setString(4, pres.getNombre());
            stmt.setFloat(5, pres.getPrestamos());
            stmt.setFloat(6, pres.getPlazo());
            stmt.setFloat(7, pres.getInteresanual());
            stmt.setFloat(8, pres.getInteresAcumulado());
            stmt.setFloat(9, pres.getTotalinteres());
            stmt.setFloat(10, pres.getCapitalinteres());
            stmt.setFloat(11, pres.getDeduccion());
            stmt.setFloat(12, pres.getAbonocapital());
            stmt.setFloat(13, pres.getInteresganado());
            stmt.setInt(14, pres.getContador());
            stmt.setString(15, pres.getTipoPago());
            stmt.executeUpdate();
            stmt.close();
            con.close();
            JOptionPane.showMessageDialog(null, " El Prestamo: " + pres.getIdPrestamo() + " se ha guardado Exitosamente.");
        } catch (SQLException se) {
            System.out.println(se.toString());
            JOptionPane.showMessageDialog(null, "Error El Cliente: " + pres.getIdPrestamo() + " no se ha guardado Exitosamente." + se.toString());
        }
    }

    public void updatePrestamo(String id, Prestamos pres) throws SQLException {
        String query = "UPDATE PRESTAMOS "
                + "SET FECHA= ?, IDCLIENTE =?, NOMBRE=?, PRESTAMO=?, PLAZO=?, INTERESANUAL= ?, INTERESACUMULADO=?, "
                + "TOTALINTERESES=?, CAPITALINTERES=?, DEDUCCION=?, ABONOCAPITAL=?, INTERESGANADO=?, "
                + "TIPOPAGO=?"
                + "WHERE IDPRESTAMO=?";
        try (PreparedStatement stmt = con.prepareStatement(query)) {
            stmt.setString(1, pres.getFecha());
            stmt.setString(2, pres.getIdCliente());
            stmt.setString(3, pres.getNombre());
            stmt.setFloat(4, pres.getPrestamos());
            stmt.setFloat(5, pres.getPlazo());
            stmt.setFloat(6, pres.getInteresanual());
            stmt.setFloat(7, pres.getInteresAcumulado());
            stmt.setFloat(8, pres.getTotalinteres());
            stmt.setFloat(9, pres.getCapitalinteres());
            stmt.setFloat(10, pres.getDeduccion());
            stmt.setFloat(11, pres.getAbonocapital());
            stmt.setFloat(12, pres.getInteresganado());
            stmt.setString(13, pres.getTipoPago());
            stmt.setString(14, pres.getIdPrestamo());
            stmt.executeUpdate();
            stmt.close();
            con.close();
            JOptionPane.showMessageDialog(null, "El Prestamo: " + id + " se ha actualizado correctamente.");
        } catch (SQLException se) {
            System.out.println(se.toString());
            JOptionPane.showMessageDialog(null, "ERROR El Prestamo: " + id + " no ha actualizado correctamente." + se.toString());
        }
    }

    public void deletePrestamo(String id) throws SQLException {
        Prestamos pres = findByIdPrestamos(id);
        if (pres == null) {
            JOptionPane.showMessageDialog(null, "Codigo de Prestamo: " + id + " no existe.");
        }
        abrirConexion();
        String query = "DELETE FROM PRESTAMOS WHERE IDPRESTAMO= ?";
        try (PreparedStatement stmt = con.prepareStatement(query)) {
            stmt.setString(1, id);
            stmt.executeUpdate();
            stmt.close();
            con.close();
            JOptionPane.showMessageDialog(null, "Codigo de prestamo: " + id + "se ha borrado.");
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "ERROR Codigo de prestamo: " + id + "no se ha borrado." + se.toString());
        }
    }

    public Prestamos findByIdPrestamos(String id) {
        String query = "SELECT * FROM PRESTAMOS WHERE IDPRESTAMO = ?";
        abrirConexion();
        try (PreparedStatement stmt = con.prepareStatement(query)) {
            stmt.setString(1, id);
            ResultSet rs = stmt.executeQuery();
            if (!rs.next()) {
                return null;
            }
            Prestamos pres = new Prestamos(rs.getString("IDPRESTAMO"), rs.getString("FECHA"), rs.getString("IDCLIENTE"),
                    rs.getString("NOMBRE"), rs.getFloat("PRESTAMO"), rs.getFloat("PLAZO"), rs.getFloat("INTERESANUAL"),
                    rs.getFloat("INTERESACUMULADO"), rs.getFloat("TOTALINTERESES"),
                    rs.getFloat("CAPITALINTERES"), rs.getFloat("DEDUCCION"), rs.getFloat("ABONOCAPITAL"),
                    rs.getFloat("INTERESGANADO"), rs.getInt("CONTADOR"), rs.getString("TIPOPAGO"));
            rs.close();
            stmt.close();
            con.close();
            return pres;
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "ERROR Codigo de Prestamo: " + id + " no se ha encontrado." + se.toString());
        }
        return null;
    }

    public List<Prestamos> obtenerPrestamosByIdCliente(String idCliente) {
        try {
            abrirConexion();
            String query = "SELECT * FROM PRESTAMOS WHERE IDCLIENTE = " + "'" + idCliente + "'";
            ArrayList<Prestamos> depts;
            try (PreparedStatement stmt = con.prepareStatement(query)) {
                ResultSet rs = stmt.executeQuery();
                depts = new ArrayList<>();
                while (rs.next()) {
                    depts.add(new Prestamos(rs.getString("IDPRESTAMO"), rs.getString("FECHA"), rs.getString("IDCLIENTE"),
                            rs.getString("NOMBRE"), rs.getFloat("PRESTAMO"), rs.getFloat("PLAZO"), rs.getFloat("INTERESANUAL"),
                            rs.getFloat("INTERESACUMULADO"), rs.getFloat("TOTALINTERESES"),
                            rs.getFloat("CAPITALINTERES"), rs.getFloat("DEDUCCION"), rs.getFloat("ABONOCAPITAL"),
                            rs.getFloat("INTERESGANADO"), rs.getInt("CONTADOR"), rs.getString("TIPOPAGO")));
                }
                stmt.close();
                rs.close();
                con.close();
            }
            return depts;
        } catch (SQLException ex) {
            Logger.getLogger(ServiciosDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public List<Prestamos> obtenerUltimoPrestamoByIdCliente(String idCliente) {
        try {
            abrirConexion();
            String query = "SELECT * FROM PRESTAMOS WHERE IDCLIENTE = " + "'" + idCliente + "'" + " ORDER BY CONTADOR DESC";
            ArrayList<Prestamos> depts;
            try (PreparedStatement stmt = con.prepareStatement(query)) {
                ResultSet rs = stmt.executeQuery();
                depts = new ArrayList<>();
                while (rs.next()) {
                    depts.add(new Prestamos(rs.getString("IDPRESTAMO"), rs.getString("FECHA"), rs.getString("IDCLIENTE"),
                            rs.getString("NOMBRE"), rs.getFloat("PRESTAMO"), rs.getFloat("PLAZO"), rs.getFloat("INTERESANUAL"),
                            rs.getFloat("INTERESACUMULADO"), rs.getFloat("TOTALINTERESES"),
                            rs.getFloat("CAPITALINTERES"), rs.getFloat("DEDUCCION"), rs.getFloat("ABONOCAPITAL"),
                            rs.getFloat("INTERESGANADO"), rs.getInt("CONTADOR"), rs.getString("TIPOPAGO")));
                }
                rs.close();
                stmt.close();
                con.close();
            }
            return depts;
        } catch (SQLException ex) {
            Logger.getLogger(ServiciosDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public List<Prestamos> listEmpleadosTemporales(String tipoEmpleado) {
        try {
            getConn();
            String query = "SELECT * FROM PRESTAMOS INNER JOIN CLIENTES ON PRESTAMOS.IDCLIENTE = CLIENTES.IDCLIENTE "
                    + "WHERE CLIENTES.TIPO = " + "'" + tipoEmpleado + "'";
            ArrayList<Prestamos> depts;
            try (PreparedStatement stmt = con.prepareStatement(query)) {
                try (ResultSet rs = stmt.executeQuery()) {
                    depts = new ArrayList<>();
                    while (rs.next()) {
                        depts.add(new Prestamos(rs.getString("IDPRESTAMO"), rs.getString("FECHA"), rs.getString("IDCLIENTE"),
                                rs.getString("NOMBRE"), rs.getFloat("PRESTAMO"), rs.getFloat("PLAZO"), rs.getFloat("INTERESANUAL"),
                                rs.getFloat("INTERESACUMULADO"), rs.getFloat("TOTALINTERESES"),
                                rs.getFloat("CAPITALINTERES"), rs.getFloat("DEDUCCION"), rs.getFloat("ABONOCAPITAL"),
                                rs.getFloat("INTERESGANADO"), rs.getInt("CONTADOR"), rs.getString("TIPOPAGO")));
                    }
                    rs.close();
                    stmt.close();
                    con.close();
                }

            }

            return depts;
        } catch (SQLException ex) {
            Logger.getLogger(ServiciosDB.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(ServiciosDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public List<Prestamos> listEmpleadosPermanentes(String tipoEmpleado) {
        try {
            abrirConexion();
            String query = "SELECT * FROM PRESTAMOS INNER JOIN CLIENTES ON PRESTAMOS.IDCLIENTE = CLIENTES.IDCLIENTE "
                    + "WHERE CLIENTES.TIPO = " + "'" + tipoEmpleado + "'";
            ArrayList<Prestamos> depts;
            try (PreparedStatement stmt = con.prepareStatement(query)) {
                ResultSet rs = stmt.executeQuery();
                depts = new ArrayList<>();
                while (rs.next()) {
                    depts.add(new Prestamos(rs.getString("IDPRESTAMO"), rs.getString("FECHA"), rs.getString("IDCLIENTE"),
                            rs.getString("NOMBRE"), rs.getFloat("PRESTAMO"), rs.getFloat("PLAZO"), rs.getFloat("INTERESANUAL"),
                            rs.getFloat("INTERESACUMULADO"), rs.getFloat("TOTALINTERESES"),
                            rs.getFloat("CAPITALINTERES"), rs.getFloat("DEDUCCION"), rs.getFloat("ABONOCAPITAL"),
                            rs.getFloat("INTERESGANADO"), rs.getInt("CONTADOR"), rs.getString("TIPOPAGO")));
                }
                rs.close();
                stmt.close();
                con.close();
            }
            return depts;
        } catch (SQLException ex) {
            Logger.getLogger(ServiciosDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public List<Prestamos> listEmpleadosSocios(String tipoEmpleado) {
        try {
            abrirConexion();
            String query = "SELECT * FROM PRESTAMOS INNER JOIN CLIENTES ON PRESTAMOS.IDCLIENTE = CLIENTES.IDCLIENTE "
                    + "WHERE CLIENTES.TIPO = " + "'" + tipoEmpleado + "'";
            ArrayList<Prestamos> depts;
            try (PreparedStatement stmt = con.prepareStatement(query)) {
                ResultSet rs = stmt.executeQuery();
                depts = new ArrayList<>();
                while (rs.next()) {
                    depts.add(new Prestamos(rs.getString("IDPRESTAMO"), rs.getString("FECHA"), rs.getString("IDCLIENTE"),
                            rs.getString("NOMBRE"), rs.getFloat("PRESTAMO"), rs.getFloat("PLAZO"), rs.getFloat("INTERESANUAL"),
                            rs.getFloat("INTERESACUMULADO"), rs.getFloat("TOTALINTERESES"),
                            rs.getFloat("CAPITALINTERES"), rs.getFloat("DEDUCCION"), rs.getFloat("ABONOCAPITAL"),
                            rs.getFloat("INTERESGANADO"), rs.getInt("CONTADOR"), rs.getString("TIPOPAGO")));
                }
                rs.close();
                stmt.close();
                con.close();
            }
            return depts;
        } catch (SQLException ex) {
            Logger.getLogger(ServiciosDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public List<Prestamos> findAllPrestamos() throws SQLException {
        abrirConexion();
        try (Statement stmt = con.createStatement()) {
            String query = "SELECT * FROM PRESTAMOS";
            ResultSet rs = stmt.executeQuery(query);
            ArrayList<Prestamos> depts = new ArrayList<>();
            while (rs.next()) {
                depts.add(new Prestamos(rs.getString("IDPRESTAMO"), rs.getString("FECHA"), rs.getString("IDCLIENTE"),
                        rs.getString("NOMBRE"), rs.getFloat("PRESTAMO"), rs.getFloat("PLAZO"), rs.getFloat("INTERESANUAL"),
                        rs.getFloat("INTERESACUMULADO"), rs.getFloat("TOTALINTERESES"),
                        rs.getFloat("CAPITALINTERES"), rs.getFloat("DEDUCCION"), rs.getFloat("ABONOCAPITAL"),
                        rs.getFloat("INTERESGANADO"), rs.getInt("CONTADOR"), rs.getString("TIPOPAGO")));
            }
            stmt.close();
            rs.close();
            con.close();
            return depts;
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "ERROR." + se.toString());
        }
        return null;
    }

    // Deducciones ----------------------------------------------------------------------------------
    public void createDeduccion(Deducciones ded) {
        String query = "INSERT INTO DEDUCCION "
                + "(IDDEDUCCION, FECHA, IDPRESTAMO, NOMBRE, PRESTAMO,DEDUCCION,SALDODEUDOR, CONTADOR) "
                + "VALUES (? , ? , ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = con.prepareStatement(query)) {
            stmt.setString(1, ded.getIdDeduccion());
            stmt.setString(2, ded.getFecha());
            stmt.setString(3, ded.getIdPrestamo());
            stmt.setString(4, ded.getNombre());
            stmt.setFloat(5, ded.getPrestamo());
            stmt.setFloat(6, ded.getDeduccion());
            stmt.setFloat(7, ded.getSaldoDeudor());
            stmt.setInt(8, ded.getContador());
            stmt.executeUpdate();
            stmt.close();
            con.close();
            JOptionPane.showMessageDialog(null, " La Deduccion: " + ded.getIdDeduccion() + " se ha guardado Exitosamente.");
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "Error La Deduccion: " + ded.getIdDeduccion() + " no se ha guardado Exitosamente." + se.toString());
        }
    }

    public void updateDeduccion(String id, Deducciones ded) throws SQLException {
        String query = "UPDATE DEDUCCION "
                + "SET FECHA= ?, IDPRESTAMO= ?, NOMBRE=?, PRESTAMO=?, DEDUCCION=?, SALDODEUDOR= ?"
                + "WHERE IDDEDUCCION= ?";
        try (PreparedStatement stmt = con.prepareStatement(query)) {
            stmt.setString(1, ded.getFecha());
            stmt.setString(2, ded.getIdPrestamo());
            stmt.setString(3, ded.getNombre());
            stmt.setFloat(4, ded.getPrestamo());
            stmt.setFloat(5, ded.getDeduccion());
            stmt.setFloat(6, ded.getSaldoDeudor());
            stmt.setString(7, ded.getIdDeduccion());
            stmt.executeUpdate();
            stmt.close();
            con.close();
            JOptionPane.showMessageDialog(null, "La deduccion: " + id + " se ha actualizado correctamente.");
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "ERROR La deduccion: " + id + " no ha actualizado correctamente." + se.toString());
        }
    }

    public void deleteDeduccion(String id) throws SQLException {
        Deducciones ded = findByIdDeduccion(id);
        if (ded == null) {
            JOptionPane.showMessageDialog(null, "Codigo de Deduccion: " + id + " no existe.");
        }
        abrirConexion();
        String query = "DELETE FROM DEDUCCION WHERE IDDEDUCCION= ?";
        try (PreparedStatement stmt = con.prepareStatement(query)) {
            stmt.setString(1, id);
            stmt.executeUpdate();
            stmt.close();
            con.close();
            JOptionPane.showMessageDialog(null, "Deduccion de prestamo: " + id + "se ha borrado.");
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "ERROR Deduccion de prestamo: " + id + "no se ha borrado." + se.toString());
        }
    }

    public Deducciones findByIdDeduccion(String id) {
        abrirConexion();
        String query = "SELECT * FROM DEDUCCION WHERE IDDEDUCCION = ?";
        try (PreparedStatement stmt = con.prepareStatement(query)) {
            stmt.setString(1, id);
            ResultSet rs = stmt.executeQuery();
            if (!rs.next()) {
                return null;
            }
            Deducciones ded = new Deducciones(rs.getString("IDDEDUCCION"), rs.getString("FECHA"), rs.getString("IDPRESTAMO"),
                    rs.getString("NOMBRE"), rs.getFloat("PRESTAMO"), rs.getFloat("DEDUCCION"),
                    rs.getFloat("SALDODEUDOR"), rs.getInt("CONTADOR"));
            rs.close();
            stmt.close();
            con.close();
            return ded;
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "ERROR Codigo de Deduccion: " + id + "no se ha encontrado." + se.toString());
        }
        return null;
    }

    public Deducciones findByIdPrestamo(String id) {
        abrirConexion();
        String query = "SELECT * FROM DEDUCCION WHERE IDPRESTAMO = ?";
        try (PreparedStatement stmt = con.prepareStatement(query)) {
            stmt.setString(1, id);
            ResultSet rs = stmt.executeQuery();
            if (!rs.next()) {
                return null;
            }
            Deducciones ded = new Deducciones(rs.getString("IDDEDUCCION"), rs.getString("FECHA"), rs.getString("IDPRESTAMO"),
                    rs.getString("NOMBRE"), rs.getFloat("PRESTAMO"), rs.getFloat("DEDUCCION"),
                    rs.getFloat("SALDODEUDOR"), rs.getInt("CONTADOR"));
            stmt.close();
            rs.close();
            con.close();
            return ded;
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "ERROR Codigo de Deduccion: " + id + "no se ha encontrado." + se.toString());
        }
        return null;
    }

    public List<Deducciones> obtenerDeduccionesByIdPrestamo(String idPrestamo) {
        try {
            abrirConexion();
            String query = "SELECT * FROM DEDUCCION WHERE IDPRESTAMO = " + "'" + idPrestamo + "'";
            ArrayList<Deducciones> depts;
            try (PreparedStatement stmt = con.prepareStatement(query)) {
                ResultSet rs = stmt.executeQuery();
                depts = new ArrayList<>();
                while (rs.next()) {
                    depts.add(new Deducciones(rs.getString("IDDEDUCCION"), rs.getString("FECHA"), rs.getString("IDPRESTAMO"),
                            rs.getString("NOMBRE"), rs.getFloat("PRESTAMO"), rs.getFloat("DEDUCCION"),
                            rs.getFloat("SALDODEUDOR"), rs.getInt("CONTADOR")));
                }
                stmt.close();
                rs.close();
                con.close();
            }
            return depts;
        } catch (SQLException ex) {
            Logger.getLogger(ServiciosDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public List<Deducciones> obtenerUltimaDeduccionByIdPrestamo(String idPrestamo) {
        try {
            getConn();
            String query = "SELECT * FROM DEDUCCION WHERE IDPRESTAMO = " + "'" + idPrestamo + "'" + " ORDER BY CONTADOR DESC";
            PreparedStatement stmt = con.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            ArrayList<Deducciones> depts = new ArrayList<>();
            while (rs.next()) {
                depts.add(new Deducciones(rs.getString("IDDEDUCCION"), rs.getString("FECHA"), rs.getString("IDPRESTAMO"),
                        rs.getString("NOMBRE"), rs.getFloat("PRESTAMO"), rs.getFloat("DEDUCCION"),
                        rs.getFloat("SALDODEUDOR"), rs.getInt("CONTADOR")));
            }
            stmt.close();
            rs.close();
            con.close();
            return depts;
        } catch (SQLException ex) {
            Logger.getLogger(ServiciosDB.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(ServiciosDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public Deducciones obtenerUltimaDeduccionByIdPrestamo1(String idPrestamo) {
        try {
            getConn();
            String query = "SELECT * FROM DEDUCCION WHERE IDPRESTAMO = " + "'" + idPrestamo + "'"
                    + "AND  ROWNUM = 1  ORDER BY CONTADOR DESC";
            ArrayList<Deducciones> depts;
            try (PreparedStatement stmt = con.prepareStatement(query)) {
                ResultSet rs = stmt.executeQuery();
                depts = new ArrayList<>();
                if (!rs.next()) {
                    return null;
                }
                Deducciones ded = new Deducciones(rs.getString("IDDEDUCCION"), rs.getString("FECHA"), rs.getString("IDPRESTAMO"),
                        rs.getString("NOMBRE"), rs.getFloat("PRESTAMO"), rs.getFloat("DEDUCCION"),
                        rs.getFloat("SALDODEUDOR"), rs.getInt("CONTADOR"));

                stmt.close();
                rs.close();
                con.close();
                return ded;
            }

        } catch (SQLException ex) {
            Logger.getLogger(ServiciosDB.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(ServiciosDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public List<Deducciones> obtenerUltimaDeduccionByIdPrestamoAcs(String idPrestamo) {
        try {
            abrirConexion();
            String query = "SELECT * FROM DEDUCCION WHERE IDPRESTAMO = " + "'" + idPrestamo + "'" + " ORDER BY CONTADOR ASC";
            ArrayList<Deducciones> depts;
            try (PreparedStatement stmt = con.prepareStatement(query)) {
                ResultSet rs = stmt.executeQuery();
                depts = new ArrayList<>();
                while (rs.next()) {
                    depts.add(new Deducciones(rs.getString("IDDEDUCCION"), rs.getString("FECHA"), rs.getString("IDPRESTAMO"),
                            rs.getString("NOMBRE"), rs.getFloat("PRESTAMO"), rs.getFloat("DEDUCCION"),
                            rs.getFloat("SALDODEUDOR"), rs.getInt("CONTADOR")));
                }
                stmt.close();
                rs.close();
                con.close();
            }
            return depts;
        } catch (SQLException ex) {
            Logger.getLogger(ServiciosDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public List<Deducciones> findAllDeducciones() throws SQLException {
        abrirConexion();
        try (Statement stmt = con.createStatement()) {
            String query = "SELECT * FROM DEDUCCION";
            ResultSet rs = stmt.executeQuery(query);
            ArrayList<Deducciones> depts = new ArrayList<>();
            while (rs.next()) {
                depts.add(new Deducciones(rs.getString("IDDEDUCCION"), rs.getString("FECHA"), rs.getString("IDPRESTAMO"),
                        rs.getString("NOMBRE"), rs.getFloat("PRESTAMO"), rs.getFloat("DEDUCCION"),
                        rs.getFloat("SALDODEUDOR"), rs.getInt("CONTADOR")));
            }
            stmt.close();
            rs.close();
            con.close();
            return depts;
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "ERROR." + se.toString());
        }
        return null;
    }

    //-------------------------------------------------------------------------------------------
    public void createAval(Aval aval) {
        String query = "INSERT INTO AVAL "
                + "(IDAVAL, NOMBRE, DIRECCION, "
                + "PROFESION, EMPRESA, LABORAREA, DEPARTAMENTO, ANIOS, MESES, SALARIO, TELEFONO, CONTADOR, IDCLIENTE, "
                + "IDPRESTAMO, RESPONSABILIDAD, IDENTIDAD) "
                + "VALUES (? , ? , ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = con.prepareStatement(query)) {
            stmt.setString(1, aval.getIdAval());
            stmt.setString(2, aval.getNombre());
            stmt.setString(3, aval.getDireccion());
            stmt.setString(4, aval.getProfesion());
            stmt.setString(5, aval.getEmpresa());
            stmt.setString(6, aval.getLaborArea());
            stmt.setString(7, aval.getDepartamento());
            stmt.setString(8, aval.getAnios());
            stmt.setString(9, aval.getMeses());
            stmt.setFloat(10, aval.getSalario());
            stmt.setString(11, aval.getTelefono());
            stmt.setInt(12, aval.getContador());
            stmt.setString(13, aval.getIdCliente());
            stmt.setString(14, aval.getIdPrestamo());
            stmt.setString(15, aval.getResponsabilidad());
            stmt.setString(16, aval.getIdentidad());
            stmt.executeUpdate();
            stmt.close();
            con.close();
            JOptionPane.showMessageDialog(null, " El Aval: " + aval.getIdAval() + " se ha guardado Exitosamente.");
        } catch (SQLException se) {
            System.out.println(se.toString());
            JOptionPane.showMessageDialog(null, "Error El Aval: " + aval.getIdAval() + " no se ha guardado Exitosamente." + se.toString());
        }
    }

    public void updateAval(String id, Aval aval) throws SQLException {
        String query = "UPDATE AVAL "
                + "SET  NOMBRE= ?, DIRECCION= ?, PROFESION= ?, EMPRESA= ?, LABORAREA= ?, DEPARTAMENTO= ?, "
                + "ANIOS= ?, MESES= ?, SALARIO= ?, TELEFONO= ?, IDCLIENTE= ?, IDPRESTAMO=?, "
                + "RESPONSABILIDAD=?, IDENTIDAD=?"
                + "WHERE IDAVAL= ?";
        try (PreparedStatement stmt = con.prepareStatement(query)) {
            stmt.setString(1, aval.getNombre());
            stmt.setString(2, aval.getDireccion());
            stmt.setString(3, aval.getProfesion());
            stmt.setString(4, aval.getEmpresa());
            stmt.setString(5, aval.getLaborArea());
            stmt.setString(6, aval.getDepartamento());
            stmt.setString(7, aval.getAnios());
            stmt.setString(8, aval.getMeses());
            stmt.setFloat(9, aval.getSalario());
            stmt.setString(10, aval.getTelefono());
            stmt.setString(11, aval.getIdCliente());
            stmt.setString(12, aval.getIdPrestamo());
            stmt.setString(13, aval.getResponsabilidad());
            stmt.setString(14, aval.getIdentidad());
            stmt.setString(15, aval.getIdAval());
            stmt.executeUpdate();
            stmt.close();
            con.close();
            JOptionPane.showMessageDialog(null, "El Aval: " + id + " se ha actualizado correctamente.");
        } catch (SQLException se) {
            System.out.println(se.toString());
            JOptionPane.showMessageDialog(null, "ERROR El Aval: " + id + " no ha actualizado correctamente." + se.toString());
        }
    }

    public void deleteAval(String id) throws SQLException {
        Aval aval = findByIdAval(id);
        if (aval == null) {
            JOptionPane.showMessageDialog(null, "Codigo de cliente: " + id + " no existe.");
        }
        abrirConexion();
        String query = "DELETE FROM AVAL WHERE IDAVAL = ?";
        try (PreparedStatement stmt = con.prepareStatement(query)) {
            stmt.setString(1, id);
            stmt.executeUpdate();
            stmt.close();
            con.close();
            JOptionPane.showMessageDialog(null, "Codigo del Aval: " + id + "se ha borrado.");
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "ERROR Codigol de Aval: " + id + "no se ha borrado." + se.toString());
        }
    }

    public Aval findByIdAval(String id) throws SQLException {
        String query = "SELECT * FROM AVAL WHERE IDAVAL = ?";
        try (PreparedStatement stmt = con.prepareStatement(query)) {
            stmt.setString(1, id);
            ResultSet rs = stmt.executeQuery();
            if (!rs.next()) {
                return null;
            }
            Aval a = new Aval(rs.getString("IDAVAL"), rs.getString("NOMBRE"), rs.getString("DIRECCION"),
                    rs.getString("PROFESION"), rs.getString("EMPRESA"), rs.getString("LABORAREA"),
                    rs.getString("DEPARTAMENTO"), rs.getString("ANIOS"), rs.getString("MESES"), rs.getFloat("SALARIO"),
                    rs.getString("TELEFONO"), rs.getInt("CONTADOR"), rs.getString("IDCLIENTE"),
                    rs.getString("IDPRESTAMO"), rs.getString("RESPONSABILIDAD"), rs.getString("IDENTIDAD"));
            stmt.close();
            rs.close();
            con.close();
            return a;
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "ERROR Codigo de cliente: " + id + "no se ha encontrado." + se.toString());
        }
        return null;
    }

    public Aval findByIdCliente(String id) throws SQLException {
        abrirConexion();
        String query = "SELECT * FROM AVAL WHERE IDCLIENTE = " + "'" + id + "'";
        try (PreparedStatement stmt = con.prepareStatement(query)) {
            ResultSet rs = stmt.executeQuery();
            if (!rs.next()) {
                return null;
            }
            Aval a = new Aval(rs.getString("IDAVAL"), rs.getString("NOMBRE"), rs.getString("DIRECCION"),
                    rs.getString("PROFESION"), rs.getString("EMPRESA"), rs.getString("LABORAREA"),
                    rs.getString("DEPARTAMENTO"), rs.getString("ANIOS"), rs.getString("MESES"), rs.getFloat("SALARIO"),
                    rs.getString("TELEFONO"), rs.getInt("CONTADOR"), rs.getString("IDCLIENTE"),
                    rs.getString("IDPRESTAMO"), rs.getString("RESPONSABILIDAD"), rs.getString("IDENTIDAD"));
            rs.close();
            stmt.close();
            con.close();
            return a;
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "ERROR Codigo de cliente: " + id + "no se ha encontrado." + se.toString());
        }
        return null;
    }

    public List<Aval> findAllAvales() throws SQLException {
        try (Statement stmt = con.createStatement()) {
            String query = "SELECT * FROM AVAL";
            ResultSet rs = stmt.executeQuery(query);
            ArrayList<Aval> depts = new ArrayList<>();
            while (rs.next()) {
                depts.add(new Aval(rs.getString("IDAVAL"), rs.getString("NOMBRE"), rs.getString("DIRECCION"),
                        rs.getString("PROFESION"), rs.getString("EMPRESA"), rs.getString("LABORAREA"),
                        rs.getString("DEPARTAMENTO"), rs.getString("ANIOS"), rs.getString("MESES"), rs.getFloat("SALARIO"),
                        rs.getString("TELEFONO"), rs.getInt("CONTADOR"), rs.getString("IDCLIENTE"),
                        rs.getString("IDPRESTAMO"), rs.getString("RESPONSABILIDAD"), rs.getString("IDENTIDAD")));
            }
            rs.close();
            stmt.close();
            con.close();
            return depts;
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "ERROR.");
        }
        return null;
    }

    public Aval findByIdentidadAval(String identidad) throws SQLException {
        String query = "SELECT * FROM AVAL WHERE IDENTIDAD = " + "'" + identidad + "'";
        try (PreparedStatement stmt = con.prepareStatement(query)) {
            ResultSet rs = stmt.executeQuery();
            if (!rs.next()) {
                return null;
            }
            Aval a = new Aval(rs.getString("IDAVAL"), rs.getString("NOMBRE"), rs.getString("DIRECCION"),
                    rs.getString("PROFESION"), rs.getString("EMPRESA"), rs.getString("LABORAREA"),
                    rs.getString("DEPARTAMENTO"), rs.getString("ANIOS"), rs.getString("MESES"), rs.getFloat("SALARIO"),
                    rs.getString("TELEFONO"), rs.getInt("CONTADOR"), rs.getString("IDCLIENTE"),
                    rs.getString("IDPRESTAMO"), rs.getString("RESPONSABILIDAD"), rs.getString("IDENTIDAD"));
            stmt.close();
            rs.close();
            con.close();
            return a;
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "ERROR Codigo de cliente: " + identidad + "no se ha encontrado." + se.toString());
        }
        return null;
    }

    public Connection getConn() throws Exception {
        if (con == null || con.isClosed()) {
            con = DriverManager.getConnection(url, username, password);
        }
        return con;
    }

}
