package pe.uni.eurekaapp.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import pe.uni.eurekaapp.db.AccesoDB;
import pe.uni.eurekaapp.model.EmpleadoModel;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class LogonService {
	
	public EmpleadoModel validar(String usuario, String clave){
		EmpleadoModel model = null;
		Connection cn = null;
		try {
			cn = AccesoDB.getConnection();
			String sql = "select chr_emplcodigo, vch_emplpaterno, vch_emplmaterno, " +
					"vch_emplnombre, vch_emplciudad, vch_empldireccion, vch_emplusuario " +
					"from eureka.empleado " +
					"where vch_emplusuario = ? and vch_emplclave = ?";
			PreparedStatement pstm = cn.prepareStatement(sql);
			pstm.setString(1, usuario);
			pstm.setString(2, clave);
			ResultSet rs = pstm.executeQuery();
			if( rs.next() ){
				model = new EmpleadoModel();
				model.setCodigo(rs.getString("chr_emplcodigo"));
				model.setPaterno(rs.getString("vch_emplpaterno"));
				model.setMaterno(rs.getString("vch_emplmaterno"));
				model.setNombre(rs.getString("vch_emplnombre"));
				model.setCiudad(rs.getString("vch_emplciudad"));
				model.setDireccion(rs.getString("vch_empldireccion"));
				model.setUsuario(rs.getString("vch_emplusuario"));
			}
			rs.close();
			pstm.close();
			if(model == null){
				throw new Exception("Datos incorrectos.");
			}
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		} finally{
			try {
				cn.close();
			} catch (Exception e) {
			}
		}
		return model;
	}

}
