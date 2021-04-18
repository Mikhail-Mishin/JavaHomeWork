package JavaHomeWork.Core.Lesson1HW;

public abstract class Barrier {


    private String barrierName;
    private float distance;
    private float height;

    Barrier(String barrierName, float distance, float height) {

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

class Racetrack extends Barrier {


    Racetrack(String barrierName, float distance, float height){
        super(barrierName, distance, height);
    }

}

class Wall extends Barrier {

    Wall(String barrierName, float distance, float height){
        super(barrierName, distance, height);
    }

}

