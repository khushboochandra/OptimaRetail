package Table.SubClass.Mapping;
import org.hibernate.*;
	public class Lab5A {
		public static void main(String args[]){
		Transaction tx= null;
		try{
			SessionFactory factory=HibernateUtil.getSessionFactory();
			Session session=factory.openSession();
			tx=session.beginTransaction();
			//1. ADDING THE STUDENT
			Student stu= new Student("khushboo","blore","enable",15000.0);
			Integer it=(Integer)session.save(stu);
			System.out.println(it.intValue());
			//2.ADDING THE CURRENT STUDENT
			CurrentStudent cstu= new CurrentStudent("niwash","balore","enable",15000.0,2000.0,"6.30P.M","babupalya");
			 it=(Integer)session.save(cstu);
				System.out.println(it.intValue());
			//3.ADDING THE OLD STUDENT
			OldStudent ostu= new OldStudent("barkhu","kolkatta","disable",12000.0,"SDSOFT","barkhu@gm",9.0);
			 it=(Integer)session.save(ostu);
				System.out.println(it.intValue());
				
			//4.ADDING THE WEEKDAY STUDENT
				WeekdayStudent wstu= new WeekdayStudent("barish","kol","disable",12000.0,2000.0,"6.30P.M","hanumannagr","M.sc","85.5",3);
				 it=(Integer)session.save(wstu);
					System.out.println(it.intValue());
		    //5.ADDING THE WEEkEND STUDENT
				WeekendStudent westu= new WeekendStudent("bark","kolkatt","enable",15000.0,2000.0,"6.30P.M","HSR","SDSOFT","barkhu@gm",9.0);
				 it=(Integer)session.save(westu);
					System.out.println(it.intValue());
			tx.commit();
			session.close();
						
						
		}catch(Exception e){
			e.printStackTrace();
			if(tx!=null)
				tx.rollback();
		}
		

}
}
