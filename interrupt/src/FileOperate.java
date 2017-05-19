import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;

class FileOperate{
	public String readFile(String pathName){
		StringBuffer buffer = new StringBuffer();
		File file = new File(pathName);
		try(BufferedReader br = new BufferedReader(new FileReader(file))) {
			String str = null;
			int i=0;
			while((str=br.readLine()) != null){
				if( i!=0){
					buffer.append(" ");
				}
				buffer.append(str);
				
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return buffer.toString();
	}
	
	public void outFile(String pathName,String result){
		File file = new File(pathName);
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(file))){
			String[] res = result.split(" ");
			
			ReverseList<String> rl = new ReverseList<String>(Arrays.asList(res));
			StringBuffer buf = new StringBuffer();
			Iterator<String> it = rl.reversed().iterator();
			int i=0;
			while(it.hasNext()){
				if(i!=0){
					buf.append(" ");
				}
				buf.append(it.next());
				i++;
			}
			bw.write(buf.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}