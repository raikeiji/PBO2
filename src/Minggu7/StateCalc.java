package Minggu7;
public class StateCalc {
    private int count;
    private double sum;
    private double squaresum;
    
    public void enter(double num){
        count++;
        sum+=num;
        squaresum+=num*num;
    }

    public int getCount() {
        return count;
    }

    public double getSum() {
        return sum;
    }
    
    public double getMean(){
        return sum/count;
    }
    
    public double getstandardeviasi(){
        double mean=getMean();
        return Math.sqrt(squaresum/count-mean*mean);
    }
}
