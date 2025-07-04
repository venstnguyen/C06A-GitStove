public enum Setting {
	OFF("---"),
	LOWHEAT("--+"),
	MEDIUMHEAT("-++"),
	HIGHHEAT("+++");

	private final String setting;

	Setting(String setting) {
		this.setting = setting;
	}

	public String toString() {
		return '[' + setting + ']';
	}
}