package local.sia._2wiringbean;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;


public class OneManBandProps implements Performer{

	private Properties instrumentProps;
	
	
	public void setInstrumentProps(Properties instrumentProps) {
		this.instrumentProps = instrumentProps;
	}


	@Override
	public void perform() {
        Iterator<Entry<Object, Object>> it = instrumentProps.entrySet().iterator();  
        while (it.hasNext()) {  
            Entry<Object, Object> entry = it.next();  
            Object key = entry.getKey();  
            Object value = entry.getValue();  
            System.out.println("key   :" + key);  
            System.out.println("value :" + value);  
            System.out.println("---------------");  
        }  		
	}

}
