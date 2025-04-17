package Assignment04;

public  class Circle extends Processor {
	protected final float PI=3.14f;
	protected float area;
	
	public Circle(int data)
	{
		this.data=data;
	}
	@Override
	public void Process() {
		// TODO Auto-generated method stub
		
		area=PI*data*data;
		
	}
	
	public void showData()
	{
		System.out.println("Area of Circle is:->"+area);
	}

}
