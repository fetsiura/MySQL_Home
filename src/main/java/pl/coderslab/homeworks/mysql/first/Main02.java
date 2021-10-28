package pl.coderslab.mysql.homework.first;

public class Main02 {
     public String createTableImagesQuery = "create table images (\n" +
             "    id int auto_increment primary key ,\n" +
             "    offer_id int unsigned,\n" +
             "    scr varchar(100),\n" +
             "    dimension varchar(10)\n" +
             ");\n" +
             "\n" +
             "create table users_companies (\n" +
             "    id int unsigned auto_increment primary key ,\n" +
             "    user_id int unsigned unique ,\n" +
             "    name varchar(30),\n" +
             "    nip int,\n" +
             "    street varchar(50),\n" +
             "    street_nr mediumint,\n" +
             "    phone char(9),\n" +
             "    post_code char(6),\n" +
             "    capital decimal(7,2),\n" +
             "    rate decimal (5,4),\n" +
             "    created_at DATETIME\n" +
             ");";

     public String createTableUsersCompaniesQuery = "";

}
