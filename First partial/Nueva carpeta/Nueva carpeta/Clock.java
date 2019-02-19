//Julio Arath Rosales Oliden 
//A01630738
//Clock.java
//6/2/2019

public class Clock{
	private int hr,
		    min,
                    sec;
	private String cd;
	
	public Clock(){
		this(12,0,0,"Guadalajara");
	}

	public Clock(int hr, int min, int sec, String cd){
		this.setTime(hr,min,sec);
		this.cd=cd;
	}	

	public void setTime(int hr, int min, int sec){
		if(hr>=0 && hr<24){
			this.hr=hr;
	        }else{
		      this.hr=12;
		}
    
    		if(min>=0 && min<60){
		      this.min=min;
	        }else{
			this.min=00;
		}

 		if(sec>=0 && sec<60){
			this.sec=sec;
		}else{
			this.sec=00;
		}
	}

	public void setCiudad(String cd){
		this.cd=cd;
	}
	
	public String getCiudad(){
		return this.cd;
	}

	public void incrementHours(){
		this.hr=++this.hr%24;
	}

	public void incrementMinutes(){
		this.min=++this.min%60;
		if(this.min==0){
			incrementHours();
		}
	}

	public void incrementSeconds(){
		this.sec=++this.sec%60;
		if(this.sec==0){
			incrementMinutes();
		}
	}

	public boolean equals(Clock reloj){
		return this.hr==reloj.hr && this.min==reloj.min && this.sec==reloj.sec;
	}
	
	public void makeCopy(Clock reloj){
		this.hr=reloj.hr;
		this.min=reloj.min;
		this.sec=reloj.sec;
		//this.cd=reloj.cd;
	}

	public Clock getCopy(){
		return new Clock(this.hr,this.min,this.sec,this.cd);
	}		
	
	
	public String toString(){
		return "Ciudad: "+this.cd+"\nHora: "+this.hr+":"+this.min+":"+this.sec;
	}

	public void printTime(){
		System.out.println("Ciudad: "+this.cd+"hora:"+this.hr+":"+this.min+":"+this.sec);
	}

	/*
	public Clock(Clock reloj){
		this.hr=12;
		this.min=0;
		this.sec=0;
	}


	public Clock(int hr,int min, int sec){
		this.hr=hr; //con this hace referencia al atributo
		this.min=min;
	    this.sec=sec;
	}
	*/

}