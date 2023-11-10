package db.repositorys;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import com.mysql.cj.xdevapi.Statement;

import db.conexion.ConexionDB;
import interfaces.RepositoryInterface;
import models.Genero;

public class GeneroRepository implements RepositoryInterface<Genero> {

    @Override
    public void agregar(Genero entidad) {
        try (Connection conexion = ConexionDB.obtenerConexion()){
            String q = "f,h";
            try(
                    PreparedStatement preparedStatement = conexion.prepareStatement(q); 
                    ) {
                        preparedStatement.setString(1,entidad.getNombre());
                        preparedStatement.executeUpdate();
            } catch (Exception e) {
                System.out.println();            // TODO: handle exception
            }
        }
        catch(Exception e){
                System.out.println("error en query, recuperar todo");
            }
            return;
        }
        // TODO Auto-generated method stub
        
    

    @Override
    public void eliminar(Genero entidad) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void modificar(Genero entidad) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Genero recuperarId(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Genero> recuperarTodos() {
        // TODO Auto-generated method stub
        try (Connection conexion = ConexionDB.obtenerConexion()){
            String q = "SELECT * FROM generos";
            try(
                Statement statement = conexion.createStatement();
                ResultSet resultSet = statement.executeQuery(q);

            )
            } catch (Exception e) {
                // TODO: handle exception
            } 
        } catch (Exception e) {
            // TODO: handle exception
        }
        return null;
    }
    
}
