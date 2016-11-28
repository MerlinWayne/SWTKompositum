import java.util.ArrayList;

public abstract class Component {

	private ArrayList<File> files = new ArrayList<File>();
	private ArrayList<Directory> directories = new ArrayList<Directory>();
	
	
	public ArrayList<File> getFile(){
		return files;
	}
	
	public ArrayList<Directory> getDirectory(){
		return directories;
	}
	
	public void insertDirectory(Directory directory){
		directories.add(directory);
	}
	
	public void insertFile(File file){
		files.add(file);
	}
	
	public void removeDirectory(Directory directory){
		directories.remove(directory);		
	}
	
	public void removeFile(File file){
		files.remove(file);
	}

}
