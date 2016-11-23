
public class File {
	
	private String name;
	
	public File(String n){
		this.name = n;
	}
	
	public void insert(String n){
		File file = new File(n);
		System.out.println("file " + n + " created!");
	}
	
	
	public void removeFile(File file){
		file = null;            //the garbage collector will remove the obj. if they are no other references!
	}
	
	public String getFile(){
		return name;
	}

}
