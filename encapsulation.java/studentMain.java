
public class Student {
   private int rollno;
   private String name;
   private String branch;
   
   public void setStudent(int rollno,String name,String branch)
   {
	   this.rollno = rollno;
	   this.name = name;
	   this.branch = branch;
   }
   public void getStudent()
   {
	   System.out.println(" Roll Number is "+rollno);
	   System.out.println(" Name is "+name);
	   System.out.println(" Branch is "+branch);
   }
}