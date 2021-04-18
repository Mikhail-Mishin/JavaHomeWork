package JavaHomeWork.Core.Lesson1HW;

public abstract class Members implements Run.Runing, Jump.jumping {
    private String name;
    private float maxRun;
    private float maxJump;

    Members(String name, float maxRun, float maxJump){

    }

    String getName() {
        return this.name;
    }

    float getMaxRun() {
        return this.maxRun;
    }

    float getMaxJump() {
        return this.maxJump;
    }

    @Override
    public void run(){
        System.out.println(name + "Пробежал ");
    }

    @Override
    public void jump(){
        System.out.println(name + "Прыгнул на");
    }




}
class Cat extends Members {


    Cat(String name, float maxRun, float maxJump){
        super(name, maxRun, maxJump);

    }





}
class Human extends Members {

    Human(String name, float maxRun, float maxJump) {
        super(name, maxRun, maxJump);

    }

}
class Robot extends Members {

    Robot(String name, float maxRun, float maxJump) {
        super(name, maxRun, maxJump);


    }

}