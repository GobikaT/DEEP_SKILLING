class Logger{
	private static Logger instance;
	 private Logger() {
		System.out.println("Object created successfully");
	}
	 public static Logger getObject() {
		 if(instance==null) {
				instance=new Logger();
			}
		 return instance;
	 }
	 public static void log(String message) {
		 System.out.println("Log : "+message);
	 }
	
}


public class SingletonPattern {

	public static void main(String[] args) {
		Logger log1=Logger.getObject();
		Logger log2=Logger.getObject();
		Logger.log("Application started");
		Logger.log("User logged in ");
		if(log1==log2) {
			System.out.println("Both reference same object");
		}
		else {
			System.out.println("Both refers to different object");
		}
		

	}

}
