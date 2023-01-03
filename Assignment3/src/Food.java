//super class also known as parent class

abstract class Food implements Payment
{
  //variables for Food class
  protected int type;
  
  //constructor
  public Food(int type, int cost){ //variables type and cost 
	this.type = type;
  }
 
  //setter of type
  public void type(int type){
    this.type = type;
  }

  //getter of type
  public int getType(){
    return type;  
  }

  
  public abstract //getter, but still it is an empty calculateCost 
  int calculateCost();
  
  //calculateCost setter
  public void setCost(int cost){
  }

  public int calculateCost(int[] costs) {
		// TODO Auto-generated method stub
	return 0;
  }



  
}