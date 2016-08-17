package local.sia._1intro;

public class BraveKnight implements Knight{

	private Quest quest;
	
	public BraveKnight(Quest quest) {
		this.quest = quest;
	}
	
	@Override
	public void embarkonQuest() throws QuestException {
		quest.embark();
	}
	
}
