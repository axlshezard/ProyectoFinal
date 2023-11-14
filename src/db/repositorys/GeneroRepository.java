package db.repositorys;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import db.conexion.ConexionDB;
import interfaces.RepositoryInterface;
import models.Genero;



public class GeneroRepository implements RepositoryInterface<Genero> {

 
    @Override
    public Genero recuperarId(Long id) {
    try (Connection conexion = ConexionDB.obtenerConexion()) {
        String q = "SELECT * FROM generos WHERER id = ? ";
        try (
            PreparedStatement preparedStatement = conexion.prepareStatement(q);
          ) {
            preparedStatement.setLong(1,id );
            return dameEntidadResultSet(preparedStatement.executeQuery());

        } catch (Exception e) {
             System.out.println("Error al crear el Statement o Resulset");
        }
    } catch  (Exception e) {
        System.out.println("eeror en la consulta");
    }
    return null;
}

    private Genero dameEntidadResultSet(ResultSet executeQuery) {
        return null;
    }

    @Override
    public List<Genero> recuperarTodos() {
        try (Connection conexion = ConexionDB.obtenerConexion()) {
            String q = "SELECT * FROM generos";
            try (
                Statement statement = conexion.createStatement();
                ResultSet resultSet = statement.executeQuery(q)        
                ){
                return this.dameListaGeneros(resultSet);    
            } catch (Exception e) { 
                System.out.println("Error al   rear el Statement o ResultSet");
            }
        } catch (Exception e) {
            System.out.println("error en la consulta");
        }
        return null;
    }


    private List<Genero> dameListaGeneros(ResultSet resultSet) {
        return null;
    }

    @Override
    public void agregar(Genero entidad) {
        try (Connection conexion = ConexionDB.obtenerConexion()){
            String q = "INSERT INTO generos VALUES(null,?)";
            try(
                PreparedStatement preparedStatement = conexion.prepareStatement(q); 
                ) {
                    preparedStatement.setString(1,entidad.getNombre());
                    preparedStatement.executeUpdate();
            } catch (Exception e) {
                System.out.println();            
            }
        } catch(Exception e){
            System.out.println("error en query, recuperar todo");
        }
    }   
    
    @Override
    public void modificar(Genero entidad) {
        try ( Connection conexion = ConexionDB.obtenerConexion()){
            String q = "UPDATE generos SET nombre = ? WHERE id = ?";
            try (
                PreparedStatement preparedStatement = conexion.prepareStatement(q);
            ){
                preparedStatement.setString(1,entidad.getNombre());
                preparedStatement.setString(2,""+entidad.getId());
                preparedStatement.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error al crear el Statement o Resultset\"");
        }

    } catch (Exception e) {
        System.out.println("Error en la consulta");
        }
    }

    @Override
    public void eliminar(Genero entidad) {
        try (Connection conexion = ConexionDB.obtenerConexion()) {
            String q = "DELETE FROM generos WHERE id = ?";
            try (

                        PreparedStatement preparedStatement = conexion.prepareStatement(q);
                ) {
                    preparedStatement.setString(1,""+entidad.getId());
                    preparedStatement.executeUpdate();
            } catch (Exception e) {
                System.out.println("Error al crear el Statement o Resultset");
            }
        } catch (Exception e) {
           System.out.println("error en la consulta");
        }        
    } 
    private List<Genero> damelistaGeneros(ResultSet resultSet){
        List<Genero> generos = new ArrayList<Genero>();
        try (resultSet){
            while ((resultSet.next())) {
                Long id = resultSet.getLong("id");
                String nombre = resultSet.getString("nombre");
                generos.add(new Genero((id), nombre));
            }  
        } catch (Exception e) {
            System.out.println("Error al recuperarSet");
        }
        return generos;

    }

    private Genero dameEntidadResultset(ResultSet resultset){
        Long id=0L;
        String nombre="";
        try {
            while (resultset.next()) {
                id = resultset.getLong("id");
                nombre = resultset.getString("nombre");                
            }
            return new Genero(id, nombre);
        } catch (Exception e) {
            System.out.println("Error al recuperar resultSet");
        }
        return null;
    }

}


