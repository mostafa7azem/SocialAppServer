package SocialAppServer;

import FileManagment.Saver;
import SocialAppGeneral.*;

import java.net.Socket;

/**
 * Created by kemo on 25/10/2016.
 */
class ReceiveClientCommand extends ReceiveCommand {
    private HalfDuplexConnection connection;
    ReceiveClientCommand(Socket remote, HalfDuplexConnection connection) {
        super(remote);
        this.connection = connection;
    }
    @Override
    public void Analyze(Command command) {
        //TODO #AllTeam mem
        //our code starts Here HF
        //TODO #Server Command prototype
        if(command.getKeyWord().equals("changeColor"))
        {
            //DO ur algorithm
            Command command1 = new Command();
            command1.setKeyWord("changeColor");
            command1.setSharableObject("#023345");
            //lastly send new command to the client
            connection.sendCommand(command1);
        }
        if(command.getKeyWord().equals(RegisterInfo.KEYWORD)){
         // h3ml constrain el fe saver 7alyin
            RegisterInfo reg =RegisterInfo.fromJsonString(command.getObjectStr());
            Saver s=new Saver(reg,connection);
      // Admin a=new Admin();
    //   a.convertIntoPermnantUser("mostafa@yahoo.com");
        //    a.convertIntoPermnantUser("mostafahazem145@yahoo.com");
            //System.out.println("in");
        }
        if(command.getKeyWord().equals(LoginInfo.KEYWORD)){

        }
    }
}
