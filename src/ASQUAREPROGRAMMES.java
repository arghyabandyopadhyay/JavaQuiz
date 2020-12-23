/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author ARGHYA
 */
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ARGHYA
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ARGHYA
 */
import java.util.*;
import javax.swing.JOptionPane;
public class ASQUAREPROGRAMMES
{
    public static int pass=0,fifty=0,doubledip=0,quest=0,m=0,h=0;
    public static String q[]=new String[200],name="",result="",lifeline="";
    public static int ans[]=new int[200];
    public static String opt1[]=new String[200]; 
    public static String opt2[]=new String[200];
    public static String opt3[]=new String[200];
    public static String opt4[]=new String[200];
    public static Calendar c;
    
    public static void main(String args[]) 
    {
        try
        {
            JOptionPane.showMessageDialog(null,"************WELCOME TO A G Y QUIZ****************"+
                "\n IF YOU CAN CRACK IT THEN CRACK IT(BUT IF...)"+
                "\n                                             Desinged by :-"
                +"\n"+"                                             Arghya bandyopadhyay"+"\n press OK to go to the next page");
            int m=0;
            c=Calendar.getInstance();
            name=name();
            JOptionPane.showMessageDialog(null,"hi,"+name+"\n"+"press OK button to start");
            int hour=c.get(Calendar.HOUR);
            int minute=c.get(Calendar.MINUTE);
            int second=c.get(Calendar.SECOND);
            questions(name,hour,minute,second);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"");
            JOptionPane.showMessageDialog(null,"");
            JOptionPane.showMessageDialog(null,"");
            JOptionPane.showMessageDialog(null,"error occurred");
            JOptionPane.showMessageDialog(null,(e.getMessage()));    
        }
    }

    public static void questions(String name,int hour,int minute,int second)
    {
        try
        {
            
            q[0]="1.who developed java?";
            ans[0]=1;
            opt1[0]="1.James A Gosling";
            opt2[0]="2.Charles Babbage";
            opt3[0]="3.Bill Gates";
            opt4[0]="4.Carnegie Mellon";
            q[1]="2.what was java initially named";
            ans[1]=2;
            opt1[1]="1.coffee";
            opt2[1]="2.oaks";
            opt3[1]="3.c++";
            opt4[1]="4.net beans";
            q[2]="3.when was java created?";
            ans[2]=1;
            opt1[2]="1.1991";
            opt2[2]="2.1990";
            opt3[2]="3.1989";
            opt4[2]="4.1988";
            q[3]="4.when was java formally introduced?";
            ans[3]=3;
            opt1[3]="1.1997";
            opt2[3]="2.1996";
            opt3[3]="3.1995";
            opt4[3]="4.1994";
            q[4]="5.when was JDK 1.1 launched?";
            ans[4]=1;
            opt1[4]="1.1997";
            opt2[4]="2.1998";
            opt3[4]="3.1999";
            opt4[4]="4.2000";
            q[5]="6.when was JDK 1.3 released?";
            ans[5]=4;
            opt1[5]="1.1996";
            opt2[5]="2.1997";
            opt3[5]="3.1998";
            opt4[5]="4.1999";
            q[6]="7.when Oracle aquired sun microsystem?";
            ans[6]=2;
            opt1[6]="1.2009";
            opt2[6]="2.2010";
            opt3[6]="3.2011";
            opt4[6]="4.2012";
            q[7]="8.when was JDK FX 1.0 released?";
            ans[7]=1;
            opt1[7]="1.2008";
            opt2[7]="2.2007";
            opt3[7]="3.2006";
            opt4[7]="4.1997";
            q[8]="9.when sun microsystem produces JDK 1.2 for linux";
            ans[8]=2;
            opt1[8]="1.1999";
            opt2[8]="2.1998";
            opt3[8]="3.1997";
            opt4[8]="4.1996";
            q[9]="10.when java celebrated its 10th birthday";
            ans[9]=3;
            opt1[9]="1.2001";
            opt2[9]="2.2004";
            opt3[9]="3.2005";
            opt4[9]="4.2006";
            q[10]="11.An ......... is an identifiable entity with some charecteristics and behaviour";
            ans[10]=2;
            opt1[10]="1.messages";
            opt2[10]="2.object";
            opt3[10]="3.abstraction";
            opt4[10]="4.classes";
            q[11]="12. ......... is the way of combining both the data and function that operate on that data under a single unit";
            ans[11]=4;
            opt1[11]="1.methods";
            opt2[11]="2.polymorphism";
            opt3[11]="3.abstraction";
            opt4[11]="4.encapsulation";
            q[12]="13. .......... can be defined as a software bundle of variables and related methods. ";
            ans[12]=3;
            opt1[12]="1.messages";
            opt2[12]="2.object";
            opt3[12]="3.classes";
            opt4[12]="4.abstraction";
            q[13]="14. real world object encapsulate .......... and ...........";
            ans[13]=1;
            opt1[13]="1.charecteristics,behaviour";
            opt2[13]="2.abstraction,polymorphism";
            opt3[13]="3.classes,object";
            opt4[13]="4.method,members";
            q[14]="15.Object interact with one another through .............";
            ans[14]=3;
            opt1[14]="1.messages";
            opt2[14]="2.methods";
            opt3[14]="3.member functions";
            opt4[14]="4.number variable";
            q[15]="16.the data in an object is accessed through the member functions of the objects known as ............... ";
            ans[15]=2;
            opt1[15]="1.methods";
            opt2[15]="2.member functions";
            opt3[15]="3.messages";
            opt4[15]="4.numder variable";
            q[16]="17.the ......... of the object is represented through function called methods.";
            ans[16]=3;
            opt1[16]="1.manner";
            opt2[16]="2.charecteristics";
            opt3[16]="3.behavior";
            opt4[16]="4.state";
            q[17]="18.the value of data members or member variables at any given points of the  times determined and object's .............";
            ans[17]=4;
            opt1[17]="1.behavior";
            opt2[17]="2.messages";
            opt3[17]="3.method";
            opt4[17]="4.state";
            q[18]="19.wrapping up of a data and function into a single unit:-";
            ans[18]=4;
            opt1[18]="1.method";
            opt2[18]="2.polymorphism";
            opt3[18]="3.abstraction";
            opt4[18]="4.encapsulation";
            q[19]="20.A member  function representing some behaviours of an object:-";
            ans[19]=1; 
            opt1[19]="1.methods";
            opt2[19]="2.messages";
            opt3[19]="3.object";
            opt4[19]="4.polymorphism";
            q[20]="21.A....... is a set of object that  have common structure and behaviour:-";
            ans[20]=4; 
            opt1[20]="1.methods";
            opt2[20]="2.object";
            opt3[20]="3.polymorphism";
            opt4[20]="4.class";
            q[21]="22.An object is identify by its .......:-";
            ans[21]=2; 
            opt1[21]="1.methods";
            opt2[21]="2.attribute";
            opt3[21]="3.object factory";
            opt4[21]="4.class";
            q[22]="23.In....... object are defined by defying a class for them:-";
            ans[22]=4; 
            opt1[22]="1.polymorphism";
            opt2[22]="2.constructor";
            opt3[22]="3.class";
            opt4[22]="4.OOP";
            q[23]="24.a class is a name software represantation of an .............:-";
            ans[23]=3; 
            opt1[23]="1.polymorphism";
            opt2[23]="2.method";
            opt3[23]="3.abstraction";
            opt4[23]="4.entity";
            q[24]="25.the.............is an object maker or object factory";
            ans[24]=4; 
            opt1[24]="1.polymorphism";
            opt2[24]="2.method";
            opt3[24]="3.abstraction";
            opt4[24]="4.class";
            q[25]="26.a..........basically represents an abstraction";
            ans[25]=1; 
            opt1[25]="1.class";
            opt2[25]="2.method";
            opt3[25]="3.abstraction";
            opt4[25]="4.polymorphism";
            q[26]="27.a software terms,an entity's ........... are represented through data members";
            ans[26]=2; 
            opt1[26]="1.behavior";
            opt2[26]="2.charecteristics";
            opt3[26]="3.manner";
            opt4[26]="4.state";
            q[27]="28.how would you describe a java?";
            ans[27]=1; 
            opt1[27]="1.both 2nd and 3rd options";
            opt2[27]="2.a platform";
            opt3[27]="3.a programing language";
            opt4[27]="4.none of this";
            q[28]="29.java applications are?";
            ans[28]=3; 
            opt1[28]="1.very big";
            opt2[28]="2.very small";
            opt3[28]="3.platform independent";
            opt4[28]="4.platform dependent";
            q[29]="30.which of the following is the reason of java programs platform independent?";
            ans[29]=1; 
            opt1[29]="1.all of the below";
            opt2[29]="2.java compiler";
            opt3[29]="3.java virtual machine";
            opt4[29]="4.java byte code";
            q[30]="31. which of the following prints some text on the monitor(in context of java)?";
            ans[30]=4; 
            opt1[30]="1.all of the below";
            opt2[30]="2.println";
            opt3[30]="3.print";
            opt4[30]="4.System.out.println";
            q[31]="32. which of the following is not a valid comment?";
            ans[31]=2;
            opt1[31]="1./**comment*/";
            opt2[31]="2./*comment";
            opt3[31]="3./*comment*/";
            opt4[31]="4.//comment";
            q[32]="33.jvm combined with .......... makes java platform.";
            ans[32]=1; 
            opt1[32]="1.java api";
            opt2[32]="2.java programs";
            opt3[32]="3.java byte code";
            opt4[32]="4.all of the above";
            q[33]="34.an abstrtact machine that hides underlying operating systems for java application and executes the java byte code?";
            ans[33]=2; 
            opt1[33]="1.java compiler";
            opt2[33]="2.java virtual machine";
            opt3[33]="3.java machine";
            opt4[33]="4.java platform";
            q[34]="35.which of the following is not a key word?";
            ans[34]=3; 
            opt1[34]="1.class";
            opt2[34]="2.void";
            opt3[34]="3.true";
            opt4[34]="4.public";
            q[35]="36.which of the following is not a token?";
            ans[35]=2; 
            opt1[35]="1.key word";
            opt2[35]="2.statement";
            opt3[35]="3.operetors";
            opt4[35]="4.identifiers";
            q[36]="37.which of the following is invalid integer?";
            ans[36]=4; 
            opt1[36]="1.1934";
            opt2[36]="2.0123";
            opt3[36]="3.0XFACE";
            opt4[36]="4.01934";
            q[37]="38.  0.625E-3 is equivalent to,";
            ans[37]=3; 
            opt1[37]="1.0.625000";
            opt2[37]="2.625.0000";
            opt3[37]="3.0.000625";
            opt4[37]="4.625^30";
            q[38]="39.which of the following does not represent a character literal?";
            ans[38]=1; 
            opt1[38]="1.''a'' ";
            opt2[38]="2.'a'";
            opt3[38]="3.'1'";
            opt4[38]="4.'/a'";
            q[39]="40.which of the following is a primitive data type?";
            ans[39]=3; 
            opt1[39]="1.array";
            opt2[39]="2.class";
            opt3[39]="3.byte";
            opt4[39]="4.character";
            q[40]="41.which of the following is an integeral data type in java?";
            ans[40]=2; 
            opt1[40]="1.Byte";
            opt2[40]="2.Double";
            opt3[40]="3.Long";
            opt4[40]="4.Short";
            q[41]="42.which of the following is the default initial value for a long datatype?";
            ans[41]=3; 
            opt1[41]="1.0";
            opt2[41]="2.long 0";
            opt3[41]="3.0L";
            opt4[41]="4.none of the above";
            q[42]="43.which Keyword turns a variable declaration into constant declaration ?";
            ans[42]=4; 
            opt1[42]="1.const";
            opt2[42]="2.constant";
            opt3[42]="3.fixed";
            opt4[42]="4.final";
            q[43]="44.ch+=2 is equivalent to?";
            ans[43]=4; 
            opt1[43]="1.ch+2";
            opt2[43]="2.ch=+2";
            opt3[43]="3.ch=2";
            opt4[43]="4.ch=ch+2";
            q[44]="45.s=++j +5 results into if value of j is 10";
            ans[44]=1; 
            opt1[44]="1.16";
            opt2[44]="2.15";
            opt3[44]="3.14";
            opt4[44]="4.none of the above";
            q[45]="46.s=j++ + 5 results into if value of j is 10";
            ans[45]=4; 
            opt1[45]="1.17";
            opt2[45]="2.16";
            opt3[45]="3.14";
            opt4[45]="4.15";
            q[46]="47.1&1 is";
            ans[46]=2; 
            opt1[46]="1.false";
            opt2[46]="2.1";
            opt3[46]="3.0";
            opt4[46]="4.true";
            q[47]="48.1&0 is";
            ans[47]=4; 
            opt1[47]="1.true";
            opt2[47]="2.false";
            opt3[47]="3.1";
            opt4[47]="4.0";
            q[48]="49.0|0 is";
            ans[48]=3; 
            opt1[48]="1.1";
            opt2[48]="2.false";
            opt3[48]="3.0";
            opt4[48]="4.true";
            q[49]="50. .......... variable are created once for entire class and are shared by all the object?";
            ans[49]=4;
            opt1[49]="1.none of the below";
            opt2[49]="2.shared variable";
            opt3[49]="3.instance variable";
            opt4[49]="4.static variable";
            q[50]="51. which of the following is the represents(s) a hexa decimal number:-";
            ans[50]=1;
            opt1[50]="1.0X5";
            opt2[50]="2.0X9G";
            opt3[50]="3.(hex)5";
            opt4[50]="4.570";
            q[51]="52. which of the following assignment is are invalid?";
            ans[51]=2;
            opt1[51]="1.long m=023";
            opt2[51]="2.both a&d";
            opt3[51]="3.int n=(int)false;";
            opt4[51]="4.double y=0X756.";
            q[52]="53. the default value of char type variable is:-";
            ans[52]=1;
            opt1[52]="1.'\u0000'";
            opt2[52]="2.O";
            opt3[52]="3.'\u00ff";
            opt4[52]="4.'u0020'";
            q[53]="54. what will be the result of expression 13&25 ?(The binary value of 13 =00001101 and 25 =00011001)";
            ans[53]=3;
            opt1[53]="1.25";
            opt2[53]="2.12";
            opt3[53]="3.9";
            opt4[53]="4.38";
            q[54]="55.what will be the result of the expression 9|9?";
            ans[54]=1;
            opt1[54]="1.9";
            opt2[54]="2.25";
            opt3[54]="3.12";
            opt4[54]="4.0";
            q[55]="56. which of the following is correct?";
            ans[55]=4;
            opt1[55]="1.int b=-8,b>>1=-4";
            opt2[55]="2.int a=16,a>>>2=4";
            opt3[55]="3.int a=16,a>>2=4";
            opt4[55]="4.all of the above";
            q[56]="57. which of the following will produce the value of 22 if x=22.9?";
            ans[56]=2;
            opt1[56]="1.ceil(x)";
            opt2[56]="2.floor(x)";
            opt3[56]="3.round(x)";
            opt4[56]="4.abs(x)";
            q[57]="58. given that int x,m=2000; short y; byte b1=-40,b2; long n; which of the following assingment statement will evaluate correctly?";
            ans[57]=1;
            opt1[57]="1.x=m*b1;";
            opt2[57]="2.x=m*3L;";
            opt3[57]="3.y=m*b1;";
            opt4[57]="4.n=m*3L";
            q[58]="59. In which of the following code fragment,the variable x is not evaluated to 8";
            ans[58]=2;
            opt1[58]="1.int x=33;x=x>>2";
            opt2[58]="2.int x=33;x=x>>33";
            opt3[58]="3.int x=35;x=x>>2";
            opt4[58]="4.int x=16;x=x>>1";
            q[59]="60.function not returning any value has return type as ";
            ans[59]=3;
            opt1[59]="1.char";
            opt2[59]="2.float";
            opt3[59]="3.void";
            opt4[59]="4.int";
            q[60]="61.a function that can return _________ values ";
            ans[60]=2;
            opt1[60]="1. 0";
            opt2[60]="2. 1";
            opt3[60]="3. 2";
            opt4[60]="4. 3";
            q[61]="62.The parameters appearing in the function defination are called =";
            ans[61]=4;
            opt1[61]="1.all of the below";
            opt2[61]="2.call parameter";
            opt3[61]="3.actual parameter";
            opt4[61]="4.formal parameter";
            q[62]="63.the parameter appearing at the function call statement are called =";
            ans[62]=3;
            opt1[62]="1.all of the below";
            opt2[62]="2.call parameter";
            opt3[62]="3.actual parameter";
            opt4[62]="4.formal parameter";
            q[63]="64.the function call in which the data in actual parameters remain intact is known as";
            ans[63]=1;
            opt1[63]="1.call by value";
            opt2[63]="2.call by reference";
            opt3[63]="3.return by value";
            opt4[63]="4.return by reference";
            q[64]="65.The function call statement in which the actual parameters gets changed =";
            ans[64]=3;
            opt1[64]="1.return by reference";
            opt2[64]="2.call by value";
            opt3[64]="3.call by reference";
            opt4[64]="4.return by value";
            q[65]="66.The function which changes the stste of the parameters is called as=";
            ans[65]=2;
            opt1[65]="1.pure function";
            opt2[65]="2.impure function";
            opt3[65]="3.change function";
            opt4[65]="4.none of the above";
            q[66]="67. one function name and many defination is called=";
            ans[66]=3;
            opt1[66]="1.function loading";
            opt2[66]="2.function enlargement";
            opt3[66]="3.functionover loading";
            opt4[66]="4.all of the above";
            q[67]="68.which of the following is not an advantage of functions ?";
            ans[67]=4;
            opt1[67]="1.it helps cope up with complexity in programs";
            opt2[67]="2.it makes sub program reusable ";
            opt3[67]="3.it hide the implementation details";
            opt4[67]="4.it offers mathematical solution of the programs";
            q[68]="69.name the keyword that causes the control to transfer back to the method call";
            ans[68]=4;
            opt1[68]="1.go to";
            opt2[68]="2.throw";
            opt3[68]="3.throws";
            opt4[68]="4.raturn";
            q[69]="70.a member function which has its name as same as that of the class";
            ans[69]=1;
            opt1[69]="1.constructor";
            opt2[69]="2.default function";
            opt3[69]="3.parameterized function";
            opt4[69]="4.non parameterised function";
            q[70]="71. a member function having the same name as that of its class ............ function";
            ans[70]=4;
            opt1[70]="1.overloading";
            opt2[70]="2.non parametrised constructor";
            opt3[70]="3.parametrised constructor";
            opt4[70]="4.constructor";
            q[71]="72. a constructor function has ............ return type";
            ans[71]=2;
            opt1[71]="1.yes";
            opt2[71]="2.no";
            opt3[71]="3.false";
            opt4[71]="4.true";
            q[72]="73.a private constructor allows object creation only inside ............ functions";
            ans[72]=4;
            opt1[72]="1.method";
            opt2[72]="2.shared";
            opt3[72]="3.instant";
            opt4[72]="4.member";
            q[73]="74.a ............ constructor takes no arguments";
            ans[73]=3;
            opt1[73]="1.none of the below";
            opt2[73]="2.protected variable";
            opt3[73]="3.non-parameterized";
            opt4[73]="4.static variable";
            q[74]="75.a ...........constructor creates objects through vales passed to it ?";
            ans[74]=4;
            opt1[74]="1.none of the below";
            opt2[74]="2.non parameterized";
            opt3[74]="3.instant";
            opt4[74]="4.parameterized";
            q[75]="76.the keyword .......... refers to current object ?";
            ans[75]=1;
            opt1[75]="1.this";
            opt2[75]="2.that";
            opt3[75]="3.THIS";
            opt4[75]="4.This";
            q[76]="77.many constructor definitions in the same class in known as constructor ............ ?";
            ans[76]=2;
            opt1[76]="1.function overloading";
            opt2[76]="2.overloading";
            opt3[76]="3.instance variable";
            opt4[76]="4.static variable";
            q[77]="78.datatypes based on primitive datatypes are called .......... datatypes?";
            ans[77]=1;
            opt1[77]="1.all of the below";
            opt2[77]="2.independent";
            opt3[77]="3.composite";
            opt4[77]="4.self dependent";
            q[78]="79.a class containing .......... can not be termed as user defined datatype ?";
            ans[78]=3;
            opt1[78]="1.none of the below";
            opt2[78]="2.shared method";
            opt3[78]="3.main method";
            opt4[78]="4.static method";
            q[79]="80. a class containing main method is termed as..........";
            ans[79]=4;
            opt1[79]="1.none of the below";
            opt2[79]="2.variable";
            opt3[79]="3.object";
            opt4[79]="4.application";
            q[80]="81. ......... member are accessible from anywhere in the public";
            ans[80]=2;
            opt1[80]="1.protected";
            opt2[80]="2.public";
            opt3[80]="3.default";
            opt4[80]="4.static variable";
            q[81]="82.if no access specifier is given then ........... access levelis applied ?";
            ans[81]=1;
            opt1[81]="1.default or package or friendly";
            opt2[81]="2.private";
            opt3[81]="3.protected";
            opt4[81]="4.static";
            q[82]="83...........members are accessible only within their own class ?";
            ans[82]=2;
            opt1[82]="1.none of the below";
            opt2[82]="2.private";
            opt3[82]="3.instance";
            opt4[82]="4.static";
            q[83]="84...........members are accessible to their own class as wellas to their subclasses ?";
            ans[83]=3;
            opt1[83]="1.none of the below";
            opt2[83]="2.shared";
            opt3[83]="3.protected";
            opt4[83]="4.static ";
            q[84]="85.package access means ?";
            ans[84]=2;
            opt1[84]="1.members are accessible to all classas within a program";
            opt2[84]="2.members are accessible to all classes within a package ";
            opt3[84]="3.members are accessible to their own class";
            opt4[84]="4.none of the above";
            q[85]="86.which of the following members can be accessed through object of their own class type ?";
            ans[85]=4;
            opt1[85]="1.private";
            opt2[85]="2.protected";
            opt3[85]="3.dfault";
            opt4[85]="4.public";
            q[86]="87.a class members referred to as <objectname>.<membername> can be referred to as simply <membername> inside their ?";
            ans[86]=3;
            opt1[86]="1.class";
            opt2[86]="2.member methods";
            opt3[86]="3.package";
            opt4[86]="4.all of above";
            q[87]="88. .............returns the character at the specified index?";
            ans[87]=1;
            opt1[87]="1.char charAt(int index)";
            opt2[87]="2.int capacity()";
            opt3[87]="3.str1+str2";
            opt4[87]="4.int length()";
            q[88]="89. ............ returns maximum no. of characters that can be entered in the current string object (this) i.e. its capacity?";
            ans[88]=3;
            opt1[88]="1.string trim()";
            opt2[88]="2.string toString()";
            opt3[88]="3.int capacity()";
            opt4[88]="4.string toLowerCase()";
            q[89]="90. ........ compares two strings lexicographically";
            ans[89]=2;
            opt1[89]="1.int capacity()";
            opt2[89]="2.int compareTo(String1,anotherString)";
            opt3[89]="3.String concat(String str)";
            opt4[89]="4.boolean equal(String str)";
            q[90]="91. ........ concatenation operator achieves same concate method";
            ans[90]=3;
            opt1[90]="1.str1*str2";
            opt2[90]="2.str1-str2";
            opt3[90]="3.str1+str2";
            opt4[90]="4.str1/str2";
            q[91]="92. .......... test if the this string ends with the specified suffix";
            ans[91]=4;
            opt1[91]="1.String concat(String str)";
            opt2[91]="2.boolean equal(String str)";
            opt3[91]="3.boolean equals(String str)";
            opt4[91]="4.boolean endsWith";
            q[92]="93. A package is a collection of...........";
            ans[92]=4;
            opt1[92]="1.interfaces";
            opt2[92]="2.classes";
            opt3[92]="3.editing ";
            opt4[92]="4.classes and interfaces ";
            q[93]="94. This code is not complete because?";
            ans[93]=1;
            opt1[93]="1.test class is not available ";
            opt2[93]="2.class result should be declared public";
            opt3[93]="3.student class is not availabel";
            opt4[93]="4.result boby is not fully defined";
            q[94]="95. ..........compares the this string to the specified object STR";
            ans[94]=4;
            opt1[94]="1.String concat(String str)";
            opt2[94]="2.int compareTo(String1,anotherString)";
            opt3[94]="3.boolean equal(String str)";
            opt4[94]="4.boolean equals(String str)";
            q[95]="96. ..........compares the this string to the specified object STR,ignoring case considerations.";
            ans[95]=2;
            opt1[95]="1.boolean equals(String str)";
            opt2[95]="2.boolean equalsIgnoreCase(String str)";
            opt3[95]="3.boolean equal(String str)";
            opt4[95]="4.boolean endsWith(String str)";
            q[96]="97. .......... returns the this string of the first occurrence of the specified charecter";
            ans[96]=4;
            opt1[96]="1.int LastindexOf(char ch)";
            opt2[96]="2.int IndexOf(char ch)";
            opt3[96]="3.int lastIndexOf(char ch)";
            opt4[96]="4.int indexOf(char ch)";
            q[97]="98. .......... returns the this string of the last occurrence of the specified charecter";
            ans[97]=3;
            opt1[97]="1.int LastindexOf(char ch)";
            opt2[97]="2.int IndexOf(char ch)";
            opt3[97]="3.int lastIndexOf(char ch)";
            opt4[97]="4.int indexOf(char ch)";
            q[98]="99. ..........returns the length of this string";
            ans[98]=4;
            opt1[98]="1.Int Length()";
            opt2[98]="2.Int length()";
            opt3[98]="3.int Length()";
            opt4[98]="4.int length()";
            q[99]="100. ..........return a new string resulting from replacing all occurrences of oldChar in this string with newChar";
            ans[99]=1;
            opt1[99]="1.String replace(char oldChar,char newChar)";
            opt2[99]="2.String substring(int beginIndex,int endIndex)";
            opt3[99]="3.String Substring(int beginIndex,int endIndex)";
            opt4[99]="4.string Substring(int beginIndex,int endIndex)";
            q[100]="101. ..........test if the this string start with the specified suffix";
            ans[100]=2;
            opt1[100]="1.String replace(char oldChar,char newChar)";
            opt2[100]="2.String startsWith(String str)";
            opt3[100]="3.String Substring(int beginIndex,int endIndex)";
            opt4[100]="4.string Substring(int beginIndex,int endIndex)";
            q[101]="102. .......... return a new string that is a substring of this string";
            ans[101]=1;
            opt1[101]="1.String substring(int beginIndex,int endIndex)";
            opt2[101]="2.String replace(char oldChar,char newChar)";
            opt3[101]="3.String Substring(int beginIndex,int endIndex)";
            opt4[101]="4.string Substring(int beginIndex,int endIndex)";
            q[102]="103. .......... converts all of the characters in the this string to lower case";
            ans[102]=3;
            opt1[102]="1.none of this";
            opt2[102]="2.String toUpperCase()";
            opt3[102]="3.String toLowerCase()";
            opt4[102]="4.string toMiddleCase()";
            q[103]="104. .......... return the string it self";
            ans[103]=1;
            opt1[103]="1.String toString()";
            opt2[103]="2.String replace()";
            opt3[103]="3.String toostring()";
            opt4[103]="4.string tostring()";
            q[104]="105. .......... converts all of the characters in the this string to upper case";
            ans[104]=4;
            opt1[104]="1.none of this";
            opt2[104]="2.String toLowerCase";
            opt3[104]="3.string toMiddleCase";
            opt4[104]="4.String toUpperCase";
            q[105]="106. .......... removes the white space from both ends of this string";
            ans[105]=2;
            opt1[105]="1.String cut()";
            opt2[105]="2.String trim()";
            opt3[105]="3.String Trim()";
            opt4[105]="4.string removeSpace()";
            q[106]="107. which of the following methods belongs to string class";
            ans[106]=1;
            opt1[106]="1.all of the below";
            opt2[106]="2.compareTo()";
            opt3[106]="3.substring()";
            opt4[106]="4.equals()";
            q[107]="108.suppose that s1 and s2 are two string which of the statement or expression are incorrect ";
            ans[107]=2;
            opt1[107]="1.String s3==s1+s2";
            opt2[107]="2.String s3=s1-s2";
            opt3[107]="3.s1.compareTo(s2)";
            opt4[107]="4.int m=s1.length()";
            q[108]="109. which exception is thrown by the read() method of InputStream class";
            ans[108]=3;
            opt1[108]="1.ReadException";
            opt2[108]="2.Exception";
            opt3[108]="3.IOException";
            opt4[108]="4.none of the above";
            q[109]="110. which of the following blocs is always executed in java program";
            ans[109]=2;
            opt1[109]="1.catch []";
            opt2[109]="2.finally []";
            opt3[109]="3.try []";
            opt4[109]="4.all of the above";
            q[110]="111. which package should be imported in a java program for obtaining system date and  time?";
            ans[110]=4;
            opt1[110]="1.java.io";
            opt2[110]="2.java.date";
            opt3[110]="3.java.calendar";
            opt4[110]="4.java.util";
            q[111]="112. which of the following loops is mostly used for fixed number of iteration?";
            ans[111]=3;
            opt1[111]="1.while";
            opt2[111]="2.do while";
            opt3[111]="3.for";
            opt4[111]="4.none of the above";
            q[112]="113. which of the following is an exit controlled loop?";
            ans[112]=1;
            opt1[112]="1.do while";
            opt2[112]="2.while";
            opt3[112]="3.for";
            opt4[112]="4.none of the above";
            q[113]="114.which of the following is not an entry controlled?";
            ans[113]=3;
            opt1[113]="1.for";
            opt2[113]="2.while";
            opt3[113]="3.do while";
            opt4[113]="4.none of the above";
            q[114]="115.which of the following is an empty loop?";
            ans[114]=2;
            opt1[114]="1.while(i<10)i++;";
            opt2[114]="2.for(i=0;i<10;i++);";
            opt3[114]="3.do(i++)while(i<10);";
            opt4[114]="4.none of the above";
            q[115]="116. which of the following is finite loop?";
            ans[115]=3;
            opt1[115]="1.for(i=0;;i++)";
            opt2[115]="2.for(i=0;i>=0;i++)";
            opt3[115]="3.for(i=0;i<=10;i++)";
            opt4[115]="4.all of the above";
            q[116]="117. which of the following can be omitted in a for loop";
            ans[116]=4;
            opt1[116]="1.initialization";
            opt2[116]="2.update expressions";
            opt3[116]="3.test conditions";
            opt4[116]="4.all of the above";
            q[117]="118. which of the following loops is executed atleast once?";
            ans[117]=4;
            opt1[117]="1.none of the below";
            opt2[117]="2.for";
            opt3[117]="3.while";
            opt4[117]="4.do while";
            q[118]="119. which of the following loops is not a jump statement?";
            ans[118]=1;
            opt1[118]="1.System.out";
            opt2[118]="2.return";
            opt3[118]="3.continue";
            opt4[118]="4.break";
            q[119]="120.which of the following statement terminate the complete execution of a loop?";
            ans[119]=4;
            opt1[119]="1.all of the below";
            opt2[119]="2.terminate";
            opt3[119]="3.continue";
            opt4[119]="4.break";
            q[120]="121. which of the following statements terminates only the current pass or iteration ?";
            ans[120]=2;
            opt1[120]="1.break";
            opt2[120]="2.continue";
            opt3[120]="3.terminate";
            opt4[120]="4.all of the above";
            q[121]="122. a loop that never ends";
            ans[121]=4;
            opt1[121]="1.non nested loop";
            opt2[121]="2.nested loop";
            opt3[121]="3.finite loop";
            opt4[121]="4.infinite loop";
            q[122]="123. a loop that contains another loop ";
            ans[122]=3;
            opt1[122]="1.infinite loop";
            opt2[122]="2.non nested loop";
            opt3[122]="3.nested loop";
            opt4[122]="4.finite loop";
            q[123]="124.a class encapsulates ";
            ans[123]=4;
            opt1[123]="1.data";
            opt2[123]="2.method";
            opt3[123]="3.functionality";
            opt4[123]="4.all of the above";
            q[124]="125.Through which access specifier a class makes its element visible to all?";
            ans[124]=2;
            opt1[124]="1.protected";
            opt2[124]="2.public";
            opt3[124]="3.private";
            opt4[124]="4.friendly";
            q[125]="126. if a local variable is having same name as that of the global class element,than it";
            ans[125]=4;
            opt1[125]="1.none of the below";
            opt2[125]="2.gets hidden by global variable";
            opt3[125]="3.produces an error";
            opt4[125]="4.hides the global variable";
            q[126]="127. java resolves a duplicate variable name to ";
            ans[126]=3;
            opt1[126]="1.global variable";
            opt2[126]="2.local variable";
            opt3[126]="3.most local scope variable";
            opt4[126]="4.all of the above";
            q[127]="128. in java, for an array having N elements, legal subscripts are";
            ans[127]=4;
            opt1[127]="1.1 to n-1";
            opt2[127]="2.1 to N";
            opt3[127]="3.0 to N";
            opt4[127]="4.0 to N-1";
            q[128]="129. total size of array A having 25 elements of char type is";
            ans[128]=1;
            opt1[128]="1.50 bytes";
            opt2[128]="2.25 bytes";
            opt3[128]="3.100 bytes";
            opt4[128]="4.0 bytes";
            q[129]="130. total size of array B[10][5] of int type is";
            ans[129]=2;
            opt1[129]="1.15 bytes";
            opt2[129]="2.200 bytes";
            opt3[129]="3.100 bytes";
            opt4[129]="4.50 bytes";
            q[130]="131.the number of element in array C[5][3][2] are";
            ans[130]=1;
            opt1[130]="1.30 bytes";
            opt2[130]="2.10 bytes";
            opt3[130]="3.20 bytes";
            opt4[130]="4.50 bytes";
            q[131]="132. which of the following statements are valid array declaration";
            ans[131]=3;
            opt1[131]="1.double[] marks;";
            opt2[131]="2.float average[];";
            opt3[131]="3.both 1st and 2nd";
            opt4[131]="4.none of them";
            q[132]="133. which of the following contain error?";
            ans[132]=1;
            opt1[132]="1.all of them";
            opt2[132]="2.int x[]=int[10]";
            opt3[132]="3.x=y=new int[10]";
            opt4[132]="4.int i=new int(10)";
            q[133]="134. given that int A[]={35,26,19,76,58}; what will be the value contain in A[3]?";
            ans[133]=4;
            opt1[133]="1.35";
            opt2[133]="2.26";
            opt3[133]="3.19";
            opt4[133]="4.76";
            q[134]="135. given that int z[][]=new{{2,6,5},{8,3,9}} what will be value of z[1][10] and z[0][2]?";
            ans[134]=2;
            opt1[134]="1. 2 and 5";
            opt2[134]="2. 8 and 5";
            opt3[134]="3. 2 and 9";
            opt4[134]="4. 6 and 3";
            q[135]="136. given array 12,3,8,5. what will be array like after two passes of selection sort?";
            ans[135]=1;
            opt1[135]="1. 3,5,8,12";
            opt2[135]="2. 12,3,8,5";
            opt3[135]="3. 3,8,5,12";
            opt4[135]="4. 3,5,12,8";
            q[136]="137. given an array 12,3,8,5. what will be array like after two passes of bubble sort";
            ans[136]=2;
            opt1[136]="1. 12,3,8,5";
            opt2[136]="2. 3,8,12,5";
            opt3[136]="3. 3,5,8,12";
            opt4[136]="4. 12,3,5,8";
            q[137]="138. an array 18,13,2,9,5 is 2,9,18,5 after three passes. which sorting technique is applied on it?";
            ans[137]=3;
            opt1[137]="1.insertion sort";
            opt2[137]="2.selection sort";
            opt3[137]="3.bubble sort";
            opt4[137]="4.binary sort";
            q[138]="139. the program or code written by programmer is usually called the ..........";
            ans[138]=2;
            opt1[138]="1.compiler code";
            opt2[138]="2.source code";
            opt3[138]="3.user code";
            opt4[138]="4.byte code";
            q[139]="140. process of converting a source code into machine is called..........";
            ans[139]=4;
            opt1[139]="1.data conversion";
            opt2[139]="2.compiler";
            opt3[139]="3.interpretor";
            opt4[139]="4.compilation";
            q[140]="141. the .......... is a machine instruction for a java processor chip called java virtual machine.";
            ans[140]=3;
            opt1[140]="1.java bit code";
            opt2[140]="2.source code";
            opt3[140]="3.java byte code";
            opt4[140]="4.user code";
            q[141]="142. characteristics of java are";
            ans[141]=1;
            opt1[141]="1.all of the below";
            opt2[141]="2.light weight code";
            opt3[141]="3.support mul timedia";
            opt4[141]="4.security";
            q[142]="143. types of java program-";
            ans[142]=3;
            opt1[142]="1.internet applets";
            opt2[142]="2.stand-alone application";
            opt3[142]="3.both 1 and 2";
            opt4[142]="4.none of them";
            q[143]="144. the smallest individual unit in a program is .......... .";
            ans[143]=2;
            opt1[143]="1.keywords";
            opt2[143]="2.token";
            opt3[143]="3.identifiers";
            opt4[143]="4.literals";
            q[144]="145. which kinds of literals must contain atleast one +ve or -ve digit and must not contain any decimal point?";
            ans[144]=3;
            opt1[144]="1.string literals";
            opt2[144]="2.character literals";
            opt3[144]="3.integer literals";
            opt4[144]="4.boolean literals";
            q[145]="146. which kinds of literals does java allows ?";
            ans[145]=4;
            opt1[145]="1.integer literals";
            opt2[145]="2.String literals";
            opt3[145]="3.boolean literals";
            opt4[145]="4.all of the above";
            q[146]="147. a .......... literal must have at least one digit before and after a decimal point. it may also have + / - sign preceding it.";
            ans[146]=4;
            opt1[146]="1.character";
            opt2[146]="2.string";
            opt3[146]="3.integer";
            opt4[146]="4.fractional";
            q[147]="148. a .......... literal has two parts a mantissa and an exponent.";
            ans[147]=1;
            opt1[147]="1.exponent";
            opt2[147]="2.String";
            opt3[147]="3.integer";
            opt4[147]="4.boolean";
            q[148]="149. a .......... literal in java must contain one character and must be enclosed in single quotation marks.";
            ans[148]=4;
            opt1[148]="1.boolean";
            opt2[148]="2.integer";
            opt3[148]="3.String";
            opt4[148]="4.character";
            q[149]="150. a .......... literal is a sequence of 0 or more characters surrounded by double quotes.";
            ans[149]=2;
            opt1[149]="1.boolean";
            opt2[149]="2.String";
            opt3[149]="3.character";
            opt4[149]="4.integer";
            q[150]="151. .......... type are means to identify the type of data and associated operations of finding it.";
            ans[150]=4;
            opt1[150]="1.character";
            opt2[150]="2.String";
            opt3[150]="3.boolean";
            opt4[150]="4.data";
            q[151]="152. a ..........is a named memory location ,which holds a data value of a perticular data type.";
            ans[151]=3;
            opt1[151]="1.class";
            opt2[151]="2.object";
            opt3[151]="3.variable";
            opt4[151]="4.none of them";
            q[152]="153. the initial value of byte is";
            ans[152]=4;
            opt1[152]="1.0L";
            opt2[152]="2.0.0d";
            opt3[152]="3.0.0f";
            opt4[152]="4. 0";
            q[153]="154. the initial value of short is";
            ans[153]=1;
            opt1[153]="1. 0";
            opt2[153]="2. 0L";
            opt3[153]="3. 0.0f";
            opt4[153]="4. 0.0d";
            q[154]="155. the initial value of int is";
            ans[154]=2;
            opt1[154]="1. 0L";
            opt2[154]="2. 0";
            opt3[154]="3. 0.0f";
            opt4[154]="4. 0.0d";
            q[155]="156. the initial value of long is";
            ans[155]=1;
            opt1[155]="1. 0L";
            opt2[155]="2. 0.0f";
            opt3[155]="3. 0.0d";
            opt4[155]="4. 0";
            q[156]="157. the initial value of float is";
            ans[156]=3;
            opt1[156]="1.0";
            opt2[156]="2.0.0d";
            opt3[156]="3.0.0f";
            opt4[156]="4.0L";
            q[157]="158. the initial value of double is";
            ans[157]=1;
            opt1[157]="1.0.0d";
            opt2[157]="2.0.0f";
            opt3[157]="3.0";
            opt4[157]="4.0L";
            q[158]="159. the initial value of char is";
            ans[158]=4;
            opt1[158]="1.'0000'";
            opt2[158]="2.'0'";
            opt3[158]="3.'u0000'";
            opt4[158]="4.'\u0000'";
            q[159]="160. the initial value of boolean is";
            ans[159]=2;
            opt1[159]="1.true";
            opt2[159]="2.false";
            opt3[159]="3.no";
            opt4[159]="4.yes";
            q[160]="161. the initial value of string is";
            ans[160]=1;
            opt1[160]="1.null";
            opt2[160]="2.o";
            opt3[160]="3.u0000000\\";
            opt4[160]="4.empty";
            q[161]="162. the operations are represented by .......... ";
            ans[161]=2;
            opt1[161]="1.operands";
            opt2[161]="2.operators";
            opt3[161]="3.unary operator";
            opt4[161]="4.puntuators";
            q[162]="163. the objects of operation are reffered to as .................";
            ans[162]=3;
            opt1[162]="1.puntuators";
            opt2[162]="2.operator";
            opt3[162]="3.operands";
            opt4[162]="4.unary operator";
            q[163]="164. operators that act on one operand are reffered to as ...............";
            ans[163]=2;
            opt1[163]="1.binary operator";
            opt2[163]="2.unary operator";
            opt3[163]="3.bitwise operator";
            opt4[163]="4.all of this";
            q[164]="165. operators that act on two operand are reffered to as ............... ";
            ans[164]=4;
            opt1[164]="1.all of this";
            opt2[164]="2.bitwise operator";
            opt3[164]="3.unary operator";
            opt4[164]="4.binary operator";
            q[165]="166. the operator op1+=op2 is equivalent to";
            ans[165]=3;
            opt1[165]="1.op1=op1*op2";
            opt2[165]="2.op1=op1-op2";
            opt3[165]="3.op1=op1+op2";
            opt4[165]="4.op1=op1/op2";
            q[166]="167. the operator op1-=op2 is equivalent to";
            ans[166]=1;
            opt1[166]="1.op1=op1-op2";
            opt2[166]="2.op1=op1*op2";
            opt3[166]="3.op1=op1+op2";
            opt4[166]="4.op1=op1/op2";
            q[167]="168. the operator opt1*=opt2 is equivalent to";
            ans[167]=3;
            opt1[167]="1.op1=op1+op2";
            opt2[167]="2.op1=op1-op2";
            opt3[167]="3.op1=op1*op2";
            opt4[167]="4.op1=op1/op2";
            q[168]="169. the operator /= is equivalent to";
            ans[168]=2;
            opt1[168]="1.op1=op1*op2";
            opt2[168]="2.op1=op1/op2";
            opt3[168]="3.op1=op1+op2";
            opt4[168]="4.op1=op1-op2";
            q[169]="170. the operator %= is equivalent to";
            ans[169]=3;
            opt1[169]="1.op1=op1^op2";
            opt2[169]="2.op1=op1&op2";
            opt3[169]="3.op1=op1%op2";
            opt4[169]="4.op1=op1/op2";
            q[170]="171. the operator &= is equivalent to";
            ans[170]=4;
            opt1[170]="1.op1=op1^op2";
            opt2[170]="2.op1=op1/op2";
            opt3[170]="3.op1=op1%op2";
            opt4[170]="4.op1=op1&op2";
            q[171]="172. the operator |= is equivalent to";
            ans[171]=4;
            opt1[171]="1.op1=op1^op2";
            opt2[171]="2.op1=op1&op2";
            opt3[171]="3.op1=op1%op2";
            opt4[171]="4.op1=op1|op2";
            q[172]="173. the operator ^= is equivalent to";
            ans[172]=1;
            opt1[172]="1.op1=op1^op2";
            opt2[172]="2.op1=op1&op2";
            opt3[172]="3.op1=op1%op2";
            opt4[172]="4.op1=op1/op2";
            q[173]="174. the operator <<= is equivalent to";
            ans[173]=4;
            opt1[173]="1.op1=op1^op2";
            opt2[173]="2.op1=op1&op2";
            opt3[173]="3.op1=op1%op2";
            opt4[173]="4.op1=op1<<op2";
            q[174]="175. the operator >>= is equivalent to";
            ans[174]=2;
            opt1[174]="1.op1=op1^op2";
            opt2[174]="2.op1=op1>>op2";
            opt3[174]="3.op1=op1%op2";
            opt4[174]="4.op1=op1/op2";
            q[175]="176. the operator >>>= is equivalent to";
            ans[175]=4;
            opt1[169]="1.op1=op1^op2";
            opt2[169]="2.op1=op1&op2";
            opt3[169]="3.op1=op1%op2";
            opt4[169]="4.op1=op1>>>op2";
            q[176]="177. which operator is the shortcut of if else statement?";
            ans[176]=3;
            opt1[176]="1. ()";
            opt2[176]="2. new";
            opt3[176]="3. ?:";
            opt4[176]="4. []";
            q[177]="178. which operator is used for declaring an array?";
            ans[177]=4;
            opt1[177]="1.()";
            opt2[177]="2.new";
            opt3[177]="3.?:";
            opt4[177]="4.[]";
            q[178]="179. which operator is used to form qualified names?";
            ans[178]=1;
            opt1[178]="1.  .";
            opt2[178]="2. ()";
            opt3[178]="3. []";
            opt4[178]="4. new";
            q[179]="180. which operator is used to delimit a comma seprated list of parameters";
            ans[179]=2;
            opt1[179]="1. .";
            opt2[179]="2. ()";
            opt3[179]="3. []";
            opt4[179]="4. new";
            q[180]="181. which operator is used to cast a value to the specified type?";
            ans[180]=1;
            opt1[180]="1. (type)";
            opt2[180]="2. ()";
            opt3[180]="3.  new";
            opt4[180]="4.  []";
            q[181]="182. which operator is used to create a new object or a new array ?";
            ans[181]=3;
            opt1[181]="1. []";
            opt2[181]="2. ()";
            opt3[181]="3. new";
            opt4[181]="4. (type)";
            q[182]="183. which operator determines whether its first operand is an instance of its second operand?";
            ans[182]=1;
            opt1[182]="1. instanceof";
            opt2[182]="2. (type)";
            opt3[182]="3. []";
            opt4[182]="4. new";
            q[183]="184. ............. in java is any valid combinations of java tokens.";
            ans[183]=4;
            opt1[183]="1.tokens";
            opt2[183]="2.state ment";
            opt3[183]="3.method";
            opt4[183]="4.expression";
            q[184]="185. the function that returns the sin of the angle x in radian";
            ans[184]=2;
            opt1[184]="1.math.cos(x)";
            opt2[184]="2.math.sin(x)";
            opt3[184]="3.math.asin(x)";
            opt4[184]="4.math.tan(x)";
            q[185]="186. the function that returns the cos of the angle x in radian";
            ans[185]=1;
            opt1[185]="1.math.cos(x)";
            opt2[185]="2.math.sin(x)";
            opt3[185]="3.math.asin(x)";
            opt4[185]="4.math.tan(x)";
            q[186]="187. the function that returns the tan of the angle x in radian";
            ans[186]=2;
            opt1[186]="1.math.cos(x)";
            opt2[186]="2.math.tan(x)";
            opt3[186]="3.math.asin(x)";
            opt4[186]="4.math.sin(x)";
            q[187]="188. the function that returns the asin of the x";
            ans[187]=3;
            opt1[187]="1.math.cos(x)";
            opt2[187]="2.math.sin(x)";
            opt3[187]="3.math.asin(x)";
            opt4[187]="4.math.tan(x)";
            q[188]="189. the function that returns the acos of the x ";
            ans[188]=2;
            opt1[188]="1.math.cos(x)";
            opt2[188]="2.math.acos(x)";
            opt3[188]="3.math.asin(x)";
            opt4[188]="4.math.tan(x)";
            q[189]="190. the function that returns the atan of the angle x";
            ans[189]=4;
            opt1[184]="1.math.cos(x)";
            opt2[184]="2.math.sin(x)";
            opt3[184]="3.math.asin(x)";
            opt4[184]="4.math.atan(x)";
            q[190]="191. the function that returns the  smallest whole number equal to or greater than x";
            ans[190]=3;
            opt1[190]="1.math.cos(x)";
            opt2[190]="2.math.sin(x)";
            opt3[190]="3.math.ceil(x)";
            opt4[190]="4.math.round(x)";
            q[191]="192. the function that returns the  largest whole number equal to or smaller than x";
            ans[191]=1;
            opt1[191]="1.math.floor(x)";
            opt2[191]="2.math.ceil(x)";
            opt3[191]="3.math.round(x)";
            opt4[191]="4.math.tan(x)";
            q[192]="193. the function that returns the  truncated value of x";
            ans[192]=3;
            opt1[192]="1.math.floor(x)";
            opt2[192]="2.math.ceil(x)";
            opt3[192]="3.math.rint(x)";
            opt4[192]="4.math.tan(x)";
            q[193]="194. the function that returns the  absolute value of x";
            ans[193]=2;
            opt1[193]="1.math.floor(x)";
            opt2[193]="2.math.abs(x)";
            opt3[193]="3.math.round(x)";
            opt4[193]="4.math.tan(x)";
            q[194]="195. the function that returns the  maximum value of x";
            ans[194]=3;
            opt1[194]="1.math.floor(x)";
            opt2[194]="2.math.ceil(x)";
            opt3[194]="3.math.max(x,y)";
            opt4[194]="4.math.tan(x)";
            q[195]="196. the function that returns the  minimum value of x";
            ans[195]=4;
            opt1[195]="1.math.floor(x)";
            opt2[195]="2.math.ceil(x)";
            opt3[195]="3.math.round(x)";
            opt4[195]="4.math.min(x,y)";
            q[196]="197. the function that returns the  x raised to y";
            ans[196]=4;
            opt1[196]="1.math.floor(x)";
            opt2[196]="2.math.ceil(x)";
            opt3[196]="3.math.round(x)";
            opt4[196]="4.math.pow(x,y)";
            q[197]="198. the function that returns the  e raised to x";
            ans[197]=1;
            opt1[197]="1.math.exp(x)";
            opt2[197]="2.math.ceil(x)";
            opt3[197]="3.math.round(x)";
            opt4[197]="4.math.tan(x)";
            q[198]="199. the function that returns the natural logarithm of x";
            ans[198]=4;
            opt1[198]="1.math.floor(x)";
            opt2[198]="2.math.ceil(x)";
            opt3[198]="3.math.round(x)";
            opt4[198]="4.math.log(x)";
            q[199]="200. the function that returns the  square root of x";
            ans[199]=2;
            opt1[199]="1.math.floor(x)";
            opt2[199]="2.math.sqrt(x)";
            opt3[199]="3.math.round(x)";
            opt4[199]="4.math.tan(x)";          
            for(int i=0;i<200;i++)
            {
                lifeline="";
                if(pass==0)
                    lifeline=lifeline+"to pass the question press 5";
                if(fifty==0)
                    lifeline=lifeline+"\n to use the lifeline 50-50 press 6";
                if(doubledip==0)
                    lifeline=lifeline+"\n to use the lifeline Double-Dip press 7";
                lifeline=lifeline+"\n to exit press 0";
                h=i;
                c=Calendar.getInstance();
                hour=c.get(Calendar.HOUR);
                minute=c.get(Calendar.MINUTE);
                second=c.get(Calendar.SECOND);
                if(ans[i]==1||ans[i]==4)
                {
                    quest++;
                    int answer1=Integer.parseInt(answer1());
                    result="";
                    Calendar c1=Calendar.getInstance();
                    if((c1.get(Calendar.HOUR))==(hour))
                    {
                        if(c1.get(Calendar.MINUTE)==(minute))
                        {
                            if((c1.get(Calendar.SECOND)-second)<=(15))
                            {
                                if(answer1==ans[i])
                                {
                                    m++;
                                    result="It is an absolutely correct answer";
                                }
                                else if(answer1==5&&pass==0)
                                {
                                    pass++;
                                }
                                else if(answer1==6&&fifty==0)
                                {
                                    fifty++;                       
                                    int answer2=Integer.parseInt(answer21());
                                    if(answer2==ans[i])
                                    {
                                        m++;
                                        result="It is an absolutely correct answer";
                                    }
                                    else 
                                    {
                                        result="It is a wrong answer";
                                        
                                        if(ans[i]==1) result=result+"\n the correct answer is  "+(opt1[i]);
                                            else if(ans[i]==4) result=result+"\n the correct answer is  "+(opt4[i]);
                                       
                                    }
                                }
                                else if(answer1==0) 
                                {
                                    quest--;
                                    break;
                                }
                                else if(answer1==7&&doubledip==0)
                                {
                                    doubledip++;               
                                    int answer2=Integer.parseInt(answer2());
                                    if(answer2!=ans[i])
                                    {
                                        JOptionPane.showMessageDialog(null,"your first answer is wrong try once more");
                                        int answer3=Integer.parseInt(answer3());
                                        if(answer3==ans[i])
                                        {
                                            m++;
                                            result="It is an absolutely correct answer";
                                        }
                                        else 
                                        {
                                            result="It is a wrong answer";
                                            if(ans[i]==1) result=result+"\n the correct answer is  "+(opt1[i]);
                                            else if(ans[i]==4) result=result+"\n the correct answer is  "+(opt4[i]);

                                        }
                                    }
                                    else if(answer2==ans[i])
                                    {
                                        m++;
                                        result="It is an absolutely correct answer";
                                    }
                                }
                                else if(answer1==6&&fifty!=0||answer1==7&&doubledip!=0||answer1==5&&pass!=0)
                                    result="you have already used this life line and you have lost your chance";            

                                else 
                                {
                                    result="It is a wrong answer";
                                    if(ans[i]==1) result=result+"\n the correct answer is  "+(opt1[i]);
                                            else if(ans[i]==4) result=result+"\n the correct answer is  "+(opt4[i]);

                                }
                            }
                            else result="you have taken  time more than given hence your answer is invalid";
                        }
                        else if(c1.get(Calendar.MINUTE)>(minute))
                        {
                            if(c1.get(Calendar.MINUTE)==(minute+1))
                            {
                                if((((c1.get(Calendar.SECOND))-second)+60)<=(15))
                                {
                                    if(answer1==ans[i])
                                    {
                                        m++;
                                        result="It is an absolutely correct answer";
                                    }
                                    else if(answer1==5&&pass==0)
                                    {
                                        pass++;
                                    }   
                                    else if(answer1==6&&fifty==0)
                                    {
                                        fifty++;                       
                                        int answer2=Integer.parseInt(answer21());
                                        if(answer2==ans[i])
                                        {
                                            m++;
                                            result="It is an absolutely correct answer";
                                        }
                                        else 
                                        {
                                            result="It is a wrong answer";
                                            if(ans[i]==1) result=result+"\n the correct answer is  "+(opt1[i]);
                                            else if(ans[i]==4) result=result+"\n the correct answer is  "+(opt4[i]);
                                        }
                                    }
                                    else if(answer1==0) 
                                    {
                                        quest--;
                                        break;
                                    }
                                    else if(answer1==7&&doubledip==0)
                                {
                                    doubledip++;               
                                    int answer2=Integer.parseInt(answer2());
                                    if(answer2!=ans[i])
                                    {
                                        result="your first answer is wrong try once more";
                                        int answer3=Integer.parseInt(answer3());
                                        if(answer3==ans[i])
                                        {
                                            m++;
                                            result="It is an absolutely correct answer";
                                        }
                                        else 
                                        {
                                            result="It is a wrong answer";
                                            
                                            if(ans[i]==1) result=result+"\n the correct answer is  "+(opt1[i]);
                                            else if(ans[i]==4) result=result+"\n the correct answer is  "+(opt4[i]);
                                            

                                        }
                                    }
                                    else if(answer2==ans[i])
                                    {
                                        m++;
                                        result="It is an absolutely correct answer";
                                    }
                                }
                                else if(answer1==6&&fifty!=0||answer1==7&&doubledip!=0||answer1==5&&pass!=0)
                                    result="you have already used this life line and you have lost your chance";            

                                else 
                                    {
                                        result="It is a wrong answer";
                                            if(ans[i]==1) result=result+"\n the correct answer is  "+(opt1[i]);
                                            else if(ans[i]==4) result=result+"\n the correct answer is  "+(opt4[i]);

                                    }
                                }
                                else result="you have taken  time more than given hence your answer is invalid";
                            }
                            else result="you have taken  time more than given hence your answer is invalid";
                        }
                    }
                    else result="you have taken  time more than given hence your answer is invalid";
                }
                else if(ans[i]==2||ans[i]==3)
                {
                    quest++;
                    int answer1=Integer.parseInt(answer1());
                    Calendar c1=Calendar.getInstance();
                    result="";
                    if((c1.get(Calendar.HOUR))==(hour))
                    {
                        if(c1.get(Calendar.MINUTE)==(minute))
                        {
                            if((c1.get(Calendar.SECOND)-second)<=(15))
                            {
                                if(answer1==ans[i])
                                {
                                    m++;
                                    result="It is an absolutely correct answer";
                                }
                                else if(answer1==5&&pass==0)
                                {
                                    pass++;
                                }
                                else if(answer1==6&&fifty==0)
                                {
                                    fifty++;                       
                                    int answer2=Integer.parseInt(answer22());
                                    if(answer2==ans[i])
                                    {
                                        m++;
                                        result="It is an absolutely correct answer";
                                    }
                                    else 
                                    {
                                        result="It is a wrong answer";
                                        if(ans[i]==2) result=result+"\n the correct answer is  "+(opt2[i]);
                                            else if(ans[i]==3) result=result+"\n the correct answer is  "+(opt3[i]);
                                    }
                                }
                                else if(answer1==0) 
                                {
                                    quest--;
                                    break;
                                }
                                else if(answer1==7&&doubledip==0)
                                {
                                    doubledip++;               
                                    int answer2=Integer.parseInt(answer2());
                                    if(answer2!=ans[i])
                                    {
                                        JOptionPane.showMessageDialog(null,"your first answer is wrong try once more");
                                        int answer3=Integer.parseInt(answer3());
                                        if(answer3==ans[i])
                                        {
                                            m++;
                                            result="It is an absolutely correct answer";
                                        }
                                        else 
                                        {
                                           result="It is a wrong answer";
                                             if(ans[i]==2) result=result+"\n the correct answer is  "+(opt2[i]);
                                            else if(ans[i]==3) result=result+"\n the correct answer is  "+(opt3[i]);

                                        }
                                    }
                                    else if(answer2==ans[i])
                                    {
                                        m++;
                                        result="It is an absolutely correct answer";
                                    }
                                }
                                else if(answer1==6&&fifty!=0||answer1==7&&doubledip!=0||answer1==5&&pass!=0)
                                    result="you have already used this life line and you have lost your chance";            

                                else 
                                {
                                    result="It is a wrong answer";
                                     if(ans[i]==2) result=result+"\n the correct answer is  "+(opt2[i]);
                                            else if(ans[i]==3) result=result+"\n the correct answer is  "+(opt3[i]);

                                }
                            }
                            else result="you have taken  time more than given hence your answer is invalid";
                        }
                        else if(c1.get(Calendar.MINUTE)>(minute))
                        {
                            if(c1.get(Calendar.MINUTE)==(minute+1))
                            {
                                if((((c1.get(Calendar.SECOND))-second)+60)<=(15))
                                {
                                    if(answer1==ans[i])
                                    {
                                        m++;
                                        result="It is an absolutely correct answer";
                                    }
                                    else if(answer1==5&&pass==0)
                                    {
                                        pass++;
                                    }   
                                    else if(answer1==6&&fifty==0)
                                    {
                                        fifty++;                       
                                        int answer2=Integer.parseInt(answer22());
                                        if(answer2==ans[i])
                                        {
                                            m++;
                                            result="It is an absolutely correct answer";
                                        }
                                        else 
                                        {
                                            result="It is a wrong answer";
                                             if(ans[i]==2) result=result+"\n the correct answer is  "+(opt2[i]);
                                            else if(ans[i]==3) result=result+"\n the correct answer is  "+(opt3[i]);
                                        }
                                    }
                                    else if(answer1==0) 
                                    {
                                        quest--;
                                        break;
                                    }
                                    else if(answer1==7&&doubledip==0)
                                {
                                    doubledip++;               
                                    int answer2=Integer.parseInt(answer2());
                                    if(answer2!=ans[i])
                                    {
                                        JOptionPane.showMessageDialog(null,"your first answer is wrong try once more");
                                        int answer3=Integer.parseInt(answer3());
                                        if(answer3==ans[i])
                                        {
                                            m++;
                                            result="It is an absolutely correct answer";
                                        }
                                        else 
                                        {
                                            result="It is a wrong answer";
                                             if(ans[i]==2) result=result+"\n the correct answer is  "+(opt2[i]);
                                            else if(ans[i]==3) result=result+"\n the correct answer is  "+(opt3[i]);

                                        }
                                    }
                                    else if(answer2==ans[i])
                                    {
                                        m++;
                                        result="It is an absolutely correct answer";
                                    }
                                }
                                else if(answer1==6&&fifty!=0||answer1==7&&doubledip!=0||answer1==5&&pass!=0)
                                    result="you have already used this life line and you have lost your chance";            

                                else 
                                    {
                                        result="It is a wrong answer";
                                             if(ans[i]==2) result=result+"\n the correct answer is  "+(opt2[i]);
                                            else if(ans[i]==3) result=result+"\n the correct answer is  "+(opt3[i]);

                                    }
                                }
                                else result="you have taken  time more than given hence your answer is invalid";
                            }
                            else result="you have taken  time more than given hence your answer is invalid";
                        }
                    }
                    else result="you have taken  time more than given hence your answer is invalid";
                }
            }
            JOptionPane.showMessageDialog(null,name+"  ,thanks for using our kadam's quiz "+"\n"+"if you want to see your progress report press OK");
            result="hence number of question attempted "+(quest)+"\n"+"total number of correct answer "+(m)+"\n"+"total number of marks "+(m*2)+"/"+(quest*2);
            double p=(m*100)/quest;
            if(p>=85)
                result=result+"\n you were outstanding";
            else if(p>=70)
                result=result+"\n you were very good";
            else if(p>=55)
                result=result+"\n you were good";
            else if(p>=40)
                result=result+"\n you were fair";
            else if(p<40)
                result=result+"\n you are not eligible for this game";
            JOptionPane.showMessageDialog(null,result);
        }

        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"there is an input/output error");    
            JOptionPane.showMessageDialog(null,e.getMessage());    
        }
    }
    public static String name() 
    {
        
        int numb=0;
        String name=JOptionPane.showInputDialog(null,"Please enter your name");
        for(int i=0;i<name.length();i++)
        {
            char character=name.charAt(i);
            int ascii=(int)character;
            if((ascii>=65&&ascii<=90)||(ascii>=97&&ascii<=122)||ascii==32) numb++;
        }
        if(name.length()==0) numb++;
        while(numb!=name.length())
        {
            numb=0;
            if(name.equalsIgnoreCase(""))
            {
                name=JOptionPane.showInputDialog(null,"an indian can't have blank"+"\n in his or her name hence input it again");
            
                for(int i=0;i<name.length();i++)
                {
                    char character=name.charAt(i);
                    int ascii=(int)character;
                    if((ascii>=65&&ascii<=90)||(ascii>=97&&ascii<=122)||ascii==32) numb++;
                }
                if(name.length()==0)numb++;
            }
            else
            {
                name=JOptionPane.showInputDialog(null,"an indian can't have numbers,special charecters"+"\n or a space in his or her name hence input it again");
            
                for(int i=0;i<name.length();i++)
                {
                    char character=name.charAt(i);
                    int ascii=(int)character;
                    if((ascii>=65&&ascii<=90)||(ascii>=97&&ascii<=122)||ascii==32) numb++;
                }
                if(name.length()==0) numb++;
            }
        }
        return name;
    }
    public static String answer1() 
    {
        String ans=JOptionPane.showInputDialog(null,result+"\n\n"+lifeline+"\n marks obtained till now ="+(m*2)+"\n"+name+" your "+quest+" no.question is:=>"+"\n"+q[h]+"\n"+opt1[h]+"\n"+opt2[h]+"\n"+opt3[h]+"\n"+opt4[h]+
                                " time"+c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND)+"\n Please input your answer");
        while(ans.equalsIgnoreCase("0")!=true&&ans.equalsIgnoreCase("1")!=true
        &&ans.equalsIgnoreCase("2")!=true&&ans.equalsIgnoreCase("3")!=true
        &&ans.equalsIgnoreCase("4")!=true&&ans.equalsIgnoreCase("5")!=true
        &&ans.equalsIgnoreCase("6")!=true&&ans.equalsIgnoreCase("7")!=true)
        {
            result="invalid input and input it again";
            c=Calendar.getInstance();
            ans=JOptionPane.showInputDialog(null,result+"\n\n"+lifeline+"\n marks obtained till now ="+(m*2)+"\n"+name+" your "+quest+" no.question is:=>"+"\n"+q[h]+"\n"+opt1[h]+"\n"+opt2[h]+"\n"+opt3[h]+"\n"+opt4[h]+
                                " time"+c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND)+"\n Please input your answer");
        }
        return ans;
    }
    public static String answer2() 
    {
        String ans=JOptionPane.showInputDialog(null,result+"\n\n"+lifeline+"\n marks obtained till now ="+(m*2)+"\n"+name+" your "+quest+" no.question is:=>"+"\n"+q[h]+"\n"+opt1[h]+"\n"+opt2[h]+"\n"+opt3[h]+"\n"+opt4[h]+
                                " time"+c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND)+"\n Please input your answer");
        while(ans.equalsIgnoreCase("1")!=true&&ans.equalsIgnoreCase("2")!=true
        &&ans.equalsIgnoreCase("3")!=true&&ans.equalsIgnoreCase("4")!=true)
        {
            result="invalid input and input it again";
            c=Calendar.getInstance();
            ans=JOptionPane.showInputDialog(null,result+"\n\n"+lifeline+"\n marks obtained till now ="+(m*2)+"\n"+name+" your "+quest+" no.question is:=>"+"\n"+q[h]+"\n"+opt1[h]+"\n"+opt2[h]+"\n"+opt3[h]+"\n"+opt4[h]+
                                " time"+c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND)+"\n Please input your answer");
        }
        return ans;
    }
     public static String answer21() 
    {
        String ans=JOptionPane.showInputDialog(null,result+"\n\n"+lifeline+"\n marks obtained till now ="+(m*2)+"\n"+name+" your "+quest+" no.question is:=>"+"\n"+q[h]+"\n"+opt1[h]+"\n"+opt4[h]+
                                " time"+c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND)+"\n Please input your answer");
        while(ans.equalsIgnoreCase("1")!=true&&ans.equalsIgnoreCase("2")!=true
        &&ans.equalsIgnoreCase("3")!=true&&ans.equalsIgnoreCase("4")!=true)
        {
            result="invalid input and input it again";
            c=Calendar.getInstance();
            ans=JOptionPane.showInputDialog(null,result+"\n\n"+lifeline+"\n marks obtained till now ="+(m*2)+"\n"+name+" your "+quest+" no.question is:=>"+"\n"+q[h]+"\n"+opt1[h]+"\n"+opt4[h]+
                                " time"+c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND)+"\n Please input your answer");
        }
        return ans;
    }
     public static String answer22() 
    {
        String ans=JOptionPane.showInputDialog(null,result+"\n\n"+lifeline+"\n marks obtained till now ="+(m*2)+"\n"+name+" your "+quest+" no.question is:=>"+"\n"+q[h]+"\n"+opt2[h]+"\n"+opt3[h]+
                                " time"+c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND)+"\n Please input your answer");
        while(ans.equalsIgnoreCase("1")!=true&&ans.equalsIgnoreCase("2")!=true
        &&ans.equalsIgnoreCase("3")!=true&&ans.equalsIgnoreCase("4")!=true)
        {
            result="invalid input and input it again";
            c=Calendar.getInstance();
            ans=JOptionPane.showInputDialog(null,result+"\n\n"+lifeline+"\n marks obtained till now ="+(m*2)+"\n"+name+" your "+quest+" no.question is:=>"+"\n"+q[h]+"\n"+opt2[h]+"\n"+opt3[h]+"\n"+
                                " time"+c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND)+"\n Please input your answer");
        }
        return ans;
    }
     public static String answer3() 
    {
        String ans=JOptionPane.showInputDialog(null,result+"\n\n"+lifeline+"\n marks obtained till now ="+(m*2)+"\n"+name+" your "+quest+" no.question is:=>"+"\n"+q[h]+"\n"+opt1[h]+"\n"+opt2[h]+"\n"+opt3[h]+"\n"+opt4[h]+
                                " time"+c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND)+"\n Please input your answer");
        while(ans.equalsIgnoreCase("1")!=true&&ans.equalsIgnoreCase("2")!=true
        &&ans.equalsIgnoreCase("3")!=true&&ans.equalsIgnoreCase("4")!=true)
        {
            result="invalid input and input it again";
            c=Calendar.getInstance();
            ans=JOptionPane.showInputDialog(null,result+"\n\n"+lifeline+"\n marks obtained till now ="+(m*2)+"\n"+name+" your "+quest+" no.question is:=>"+"\n"+q[h]+"\n"+opt1[h]+"\n"+opt2[h]+"\n"+opt3[h]+"\n"+opt4[h]+
                                " time"+c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND)+"\n Please input your answer");
        }
        return ans;
    }
    
    
}


