import java.util.ArrayList;

public class File {
	
	private String name;
	private ArrayList<File> files = new ArrayList<File>();
	
	public File(String n){
		this.name = n;
	}
	
	public void insertFile(String n){
		File file = new File(n);
		files.add(file);
		System.out.println("file " + n + " created!");
	}
	
	
	public void removeFile(File file){
		file = null;            //the garbage collector will remove the obj. if they are no other references!
	}
	
	public String getFile(){
		return name;
	}

}
