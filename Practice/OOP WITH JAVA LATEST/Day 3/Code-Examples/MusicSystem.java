
public class MusicSystem {
	private String manufacturer;
	private String soundEffect;
	public MusicSystem() {
		manufacturer = "Panasonic";
		soundEffect = "Mono";
	}
	public MusicSystem(String manufacturer, String soundEffect) {
		this.manufacturer = manufacturer;
		this.soundEffect = soundEffect;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getSoundEffect() {
		return soundEffect;
	}
	public void setSoundEffect(String soundEffect) {
		this.soundEffect = soundEffect;
	}

}
