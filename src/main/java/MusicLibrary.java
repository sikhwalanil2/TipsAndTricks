import Queue.FixedSizeQueue;
import Queue.UserData;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MusicLibrary {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Map<String, UserData> dataDetails = new LinkedHashMap<>();
        char ch ;
        String username = null;
        do{
            printMessage("\nChoose one option");
            printMessage("Press 1 for new User");
            printMessage("Press 2 for play a Song");
            printMessage("Press 3 for current playlist of User");
            printMessage("Press 4 for current user of playlist");
            printMessage("Press 9 to exit");
            printMessage("\n");
            ch = sc.next().charAt(0);
            switch (ch){
                case '1':
                    printMessage("Enter username");
                    username = sc.next();
                    if(dataDetails.get(username) ==null){
                        printMessage("Enter capacity for this user too");

                        UserData userData = new UserData();
                        userData.setCapacity(sc.nextInt());
                        FixedSizeQueue<String> fqt = new FixedSizeQueue<String>( userData.getCapacity());
                        userData.setSongs(fqt);
                        dataDetails.put(username,userData);
                    }else {
                        printMessage("We already have this user, so choose a song please");
                    }
                    break;
                case '2':
                    printMessage("Enter song name");
                    String song = sc.next();
                    UserData d = dataDetails.get(username);
                    playNewSong(d,song);

                    dataDetails.put(username, d);
                    break;
                case '3':
                    printMessage("Please give which user info you want to dispaly");
                    String user = sc.next();
                    printUserPlaylist(dataDetails.get(user),user);
                    break;
                case '4':
                    printMessage("Playlist for user '"+username+"'  is below");
                    printUserPlaylist(dataDetails.get(username),username);
                    break;
                case '9':
                    printMessage("Clearing history ...........");
                    printMessage("In progress.. ",5);
                    printMessage("See you soon!");
                    System.exit(0);
                    break;
                default:
                    printMessage("Looks like you are a tester. Try again");

            }
        }while (ch != '9');



    }

    static void printMessage(String msg, int times){
        while (times-->0){
            System.out.println(msg);
        }

    }
    static void printMessage(String msg){
        System.out.println(msg);
    }

    public static void playNewSong(UserData user, String s){
        FixedSizeQueue<String> fq= user.getSongs();
        fq.offer(s);
        user.setSongs(fq);
    }

    public static void printUserPlaylist(UserData ud,String user){
       ;
        if(ud == null){
            printMessage("OOPS!! looks like this user is not in our system Or no ");
        } else if (ud.getSongs().isEmpty()) {
            printMessage("OOPS!! looks like this user has not playing any song");

        } else {

            printMessage("Wohooo! We got the details ");
            printMessage("playlist of user: "+user);
            ud.getSongs().printCurrentQueue();
        }
    }
}
