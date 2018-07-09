public class main {

	public static void main(String[] args) {
		DBConnect connect = new DBConnect();
		//connect.insertCarCompany("BMW", "Germany", "Frankfort"); *done*
		//connect.insertCar(64293, 50000, "Accent", 2010, "White", null); *done*
		//connect.insertCar(64937, 70000, "Camry", 2017, "White", "Saad"); *done*
		//connect.insertCustomer("Ahmed", 573929076, "cash"); *done*
		//connect.insertCarCompany_has_Cars("GMC", 64293); *done*
		///////////////////insert//////////////////////////
		int x = connect.showCarCompanyData().length;
		for(int i = 0; i< x; i++){
			if(connect.showCarCompanyData()[i] == null)
				break;
			System.out.println(connect.showCarCompanyData()[i]);
		}
		
		
		
	}
}
