# Study_Report
---

## vi/vim编辑器的使用
  1. 概念
   - vi(Visual Interface)是Unix及Linux系统下标准的文本编辑器
   - vim(vi iMprove)是vi的升级版
 2. 使用vim打开文件：
     - $vim path :vim后面接文件路径及文件名，如果文件存在，则打开编辑文件窗口，如果文件不存在，则创建文件。  
    `$vim /ts/test`
 在ts文件下打开test文本或创建test文本。  

     - $vim +# path :打开文件并定位到第#行，若#不输入，则定位到最后一行。  
     `$vim +2 /ts/test`  
     打开ts目录下的test文本并定位到第三行
     
     - $vim +/pattern path :打开文件，定位到第一次匹配到pattern行的行首。
     `$vim +/start /ts/tset`  
     打开test文本并定位到有“start”词的行的行首  


 3. vim模式：
     - 命令模式：刚进入vim的时候，默认就是 命令模式，可以复制行，删除行等。
     - 输入模式：可以输入内容。
     - 末行模式：在最下边，除编辑模式，可以输入诸多管理员命令。

 4. 模式转换：  
    ![avatar](/stage1/image/模式转换.png)   
 命令模式转输入模式：  
      - i：在当前光标所在字符的前面，转为输入模式  
      - I：在当前光标所在行的行首转换为输入模式  
      - a：在当前光标所在字符的后面，转为输入模式  
      - A：在光标所在行的行尾，转换为输入模式  
      - o：在当前光标所在行的下方，新建一行，并转为输入模式  
      - O：在当前光标所在行的上方，新建一行，并转为输入模式  
      - s：删除光标所在字符  
      - r：替换光标处字符 
 5. 关闭文件：
    末行模式：
     - w：保存
     - q：退出
     - wq 或 x：保存退出，wq 和 x 都是保存退出
     - q！：强制退出
     - w！：强制保存，管理员才有权限
    命令模式：
     - zz：保存并退出

 6. （命令模式）移动光标：
     - 逐字符移动：
         - h：向左
         - l：向右
         - j：向下
         - k：向上
         - #h：移动#个字符
     - 以单词为单位移动：
         - w：移到下一个单词的词首
         - b：跳至当前或上一个单词的词首
         - #w：表示移动#个单词
     - 行内跳转：
         - 0：绝对行首
         - ^：行首第一个非空白字符
         - $：绝对行尾
     - 行间跳转
         - G：最后一行
         - #G：跳转到第#行
         - （末行模式下）输入行号+回车

 7. （命令模式）翻屏：
     - Ctrl+f：向下翻一屏
     - Ctrl+b：向上翻一屏
     - Ctrl+d：向下翻半屏
     - Ctrl+u：向上翻半屏　

 8. (命令模式）删除：
     - x：删除光标所在处单个字符
     - #x：删除光标所在处及向后共#个字符
     - d跟跳转命令组合 例：dw 表示删除光标所在位置到下一个单词词首所有字符
     - dd：删除当前光标所在行、
     - #dd：删除包含当前光标所在行内的#行

 9. (命令模式）修改：
     - c:用法同d，删除然后转为输入模式。

 10. (命令模式）替换：
     - r:转为替换模式。

 11. (命令模式）其他操作：
     - .:重复上一次执行的命令
     - u:撤销上一次执行的命令
     - v：可视化模式，键盘控制光标划过的区域被选取

 12. 末行模式：
     - /pattern：从当前位置向后查找“pattern”
     - ?pattern：从当前位置向前查找“pattern”
     - w：表示保存当前文件
     - w /path/to/somewhere：将当前文件另存为到路径指定的地方
     - r： /path/to/somefile  例如：vim /ts/rc.sysinit 打开文件后，末行模式 输入 :r /ts/test ：会将 test文件的所有内容附加到rc.sysinit文件光标  所在的位置
     - (vim FILE1 FILE2 FILE3)(vim打开多个文件）：
         - :next 切换到下一个文件
         - :prev 切换到上一个文件
         - :last 切换到最后一个文件
         - :first 切换到第一个文件
         - qa:全部退出

---

## jdk环境与java语言
 1. $ java -version :查看当前安装的java版本
 2. 编译命令：$ javac [-d] [-o] [-verbose] [-classpath] [-sourcepath]
     - -d,指定生成的.class文件存放目录，省略则默认放在java源文件的同一目录下
     - -o,告诉javac优化内联的static，finall以及privite成员函数所产生的码。
     - -verbose，告知java显示出有关被编译的源文件和任何被调用类库的信息。
     - -classpath，设定要用到的类路径，可以是目录，jar文件，zip文件（里面都是class文件）。也可以省略，省略则默认使用环境变量$CLASSPATH路径。
     - sourcepath,设定要编译的java文件路径，可以是目录，jar文件，zip文件（里面都是java文件）。  
    `$ javac hello_world.java`  
    编译hello_world.java文件,在同一目录下生成可执行文件hello_world。

 3. 运行命令：$ java [-classpath] [-sourcepath] 
    - classpath同编译时的类路径
    - sourcepath指要运行的目标1文件名，不需要添加后缀。  
    `$ java hello_world`  
    运行由上编译成的可执行文件。
 4. Java基础知识与C++有大同小异之处。
 5. import package_name 导入包，本次小程序主要为GUI组件部分设计，需要使用到的包有AWT(Abstract Window Toolkit)和Swing(AWT包的升级版);  
    `import java.awt.*`  
    `import javax.swing.*`  
 6.  - `public class CalculatorDemo extends JFrame`    
    通过继承JFrame类来添加窗口  
     - `JButton sub = new JButton("-")`   
    添加减号按钮
     - `JLabel leftnum = new JLabel("12",JLabel.CENTER);`  
    添加显示框数字“12”，并使文本居中
     - `JTextField result = new JTextField();`  
    添加文本框，用来输出结果。
     - `result.setHorizontalAlignment(JTextField.CENTER);`   
    使输出框文本居中。
     - `final Font font = new Font("宋体", Font.BOLD, 21);`  
    添加文字style（宋体，粗体，21号大小）
     - `add1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				opera.setText("+");
				result.setText("?");
				index = 1;
			}
		});`   
    为按钮添加事件，监听。
    结合，生成小程序。 4. Java基础知识与C++有大同小异之处。
 5. import package_name 导入包，本次小程序主要为GUI组件部分设计，需要使用到的包有AWT(Abstract Window Toolkit)和Swing(AWT包的升级版);  
    `import java.awt.*`  
    `import javax.swing.*`  
 6.  - `public class CalculatorDemo extends JFrame`    
    通过继承JFrame类来添加窗口  
     - `JButton sub = new JButton("-")`   
    添加减号按钮
     - `JLabel leftnum = new JLabel("12",JLabel.CENTER);`  
    添加显示框数字“12”，并使文本居中
     - `JTextField result = new JTextField();`  
    添加文本框，用来输出结果。
     - `result.setHorizontalAlignment(JTextField.CENTER);`   
    使输出框文本居中。
     - `final Font font = new Font("宋体", Font.BOLD, 21);`  
    添加文字style（宋体，粗体，21号大小）
     - `add1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				opera.setText("+");
				result.setText("?");
				index = 1;
			}
		});`   
    为按钮添加事件，监听。
    结合，生成小程序。
    
  ---

## ANT环境配置及使用

1. ANT环境配置
     - 在[ant官网](http://ant.apache.org/bindownload.cgi)上下载apache-ant-1.9.14
     - 手动解压
     - 将apache-ant-1.9.14文件置于~/Desktop上
     - 设置环境变量：   
          `gedit ~/.bashrc`  
        在.bashrc中添加    
        `#set Ant environment`   
        `export ANT_HOME=~/Desktop/apache-ant-1.9.14`   
        `export PATH=${ANT_HOME}/bin:$PATH`  
     - 使修改立即生效  
        `source ~/.bashrc`  
     - 测试  
    `ant`  
    若显示Buildfile:build xml does not exist! Build failed,则ant配置成功  
     - PS:使用 `vi /etc/profile` 似乎权限不够，只能以只读打开profile  

 2. ANT使用
     - 将java文件置于src文件下。
     - 在该project下建立一个build.xml文件
     - 然后利用ant编译。  
        `$ ant all`  
        将会出现信息：
    Buildfile: /home/administrator/Desktop/build.xml
init:
    [mkdir] Created dir: /home/administrator/Desktop/classes  
    [mkdir] Created dir: /home/administrator/Desktop/classes  
compile:
    [javac] /home/administrator/Desktop/build.xml:25: warning: 'includeantruntime' was not
set, defaulting to build.sysclasspath=last; set to false for repeatable builds
    [javac] Compiling 1 source file to /home/administrator/Desktop/classes  
jar:    
      [jar] Building jar:   /home/administrator/Desktop/Hello_World.jar
all:  
    BUILD SUCCESSFUL  
    Total time: 0 seconds
     - 执行 `$ java -jar HelloWorld.jar hello_world` 时会报错： "no main mainfest attribute， in HellowWorld.jar"   
    应使用`$ java -cp HelloWorld.jar hello_world` 来运行指定想要运行的类，因为java打包成jar包需要在MANIFEST.MF中指定Main.Class项以便运行 `$ java -jar XXX.jar` 时找到对应的主类

---
## Junit环境配置和使用
 1. Junit环境配置
     - 从百度网页上下载Junit包
     - `$ gedit ~/.bashrc`    
        配置Junit环境变量：
    #set Junit environment  
        export JAVA_HOME=/usr/lib/jvm/jdk1.8.0_91
    export CLASSPATH=.:$JAVA_HOME/lib/dt.jar:$JAVA_HOME/lib/tools.jar:/home/administrator/Downloads/junit-4.9.jar:$CLASSPATH
    export PATH=$JAVA_HOME/bin:$JAVA_HOME/jre/bin:$PATH:$HOME/bin 
     - `$ soure ~/.bashrc`  
        使修改立即生效。

 2. Junit使用
     - 为了方便测试，在原有的hello_world.java中添加一些函数以便测试。
     - 创建hello_worldTest.java文件。
     - $`javac hello_worldTest.java hello_world.java` 
     - `$ java -ea org.junit.runner.JUnitCore hello_worldTest`  
     -  出现如下结果则表示运行成功：
        JUnit version 4.9
        Time：0.005
        OK（1test）

 3. PS
     - 添加Junit环境变量真是令人头疼，一不小心改错了，让很多指令都变成了`command not found`  
     - 使用/bin/ls和/bin/cd找到隐藏文件.bashrc改回去最终才恢复正常。  
     - 环境配置单词容易打错。
