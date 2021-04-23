package pe.ucont.sistcomercial.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import pe.ucont.sistcomercial.db.AccesoDB;
import pe.ucont.sistcomercial.dto.CategoriaDto;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class CategoriaService {

	public List<CategoriaDto> traerTodos(){
		List<CategoriaDto> lista = new ArrayList<>();
		Connection cn = null;
		try {
			cn = AccesoDB.getConnection();
			Statement stm = cn.createStatement();
			String query = "select idcat, nombre from categoria";
			ResultSet rs = stm.executeQuery(query);
			while(rs.next()){
				int id = rs.getInt("idcat");
				String nombre = rs.getString("nombre");
				lista.add(new CategoriaDto(id, nombre));
			}
			rs.close();
			stm.close();
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		} finally {
			try {
				cn.close();
			} catch (Exception e) {
			}
		}
		return lista;
	}
	
}
