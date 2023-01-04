package live;
import music.string.Veena;
import music.wind.Saxophone;
import music.Playable;
public class test {
	public static void main(String[] args){
		// TODO Auto-generated method stub
		Veena v=new Veena();
		v.play();
		Saxophone s=new Saxophone();
		s.play();
		Playable t;
		t=v;
		t.play();
		t=s;
		t.play();

	}

}
