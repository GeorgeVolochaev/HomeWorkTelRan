package homework7;

import homework7.athletes.AthleteInf;
import homework7.athletes.Cat;
import homework7.athletes.Man;
import homework7.athletes.Robot;
import homework7.barriers.Barrier;
import homework7.barriers.RunningTrack;
import homework7.barriers.Wall;

public class HomeW7 {

    public static void main(String[] args)
    {
        AthleteInf[] athletes = new AthleteInf[4];
        athletes[0] = new Cat(150,2, "Cat1");
        athletes[1] = new Cat(250,2, "Cat2");
        athletes[2] = new Man(300,1, "Man1");
        athletes[3] = new Robot(150,3,"Robot1");

        Barrier[] barriers = new Barrier[3];
        barriers[0] = new Wall(2,"Wall1");
        barriers[1] = new RunningTrack(200,"RunningTrack1");
        barriers[2] = new RunningTrack(200,"RunningTrack2");

        for (AthleteInf athlete : athletes) {
            String classNameBarr;
            System.out.println("-----------------------------------------------");
            int i = 0;
            boolean runResult=true, jumpResult=true;
            while (i<barriers.length && runResult && jumpResult) {
                classNameBarr = barriers[i].getClass().getSimpleName();
                if (classNameBarr.equals("RunningTrack")) {
                    runResult = athlete.ranSuccessfully(barriers[i]);
                    System.out.println(athlete + " ran " + barriers[i] + ((!runResult) ? " not successfully" : " successfully" + ""));
                }
                else if (classNameBarr.equals("Wall")) {
                        jumpResult = athlete.jumpedSuccessfully(barriers[i]);
                        System.out.println(athlete + " jumped " + barriers[i] + ((!jumpResult) ? " not successfully" : " successfully" + ""));
                }
                i++;
            }
        }
    }
}