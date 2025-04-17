package Assignment_02;

public class Floor {
	private float length;
	private float width;
	private float fArea;
	
	public Floor(float le,float wi)
	{
		length=le;
		width=wi;
		
	}
	
	public float FlArea()
	{
		fArea=length*width;
		
		return fArea;
	}
	
	

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public float getfArea() {
		return fArea;
	}

	public void setfArea(float fArea) {
		this.fArea = fArea;
	}

	public void TotalTiles(Tile tl) {
		System.out.println("Total Tiles is :->"+String.format( "%.2f",(FlArea()/tl.AreaT())));
		
	}
	
	
	
	
	
	

}
