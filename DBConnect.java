import java.sql.*;

import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
public class DBConnect {
	private Connection con;
	private Statement st;
	private ResultSet rs;
	
	// connecting
	public DBConnect(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/CarCompany?useSSL=false","root", "saad");
			st = con.createStatement();
			
		}catch(Exception ex){
			System.out.println("Error: "+ex);
		}
	}
	// filling ComboBoxes from DataBase
	public JComboBox<String> CarPK(JComboBox<String> jc){
		try{
			String query = "select * from CarCompany.Car;";
			rs = st.executeQuery(query);
			jc.removeAllItems();
			while(rs.next()){
				jc.addItem(rs.getString("CarID"));
			}
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		return jc;
	}
	public JComboBox<String> CarCompanyPK(JComboBox<String> jc){
		try{
			jc.removeAllItems();
			String query = "select * from CarCompany.CarCompany;";
			rs = st.executeQuery(query);
			while(rs.next()){
				jc.addItem(rs.getString("Cname"));
			}
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		return jc;
	}
	public JComboBox<String> CustomerPK(JComboBox<String> jc){
		try{
			String query = "select * from CarCompany.Customer;";
			rs = st.executeQuery(query);
			jc.removeAllItems();
			while(rs.next()){
				jc.addItem(rs.getString("CustomerName"));
			}
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		return jc;
	}
	public JComboBox<String> CarCompany_has_CarsPK2(JComboBox<String> jc){
		try{
			String query = "select * from CarCompany.CarCompany_has_Cars;";
			rs = st.executeQuery(query);
			jc.removeAllItems();
			while(rs.next()){
				jc.addItem(rs.getString("CarID"));
			}
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		return jc;
	}
	public JComboBox<String> notInCarCompany_has_CarsPK2(JComboBox<String> jc){
		try{
			String query = "SELECT * FROM Car WHERE CarID NOT IN (SELECT CarID FROM CarCompany_has_Cars);";
			rs = st.executeQuery(query);
			jc.removeAllItems();
			while(rs.next()){
				jc.addItem(rs.getString("CarID"));
			}
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		return jc;
	}
	// filling Tables from DataBase
	public JTable CarCompanyTable(){
		JTable table = null; 
		try{
			DefaultTableModel model = new DefaultTableModel(); 
			model.addColumn("Company Name"); 
			model.addColumn("Country");
			model.addColumn("City"); 
			table = new JTable(model); 
			String query = "select * from CarCompany.CarCompany;";
			rs = st.executeQuery(query);
			while(rs.next()){
				String name = rs.getString("Cname");
				String Address = rs.getString("Country");
				String Location = rs.getString("City");
				Object[] row = { name, Address, Location};
				model.addRow(row);
			}
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		return table;
	}
	public JTable CarTable(){
		JTable table = null; 
		try{
			DefaultTableModel model = new DefaultTableModel(); 
			model.addColumn("CarID"); 
			model.addColumn("Price");
			model.addColumn("Car name"); 
			model.addColumn("Model");
			model.addColumn("Color"); 
			model.addColumn("Customer name"); 
			table = new JTable(model); 
			String query = "select * from CarCompany.Car;";
			rs = st.executeQuery(query);
			while(rs.next()){
			String CarID = rs.getString("CarID");
			String Price = rs.getString("Price");
			String CarName = rs.getString("CarName");
			String Model = rs.getString("Model");
			String Color = rs.getString("Color");
			String CustomerName = rs.getString("CustomerName");
				Object[] row = { CarID, Price, CarName,Model,Color,CustomerName };
				model.addRow(row);
			}
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		return table;
	}
	public JTable CustomerTable(){
		JTable table = null; 
		try{
			DefaultTableModel model = new DefaultTableModel(); 
			model.addColumn("Customer Name"); 
			model.addColumn("Phone");
			model.addColumn("Payment_method"); 
			table = new JTable(model); 
			String query = "select * from CarCompany.Customer;";
			rs = st.executeQuery(query);
			while(rs.next()){
				String CustomerName = rs.getString("CustomerName");
				String Phone = rs.getString("Phone");
				String Payment_method = rs.getString("Payment_method");
				Object[] row = { CustomerName, Phone, Payment_method};
				model.addRow(row);
			}
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		return table;
	}
	public JTable CarCompany_has_CarsTable(){
		JTable table = null; 
		try{
			DefaultTableModel model = new DefaultTableModel(); 
			model.addColumn("Company Name"); 
			model.addColumn("CarID");
			table = new JTable(model); 
			String query = "select * from CarCompany.CarCompany_has_Cars;";
			rs = st.executeQuery(query);
			while(rs.next()){
				String Cname = rs.getString("Cname");
				String CarID = rs.getString("CarID");
				Object[] row = { Cname, CarID};
				model.addRow(row);
			}
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		return table;
	}
	// insert in DataBase
	public void insertCar(int id,int price,String CarName,int Model,String Color,String CustomerName){
		try{
			String query;
			if(CustomerName == null){
				query = "INSERT INTO `carCompany`.`Car` (`CarID`, `Price`, `CarName`, `Model`, `Color`) "
						+ "VALUES ('"+id+"', '"+price+"', '"+CarName+"', '"+Model+"', '"+Color+"');";
			}
			else {
			query = "INSERT INTO `carCompany`.`Car` (`CarID`, `Price`, `CarName`, `Model`, `Color`, `CustomerName`)"
				+ "VALUES ('"+id+"', '"+price+"', '"+CarName+"', '"+Model+"', '"+Color+"', '"+CustomerName+"');";
			}
			st.executeUpdate(query);
		}catch(Exception ex){
			System.out.println(ex);
		}
	}
	public void insertCarCompany(String Cname, String country, String City){
		try{
			String query = "INSERT INTO `carCompany`.`CarCompany` (`Cname`, `country`, `City`) VALUES"
					+ "('"+Cname+"', '"+country+"', '"+City+"');";	
		st.executeUpdate(query);
		}catch(Exception ex){
			System.out.println(ex);
		}
	}
	public void insertCustomer(String CustomerName, int Phone, String Payment_method){
		try{
			String query = "INSERT INTO `carCompany`.`Customer` (`CustomerName`, `Phone`, `Payment_method`) VALUES"
					+ " ('"+CustomerName+"', '"+Phone+"', '"+Payment_method+"');";
			
			
		st.executeUpdate(query);
		}catch(Exception ex){
			System.out.println(ex);
		}
	}
	public void insertCarCompany_has_Cars(String Cname, int CarID){
		try{
			String query = "INSERT INTO `carCompany`.`CarCompany_has_Cars` (`Cname`, `CarID`) VALUES"
					+ " ('"+Cname+"', '"+CarID+"');";
		st.executeUpdate(query);
		}catch(Exception ex){
			System.out.println(ex);
		}
	}
	// Deleting from DataBase
	public void deleteCarRow(int CarID){
		try{
			String query = "DELETE FROM `carCompany`.`Car` WHERE `CarID`='"+CarID+"';";
		st.executeUpdate(query);
		}catch(Exception ex){
			System.out.println(ex);
		}
	}
	public void deleteCarCompanyRow(String Cname){
		try{
			String query = "DELETE FROM `carCompany`.`CarCompany` WHERE `Cname`='"+Cname+"';";
		st.executeUpdate(query);
		}catch(Exception ex){
			System.out.println(ex);
		}
	}
	public void deleteCustomerRow(String CustomerName){
		try{
			String query = "DELETE FROM `carCompany`.`Customer` WHERE `CustomerName`='"+CustomerName+"';";
		st.executeUpdate(query);
		}catch(Exception ex){
			System.out.println(ex);
		}
	}
	public void deleteCarCompany_has_CarsRow(int CarID){
		try{
			String query = "DELETE FROM `carCompany`.`CarCompany_has_Cars` WHERE `CarID`='"+CarID+"';";
		st.executeUpdate(query);
		}catch(Exception ex){
			System.out.println(ex);
		}
	}
	// Editing in DataBase
	public void editCarRow(int oldID,int ID,int price,String CarName,int Model,String Color,String CustomerName){
		try{
			String query = "UPDATE `carCompany`.`Car` SET "
					+ "`CarID`='"+ID+"', `Price`='"+price+"', `CarName`='"+CarName+"', `Model`='"+Model+"', `Color`='"+Color+"', "
					+ "`CustomerName`='"+CustomerName+"' WHERE `CarID`='"+oldID+"';";
		st.executeUpdate(query);
		}catch(Exception ex){
			System.out.println(ex);
		}
	}
	public void editCarCompanyRow(String oldCname, String Cname, String country, String City){
		try{
			String query = "UPDATE `carCompany`.`CarCompany` SET `Cname`='"+Cname+"', `country`='"+country+"', `City`='"+City+"' WHERE `Cname`='"+oldCname+"';";
			st.executeUpdate(query);
		}catch(Exception ex){
			System.out.println(ex);
		}
	}
	public void editCarCompany_has_Cars(String Cname, int oldCarID,int CarID){
		try{
			String query = "UPDATE `carCompany`.`CarCompany_has_Cars` SET "
					+ "`Cname`='\""+Cname+"\"', `CarID`='"+CarID+"' WHERE `CarID`='"+oldCarID+"';";
			st.executeUpdate(query);
		}catch(Exception ex){
			System.out.println(ex);
		}
	}
	public void editCustomerRow(String oldCustomerName,String CustomerName, int Phone, String Payment_method){
		try{
			String query = "UPDATE `carCompany`.`Customer` SET "
					+ "`CustomerName`='"+CustomerName+"', `Phone`='"+Phone+"', `Payment_method`='"+Payment_method+"' WHERE `CustomerName`='"+oldCustomerName+"';";
			st.executeUpdate(query);
		}catch(Exception ex){
			System.out.println(ex);
		}
	}
	// Searching in DataBase
	public String searchCar(int CarID){
		String s = "";
		try{
			String query = "select * from carCompany.Car where CarId = "+CarID+";";
			rs = st.executeQuery(query);
			while(rs.next()){
			String CarID2 = rs.getString("CarID");
			String Price = rs.getString("Price");
			String CarName = rs.getString("CarName");
			String Model = rs.getString("Model");
			String Color = rs.getString("Color");
			String CustomerName = rs.getString("CustomerName");
			//s = "CarID: "+CarID2+"  Price: "+Price+"SR"+"  CarName: "+CarName+"  Model: "+Model+"  Color: "+Color;
			s = CarID2+" "+Price+" "+CarName+" "+Model+" "+Color+" "+CustomerName;
			}
		}catch(Exception e){
			System.out.println(e);
		}
		return s;
	}
	public String searchCarCompany(String Cname){
		String s = "";
		try{
			String query = "select * from carCompany.CarCompany where Cname = \""+Cname+"\";";
			rs = st.executeQuery(query);
			while(rs.next()){
			String Cname2 = rs.getString("Cname");
			String Country = rs.getString("Country");
			String City = rs.getString("City");
			//s = "CompanyName: "+Cname2+"  Address: "+Address+"  Location: "+Location;
			s = Cname2+" "+Country+" "+City;
			}
		}catch(Exception e){
			System.out.println(e);
		}
		return s;
	}
	public String searchCustomer(String CustomerName){
		String s = "";
		try{
			String query = "select * from carCompany.Customer where CustomerName = \""+CustomerName+"\";";
			rs = st.executeQuery(query);
			while(rs.next()){
			String CustomerName2 = rs.getString("CustomerName");
			String Phone = rs.getString("Phone");
			String Payment_method = rs.getString("Payment_method");
			//s = "CustomerName: "+CustomerName+"  Phone: "+Phone+"  Payment_method: "+Payment_method;
			s = CustomerName2+" "+Phone+" "+Payment_method;
			}
		}catch(Exception e){
			System.out.println(e);
		}
		return s;
	}
	public String searchCarCompany_has_Cars(String CarID){
		String s = "";
		try{
			String query = "select * from carCompany.CarCompany_has_Cars where CarID = '"+CarID+"';";
			rs = st.executeQuery(query);
			while(rs.next()){
			String Cname = rs.getString("Cname");
			String CarID2 = rs.getString("CarID");
			s = Cname+" "+CarID2;
			}
		}catch(Exception e){
			System.out.println(e);
		}
		return s;
	}
	
}
