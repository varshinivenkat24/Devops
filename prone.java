import java.io.*;
import java.net.*;
public class prone{
Public static void main(String args[])throws Exception{
ServerSocket ss=new ServerSocket(5000);
System.out.println("waiting");
BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
PrintWriter out=new PrintWriter(s.getOutprintStream(),true);
Socket s=ss.accept();
System.out.println("connected");
String name=br.readLine();
System.out.println("received:"+name);
Process p=Runtime.getRuntime().exec(" java "+name);
BufferedReader pr=new BufferedReader(new InputStreamReader(p.getInputStream()));
String line;
while((line=pr.readLine())!=null)
{
out.println(line);
}
}
}

