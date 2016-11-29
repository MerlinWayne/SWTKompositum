import java.util.ArrayList;

public class Directory {
	
	protected String name;
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
		System.out.println(directory.name);
	}
	
		public void removeDirectory(Directory directory){
			if(directories.contains(directory)){
				directories.remove(directory);
			}
			else throw new MyException("sructure harmed !");		
	}
		
		
	
	public void removeFile(File file){
		if(files.contains(file)){
			files.remove(file);			
		}
		else throw new MyException("sructure harmed !");
	}

	public ArrayList<File> getFile(){
		return files;
	}
		
	public void insertFile(File file){
		files.add(file);	
		System.out.println(file.name);
	}
	

}
