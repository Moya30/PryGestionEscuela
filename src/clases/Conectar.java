package clases;

import java.sql.*;

public class Conectar {

    Connection cn;
    public final String DRIVER = "com.mysql.jdbc.Driver";

    public Conectar() {
        cn = null;
    }

    public Connection conexion() {
        try {
            Class.forName(DRIVER);
            this.cn = DriverManager.getConnection("jdbc:mysql://localhost/escuela", "root", "");

            System.out.println("Conectado a la base de datos escuela");

        } catch (Exception e) {
            System.out.println("Erroro, no conectado: " + e.getMessage());
        }
        return cn;
    }

    public static void main(String[] args) {
        Conectar conect = new Conectar();
        conect.conexion();
    }
}
