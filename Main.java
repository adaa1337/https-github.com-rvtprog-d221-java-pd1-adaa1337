public class Main {
    public static void main(String [] args){

        

        Time t1 = new Time();
        t1.setTime("14:25:12");
        t1.printTime(); // Izdrukā laiku 14:35:12
                
        Time t2 = new Time("23:59:59");
        t2.addSecond(); // pievieno 1 sekundi laikam
        t2.printTime(); // Izdrukā laiku 00:00:00
        
        t2.addHour(); // pievieno 1 stundu laikam
        t2.addSecond(); //pievieno 1 sekndi
        t2.addMinute(); // pievienot 1 minuti
        t2.printTime(); // Izdrukā laiku 01:01:01

        //Time t3 = new Time();
        //t3.setTime("01:01:01");
        //t3.printTime(); // Izdrukā laiku 00:00:00
        

        
        /*
         * Izveido savu testa piemēru, kā aprakstīts zemāk.
         */
        
        // Izveido masīvu ar nosaukumu laiki, kurā glabāsies 5 Time klases objekti
        
        
        
        // Izveido 5 laikus, sākot ar plkst. 09:00:00 katrs nākamais ir +1 stunda, tātad pēdejais laiks ir 13:00:00 un ieliec tos masīvā
        
        Time [] laiki = new Time[5]; // masīvs ar 5 referencēm
        laiki[0] = new Time();
        laiki[1] = new Time();
        laiki[2] = new Time();
        laiki[3] = new Time();
        laiki[4] = new Time();
        
        // Izdrukā visus laikus no masīva
        
        
        /* Paskaidro zemāk, kas notiek pēc katras no rindiņu izpildēm.
         * Komentē, kas notiek ar referenci, kas notiek ar objektu.
         */
        
        laiki[0] = laiki[1];
        // Komentārs: 
        
        Time t3 = laiki[0];
        // Komentārs:
        
        Time t4 = laiki[4];
        // Komentārs:
        
        laiki[4] = laiki[3];
        // Komentārs: 
        
        laiki[3] = null;
        // Komentārs:
        
        t4.setTime("23:00:00");
        // Komentārs:
        
        t3 = new Time("15:00:00");
        // Komentārs:
        
        t4 = null;
        // Komentārs:
        
        
        // Izdrukā visus laikus no masīva un informāciju no t3 un t4 referencēm.
        
        
        
        
    }
    
}
