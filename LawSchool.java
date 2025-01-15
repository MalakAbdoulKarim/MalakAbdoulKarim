public class LawSchool extends EducationalInstitution {
public LawSchool(){
super(3);
}
public String graduationRequirements(){
return super.graduationRequirements() + " and passing the bar";
}
}
