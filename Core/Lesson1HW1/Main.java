package JavaHomeWork.Core.Lesson1HW1;

public class Main {

    public static void main (String[] args) {

        String memberInfo;
        String result;

        Team member1 = new Team("Team1","Vasya",10, 3);
        Team member2 = new Team("Team1","Kolya",12, 2);
        Team member3 = new Team("Team1","Petya",15, 2.5f);
        Team member4 = new Team("Team1","Ibragim",3, 0.3f);


        Team[] team1 = {member1, member2, member3, member4};

        Course course1 = new Course("First barrier", 10, 2);
        Course course2 = new Course("Second barrier", 12, 2.3f);

        Course[] courses = {course1, course2};


        for (int i = 0; i < team1.length; i++){
            memberInfo = team1[i].getTeamName() + " Name: " +team1[i].getMemberName() + ", max distance = " + team1[i].getMaxRun() + ", max jump height = " + team1[i].getMaxJump();
            getMemberInfo(memberInfo);
        }

        System.out.println("----------------------------------------------");

        for (int i = 0; i < team1.length; i++) {
            for (int j =0; j < courses.length; j++){
                result = team1[i].getMemberName() + " successfully overcomes " + courses[j].getBarrierName();

                if (team1[i].getMaxRun() < courses[j].getDistance() && team1[i].getMaxJump() < courses[j].getHeight())
                    result = team1[i].getMemberName() + " can't overcome " + courses[j].getBarrierName();
                getResult(result);
            }
        }
    }

    public static void getResult (String result) {
        System.out.println(result);
    }



    public static void getMemberInfo (String memberInfo){
        System.out.println(memberInfo);
    }
}
class Team {


    private String teamName;
    private String memberName;
    private float maxRun;
    private float maxJump;


    Team(String teamName, String memberName, float maxRun, float maxJump) {
        this.teamName = teamName;
        this.memberName = memberName;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    String getTeamName() {
        return this.teamName;
    }

    String getMemberName() {
        return this.memberName;
    }

    float getMaxRun() {
        return this.maxRun;
    }

    float getMaxJump() {
        return this.maxJump;
    }
}

class Course {

    private String barrierName;
    private float distance;
    private float height;

    Course(String barrierName, float distance, float height){
        this.barrierName = barrierName;
        this.distance = distance;
        this.height = height;
    }

    String getBarrierName() {
        return this.barrierName;
    }
    float getDistance() {
        return this.distance;
    }
    float getHeight() {
        return this.height;
    }

}




