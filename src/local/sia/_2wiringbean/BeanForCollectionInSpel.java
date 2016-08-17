package local.sia._2wiringbean;

public class BeanForCollectionInSpel implements Performer{
	private City chosenCity;//<property name="chosenCity" value="#{cities[2]}"/>
	private City chosenCity2; //<property name="chosenCity" value="#{cities[T(java.lang.Math).random() * cities.size()]}"/>
	private City chosenCity3; //<property name="chosenCity" value="#{cities['Dallas']}"/>
	private String accessToken;//<property name="accessToken" value="#{settings['twitter.accessToken']}"/>
	private String jdkHome;//<property name="homePath" value="#{systemEnvironment['HOME']}"/>

	public String getAccessToken() {
		return accessToken;
	}
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	public String getJdkHome() {
		return jdkHome;
	}
	public void setJdkHome(String jdkHome) {
		this.jdkHome = jdkHome;
	}
	public City getChosenCity() {
		return chosenCity;
	}
	public void setChosenCity(City chosenCity) {
		this.chosenCity = chosenCity;
	}
	public City getChosenCity2() {
		return chosenCity2;
	}
	public void setChosenCity2(City chosenCity2) {
		this.chosenCity2 = chosenCity2;
	}
	public City getChosenCity3() {
		return chosenCity3;
	}
	public void setChosenCity3(City chosenCity3) {
		this.chosenCity3 = chosenCity3;
	}
	
	@Override
	public void perform() {
		System.out.println("chosenCity.getName(): "+chosenCity.getName());
		System.out.println("this.chosenCity2.getName(): "+this.chosenCity2.getName());
		System.out.println("this.accessToken: "+this.accessToken);
		System.out.println("this.jdkHome: "+this.jdkHome);
	}
	
}
