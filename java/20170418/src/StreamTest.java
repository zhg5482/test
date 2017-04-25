import java.io.*;

/**
 * Created by zhg-pc on 17/4/21.
 */
public class StreamTest {
    public static void main(String []args){
        StreamTest t1 = new StreamTest();
        //t1.brRead();
        //t1.BRReadLines();
        //t1.WriteDemo();
        //t1.fileStreamTest();
        //t1.fileStreamTest2();
        //t1.DirList();
        t1.DeleteFileDemo();
    }

    public void brRead(){
        char c;
        // 使用 System.in 创建 BufferedReader
        BufferedReader br = new BufferedReader(new
                InputStreamReader(System.in));
        System.out.println("输入字符, 按下 'q' 键退出。");
        // 读取字符
        try {
            do {
                c = (char) br.read();
                System.out.println(c);
            } while (c != 'q');
            System.out.println("\nthis is end!");
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void BRReadLines(){
        // 使用 System.in 创建 BufferedReader
        BufferedReader br = new BufferedReader(new
                InputStreamReader(System.in));
        String str;
        System.out.println("Enter lines of text.");
        System.out.println("Enter 'end' to quit.");
        try {
            do {
                str = br.readLine();
                System.out.println(str);
            } while (!str.equals("end"));
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void WriteDemo(){
        int b;
        b = 'A';
        System.out.write(b);
        System.out.write('\n');
    }

    public void fileStreamTest(){
        try {
            byte bWrite[] = {11, 21, 3, 40, 5};
            OutputStream os = new FileOutputStream("test.txt");
            for(int x = 0;x < bWrite.length; x++){
                os.write(bWrite[x]);    // writes the bytes
            }
            os.close();

            InputStream is = new FileInputStream("test.txt");
            int size = is.available();

            for (int i = 0; i < size; i++){
                System.out.print((char)is.read() + " ");
            }
            is.close();
        }catch (IOException e){
            System.out.print("Exception");
        }
    }

    /*
    FileInputStream
    该流用于从文件读取数据，它的对象可以用关键字 new 来创建。
    有多种构造方法可用来创建对象。
    FileOutputStream
    该类用来创建一个文件并向文件中写数据。
    如果该流在打开文件进行输出前，目标文件不存在，那么该流会创建该文件。
     */
    public void fileStreamTest2(){
        try{
            File f = new File("a.txt");
            FileOutputStream fop = new FileOutputStream(f);
            // 构建FileOutputStream对象,文件不存在会自动新建

            OutputStreamWriter writer = new OutputStreamWriter(fop,"UTF-8");
            // 构建OutputStreamWriter对象，参数可以指定编码，默认为操作系统默认编码，windows上是gbk

            writer.append("中文输入");
            //写入到缓冲区

            writer.append("\r\n");
            //换行

            writer.append("English");
            // 刷新缓存区，写入到文件，如果下面已经没有写入的内容了，直接close也会写入

            writer.close();
            // 关闭写入流，同时会把缓冲区内容写入文件，所以上面的注释掉

            fop.close();
            // 关闭输出流，释放系统资源

            FileInputStream fip = new FileInputStream(f);
            // 构建FileInputStream对象

            InputStreamReader reader = new InputStreamReader(fip,"Utf-8");
            // 构建InputStreamReader对象，编码与写入相同

            StringBuffer sb = new StringBuffer();
            while (reader.ready()){
                sb.append((char)reader.read());
                // 转成char加到StringBuffer对象中
            }
            System.out.println(sb.toString());
            reader.close();
            //关闭读取流

            fip.close();
            //关闭输入流,释放系统资源

        }catch (FileNotFoundException e){
            System.out.print("FileNotFoundException");
        }catch (UnsupportedEncodingException e){
            System.out.print("UnsupportedEncodingException");
        }catch (IOException e){
            System.out.print("IOException");
        }
    }

    /*
    创建目录：
    File类中有两个方法可以用来创建文件夹：
    mkdir( )方法创建一个文件夹，成功则返回true，失败则返回false。
        失败表明File对象指定的路径已经存在，或者由于整个路径还不存在，该文件夹不能被创建。
    mkdirs()方法创建一个文件夹和它的所有父文件夹。
     */
    public void CreateDir(){
        String dirname = "/tmp/user/java/bin";
        File d = new File(dirname);
        //现在创建目录
        d.mkdirs();
    }

    /*
    读取目录
    一个目录其实就是一个 File 对象，它包含其他文件和文件夹。
    如果创建一个 File 对象并且它是一个目录，那么调用 isDirectory() 方法会返回 true。
    可以通过调用该对象上的 list() 方法，来提取它包含的文件和文件夹的列表。
     */
    public void DirList(){
        String dirname = "/tmp";
        File f1 = new File(dirname);
        if (f1.isDirectory()){
            System.out.println("目录 " + dirname);
            String s[] = f1.list();
            for (int i = 0;i < s.length; i++){
                File f = new File(dirname + "/" + s[i]);
                if (f.isDirectory()){
                    System.out.println(s[i] + " 是一个目录");
                }else {
                    System.out.println(s[i] + " 是一个文件");
                }
            }
        }else{
            System.out.println(dirname + " 不是一个目录");
        }
    }

    /*
    删除目录或文件
    删除文件可以使用 java.io.File.delete() 方法。
     */
    public void DeleteFileDemo(){
        // 这里修改为自己的测试目录
        File folder = new File("/tmp/java");
        deleteFolder(folder);
    }

    //删除文件及目录
    public static void deleteFolder(File folder) {
        File[] files = folder.listFiles();
        if(files!=null) {
            for(File f: files) {
                if(f.isDirectory()) {
                    deleteFolder(f);
                } else {
                    f.delete();
                }
            }
        }
        folder.delete();
    }
}
