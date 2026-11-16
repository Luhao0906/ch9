import java.util.Arrays;
public class stats {
public static void main(String[] args) {
	int count = 0;
    for (String arg : args){
		count++;
	}
	System.out.println("Count:" + count);
		
	int sum=0;
	for (String arg : args){
		sum+=Integer.parseInt(arg);
	}
	System.out.println("Sum:" + sum);
		
	int Min=Integer.MAX_VALUE;
	for (String arg : args){
		int value = Integer.parseInt(arg);
		if(value<Min)	Min=value;
	}
	System.out.println("Min:" + Min); 
    
	int Max=Integer.MIN_VALUE;
	for (String arg : args){
		int value = Integer.parseInt(arg);
		if(value>Max)	Max=value;
	}
	System.out.println("Max:" + Max); 
	
	double average= sum/count;
    System.out.printf("average: %.2f" , average); 
    System.out.println("");
    
    
    }
}
