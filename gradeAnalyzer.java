import java.util.ArrayList;

	public class GradeAnalyzer{

    public GradeAnalyzer(){
    }   //creating object


public int getAverage(ArrayList<Integer> grades){ //creating method

  if (grades.size() < 1) { //checking to make sure there is a grade
    System.out.println("Error no grade");

      return 0;
  }
  else{ //getting total
    int sum = 0;
    for (int grade : grades){
      sum = sum + grade;

    }
    int average;
    int size = grades.size();
    average = sum / size; //getting average
    System.out.println("The average of your grades is " + average);

    return average;
  }
}


    public static void main(String[] args){
      GradeAnalyzer myAnalyzer = new GradeAnalyzer();
      ArrayList<Integer> myClassroom = new ArrayList<Integer>();
      myClassroom.add(98);
      myClassroom.add(92);
      myClassroom.add(88);
      myClassroom.add(75);
      myClassroom.add(61);
      myClassroom.add(81);
      myClassroom.add(95);

      myAnalyzer.getAverage(myClassroom);




  }
  }

