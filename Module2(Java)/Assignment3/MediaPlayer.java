interface AudioPlayer{
	void playAudio(String song);
}
interface VideoPlayer{
	void playVideo(String movie);
}
class MediaPlayer implements AudioPlayer,VideoPlayer{
	String song;
	String movie;
	
	MediaPlayer(String song,String movie){
		this.song=song;
		this.movie=movie;
	}
	
	public void playAudio(String song){
		System.out.pritnln("Playing Audio: "+ song);
	}
	
	public void playVideo(String movie){
		System.out.pritnln("Playing Video: "+ movie);
	}
}

class MediaPlayerDriver{
	public static void main(String[]args){
		MediaPlayer audio = new MediaPlayer("Shape of you ");
		MediaPlayer video = new MediaPlayer("Inception");
		
		audio.playAudio();
		video.playVideo();
	}
}