package proffision;

public class ReportCard {
    private String stuName;
    private Subject[] subArray;

    public String getStuName() {
        return stuName;
    }
    public void setStuName(String stuName) {
        this.stuName = stuName;
    }
    public Subject[] getSubArray() {
        return subArray;
    }
    public void setSubArray(Subject[] subArray) {
        this.subArray = subArray;
    }
    
    public ReportCard(String name,int num){
        this.stuName = name;
        this.subArray = new Subject[num];
    }
    
    public double average(){
        double average = 0;
        for(int i = 0;i < this.subArray.length;i++){
            average += this.subArray[i].getGrade();
        }
        average = average / this.subArray.length;
        return average;
    }

    public boolean isExcellent(){
        boolean goodStudent;
        if (average() >= 85) {
            goodStudent = true;
        }
        else{
            goodStudent = false;
        }
        return goodStudent;
    }

    public void PrintExcellent(ReportCard[] classCards){
        for(int i = 0;i < classCards.length;i++){
            if (classCards[i].isExcellent()) {
                System.out.println(classCards[i].getStuName());
            }
        }
    }
    
}
