package program_17_carpet;

public class Floor {
    double width;
    double lenght;

    public Floor(double width, double lenght){
        if(width < 0){
           this.width = 0;
        }else {
            this.width = 0;
        }
        if(lenght < 0){
            this.lenght = 0;
        }else {
            this.lenght = lenght;
        }
    }
    public double getArea(){

        return this.width * this.lenght;
    }

}
