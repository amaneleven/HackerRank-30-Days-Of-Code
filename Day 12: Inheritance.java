//write this after print data section and before solution class 👇🏻

class Student extends Person {
    private int[] testScores;

   
    public Student(String firstName, String lastName, int id, int [] scores) {
        super(firstName, lastName, id);
        testScores = scores;
    }

   
    public char calculate() {
        double average = 0;
        for (int score : testScores) {
            average += score;
        }
        average /= testScores.length;
      
//Author : AmanEleven
//Follow : All Personal and Professional Links Here -->  https://linktr.ee/amaneleven
        
        if  (average >= 90) {
            return 'O';
        } else if (average >= 80) {
            return 'E';
        } else if (average >= 70) {
            return 'A';
        } else if (average >= 55) {
            return 'P';
        } else if (average >= 40) {
            return 'D';
        } else {
            return 'T';
        }
    }
}
