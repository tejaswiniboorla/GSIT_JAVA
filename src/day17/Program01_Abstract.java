package day17;

abstract class Rating
{
	int rate;
	abstract void setRate();
	
}

	class DroneRating extends Rating
	{
		void setRate()
		{
			this.rate=3;
		}
	}
public class Program01_Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DroneRating obj=new DroneRating();
		obj.setRate();
		System.out.println(obj.rate);

	}

}
