package techproed.jdbcOrnekler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbornek2 {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		//1) ilgili driver i yuklemeliyiz. tv nin fisini tak 
		
		Class.forName("com.mysql.cj.jdbc.Driver") ;
		
		// 2) baglanti olusturmaliyiz
		
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javabaglanma?serverTimezone=UTC", "root", "1234");
		 
	   // 3) SQL komutlari icin bir statement nesnesi olustur...Her kanal icin kumanda da yer ayarlamak icin birsey
		   
	      Statement st =  con.createStatement()	 ;		
			
		// Mysql sayfasinda gittik orada bir personel tablosu olusturduk ve commit ettik
	      // suan sql ifadeleri yazabilir ve calistirabiliriz 
	      
	     ResultSet veri = st.executeQuery("SELECT Name,Country from day10.sampledata_csv where Age = 32");
	     //while ve iterator kullanacagiz next()
	      // resultset data type dir
	     while(veri.next()) {
	    	// System.out.println(veri.getString("Name")+ veri.getString("Country"));
	    	 System.out.println("Student Name : "+ veri.getString(1)+", Country : "+veri.getString(2)) ;    	
	     }
	   /*
	     ResultSet veri2 = st.executeQuery("SELECT Name,Country from day10.sampledata_csv where Age = 36");
	     while(veri2.next()) {
	    	 System.out.println(veri2.getString("isim")+"\n"+
	     veri2.getString("sirket")+"\n"+veri2.getInt("id"));
	    	 
	    	 
	     }
	     */
	     
	     
	     
	     

	}

}
