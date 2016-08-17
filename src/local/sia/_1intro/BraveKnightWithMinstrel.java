package local.sia._1intro;

public class BraveKnightWithMinstrel implements Knight{

	private Quest quest;
	
	private Minstrel minstrel;
	
	public BraveKnightWithMinstrel(Quest quest,Minstrel minstrel) {
		this.quest = quest;
		this.minstrel = minstrel;
	}
	
	@Override
	public void embarkonQuest() throws QuestException {
		minstrel.singBeforeQuest();
		quest.embark();
		minstrel.singAfterQuest();
	}

}
