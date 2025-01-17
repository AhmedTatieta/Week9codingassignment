package project.dao;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sqlPreparedStatement;
import java.sql.SQLException;
import projects.entity.projects;
import projects.exception.DbException;
import provided.util.DaoBase; 




public class ProjectDao  extends DaoBase {
private static final String CATEGORY_TABLE = "category";
private static final String MATERIAL_TABLE = "material";
private static final String PROJECT_TABLE = "project";
private static final String PROJECT_CATEGORY_TABLE = "project_category";
private static final String STEP_TABLE = "step";


public Project insertProject(Project project) {
	
	String sql = ""
		+ "INSERT INTO " + PROJECT_TABLE + " "
		+ "(project_name, estimated_hours, actual_hours, difficulty, notes) "
		+ "VALUES "
		+ "(?, ?, ?, ?, ?)"; 
	
	try(Connection com = DbConnection getConnection()) {
		startTransaction(conn);
		
		try(PreparedStatement stmt = conn.prepareStatement(sql)) {
			setParameter(stmt, 1, project.getProjectName(, String.class);
			setParameter(stmt, 2 project.getEstimatedHours(), BigDecimal.class);
			setParameter(stmt, 3 project.getActualHours(), BigDecima.class);
			setParameter(stmt, 4 project.getDifficulty(), Integer.class);
			setParameter(stmt, 5 project.getNotes(), Stringg.class);
			
			stmt.executeUpdate();
			
			Integer projecteId = getLastInsertId(conn, PROJECT_TABLE);
			commitTransaction(conn);
			
			project.setProjectId(projectId);
			return project;
		}
		catch(Exception e) {
			rollbackTransaction(conn);
			throw new DbException(e); 
		}
	 }
	 catch(SQLException e) {
		 throw new DbException(e);
	 }
  }
}
