/*
 * Get java, Problem 7-1-1
 * define Triangle Class to save base and height 
 */
class Triangle {
	
	double base; // 전역변수
	double height;
	
	public Triangle() // 생성자
	{
		base = 1;
		height = 1;
	}
	
	public void changeValue(double b, double h) { // 밑변과 높이를 변경하는 메소드
		base = b;
		height = h;
	}
	
	public double triArea() { // 삼각형 넓이 계산하는 메소드
		return ( base * height ) / 2;
	}
}
public class P7_1_1 {

	public static void main(String[] args) {
		Triangle t = new Triangle(); // 인스턴스 생성
		double result = 0;
		
		t.changeValue(5, 7); // 삼각형의 밑변과 높이 할당
		result = t.triArea(); // 삼각형 넓이 할당
		
		System.out.println(result);
	}

}
