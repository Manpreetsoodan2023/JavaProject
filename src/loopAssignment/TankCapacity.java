package loopAssignment;

import java.util.Scanner;

public class TankCapacity {
	Scanner sc = new Scanner(System.in);
	int tankCapacity;
	int bucketCapacity;
	int numberOfBuckets;
	
	void fillWaterTank() {
		
		System.out.println("Enter bucket capacity in litres");
		bucketCapacity = sc.nextInt();
		
		while(tankCapacity <= 100 - bucketCapacity)
			
		{
			tankCapacity += bucketCapacity;
			
		if(bucketCapacity<=tankCapacity)
		{
			System.out.println("The quantity of water filled in tank is " +tankCapacity);
			
		}
		
			else
				System.out.println("Water will spill out");
			
		}
		
		}
		
	}

