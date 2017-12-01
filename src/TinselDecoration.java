
public class TinselDecoration extends XmasDecoration {
	private Plain decoratee;			/* the object we are decorating */
	private String name;
	
	TinselDecoration(Plain decoratee) {
		this.decoratee = decoratee;
		set_name(" Tinsel, ");
	}
	
	public String get_name() {
		return this.decoratee.get_name() + this.name;
	}
	
	public void set_name(String name) {
		this.name = name; 
	}
}
