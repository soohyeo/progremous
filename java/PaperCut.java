public class PaperCut {
    public int papercut(int M, int N){
        int answer = (M * N) - 1;
        return answer;
    }



    public static void main(String[] args) {
        PaperCut a = new PaperCut();
        int x = a.papercut(2, 2);
        System.out.println(x);


    }
}
