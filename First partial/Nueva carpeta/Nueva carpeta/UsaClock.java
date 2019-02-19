public class UsaClock{

	public static void main(String args[]){
		Clock gda= new Clock(12,21,30);
		Clock cob= new Clock(11,21,30);
		Clock tij= new Clock(10,21,30);
		Clock ny= new Clock(13,11,30);

		gda.printTime();
		cob.printTime();
		tij.printTime();
		ny.printTime();

		gda.setTime(1000,200,400);
		cob.setTime(-300,-543,-200);
		tij.setTime(30,-234,347);
		ny.setTime(-543,456,833);

		gda.printTime();
		cob.printTime();
		tij.printTime();
		ny.printTime();

		gda.setTime(12,10,30);
		gda.printTime();
		gda.incrementSeconds();
		gda.printTime();
		gda.incrementMinutes();
		gda.printTime();
		gda.incrementHours();
		gda.printTime();

		System.out.println(gda.equals(tij));
		//Clock zap=gda.getCopy();
		Clock zap=new Clock(12,41,30);
		System.out.println(gda.equals(zap));
		
		zap.makeCopy(gda);
		gda.printTime();
		zap.printTime();
		
		zap.setTime(23,58,59);
		zap.printTime();
		zap.incrementSeconds();
		zap.printTime();
		zap.incrementMinutes();
		zap.printTime();		
	}
}