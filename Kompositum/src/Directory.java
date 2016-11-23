
public class Directory {
	
	private String name;
	
	public Directory(String n){
		this.name = n;
	}
	
	public void insert(String name){
		Directory directory = new Directory(name);
		System.out.println("directory " + name + " created!");
	}
	
	public void removeDirectory(){
		//toDo
	}
	
	public String getDirectory(){
		return name;
	}

}
