package project.service;
import java.util.List;
import java.util.NoSuchElementException;

import project.dao.ProjectDao;
import project.entity.Project;
import project.exception.DbException;

public class projectService {
	private ProjectDao projectDao = new ProjectDao();
	
	public List<Project> fetchAllProjects() {
		return projectDao.fetchAllProjects();
		
	}	
	
	
	public Project fetchProjectById(Integer projectId) {
		return projectDao.fetchProjectbyID(projectId).orElseThrow( () -> new NoSuchElementException("Project with ID = " + projectId + " does not exist."));
	}
	

	public Project addProject(Project project) {
		
		return projectDao.insertProject(project);
		}


	public void modifyProjetDetails(Project project) {
		if(!projectDao.modifyProjectDetails(project)) {
			throw new DbException("Project with ID=" + project.getProjectId() + " does not exist");
		}
		
	}


	public void deleteProject(Integer projectId) {
		
		if(!projectDao.deleteProject(projectId)) {
			throw new DbException("Project with ID= " + projectId + " does not exist.");
		}
	}
	
	}






