package loopAssignment;

public class TankCapacity {

	int tankCapacity = 100;
	int bucketCapacity = 10;
	int numberOfBuckets;
	
	void fillWaterTank() {
		
		numberOfBuckets = tankCapacity/bucketCapacity;
		
		System.out.println("Number of buckets required to fill the tank is "+ numberOfBuckets);
		
		while(bucketCapacity <= tankCapacity)
		{
			
		if(bucketCapacity<=tankCapacity)
		{
			System.out.println("The quantity of water filled in tank is " +bucketCapacity);
			
			bucketCapacity += 10;
		}
		
			else
				System.out.println("Water will spill out");
			
		}
		
		}
		
	}

