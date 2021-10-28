package pl.coderslab.homeworks.mysql.first;

public class Main03 {
     public String createTableImagesQuery = "INSERT INTO images (offer_id, scr, dimension)\n" +
             "             VALUES (1, 'https://vk.com/photo481361968_456239017', '400x400'),\n" +
             "                   (2, 'https://vk.com/photo481436544_456239114', '400x350'),\n" +
             "                    (3, 'https://vk.com/photo481436544_456239112', '200x350'),\n" +
             "                 (4, 'https://vk.com/photo481436544_456239111', '300x350'),\n" +
             "                   (5, 'https://vk.com/photo481436544_456239110', '600x350');";

     public String createTableUsersCompaniesQuery = "INSERT INTO users_companies(user_id, name, nip, street, street_nr, phone, post_code, capital, rate, created_at)\n" +
             "             VALUES (1, 'Jaro Majer', 0000000001, 'Motycka', 23, 781456721,05566,10000,5, '2004-05-23 00:00:00' ),\n" +
             "             (2, 'Julia Kruchkowska', 0000000002, 'Kiraj', 23, 586445675,01566,20000,4, '2005-06-12' ),\n" +
             "             (3, 'Oleh Haj', 0000000003, 'Jana Pawła', 66, 681456721,03166,30000,3, '2009-02-11' ),\n" +
             "             (4, 'Kiril Shevs', 0000000004, 'Grochowska', 77, 581456721,12566,40000,2, '2016-09-11' ),\n" +
             "             (5, 'Grzegosz Pirs', 0000000005, 'Lisa-Kuli', 14, 481456721,06566,50000,1, '2010-11-01' );";

}
