/*
 * Get java, Problem 7-1-2
 * Marbles
 */

class MarbleUser {
	int m_cnt;
	
	public MarbleUser(int m) { // 생성자
		m_cnt = m; // 처음 구슬의 갯수
	}
	public void getMarbles(MarbleUser child, int m) { // 상대로 부터 구슬을 얻는 메소드
		m_cnt += m;
		child.lossMarbles(m);
	}
	public void lossMarbles(int m) { // 상대에게 구슬을 주는 메소드
		m_cnt -= m;
	}
	public void showMarbles() { // 현재 구슬의 갯수를 보여주는 메소드
		System.out.println("현재 보유 구슬의 갯수 : " + m_cnt);
	}
}
public class P7_1_2 {

	public static void main(String[] args) {
		MarbleUser f_child = new MarbleUser(15); // 첫번째 어린이 구슬 15개
		MarbleUser s_child = new MarbleUser(9); // 두번째 어린이 구슬 9개
		
		f_child.getMarbles(s_child, 2); // 첫 번째 어린이가 두 번째 어린이의 구슬 2개를 획득
		System.out.print("첫 번째 어린이의 ");
		f_child.showMarbles();
		System.out.print("두 번째 어린이의 ");
		s_child.showMarbles();
		
		s_child.getMarbles(f_child, 7);
		System.out.print("첫 번째 어린이의 ");
		f_child.showMarbles();
		System.out.print("두 번째 어린이의 ");
		s_child.showMarbles();
	}

}
