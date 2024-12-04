public class Main {    

public static void main(String[] args) throws InterruptedException {        String fruitList = "Banana Orange Pineapple Cherry";         
String fruits[] = fruitList.split(" ");        
int maxLength =0;        
String maxLengthWord = null;        

for(int i=0; i<fruits.length; i++){            if( fruits[i].length() %2==0  && fruits[i].length() > maxLength {                 

maxLengthWord = fruits[i];                                 
maxLength = fruits[i].length();           
  }         
}         
System.out.println("Maximum Even Length Word ---: " + maxLengthWord + " :" + maxLength);    
 } 
}