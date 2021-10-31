package pl.coderslab.homeworks.mysql.second;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Collection;

public class Main04 {

    public static void main(String[] args) {

        printMovies();

    }

    public static void printMovies (){

        String all = "select title, description,rating,c.name from movies as m, cinemas as c\n" +
                "join  cinemas_movies cm on c.id = cm.cinema_id";

        try(Connection connection = DBUtil.connect()){

            DBUtil.showAll(connection,all);

        }catch (SQLException e){
            e.printStackTrace();
        }

    }

}
