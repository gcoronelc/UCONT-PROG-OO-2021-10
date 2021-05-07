package pe.edu.ucont.proyectodemoef.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import pe.edu.ucont.proyectodemoef.db.AccesoDB;
import pe.edu.ucont.proyectodemoef.dto.EmpleadoDto;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class LogonService extends AbstractService {

	public EmpleadoDto validar(String usuario, String clave) {
		EmpleadoDto empDto = null;
		String query = "select e.CHR_EMPLCODIGO, e.VCH_EMPLPATERNO, e.VCH_EMPLMATERNO,"
				  + "e.VCH_EMPLNOMBRE, e.VCH_EMPLCIUDAD, e.VCH_EMPLDIRECCION, e.VCH_EMPLUSUARIO,"
				  + "'*****' VCH_EMPLCLAVE "
				  + "from empleado e "
				  + "join asignado a on e.chr_emplcodigo = a.chr_emplcodigo "
				  + "where vch_emplusuario = ?  and vch_emplclave = ? "
				  + "and a.dtt_asigfechabaja is null";
		Connection cn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		this.setCode(1);
		this.setMessage("Proceso ok.");
		try {
			cn = AccesoDB.getConnection();
			pstm = cn.prepareStatement(query);
			pstm.setString(1, usuario);
			pstm.setString(2, clave);
			rs = pstm.executeQuery();
			if(!rs.next()){
				rs.close();
				pstm.close();
				throw new SQLException("Datos incorrectos.");
			}
			empDto = new EmpleadoDto();
			empDto.setCodigo(rs.getString("CHR_EMPLCODIGO"));
			empDto.setPaterno(rs.getString("VCH_EMPLPATERNO"));
			empDto.setMaterno(rs.getString("VCH_EMPLMATERNO"));
			empDto.setNombre(rs.getString("VCH_EMPLNOMBRE"));
			empDto.setCiudad(rs.getString("VCH_EMPLCIUDAD"));
			empDto.setDireccion(rs.getString("VCH_EMPLDIRECCION"));
			empDto.setUsuario(rs.getString("VCH_EMPLUSUARIO"));
			empDto.setClave(rs.getString("VCH_EMPLCLAVE"));
			rs.close();
			pstm.close();
		} catch (SQLException e) {
			this.setCode(-1);
			this.setMessage(e.getMessage());
		} catch (Exception e) {
			this.setCode(-1);
			this.setMessage("Error en el proceso, intentelo de nuevo.");
		}finally{
			try {
				cn.close();
			} catch (Exception e) {
			}
		}
		return empDto;
	}
}
