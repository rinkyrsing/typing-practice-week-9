package program_20_pool;

public class Cuboid extends Rectangle{
    double height;

    public Cuboid(double width, double lenght, double height){
        super(width, height);
        this.height = height;
        if(this.height < 0){
            this.height = 0;
        }
    }
    public double getHeight(){
        return this.height;
    }
    public double getVolume(){
        return (getArea() * getHeight());
    }
}
