package Level_9;

import java.io.*;

public class Solution_9_11_11 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            InputStream fileInputStream = getInputStream(reader.readLine());
            OutputStream fileOutputStream = getOutputStream(reader.readLine());
            while (fileInputStream.available() > 0) {
                int data = fileInputStream.read();
                fileOutputStream.write(data);
            }
            fileInputStream.close();
            fileOutputStream.close();
        }
        catch (Exception e){
            System.out.println("Файл не существует");
            InputStream fileInputStream = getInputStream(reader.readLine());
            OutputStream fileOutputStream = getOutputStream(reader.readLine());
            while (fileInputStream.available() > 0) {
                int data = fileInputStream.read();
                fileOutputStream.write(data);
            }
            fileInputStream.close();
            fileOutputStream.close();
        }
    }

    public static InputStream getInputStream(String fileName) throws IOException {
        return new FileInputStream(fileName);
    }

    public static OutputStream getOutputStream(String fileName) throws IOException {
        return new FileOutputStream(fileName);
    }
}




