public class Samsung implements Radio,Camera,Maps{

	@Override
	public void scanStation() {
		System.out.println(" Scanning the Station...");
		
	}

	@Override
	public void playStation() {
		System.out.println(" Playing the sattion...");
		
	}

	@Override
	public void captureImage() {
		System.out.println(" capturing the Image ...");
		
	}

	@Override
	public void showImage() {
		System.out.println(" showing the Image...");
		
	}

	@Override
	public void showMaps() {
		System.out.println(" showing Maps....");
		
	}
     
}