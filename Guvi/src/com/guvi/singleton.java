class Singleton {
    
    // Step 1: Create a private static final instance/object of the Singleton class
    private static final Singleton instance = new Singleton();
    
    // Step 2: Make the constructor private to prevent instantiation
    private Singleton() {}
    
    // Step 3: Provide a public static method to access the instance
    public static Singleton getInstance() {
        return instance;
    }
    
    // Example method to demonstrate Singleton behavior
    public void showMessage() {
        System.out.println("Hello from Singleton!  method1>>");
    }
	
	public void showMessage1() {
        System.out.println("Hello from Singleton!  method 2");
    }
    
    public static void main(String[] args) {
        // Access the Singleton instance
        Singleton singleton = Singleton.getInstance();
        
        // Call a method on the Singleton instance
        singleton.showMessage();
		 singleton.showMessage1();
		
    }
}