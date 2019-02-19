/*Julio Arath Rosales Oliden
A01630738*/
public class Clock{
	private int hr,
		    min,
		    sec;

	public Clock(){
		hr=10;
		min=30;
		sec=00;
	}
	
	public Clock(int hr, int min, int sec){
		this.hr=hr;
		this.min=min;
		this.sec=sec;
	}

	public void setTime(int hr,int min, int sec){
		if(hr>=0 && hr<24){
			this.hr=hr;
		}else{
			this.hr=12;
		}
		if(min>=0 && min<60){
			this.min=min;
		}else{
			this.min=0;
		}
		if(sec>=0 && sec<60){
			this.sec=sec;
		}else{
			this.sec=0;
		}
	}
	
	/*
	public void setTime(int hr, int min, int sec){
		this.hr=hr;
		this.min=min;
		this.sec=sec;
	}
	*/
	
	public void printTime(){
		System.out.println(this.hr+":"+this.min+":"+this.sec);

	}
	
}

