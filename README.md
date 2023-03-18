# progremous
/*
 * 머쓱이는 태어난 지 6개월 된 조카를 돌보고 있습니다. 
 * 조카는 아직 "aya", "ye", "woo", "ma" 네 가지 발음을 
 * 최대 한 번씩 사용해 조합한(이어 붙인) 발음밖에 하지 못합니다. 
 * 문자열 배열 babbling이 매개변수로 주어질 때, 
 * 머쓱이의 조카가 발음할 수 있는 단어의 개수를 return하도록 isEmpty 함수를 완성해주세요.
 */
public class IsEmpty{
	public int isEmpty(String[] babbling){
		int answer = 0;
		
		for(int i = 0; i < babbling.length; i++) {
			babbling[i] = babbling[i].replace("aya", "1"); //replace 뜻과 정수 1이 "과 함께 쓰인이유
			babbling[i] = babbling[i].replace("ye", "1");
			babbling[i] = babbling[i].replace("woo", "1");
			babbling[i] = babbling[i].replace("ma", "1");
			babbling[i] = babbling[i].replace("1", ""); //"" 이곳에 들어 있는 수에 뜻
		
			if(babbling[i].isEmpty()) {
				answer = answer + 1;	//isEmpty()의 뜻과 answer에 +1을 해준 이유
			}
		}
			return answer;
	}
}
