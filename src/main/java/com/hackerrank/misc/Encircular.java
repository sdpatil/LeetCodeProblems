package com.hackerrank.misc;

import java.io.*;
import java.util.Scanner;

/**
 * Created by sunilpatil on 7/5/17.
 */
public class Encircular {
    /*
    Encircular

     */
    static String[] doesCircleExist(String[] commands) {
        String[] result = new String[commands.length];

        for(int i = 0 ; i < commands.length; i++){
            String command = commands[i];
            boolean circular = doesCircleExist(command);
            if(circular)
                result[i] ="YES";
            else
                result[i] ="NO";
        }
        return result;
    }

    public static void main(String[] argv){
        Encircular encircular = new Encircular();
        System.out.println(doesCircleExist("GRGL"));
    }

    static boolean doesCircleExist(String command){
        int initialX = 0;
        int initialY = 0;

        int x =0, y =0;
        String direction = "north";
        for(int i = 0 ; i < command.length(); i++){
            char currentCommand = command.charAt(i);
            if(direction == "north"){
                if(currentCommand == 'G'){
                    y++;
                }else if(currentCommand == 'L'){
                    direction= "west";
                }else if(currentCommand =='R'){
                    direction = "east";
                }
            }else if(direction == "south"){
                if(currentCommand == 'G'){
                    y--;
                }else if(currentCommand == 'L'){
                    direction= "east";
                }else if(currentCommand =='R'){
                    direction = "west";
                }
            }else if(direction == "east"){
                if(currentCommand == 'G'){
                    x++;
                }else if(currentCommand == 'L'){
                    direction= "north";
                }else if(currentCommand =='R'){
                    direction = "south";
                }
            }else if(direction == "west"){
                if(currentCommand == 'G'){
                    x--;
                }else if(currentCommand == 'L'){
                    direction= "south";
                }else if(currentCommand =='R'){
                    direction = "north";
                }
            }
        }
        int xDistance = x - initialX;
        int yDistance = y - initialY;
        if(direction.equals("north") && (xDistance*xDistance + yDistance*yDistance) >0 )
            return false;
        return true;
    }
/*
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        final String fileName = System.getenv("OUTPUT_PATH");
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        String[] res;

        int _commands_size = 0;
        _commands_size = Integer.parseInt(in.nextLine().trim());
        String[] _commands = new String[_commands_size];
        String _commands_item;
        for(int _commands_i = 0; _commands_i < _commands_size; _commands_i++) {
            try {
                _commands_item = in.nextLine();
            } catch (Exception e) {
                _commands_item = null;
            }
            _commands[_commands_i] = _commands_item;
        }

        res = doesCircleExist(_commands);
        for(int res_i=0; res_i < res.length; res_i++) {
            bw.write(String.valueOf(res[res_i]));
            bw.newLine();
        }

        bw.close();
    }*/
}
