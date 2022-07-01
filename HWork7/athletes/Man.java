package homework7.athletes;

import homework7.barriers.Barrier;

public  class Man implements AthleteInf {
    private final int limitRun;
    private final int limitJump;
    private final String objName;

    public Man(int limitRun, int limitJump, String objName) {
        this.limitRun = limitRun;
        this.limitJump = limitJump;
        this.objName = objName;
    }

    @Override
    public boolean ranSuccessfully(Barrier b) {
        return b.getLengthBarrier() <= limitRun;
    }
    @Override
    public boolean jumpedSuccessfully(Barrier b) {
        return b.getLengthBarrier() <= limitJump;
    }

    @Override
    public String toString() {
        return objName;
    }
}
