/** 
*The purpose of this class is to model a television
*Your name and today’s date
*/

public class Television {
	final String MANUFACTURER;//hold the brand name.
	final int SCREEN_SIZE;//hold the size of the television screen.
	boolean powerOn;//hold the value true if the power is on, and false if the power is of.
	int channel;//hold the value of the station that the television is showing.
	int volume;//represent the loudness (0 being no sound)
	
	/**
	 * 
	 * @param manufact
	 * @param size
	 */
	public Television (String manufact, int size) {
		MANUFACTURER = manufact;
	    SCREEN_SIZE = size;
		powerOn = false;
		volume = 20;
		channel = 2;
	}
	/**
	 * 
	 * @return volume.
	 * 
	 */
	public int getVolume() {
		return this.volume; 
	}
	
	/**
	 * 
	 * @return channel
	 */
	public int getChannel() {
		return this.channel;
	}
	
	/**
	 * 
	 * @return MANUFACTURER
	 */
	public String getManufacturer() {
		return this.MANUFACTURER;
	}
	
	/**
	 * 
	 * @return SCREEN_SIZE
	 */
	public int getScreenSize() {
		return this.SCREEN_SIZE;
	}
	
	/**
	 * 
	 * @return channel
	 */
	public int setChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel=channel;
	}
	
	
	public void power() {
		this.powerOn = !this.powerOn;
	}
	
	public void increaseVolume() {
		volume++;
	}
	public void decreaseVolume() {
		volume--;
	}
	
	

}
