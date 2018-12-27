package java31;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Test {
	JFrame jFrame = new JFrame("JTable 예제");

	String columnNames[] = { "상품번호", "상품이름", "상품가격", "상품설명" };

	Object rowData[][] = { 
			{ 1, "맛동산", 100, "오리온" }, 
			{ 2, "아폴로", 200, "불량식품" }, 
			{ 3, "칸쵸코", 300, "과자계의 레전드" } ,
			{ 1, "맛동산", 100, "오리온" }, 
			{ 2, "아폴로", 200, "불량식품" }, 
			{ 3, "칸쵸코", 300, "과자계의 레전드" }, 
			{ 1, "맛동산", 100, "오리온" }, 
			{ 2, "아폴로", 200, "불량식품" }, 
			{ 1, "맛동산", 100, "오리온" }, 
			{ 2, "아폴로", 200, "불량식품" }, 
			{ 3, "칸쵸코", 300, "과자계의 레전드" } ,
			{ 1, "맛동산", 100, "오리온" }, 
			{ 2, "아폴로", 200, "불량식품" }, 
			{ 3, "칸쵸코", 300, "과자계의 레전드" }, 
			{ 1, "맛동산", 100, "오리온" }, 
			{ 2, "아폴로", 200, "불량식품" }, 
			{ 3, "칸쵸코", 300, "과자계의 레전드" } 
	};

	JTable jTable = new JTable(rowData, columnNames);
	JScrollPane jScollPane = new JScrollPane(jTable);

	
	
	Test() {
		jFrame.add(jScollPane);

		jFrame.setSize(400, 300);
		jFrame.setVisible(true);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new Test();
	}
}