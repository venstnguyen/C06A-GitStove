public enum Setting {
	OFF ("---"),
	LOWHEAT ("--+"),
	MEDIUMHEAT ("-++"),
	HIGHHEAT ("+++");
	
	private String setting;
	
	Setting (String setting){
		this.setting = setting;
	}
	
	public String toString() {
		return setting;
	}
}
