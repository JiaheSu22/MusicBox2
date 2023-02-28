public class Main{
    public static void main(String[] args) {

        MusicBox mbox = new MusicBox("S34TG65", 'Y', "Raindrops", "Misty",
                "The path less traveled", "Country", "BZEE Music", "Rhythm Divine");

        System.out.println("Now playing the song");
        PlaySong playsong = new PlaySong();
        playsong.playSong(mbox.getSongID(), mbox.getPremiumSong(), 2);

        // --- TODO

        /* Repeat the above code to create another object
         * Pass different parameters to the MusicBox constructor, but initialise premiumSong to N and when calling the
         * playSong method, pass ads parameter as just 1
         *
         *
         */
        MusicBox mbox2 = new MusicBox("S34TG23", 'N', "Starry Starry Night","Lianne La Havas",
                "Loving Vincet", "Soft", "Masterworks","Better Sleep" );
        System.out.println("Now playing the song");
        playsong.playSong(mbox2.getSongID(), mbox2.getPremiumSong(), 1);
        System.out.println("Now playing the song");
    }
}