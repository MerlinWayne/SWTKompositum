
public class File implements FileDoc {   //rename file
	
	protected String name;
	
	
	public File(String n){
		this.name = n;
	}
	
	@Override
	public void accept(Visitor visitor){
		visitor.visit(this);
	}
}
