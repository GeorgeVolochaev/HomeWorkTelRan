package homework7.barriers;

public abstract class Barrier {
    private int lengthBarrier;
    private final String nameBarrier;

    public int getLengthBarrier() {
        return lengthBarrier;
    }

    public String getNameBarrier() {
        return nameBarrier;
    }

    public void setLengthBarrier(int lengthBarrier) {
        this.lengthBarrier = lengthBarrier;
    }

    public Barrier(int lengthBarrier, String nameBarrier) {
        this.lengthBarrier = lengthBarrier;
        this.nameBarrier = nameBarrier;
    }

    @Override
    public String toString() {
        return nameBarrier;
    }
}
