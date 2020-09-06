//
//public class Statistics {
//   private int count;
//   private int sum;
//    public void addNumber(int number){
//        count++;
//        sum = sum + number;
//    }
//    
//    public int getCount(){
//        return this.count;
//    }
//    
//    public int sum(){
//        return this.sum;
//    }
//    
//    public double average(){
//        if (this.count == 0) {
//            return 0.0;
//        }else{
//            return this.sum / (double)count;
//        }
//    }
//}

public class Statistics {
    private int count=0;
    private int sum=0;
    
 
    public Statistics() {
       
    }
 
    
   
    public void addNumber(int number){
        
        
        
        sum=sum+number;
        count++;
    
    }
    
    
     
    public int getCount(){
        
        return count;
        
    }
    public int sum(){
        
        return sum;
    }
    
    public double average(){
        if(count==0){
            return 0;
        }
        
        return (double)sum/count;
    }
    
    
}
 