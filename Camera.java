public class Camera{


	String brandName;
	float cameraPixel;
	int batteryCapacity;
	int price;
	String type;


	public Camera(){
		System.out.println("No param constructor of Camera");
	}


	public Camera(String brandName , float cameraPixel , int batteryCapacity , int price, String type){

		this.brandName = brandName;
		this.cameraPixel = cameraPixel;
		this.batteryCapacity = batteryCapacity;
		this.price = price;
		this.type = type;
	}


	public void cameraDetails(){

		System.out.println("Brand Name : " + brandName);
		System.out.println("camera Pixel: " + cameraPixel);
		System.out.println("Battery Capacity : " + batteryCapacity);
		System.out.println("price: " + price);
		System.out.println("type : " + type);

	}






	


}