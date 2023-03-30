package kr.co.ezenac.array03;

public class ObjectCopyTest2 {
	
	public static void main(String[] args) {		//깊은 복사
		
		Book[] libray = new Book[5];		//100번지
		Book[] copyLib = new Book[5];		//200번지  도착하는 곳은 같음
		
		libray[0] = new Book("Spring Security1 ", "믹 넛슨");
		libray[1] = new Book("Spring Security2 ", "믹 넛슨");
		libray[2] = new Book("Spring Security3 ", "믹 넛슨");
		libray[3] = new Book("Spring Security4 ", "믹 넛슨");
		libray[4] = new Book("Spring Security5 ", "믹 넛슨");
		
		copyLib[0] = new Book();
		copyLib[1] = new Book();
		copyLib[2] = new Book();
		copyLib[3] = new Book();
		copyLib[4] = new Book();
		
		for(int i = 0; i<libray.length; i++) {
			copyLib[i].setTitle(libray[i].getTitle());
			copyLib[i].setAuthor(libray[i].getAuthor());
		
		}
		
//		System.out.println("=======copy libray=======");
//		for(Book book : libray) {
//			book.showInfo();
//		}
//		System.out.println();
//		
//		
//		System.out.println("=======copy libray=======");
//		for(Book book : copyLib) {
//			book.showInfo();
//		}
		
		libray[0].setTitle("그래프 러닝머신");
		libray[0].setAuthor("클라우디오 스타밀레");
		
		System.out.println("=======copy libray=======");
		for(Book book : libray) {
			book.showInfo();
		}
		System.out.println();
		
		
		System.out.println("=======copy libray=======");
		for(Book book : copyLib) {
			book.showInfo();
		}
	}
	
}










