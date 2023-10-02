
class ClassX {
	public void methodX() {
		System.out.println("No constructor defined. MethodX Writes Hello!");
	}
	public static void main(String args[]){
		ClassX obj = new ClassX(); 
		obj.methodX();
	}
}
