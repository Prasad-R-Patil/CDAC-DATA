package Assignment_02;

public class Tile {
	private float lw;
	private float tArea;
	public Tile(float l)
	{
		lw=l;
	}
	
	public float AreaT()
	{
		tArea=lw*lw;
		
		return tArea;
	}

	public float getLw() {
		return lw;
	}

	public void setLw(float lw) {
		this.lw = lw;
	}

	public float gettArea() {
		return tArea;
	}

	public void settArea(float tArea) {
		this.tArea = tArea;
	}
	
	
	
	
}
