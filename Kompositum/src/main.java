
public class main {

	public static void main(String args[]) {
		
		
		Directory directory1 = new Directory("directory1");
		Directory directory2 = new Directory("directory2");
		Directory directory3 = new Directory("directory3");
		
		File file1 = new File("file1");
		File file2 = new File("file2");
		File file3 = new File("file1");
		File file4 = new File("file4");
		File file5 = new File("file5");
		
		directory1.insertFile(file1);
		directory1.insertDirectory(directory2);
		directory2.insertFile(file2);
		directory2.insertDirectory(directory3);
		directory3.insertFile(file3);
		directory3.insertFile(file4);
		directory3.insertFile(file5);
		
		System.out.println(directory1);
		
		
		
	}

}
