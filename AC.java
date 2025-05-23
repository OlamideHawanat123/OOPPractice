public class AC{ 

	private String name;
	private boolean isOn;
	private int temperature = 16;

	public AC(String name){
		this.name = name;
	}


	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return this.name;
	}

	public void setIsOn(boolean isOn){
		this.isOn = isOn;
	}

	public boolean getIsOn(){
		return this.isOn;
	}

	public void setTemperature(int temperature){
		this.temperature = temperature;
	}

	public int getTemperature(){
		return this.temperature;
	}



	public void increaseTemperature(){
		if(!(this.isOn = false && temperature >= 30)) temperature++;
	
	}

	public void decreaseTemperature(){
		if(!(this.isOn = false && temperature <= 16)) temperature--;
	} 

	public void turnOnOrOff(){
		if(this.isOn == false){
		setIsOn(true);
	}

		else{
		setIsOn(true);
		}
		}

	public String toString(){
		return "Ac{"+
		"name '" + name +","+
		"isOn" + isOn +","+
		"temperature" + temperature +
		"}";
}
		

















}

