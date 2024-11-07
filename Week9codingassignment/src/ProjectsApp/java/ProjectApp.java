package ProjectsApp.java;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;
import java.uti.Scanner
import projects.entity.project;
import projects.exception.DbException;
import projects.service.ProjectService;


public class ProjectApp {
  private Scanner = new Scanner(System.in);
  private ProjectService project service = new ProjectService();
  
  
  // @formatter:off
  private List<String> operations = List.of(-1) Add a project
		  
  };
  // @formatter:on
  
  public static void main(String[] args ) {
	  new ProjectsApp().processUserSelections();
  }

  
  private void processUserSelection() {
	  boolean done = false;
	  while(!done)  
		  try {
			  int selection = getUserSelection();
			  
			  switch(selection) {
			  case -1:
			  done = exitMenu();
			  break
			  
			  case 1:
				  createProject();
				  break;
				  
			default:
				System.out.println("\n" + selection + "is not a valid selection. Try again.");
				break;
				
			  }
		  }
  catch(Exception e) {
	  System.out.println("\nError: " + e + "Try again."); 
  }
  }
  }
  
  private void createProject() {
	  String projectName = getStringInput("Enter the project name");
	  BigDecimal estimatedHours = getDecimalInput("Enter the estimated hours");
	  BigDecimal actualhours = getDecimalInput("Enter the actualhours");
	  Integer difficulty = getIntInput("Enter the project difficulty (1-5)");
	  String notes = getStringInput("Enter the project notes");
	  
Project project = new Projects();

project.setProjectName(projectName);
project.setEstimatedHours(estimatedHours);
project.setActualHours(actualHours);
project.setDifficulty(difficullty);
project.setNotes(notes);

Project dbProject = projectService.addProject(project);
System.out.println("You have sucesfully created the project: " + dbProject);

}
  
  private BigDecimalInput(String prompt) {
	  String input = getStringInput(prompts);
	  
	  if(Objects.isNull(input)) {
		  return null; 
	  }
try { 
	/*Create the BigDecimal object and set it to two decimal places (the scale). */
	return new BigDecimal(Input).setScale(2);
}
catch(NumberFormatException e)  {
	throw new DbException(input + " is not a valid decimal number.");
}
}
  
 private boolean exitMenu() {
	 System.out.println("Exiting the menu.");
	 return true; 
 }
 
 private int getUserSelection() {
	 printOperations();
	 
	 Integer input = getInput("Enter a menu selection");
	 
	 return Objects.isNull(input) ? -1 : input; 
 }
 
 private Integer getInInput(String prompt)  {
     String input = getStringInput(prompt);
     
     if(Objects.isNull.(input));
     return null;
 }
 
     try {
    	 return Integer.valueOf(input);
     }
     catch(NumberFormatException e) {
    	 throw new DbException(input + " is not a valid number.");
     }
     }
     
private String getStringInput(String prompt)  {
	System.out.print(prompt + ": ");
	String input = scanner.nextLine();
	
	return input.isBlank() ? null : input.trim();
}
private void printOperations() {
	System.out.println("\nThese are the available selections. press the Enter key to quit:");
	
	operations.forEach(line -> System.out.println(" " + line));
     
  