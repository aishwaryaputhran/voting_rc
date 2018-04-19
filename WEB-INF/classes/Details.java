package CT;
import databaseconnection.*;
import java.sql.*;

public class  Details
{

static Connection con1=null;
static Statement st1=null;



public static String[] main(String vid) {
	String[] res=new String[4];

			try{


			con1 = databasecon.getconnection();
			st1 = con1.createStatement();
			 String sql=null;;
			sql="select * from votequery where vid='"+vid+"' ";
			ResultSet rs=null;
			rs=st1.executeQuery(sql);

			while(rs.next())
			{
			//System.out.println(rs.getString("user"));
				res[0]=rs.getString("query");
					res[1]=rs.getString("uemail");
						res[2]=rs.getString("uname");
							res[3]=rs.getString("latent");
				}
			}
				catch(Exception e){
					System.out.println(e);
				}
				finally{
					try{
					con1.close();
					st1.close();
			//		rs.close();
					}
					catch(Exception e){
					System.out.println(e);
					}
				}
				return res;
	}





public static String[] main2() {
	String[] res=new String[3];

			try{


			con1 = databasecon.getconnection();
			st1 = con1.createStatement();
			 String sql=null;;
			sql="SELECT COUNT(*) FROM votes WHERE vote='L'";
			ResultSet rs=null;
			rs=st1.executeQuery(sql);

			if(rs.next())
			{
				res[1]=rs.getString(1);
				}
			sql="SELECT COUNT(*) FROM votes WHERE vote='D'";
			rs=st1.executeQuery(sql);

			if(rs.next())
			{
				res[2]=rs.getString(1);
				}
			sql="SELECT COUNT(*) FROM	 users	";
			rs=st1.executeQuery(sql);

			if(rs.next())
			{
				res[0]=rs.getString(1);
				}

			
			}
				catch(Exception e){
					System.out.println(e);
				}
				finally{
					try{
					con1.close();
					st1.close();
			//		rs.close();
					}
					catch(Exception e){
					System.out.println(e);
					}
				}
				return res;
	}


	
public static String[] main3(String vid) {
	String[] res=new String[2];

			try{


			con1 = databasecon.getconnection();
			st1 = con1.createStatement();
			 String sql=null;;
			sql="SELECT COUNT(*) FROM votes WHERE vote='L' and vid='"+vid+"' ";
			ResultSet rs=null;
			rs=st1.executeQuery(sql);

			if(rs.next())
			{
				res[0]=rs.getString(1);
			}
			
			
			sql="SELECT COUNT(*) FROM votes WHERE vote='D' and vid='"+vid+"' ";
			rs=st1.executeQuery(sql);

			if(rs.next())
			{
				res[1]=rs.getString(1);
				}
			
			}
				catch(Exception e){
					System.out.println(e);
				}
				finally{
					try{
					con1.close();
					st1.close();
			//		rs.close();
					}
					catch(Exception e){
					System.out.println(e);
					}
				}
				return res;
	}



	public static void main(String[] args) 
	{
		
String[] r=Details.main3("1");
for(String rr:r)
		{
System.out.println(rr);
}



	}

}



