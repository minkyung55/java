package maps;

// DTO라는 클래스를 만들었음, 다른 곳에서 사용가능! (물론 내 이클립스에서만 가능)
// 많은데이터들은 하나에 데이터에 담겠다! 
//Data Transfer Object or Value Object

//DTO는 클래스를 만들고 수정이 가능하게 / VO는 수정이 안되게 만듬 - 그이유는 DTO는 중간에 다른 사람이 변경할 수 있기 때문에  
//예전에는 DTO  요즘은 VO를 많이 씀 - 비대면으로 재택이 많아져서 의사소통이 어렵기 때문에

public class DTO {
	private String id;
	private String pw;
	private String name;
	private int num;
	private boolean black; // 블랙
	private double distance; //배달의 거리
		
	// Alt + Shift + s
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public boolean isBlack() {
		return black;
	}
	public void setBlack(boolean black) {
		this.black = black;
	}
	public double getDistance() {
		return distance;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}
	
	
	
	}

