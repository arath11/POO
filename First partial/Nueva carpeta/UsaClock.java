public class UsaClock{
	
	public static void main(String[] args){
		Clock gda= new Clock(12,21,30);
		Clock cob= new Clock(11,21,30);
		Clock tij= new Clock(10,21,30);
		Clock ny= new Clock(13,21,30);
		gda.printTime();
		cob.printTime();
		tij.printTime();
		ny.printTime();	

		gda.setTime(1000,200,400);
		gda.printTime();
		cob.setTime(-300,-543,-200);
		tij.setTime(30,-234,347);
		ny.setTime(-543,435,1);
		
	}	

}