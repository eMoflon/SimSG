package SimSG.Core.Persistence;

public enum PersistenceManagerEnum {
	SimplePersistence("SimplePersistence");
	
	private String name;
	private PersistenceManagerEnum(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
}
