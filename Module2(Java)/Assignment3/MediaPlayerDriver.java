interface AudioPlayer{
	void playAudio();
}
interface VideoPlayer{
	void playVideo();
}
class MediaPlayer implements AudioPlayer,VideoPlayer{
	String song;
	String movie;
	
	MediaPlayer(String song,String movie){
		this.song=song;
		this.movie=movie;
	}
	
	public void playAudio(){
		System.out.println("Playing Audio: "+ song);
	}
	
	public void playVideo(){
		System.out.println("Playing Video: "+ movie);
	}
}

class MediaPlayerDriver{
	public static void main(String[]args){
		MediaPlayer content = new MediaPlayer("Shape of you","Inception");
		
		content.playAudio();
		content.playVideo();
	}
}