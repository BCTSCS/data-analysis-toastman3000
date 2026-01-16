import java.util.ArrayList;

public class TextProcessor {
    private ArrayList<String> textList;
    public TextProcessor(ArrayList<String> lines) {
        setTextList(lines);
    }
  
   public void setTextList(ArrayList<String> newTextList) {
    textList = newTextList;
   }
  
  public void removeStopWords(ArrayList<String> stopWord) {
    for (String stop : stopWord){
      for(int i=0; i<textList.size(); i++){
        String line= textList.get(i);
       
        line=line.replaceAll(" "+stop+" ", " "); 
        line=line.startsWith(stop)?line.replace(stop, "") : line; 

        line=line.replace(" "+stop+"\n", "\n");

        textList.set(i, line);
    
      }

    }
  }

  public String toString() {
    String text = "";

    for (String value : textList) {
      text = text + value + "\n";
    }

    return text;
  }

    public static void main(String[] args) {
        ArrayList<String> stopword = FileOperator.getStringList("data-analysis-toastman3000/stopwords.txt");
        ArrayList<String> posts = FileOperator.getStringList("data-analysis-toastman3000/posts.txt");
        TextProcessor t = new TextProcessor(posts);
        t.removeStopWords(stopword);
        System.out.println(t);

      
    }
    
}