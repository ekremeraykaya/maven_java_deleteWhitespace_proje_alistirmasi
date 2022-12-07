package tr.edu.medipol.ornek1;

import org.apache.commons.lang3.StringUtils;

public class BosluklariTemizle {

	public static void main(String[] args) {
		
		String sonuc = StringUtils.deleteWhitespace("ab      ab aa   ccc");
		System.out.println(sonuc);
	}

}
