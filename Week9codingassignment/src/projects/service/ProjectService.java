package projects.service;

import projects.dao.ProjectDao;
import projects.entity.Project;


public class ProjectService { 
	private ProjectDao projectDao = ProjectDao();
	
	
public project addProject(Project project) {
	return projectdao.insertProject(project);
	
}

}
