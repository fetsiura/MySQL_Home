package pl.coderslab.homeworks.mysql.first;

public class Main01 {
    public String query1 = "select * from homeSQL.users where name like 'Alex&'";

    public String query2 = "select * from homeSQL.users order by email asc limit 5;";

    public String query3 = "select * from homeSQL.users where email like '%@yahoo.com' and name like 'L%'";

    public String query4 = "select * from homeSQL.users where password = SHA2(concat(name+salt),256);";

    public String query5 = "select id, title from offers where price > 500000";

    public String query6 = "select id, price from offers where activation_token = '' and price between 2000 and 400000;";

    public String query7 = "select title,price,phone from offers WHERE DATE_ADD(now(), INTERVAL 10 DAY ) and status = 1;";

    public String query8 = "select * from offers where description like '%violent%' and phone like '%2%' and price > 50000;";

    public String query9 = "select * from offers where promoted =0 and price < 300000 and title like '%PLC'";

    public String query10 = "select * from offers where price*2 < 50000 and promoted =1";

    public String query11 = "select COUNT(*) as sum_active from offers where expire> CURRENT_DATE;";

    public String query12 = "select owner, COUNT(*) as sum_user from offers where expire> NOW() group by owner";

    public String query13 = "select status as type, COUNT(*) as counter from offers\n" +
            "where status in(1,2)\n" +
            "group by type order by type ASC ;";

    public String query14 = "";

    public String query15 = "";

}
