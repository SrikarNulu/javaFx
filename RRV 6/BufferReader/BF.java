import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;


class  BF
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String values = br.readLine();
        System.out.println(values);

        String [] parts = values.split(" ");
        System.out.println(Arrays.toString(parts));
       String val = br.readLine();
       System.out.println();
       // int a = Integer.parseInt(br.readLine());
       // System.out.println(a);
	}
}
