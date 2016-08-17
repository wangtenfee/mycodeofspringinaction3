package local.sia._2wiringbean;


/*
 * @auther wtf
 * @function:2.3.2 Performing operations on SpEL values
 * 
 * */
public class BeanForSpelOperation implements Performer{

	private int adjustedAmount; //<property name="adjustedAmount" value="#{counter.total + 42}"/>
	private int adjustedAmount2;	//<property name="adjustedAmount2" value="#{counter.total - 20}"/>
	private int circumference; //<property name="circumference"  value="#{2 * T(java.lang.Math).PI * circle.radius}"/>
	private int average;//<property name="average" value="#{counter.total / counter.count}"/>
	private int remainder;//<property name="remainder" value="#{counter.total % counter.count}"/>
	private String fullName;//<property name="fullName"	value="#{performer.firstName + ' ' + performer.lastName}"/>
	private boolean equal;//<property name="equal" value="#{counter.total == 100}"/>
	private boolean hasCapacity;//<property name="hasCapacity" value="#{counter.total le 100000}"/>
	private boolean largeCircle;//<property name="largeCircle"	value="#{shape.kind == 'circle' and shape.perimeter gt 10000}"/>
	private boolean outOfStock;//<property name="outOfStock" value="#{!product.available}"/>
	private boolean outOfStock2;//<property name="outOfStock" value="#{not product.available}"/>
	private String song;//<property name="song" 	value="#{kenny.song != null ? kenny.song : 'Greensleeves'}"/>
	private String song2;//<property name="song" value="#{kenny.song ?: 'Greensleeves'}"/>
	private String validEmail;//<property name="validEmail" value="#{admin.email matches '[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.com'}"/>
	@Override
	public void perform() {
		System.out.println("this.adjustedAmount:"+this.adjustedAmount);
		System.out.println("this.adjustedAmount2:"+this.adjustedAmount2);
		System.out.println("this.circumference:"+this.circumference);
		System.out.println("this.average:"+this.average);
		System.out.println("this.remainder:"+this.remainder);
		System.out.println("this.fullName:"+this.fullName);
		System.out.println("this.equal:"+this.equal);
		System.out.println("this.hasCapacity:"+this.hasCapacity);
		System.out.println("this.largeCircle:"+this.largeCircle);
		System.out.println("this.outOfStock:"+this.outOfStock);
		System.out.println("this.outOfStock2:"+this.outOfStock2);
		System.out.println("this.song:"+this.song);
		System.out.println("this.song2:"+this.song2);
		System.out.println("this.validEmail:"+this.validEmail);		
		
		
	}
	public void setAdjustedAmount(int adjustedAmount) {
		this.adjustedAmount = adjustedAmount;
	}
	public void setAdjustedAmount2(int adjustedAmount2) {
		this.adjustedAmount2 = adjustedAmount2;
	}
	public void setCircumference(int circumference) {
		this.circumference = circumference;
	}
	public void setAverage(int average) {
		this.average = average;
	}
	public void setRemainder(int remainder) {
		this.remainder = remainder;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public void setEqual(boolean equal) {
		this.equal = equal;
	}
	public void setHasCapacity(boolean hasCapacity) {
		this.hasCapacity = hasCapacity;
	}
	public void setLargeCircle(boolean largeCircle) {
		this.largeCircle = largeCircle;
	}
	public void setOutOfStock(boolean outOfStock) {
		this.outOfStock = outOfStock;
	}
	public void setOutOfStock2(boolean outOfStock2) {
		this.outOfStock2 = outOfStock2;
	}
	public void setSong(String song) {
		this.song = song;
	}
	public void setSong2(String song2) {
		this.song2 = song2;
	}
	public void setValidEmail(String validEmail) {
		this.validEmail = validEmail;
	}
	
	
	
}
