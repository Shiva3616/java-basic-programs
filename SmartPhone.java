package interfaces_com;

public class SmartPhone implements Camera, MusicPlayer {
	public void takePhoto() {
		System.out.println("hello");
	}
	
	public void playmusic() {
		System.out.println("world");
	}

}
