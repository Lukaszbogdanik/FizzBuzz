package fizzbuzz;

public class FizzBuzz {

    private Integer countTo;
    private Integer countFrom;
    
    public FizzBuzz(Integer countFrom, Integer countTo) {
        
        if (countFrom == null || countTo == null ) {
            throw new IllegalArgumentException("The Values can not be NULL"); //wartość nie może być NULL
	}	
                
        if (countTo != 100 || countFrom !=1) {
            throw new IllegalArgumentException("We count 1 - 100"); //liczymy od 1 do 100
        }
        this.countFrom = countFrom;
        this.countTo = countTo;
    }

    
    public Integer getCountTo() {
        
        return countTo;
        
    }
    
    
    public Integer getCountFrom(){
        
        return countFrom;
        
    }
    
    public Integer getCurrentInt(int number) {
        
        return number;
        
    }
    
    public String returnFizz(){
        
        return "Fizz";
        
    }
    
    public String returnBuzz(){
        
        return "Buzz";
        
    }
    
    public String returnFizzBuzz(){
        
       return "FizzBuzz";
       
    }
    
    
    public String getValue(Integer number){
        
        StringBuilder sb = new StringBuilder();
        
        if ( (number % 3 == 0) && (number % 5 == 0) ) {
            sb.append(returnFizzBuzz());
            
        }
        else if (number % 3 == 0) {
            sb.append(returnFizz());
           
        }
        else if (number % 5 == 0) {
            sb.append(returnBuzz());
        }
        else {
            sb.append(String.valueOf(number));
        }
        
        return sb.toString();
        
    }
    
    public void doingFizzBuzzer(){
     
        for (int i = countFrom; i < countTo + 1; i++) {
            System.out.println(getValue(i));
        }
    
    }
    
    
}