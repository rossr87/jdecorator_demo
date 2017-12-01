
public class BaublesDecoration extends XmasDecoration {
	private Plain decoratee;			/* the object we are decorating */
	private String name;
	
	BaublesDecoration(Plain decoratee) {
		this.decoratee = decoratee;
		set_name(" Baubles, ");
	}
	
	public String get_name() {
		return this.decoratee.get_name() + this.name;
	}
	
	public void set_name(String name) {
		this.name = name;
	}
}
