//Makai 
//Company: techyaluna
//Lang: Java
//gitHub: microEvan

public class Bus {
    private int numberOfPassangers;

    // getter
    public int getNumberOfPassangers() {
        return numberOfPassangers;
    }

    // setter
    public void setNumberOfPassangers(int numberOfPassangers) {
        this.numberOfPassangers = numberOfPassangers;
    }

    // Calculate seats remaining
    public void remainingSeats() {
        int remainingSeats = getNumberOfPassangers() - 50;
        if(remainingSeats >= 50 ){
            setNumberOfPassangers(remainingSeats);
            remainingSeats();
        }else{
          System.out.println("There are "+ remainingSeats +" seats left empty");  
        }
    }
}
