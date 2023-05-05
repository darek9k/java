package darek9k.shapes;

public abstract class Shape {
    private int x;
    private int y;

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


    //Applies to an inheriting class.
    //private - the inheriting class never has access.
    //protected - always has access.
    //public - always has access.
    //package accesses - has only in the same package.

    //For the class I want to use.
    //private - the inheriting class is never allowed.
    //protected - has access if in the same package, not in another.
    //public - always has access.
    //package accesses - has only in the same package.
    public void myPosition(){
        System.out.println("Moja pozycja to x="+x+ ", y="+y);
    }

    public void description(){
        shapeDetails();
        myPosition();

    }
    public abstract void shapeDetails();
}
