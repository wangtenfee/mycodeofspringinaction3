package _2wiringbean.sia.local;

import java.util.Map;

public class OneManBandMap implements Performer{

	private Map<String,Instrument> instrumentMap;
	
	
	public void setInstrumentMap(Map<String, Instrument> instrumentMap) {
		this.instrumentMap = instrumentMap;
	}


	@Override
	public void perform() {
		System.out.println("OneManBandMap.perform()");
		for (String key : instrumentMap.keySet()) {
			System.out.println(key +":");
			instrumentMap.get(key).play();
		}
	}

}
