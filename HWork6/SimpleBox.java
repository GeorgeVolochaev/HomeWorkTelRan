public class SimpleBox<Param extends Number> {
    private Param obj;

    public SimpleBox(Param obj) {
        this.obj = obj;
    }

    public Param getObj() {
        return obj;
    }

    public void setObj(Param obj) {
        this.obj = obj;
    }

    public String getType(){
        return obj.getClass().getSimpleName();
    }
}
