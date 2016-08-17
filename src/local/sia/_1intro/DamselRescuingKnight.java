package local.sia._1intro;

public class DamselRescuingKnight implements Knight{

	private RescueDamselQuest rescueDamselQuest;
	
	public DamselRescuingKnight() {
		this.rescueDamselQuest = new RescueDamselQuest();
	}
	
	@Override
	public void embarkonQuest() throws QuestException {
		rescueDamselQuest.embark();
	}

}
