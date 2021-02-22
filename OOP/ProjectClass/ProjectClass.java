import java.util.Set;
import java.util.ArrayList;


public class ProjectClass {
  private String description;
  private String name;


  public ProjectClass() {
    this.name = null;
    this.description = null;
   
  }

  public ProjectClass(String name) {
    this.name = name;
    this.description = null;
  
  }

  public ProjectClass(String name, String description) {
    this.name = name;
    this.description = description;
    
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setDesc(String description) {
    this.description = description;
  }

  public String getName() {
    return this.name;
  }

  public String getDesc() {
    return this.description;
  }

  public String elevatorPitch() {

    System.out.println(this.name + this.description);
    return getName() + getDesc();
  }
  
}