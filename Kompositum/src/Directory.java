import java.util.ArrayList;

public class Directory {
	
	private String name;
	private ArrayList<File> files = new ArrayList<File>();
	private ArrayList<Directory> directories = new ArrayList<Directory>();
	
	
	public Directory(String n){
		this.name = n;
	}
	

	
	public ArrayList<Directory> getDirectory(){
		return directories;
	}
	
	
	public void insertDirectory(Directory directory){
		directories.add(directory);
	}
	
		public void removeDirectory(Directory directory){
		directories.remove(directory);		
	}
		
		
	
	public void removeFile(File file){
		files.remove(file);
	}

	public ArrayList<File> getFile(){
		return files;
	}
		
	public void insertFile(File file){
		files.add(file);		
	}
	

}
