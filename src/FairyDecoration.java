
public class FairyDecoration extends XmasDecoration {
	private Plain decoratee;
	private String name;
	
	FairyDecoration(Plain decoratee) {
		this.decoratee = decoratee;
		set_name("Fairy");
	}
	
	public String get_name() {
		return this.decoratee.get_name() + this.name;
	}
	
	public void set_name(String name) {
		this.name = name;
	}
}
