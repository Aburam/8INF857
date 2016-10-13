//Splits the text in string text into the number of slices in variable nb, placing one letter into each slice in turn.  
// ex: abdcefhij into 3 slices gives  1) adh 2) bei 3) cfj  

package decryption;



public class TextSlicer {
	
	private final  static String text="futptnheovduhdjstcgeiltpauhttrgiqltstcgeidtctmdnsehegaxtfuxlcypiiajcjnherrttfuxstvtnvetnherrtttnherrtttnuaxtvldigeaehejlfuxsjrkiiajstcgeiehtaerotugldrhqjeaekicectgeaeherrtthogtjngobacddiitduyojrhcdniecigucstcgeiptuieirtqjeaaregtxtjdtehttlaeaeherrttsehldnvutsuiseaiiehlpmdrictstcgeiqjippeagtxecdgaptduiltmdnseeegsdncecevagdtucstcgeicdmbejntnuactaakaaejrsuctgehogrtsxdtdpnhsdnherrttjnherrttcemihttqjehiaehtrocnjdtqjeaqjucpdugqjesebejrtltstcgeinduhtpigocsyuhqjajsxltnreaeherrttseaesuraiidngehisesacsaegehptcidtltltvtltstcgeidjsjcrehehtsouftnhegltpauhggacdcobbgeeohsxbaesevecstsiucfdufuxrtvtltahauebmtctqjiavtuigprsegstcgeitduiegekeaaiidnsucstcgeiehtaauajttqjesereauxqjiaarocfxeaeherrttsegejshigctsidttgepdgoxtcocdttgejtxltojtaebocdtajnherrttsehigdttdncegltspuirtsaarocfxacctecsditsiltpgebitrherrttsuhurctsaeherrttseaagejshiiepvtcjntnuactrehtseceeaheirtstseagecthltstcgeidjsjcrehntsippsrocnjqjeserejxfuxndnippsgejshi";
	private final static int nb = 4;
	
	public static void main(String[] args) {
		
		  String[]  slices= new String [nb]  ;
		  int j=0;
		  for (j=0;j<nb;j++)
		  {
			  slices[j%nb]="";
			  
		  }
		  j=0;
		  for (int i=0;i<text.length();i++)
		  {
			  slices[j%nb]=slices[j%nb]+text.charAt(i);
			  j++;
		  }
		  j=0;
		  for (j=0;j<nb;j++)
		  {
			 System.out.println( slices[j%nb]);
		  }
	}

}
