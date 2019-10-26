
public class Quiz {

	
	/* 5 pytañ w pliku txt
	 * pytanie odpowiedz odpowiedz odpowiedz odpowiedz prawidlowa
	 * 
	 */
	String tresc;
	String a,b,c,d; /// odpowiedzi
	String moja; // moja odpowiedz
	String prawidlowa;
	
	Quiz(){
		tresc=null;
		a=null;
		b=null;
		c=null;
		d=null;
		moja=null;
		prawidlowa=null;
	}
	Quiz(String tresc1, String a1, String b1, String c1, String d1, String moja1, String prawidlowa1){
		tresc=null;
		a=null;
		b=null;
		c=null;
		d=null;
		moja=null;
		prawidlowa=null;
	}
	public void settresc(String tresc1) {
		tresc=tresc1;
	}
	public void seta(String a1) {
		a=a1;
	}
	public void setb(String b1) {
		b=b1;
	}
	public void setc(String c1) {
		c=c1;
	}
	public void setd(String d1) {
		d=d1;
	}
	public void setmoja(String moja1) {
		moja=moja1;
	}
	public void setprawidlowa(String prawidlowa1) {
		prawidlowa=prawidlowa1;
	}
	
	
}
