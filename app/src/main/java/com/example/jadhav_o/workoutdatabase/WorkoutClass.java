package com.example.jadhav_o.workoutdatabase;

/**
 * Created by jadhav_o on 26-09-2017.
 */

public class WorkoutClass {
    private int ID;
    private int Level;
    private String Workout_Name;
    public WorkoutClass()
    {

    }
    public WorkoutClass(int id,int level,String workout_name)
    {
        this.ID=id;
        this.Level=level;
        this.Workout_Name=workout_name;
    }

    public void setID(int id) {
        this.ID = id;
    }
    public void setLevel(int level) {
        this.Level = level;
    }

    public void setWorkout_Name(String name) {
        this.Workout_Name = name;
    }

    public int getID() {
        return ID;
    }
    public int getLevel() {
        return Level;
    }
    public String getWorkout_Name() {
        return Workout_Name;
    }
}
