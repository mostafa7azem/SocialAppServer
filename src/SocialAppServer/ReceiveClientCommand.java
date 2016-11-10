package SocialAppServer;

import SocialAppGeneral.Command;
import SocialAppGeneral.ReceiveCommand;

import java.net.Socket;

/**
 * Created by kemo on 25/10/2016.
 */
public class ReceiveClientCommand extends ReceiveCommand {
    HalfDuplexConnection connection;
    public ReceiveClientCommand(Socket remote, HalfDuplexConnection connection) {
        super(remote);
        this.connection = connection;
    }

    @Override
    public void Analyze(Command command) {
        //TODO #AllTeam mem
        //our code starts Here HF
        //TODO #prototype
        if(command.getKeyWord().equals("changeColor"))
        {
            //DO ur algorithm
            Command command1 = new Command();
            command1.setKeyWord("changeColor");
            command1.setSharableObject("#023345");
            //lastly send new command to the client
            connection.sendCommand(command1);
        }
    }
}