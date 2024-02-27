import java.util.Arrays;
abstract class Student {
  int studentId;
  String studentName;
  abstract float calculateGrade();
  abstract void displayDetails();
  public static void main(String[] args) {
    
  }
}

class RegularStudent extends Student {
  int[] attendance;
  String[] assignments;
  float[] examScores;

  RegularStudent(int studentId, String studentName) {
    this.studentId = studentId;
    this.studentName = studentName;
  }

  float calculateGrade() {
    float temp = 0;
    for (int i = 0; i < this.examScores.length; i++) {
      temp += this.examScores[i];
    }
    return temp / this.examScores.length;
  }

  void displayDetails() {
    System.out.println("Student Id : " + this.studentId +
        "\nStudent Name : " + this.studentName);
  }
}

class HonorStudent extends Student {
  float projectScores, examScores[];
  int researchPapers;

  float calculateGrade() {
    float temp = 0;
    for (int i = 0; i < this.examScores.length; i++) {
      temp += this.examScores[i];
    }
    return temp / this.examScores.length;
  }

  void displayDetails() {
    System.out.println("Student Id : " + this.studentId +
        "\nStudent Name : " + this.studentName);
  }
}

class GradeManagementSystem {
  Student[] students;
  int[] studentsId;

  void add(int id) {
    if (Arrays.asList(studentsId).contains(id)) {
      System.out.println("Student Already Exists");
    } else {
      int[] newStudentsId = new int[this.studentsId.length + 1];
      for (int i = 0; i < this.studentsId.length; i++) {
        newStudentsId[i] = this.studentsId[i];
      }
      newStudentsId[newStudentsId.length - 1] = id;
      this.studentsId = newStudentsId;
      System.out.println("Student Has Been Added");
    }
  }

  void delete(int id){
    if (Arrays.asList(this.studentsId).contains(id)){
      System.out.println("Student Does not Exist");
    } else {
      int[] newStudentsId = new int[this.studentsId.length - 1];
      for(int i = 0; i < newStudentsId.length; i++){
        if(this.studentsId[i] != id){
          newStudentsId[i] = this.studentsId[i];
        }
      }
      this.studentsId = newStudentsId;
      System.out.println("Student Has Been Deleted");
    }
  }

  void display(Student x) {
    x.displayDetails();
  }
}
