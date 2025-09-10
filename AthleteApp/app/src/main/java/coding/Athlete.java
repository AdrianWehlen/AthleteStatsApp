package coding;
public class Athlete{

    private String name;
    private int age;
    private int weight; 
    private int height;
    private double bmr;
    private double bmi;
    private int maxHR;

    public Athlete(String name,int age,int weight, int height){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height= height;
        this.bmr= 0;
        this.bmi= 0;
        this.maxHR=0;


    }

    public int getmaxHR(){
        return maxHR;
    
    }
    public int getAge() {
        return age;
    }

    public String getName(){
        return this.name;
    }

    public int getWeight(){
        return this.weight;
    }

    public int getHeight(){
        return this.height;
    }

    public double getBmr(){
        return bmr;
    }

    public double getBmi(){
        return bmi;
    }

    public void setAge(int age){
        this.age= age;

    }

    public void setName(String name){
        this.name = name;
    }

    public void setWeight(int weight){
        this.weight = weight;
        
    }

    public void setHeight(int height){
        this.height = height;
    }

    public void setBmr(double bmr){
        this.bmr = bmr;
    }

    public void setBmi(double bmi){
        this.bmi= bmi;
    }

    public void setMaxHR(int maxHR){
        this.maxHR= maxHR;
    }
 }
