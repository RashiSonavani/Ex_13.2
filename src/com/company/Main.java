package com.company;



 import java.io.BufferedReader;
 import java.util.ArrayList;
 import java.util.HashSet;
 import java.util.List;
 import java.io.FileReader;
 import java.io.IOException;


    class Task_2 {
        public static void main(String[] args)
        {
            List<String> t1 = new ArrayList<>();
            try(BufferedReader br = new BufferedReader(new FileReader("Data.txt"))){

                String ln;
                while ((ln = br.readLine()) !=null)
                {
                    t1.add(ln);
                }
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }

            System.out.println("The size of the collection is: " + t1.size());
            System.out.println("FOR EACH LOOP : ");

            for (String employee:t1)
            {
                System.out.println(employee);
            }

            HashSet<String> set = new HashSet<String>(t1);

            List<String> newlist = new ArrayList<>(set);

            System.out.println("after removed duplicate elements: ");

            for (Object ob:newlist)

                System.out.println(ob);

        }
    }
